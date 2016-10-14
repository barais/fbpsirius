package fbp.project.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;

import fbpmodel.ComponentInstance;
import fbpmodel.ComponentType;
import fbpmodel.VariableDescription;
import fbpmodel.VariableValue;
import semantics.fbpmodel.aspects.Run;

public class Services {
	
	
	public Collection<ComponentType> getCandidates(EObject cur) {
		
		Collection<ComponentType> types = new ArrayList<ComponentType>();
		cur.eResource().getResourceSet().getAllContents().forEachRemaining(new Consumer<Notifier>() {

			@Override
			public void accept(Notifier t) {
				if (t instanceof ComponentType)
					types.add((ComponentType) t);
			}
		});
		return types;
	}

	
	public void createVarValues(ComponentInstance cur) {
		
		for (VariableDescription d : cur.getType().getVars()){
			  VariableValue v = fbpmodel.FbpmodelFactory.eINSTANCE.createVariableValue();
			  v.setType(d);
			  v.setValue("");
			  cur.getVars().add(v);
		}
		//Collection<Variable> : cur.getType().getVars();
	}
	
	

	public void run(ComponentInstance cur) {
		Run r = new Run();
		System.err.println("pass par la");
		
		r.run(cur);
		
	}
	


}
