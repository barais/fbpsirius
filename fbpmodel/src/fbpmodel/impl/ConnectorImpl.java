/**
 */
package fbpmodel.impl;

import fbpmodel.ComponentInstance;
import fbpmodel.Connector;
import fbpmodel.FbpmodelPackage;
import fbpmodel.InputPort;
import fbpmodel.OutputPort;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fbpmodel.impl.ConnectorImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link fbpmodel.impl.ConnectorImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fbpmodel.impl.ConnectorImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends NamedElementImpl implements Connector {
	/**
	 * The cached value of the '{@link #getComponentInstance() <em>Component Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> componentInstance;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPort> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPort> outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FbpmodelPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getComponentInstance() {
		if (componentInstance == null) {
			componentInstance = new EObjectResolvingEList<ComponentInstance>(ComponentInstance.class, this, FbpmodelPackage.CONNECTOR__COMPONENT_INSTANCE);
		}
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPort> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<InputPort>(InputPort.class, this, FbpmodelPackage.CONNECTOR__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPort> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectResolvingEList<OutputPort>(OutputPort.class, this, FbpmodelPackage.CONNECTOR__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FbpmodelPackage.CONNECTOR__COMPONENT_INSTANCE:
				return getComponentInstance();
			case FbpmodelPackage.CONNECTOR__INPUTS:
				return getInputs();
			case FbpmodelPackage.CONNECTOR__OUTPUTS:
				return getOutputs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FbpmodelPackage.CONNECTOR__COMPONENT_INSTANCE:
				getComponentInstance().clear();
				getComponentInstance().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case FbpmodelPackage.CONNECTOR__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends InputPort>)newValue);
				return;
			case FbpmodelPackage.CONNECTOR__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends OutputPort>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FbpmodelPackage.CONNECTOR__COMPONENT_INSTANCE:
				getComponentInstance().clear();
				return;
			case FbpmodelPackage.CONNECTOR__INPUTS:
				getInputs().clear();
				return;
			case FbpmodelPackage.CONNECTOR__OUTPUTS:
				getOutputs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FbpmodelPackage.CONNECTOR__COMPONENT_INSTANCE:
				return componentInstance != null && !componentInstance.isEmpty();
			case FbpmodelPackage.CONNECTOR__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case FbpmodelPackage.CONNECTOR__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
