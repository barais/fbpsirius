/**
 */
package fbpmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fbpmodel.Configuration#getInstance <em>Instance</em>}</li>
 *   <li>{@link fbpmodel.Configuration#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @see fbpmodel.FbpmodelPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link fbpmodel.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see fbpmodel.FbpmodelPackage#getConfiguration_Instance()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ComponentInstance> getInstance();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link fbpmodel.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see fbpmodel.FbpmodelPackage#getConfiguration_Connection()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Connector> getConnection();

} // Configuration
