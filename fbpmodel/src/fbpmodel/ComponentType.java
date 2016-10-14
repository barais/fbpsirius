/**
 */
package fbpmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fbpmodel.ComponentType#getDescription <em>Description</em>}</li>
 *   <li>{@link fbpmodel.ComponentType#getDockerImage <em>Docker Image</em>}</li>
 *   <li>{@link fbpmodel.ComponentType#getPicture <em>Picture</em>}</li>
 *   <li>{@link fbpmodel.ComponentType#getCommand <em>Command</em>}</li>
 *   <li>{@link fbpmodel.ComponentType#isAutomaticRun <em>Automatic Run</em>}</li>
 *   <li>{@link fbpmodel.ComponentType#isFork <em>Fork</em>}</li>
 *   <li>{@link fbpmodel.ComponentType#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fbpmodel.ComponentType#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link fbpmodel.ComponentType#getVars <em>Vars</em>}</li>
 * </ul>
 *
 * @see fbpmodel.FbpmodelPackage#getComponentType()
 * @model
 * @generated
 */
public interface ComponentType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fbpmodel.FbpmodelPackage#getComponentType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fbpmodel.ComponentType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Docker Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docker Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Image</em>' attribute.
	 * @see #setDockerImage(String)
	 * @see fbpmodel.FbpmodelPackage#getComponentType_DockerImage()
	 * @model
	 * @generated
	 */
	String getDockerImage();

	/**
	 * Sets the value of the '{@link fbpmodel.ComponentType#getDockerImage <em>Docker Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Image</em>' attribute.
	 * @see #getDockerImage()
	 * @generated
	 */
	void setDockerImage(String value);

	/**
	 * Returns the value of the '<em><b>Picture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picture</em>' attribute.
	 * @see #setPicture(String)
	 * @see fbpmodel.FbpmodelPackage#getComponentType_Picture()
	 * @model
	 * @generated
	 */
	String getPicture();

	/**
	 * Sets the value of the '{@link fbpmodel.ComponentType#getPicture <em>Picture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picture</em>' attribute.
	 * @see #getPicture()
	 * @generated
	 */
	void setPicture(String value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see fbpmodel.FbpmodelPackage#getComponentType_Command()
	 * @model
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link fbpmodel.ComponentType#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

	/**
	 * Returns the value of the '<em><b>Automatic Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Run</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Run</em>' attribute.
	 * @see #setAutomaticRun(boolean)
	 * @see fbpmodel.FbpmodelPackage#getComponentType_AutomaticRun()
	 * @model
	 * @generated
	 */
	boolean isAutomaticRun();

	/**
	 * Sets the value of the '{@link fbpmodel.ComponentType#isAutomaticRun <em>Automatic Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Run</em>' attribute.
	 * @see #isAutomaticRun()
	 * @generated
	 */
	void setAutomaticRun(boolean value);

	/**
	 * Returns the value of the '<em><b>Fork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fork</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork</em>' attribute.
	 * @see #setFork(boolean)
	 * @see fbpmodel.FbpmodelPackage#getComponentType_Fork()
	 * @model
	 * @generated
	 */
	boolean isFork();

	/**
	 * Sets the value of the '{@link fbpmodel.ComponentType#isFork <em>Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fork</em>' attribute.
	 * @see #isFork()
	 * @generated
	 */
	void setFork(boolean value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link fbpmodel.InputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see fbpmodel.FbpmodelPackage#getComponentType_Inputs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<InputPort> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link fbpmodel.OutputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see fbpmodel.FbpmodelPackage#getComponentType_Outputs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OutputPort> getOutputs();

	/**
	 * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
	 * The list contents are of type {@link fbpmodel.VariableDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars</em>' containment reference list.
	 * @see fbpmodel.FbpmodelPackage#getComponentType_Vars()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VariableDescription> getVars();

} // ComponentType
