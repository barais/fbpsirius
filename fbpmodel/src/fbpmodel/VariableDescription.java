/**
 */
package fbpmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fbpmodel.VariableDescription#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fbpmodel.FbpmodelPackage#getVariableDescription()
 * @model
 * @generated
 */
public interface VariableDescription extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see fbpmodel.FbpmodelPackage#getVariableDescription_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link fbpmodel.VariableDescription#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // VariableDescription