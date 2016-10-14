/**
 */
package fbpmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fbpmodel.Connector#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link fbpmodel.Connector#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fbpmodel.Connector#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see fbpmodel.FbpmodelPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' reference list.
	 * The list contents are of type {@link fbpmodel.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance</em>' reference list.
	 * @see fbpmodel.FbpmodelPackage#getConnector_ComponentInstance()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<ComponentInstance> getComponentInstance();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link fbpmodel.InputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see fbpmodel.FbpmodelPackage#getConnector_Inputs()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<InputPort> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link fbpmodel.OutputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see fbpmodel.FbpmodelPackage#getConnector_Outputs()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<OutputPort> getOutputs();

} // Connector
