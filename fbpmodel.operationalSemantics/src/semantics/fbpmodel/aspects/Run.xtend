package semantics.fbpmodel.aspects

import fbpmodel.ComponentInstance
import fbpmodel.Configuration
import java.io.File
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension semantics.fbpmodel.aspects.ConfigurationAspect.*
import fbpmodel.FbpmodelFactory
import fbpmodel.FbpmodelPackage

class Run {
	public def run(ComponentInstance instance) {
		System.err.println("pass par la 1")
		var conf = instance.eContainer as Configuration
		conf.run

	}

	def static void main(String[] args) {
		var resourceSetxmi = new ResourceSetImpl();
		if (!EPackage.Registry.INSTANCE.containsKey(FbpmodelPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(FbpmodelPackage.eNS_URI, FbpmodelPackage.eINSTANCE);
		}
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("fbpmodel", new XMIResourceFactoryImpl);
		var resource = resourceSetxmi.getResource(createFileURI("/home/barais/workspaces/sirius-New_configuration/TestFBP/conf.fbpmodel"), true);
		var eObject = resource.getContents().get(0);
		if (eObject instanceof Configuration) {
			var conf = eObject as Configuration;
			conf.run
		}

	}

	def static URI createFileURI(String path) {
		return URI.createFileURI(createFile(path).getAbsolutePath());
	}

	def static File createFile(String path) {
		return new File(path);
	}
}
