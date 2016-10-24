package semantics.fbpmodel.aspects

import fbpmodel.ComponentInstance
import fbpmodel.ComponentType
import fbpmodel.Configuration
import fbpmodel.Connector
import fbpmodel.InputPort
import fbpmodel.Library
import fbpmodel.NamedElement
import fbpmodel.OutputPort
import fbpmodel.Port
import fbpmodel.VariableDescription
import fbpmodel.VariableValue
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.io.ByteArrayOutputStream
import java.util.ArrayList
import java.util.HashMap
import java.util.Stack
import java.util.StringTokenizer
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.Future
import org.buildobjects.process.ProcBuilder
import org.eclipse.ui.console.ConsolePlugin
import org.eclipse.ui.console.IConsole
import org.eclipse.ui.console.MessageConsole
import org.eclipse.xtend.lib.annotations.Accessors
import static extension semantics.fbpmodel.aspects.ComponentInstanceAspect.*
import fbpmodel.operationalsemantics.AConsole

class Cst {

	new() {
//		ips.add("127.0.0.1:2378")
			ips.add("192.168.6.132:2375")
			ips.add("192.168.6.134:2375")
			ips.add("192.168.6.149:2375")
			ips.add("192.168.6.117:2375")
	}

	private final Object lockI = new Object();
	int i = 1;

	def int getI() {
		synchronized (lockI) {
			return i

		}
	}

	def synchronized void setI(int j) {
		synchronized (lockI) {
			i = j
		}
	}

	def static Cst getInstance() {
		return instance;
	}

	@Accessors
	String staticNFSIP = "192.168.6.1"
//	String staticNFSIP = "10.0.2.2"

	@Accessors
	Boolean simu = false

	static Cst instance = new Cst()
	Stack<String> ips = new Stack<String>()

	def String getIp() {
		return ips.pop
	}

	def synchronized void addIp(String ip) {
		ips.add(ip)
	}

}

class Runner implements Callable<Object> {

	@Accessors
	GlobalContext g;
	@Accessors
	Token token;
	@Accessors
	InputPort input;

	new(GlobalContext g, Token token, InputPort input) {
		this.g = g;
		this.token = token;
		this.input = input;

	}

	override call() throws Exception {
		token.context.nextActivity.sendOffer(g, token, input)
		return this
	}

}

class GlobalContext {
	Configuration configuration;
	@Accessors
	int tokensQuantity = 1;

	new(Configuration conf) {
		this.configuration = conf
	}

	def configuration() {
		return this.configuration
	}

	def getTokens() {
		return this.tokens
	}
	
	 def MessageConsole findConsole(String name) {
      var plugin = ConsolePlugin.getDefault()
      var conMan = plugin.getConsoleManager()
      var existing = conMan.getConsoles()
      for (var i = 0; i < existing.length; i++){
         if (name.equals(existing.get(i).getName())){
            return existing.get(i) as MessageConsole;            
            }            
      }
		
      var myConsole = new  AConsole(name,null);
      
      var consoles  = new ArrayList<IConsole>()
      consoles.add(myConsole)      
      conMan.addConsoles(consoles); 
      return  myConsole
   }

}

class Token {

	TokenContext context;
	@Accessors
	TokenContext oldcontext;

	new(TokenContext cont) {
		this.context = cont

	}

	def context() {
		return this.context
	}
}

class TokenContext {

	@Accessors
	String fileName;
	@Accessors
	ComponentInstance nextActivity;
	@Accessors
	InputPort nextInputPort;

}

@Aspect(className=NamedElement)
abstract class NamedElementAspect {

	def void run(GlobalContext g, Token token) {
	}
}

@Aspect(className=VariableValue)
class VariableValueAspect {
}

@Aspect(className=ComponentInstance)
class ComponentInstanceAspect extends NamedElementAspect {
	@OverrideAspectMethod
	def void run(GlobalContext g, Token token) {
		token.context.nextActivity = null
		token.context.nextInputPort = null

		var nbreWorker = 1;
		val nbreWorkerVar = _self.type.vars.findFirst[va|va.name.equals("nbreWorker")]
		if (nbreWorkerVar != null) {
			val nbreWorkerValue = _self.vars.findFirst[vava|vava.type.equals(nbreWorkerVar)]
			if (nbreWorkerValue != null) {
				try {

					nbreWorker = Integer.parseInt(nbreWorkerValue.value)
				} catch (Exception e) {
					nbreWorker = 1;
				}
			}

		}

		if (_self.type.dockerImage != null && !_self.type.dockerImage.equals("")) {
			if (_self.type.command != null && !_self.type.command.equals("")) {
				var console = g.findConsole("FBBInterpreter")
				var out = console.newMessageStream();
					var command = _self.type.command
					if (command.contains("$i")) {
						command = command.replace("$i", String.format("%03d", Cst.instance.i))
						Cst.instance.i = Cst.instance.i + 1
						out.println(command)
					}
				var ip = Cst.instance.ip
				out.println("execute" + _self.type.dockerImage + " : " + command + " : " +ip )

				if (!Cst.instance.simu && _self.type.dockerImage != null && !"".equals(_self.type.dockerImage)) {
					val output = new ByteArrayOutputStream();
					var p = new ProcBuilder("/usr/bin/docker");
					p.withTimeoutMillis(2000000);
					p.withOutputStream(output);


					out.println(ip)
					
					var args = new ArrayList<String>()
					args.addAll("-H", ip, "run", "-t", "--volume-driver=nfs", "-v",
						Cst.instance.staticNFSIP + "/data:/data", _self.type.dockerImage)
					var tokenizer = new StringTokenizer(command," ")
					for (var j=0;j< tokenizer.countTokens;j++){
						args.add(tokenizer.nextToken)	
					}
					
					p.withArgs(args);
					out.println(p.toString)
					try{ 
						p.run();
						
						}catch (Exception e){
							e.printStackTrace
						}
					out.println(new String(output.toByteArray));
					out.println("add IP " + ip)

				}else if (Cst.instance.simu){
					Thread.sleep(200)
				}
				out.println("executed" + _self.type.dockerImage + " : " + command + " : " +ip)
				Cst.instance.addIp(ip)
				
			}
		} else {
			val varFileName = _self.type.vars.findFirst[va|va.name.equals("fileName")]
			if (varFileName != null) {
				val fileNameValue = _self.vars.findFirst[vava|vava.type.equals(varFileName)]
				if (fileNameValue != null) {
					token.context.fileName = fileNameValue.value
				}

			}
		}

		val connectors = new HashMap<OutputPort, Iterable<Connector>>()

		_self.type.outputs.forEach [ outputPort |
			connectors.put(outputPort, g.configuration.connection.filter [ c1 |
				c1.componentInstance.contains(_self) && c1.outputs.contains(outputPort)
			])
		]

		/*if (connectors.size >0){
		 * System.err.println("connectors for " + _self.type.name + " : "+connectors.size +  " " +
		 * 	 connectors.values.get(0).size + " " + connectors.values.get(0).get(0).name
		 * )
		 * 
		 }*/
		val list = new ArrayList<Token>
		list.add(token);

		connectors.keySet.forEach [ out |
			connectors.get(out).forEach [ c1 |
				val l = new ArrayList<ComponentInstance>()
				l.addAll(c1.componentInstance)
				l.remove(_self)
				if (!out.multiple) {
					token.context.nextActivity = l.get(0);
					token.context.nextInputPort = c1.inputs.get(0);
				} else if (out.multiple && !l.get(0).type.fork) {
					for (var i = 0; i < l.size; i++) {
						if (i == 0) {
							token.context.nextActivity = l.get(i);
							token.context.nextInputPort = c1.inputs.get(i);
//						l.get(i).sendOffer(g,token,c1.inputs.get(i))
						} else {
							var token1 = new Token(new TokenContext())
							list.add(token1)
							g.tokensQuantity = g.tokensQuantity + 1
							token1.context.fileName = token.context.fileName
							token1.context.nextActivity = l.get(i);
							token1.context.nextInputPort = c1.inputs.get(i);
//						l.get(i).sendOffer(g,token1,c1.inputs.get(i))						
						}
					}
				} else {
					for (var i = 0; i < 9; i++) {
						if (i == 0) {
							token.context.nextActivity = l.get(0);
							token.context.nextInputPort = c1.inputs.get(0);

						} // l.get(i).sendOffer(g,token,c1.inputs.get(0))
						else {
							var token1 = new Token(new TokenContext())
							g.tokensQuantity = g.tokensQuantity + 1
							list.add(token1)
							token1.context.fileName = token.context.fileName
//						l.get(0).sendOffer(g,token1,c1.inputs.get(0))						
							token1.context.nextActivity = l.get(0);
							token1.context.nextInputPort = c1.inputs.get(0);
						}
					}

				}
			]

		]

		val service = Executors.newFixedThreadPool(nbreWorker)

		val futures = new ArrayList<Future>()
		/*_self.outgoing.forEach[e|
		 * 	futures.add(service.submit(new Run(e,newContext)))
		 ];*/
		list.forEach [ token2 |
			if (token2.context.nextActivity != null) {
				futures.add(service.submit(new Runner(g, token2, token2.context.nextInputPort)))
			}
//				token2.context.nextActivity.sendOffer(g,token2,token2.context.nextInputPort)
		]
		futures.forEach[e|e.get]
		service.shutdown()

	}

	def void sendOffer(GlobalContext g, Token token, InputPort input) {

		if (g.tokensQuantity > 1) {
			if (_self.type.fork) {
				// println("pass " + g.tokens.size +  token +_self)
				_self.run(g, token)
//				g.tokens.remove(token)
			} else {
				g.tokensQuantity = g.tokensQuantity - 1
			// println("pass par la " + g.tokens.size +  token + _self)
			// token.context.children.remove(token)
			}
		} else {
			// println("p " + g.tokens.size + token + _self)
			_self.run(g, token)

		}
	}
}

@Aspect(className=VariableDescription)
class VariableDescriptionAspect extends NamedElementAspect {
}

@Aspect(className=ComponentType)
class ComponentTypeAspect extends NamedElementAspect {
}

@Aspect(className=Connector)
class ConnectorAspect extends NamedElementAspect {
}

@Aspect(className=Port)
abstract class PortAspect extends NamedElementAspect {
}

@Aspect(className=InputPort)
class InputPortAspect extends PortAspect {
}

@Aspect(className=OutputPort)
class OutputPortAspect extends PortAspect {
}


@Aspect(className=Configuration)
class ConfigurationAspect {
	def void run() { 

		_self.instance.filter[e|e.type.automaticRun == true].forEach [ e |

			var g = new GlobalContext(_self)
			Cst.instance.i = 1
			var token = new Token(new TokenContext())
			e.run(g, token)
		]
	}

}



@Aspect(className=Library)
class LibraryAspect extends NamedElementAspect {
}

















