/**
 */
package fbpmodel.impl;

import fbpmodel.ComponentType;
import fbpmodel.FbpmodelPackage;
import fbpmodel.InputPort;
import fbpmodel.OutputPort;
import fbpmodel.VariableDescription;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fbpmodel.impl.ComponentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fbpmodel.impl.ComponentTypeImpl#getDockerImage <em>Docker Image</em>}</li>
 *   <li>{@link fbpmodel.impl.ComponentTypeImpl#getPicture <em>Picture</em>}</li>
 *   <li>{@link fbpmodel.impl.ComponentTypeImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link fbpmodel.impl.ComponentTypeImpl#isAutomaticRun <em>Automatic Run</em>}</li>
 *   <li>{@link fbpmodel.impl.ComponentTypeImpl#isFork <em>Fork</em>}</li>
 *   <li>{@link fbpmodel.impl.ComponentTypeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fbpmodel.impl.ComponentTypeImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link fbpmodel.impl.ComponentTypeImpl#getVars <em>Vars</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentTypeImpl extends NamedElementImpl implements ComponentType {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDockerImage() <em>Docker Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerImage()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCKER_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDockerImage() <em>Docker Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerImage()
	 * @generated
	 * @ordered
	 */
	protected String dockerImage = DOCKER_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPicture() <em>Picture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicture()
	 * @generated
	 * @ordered
	 */
	protected static final String PICTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPicture() <em>Picture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicture()
	 * @generated
	 * @ordered
	 */
	protected String picture = PICTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected String command = COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutomaticRun() <em>Automatic Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticRun()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOMATIC_RUN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutomaticRun() <em>Automatic Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticRun()
	 * @generated
	 * @ordered
	 */
	protected boolean automaticRun = AUTOMATIC_RUN_EDEFAULT;

	/**
	 * The default value of the '{@link #isFork() <em>Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFork()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFork() <em>Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFork()
	 * @generated
	 * @ordered
	 */
	protected boolean fork = FORK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPort> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPort> outputs;

	/**
	 * The cached value of the '{@link #getVars() <em>Vars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVars()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDescription> vars;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FbpmodelPackage.Literals.COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FbpmodelPackage.COMPONENT_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDockerImage() {
		return dockerImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDockerImage(String newDockerImage) {
		String oldDockerImage = dockerImage;
		dockerImage = newDockerImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FbpmodelPackage.COMPONENT_TYPE__DOCKER_IMAGE, oldDockerImage, dockerImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPicture(String newPicture) {
		String oldPicture = picture;
		picture = newPicture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FbpmodelPackage.COMPONENT_TYPE__PICTURE, oldPicture, picture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FbpmodelPackage.COMPONENT_TYPE__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutomaticRun() {
		return automaticRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticRun(boolean newAutomaticRun) {
		boolean oldAutomaticRun = automaticRun;
		automaticRun = newAutomaticRun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FbpmodelPackage.COMPONENT_TYPE__AUTOMATIC_RUN, oldAutomaticRun, automaticRun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFork() {
		return fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFork(boolean newFork) {
		boolean oldFork = fork;
		fork = newFork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FbpmodelPackage.COMPONENT_TYPE__FORK, oldFork, fork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPort> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<InputPort>(InputPort.class, this, FbpmodelPackage.COMPONENT_TYPE__INPUTS);
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
			outputs = new EObjectContainmentEList<OutputPort>(OutputPort.class, this, FbpmodelPackage.COMPONENT_TYPE__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDescription> getVars() {
		if (vars == null) {
			vars = new EObjectContainmentEList<VariableDescription>(VariableDescription.class, this, FbpmodelPackage.COMPONENT_TYPE__VARS);
		}
		return vars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FbpmodelPackage.COMPONENT_TYPE__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case FbpmodelPackage.COMPONENT_TYPE__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case FbpmodelPackage.COMPONENT_TYPE__VARS:
				return ((InternalEList<?>)getVars()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FbpmodelPackage.COMPONENT_TYPE__DESCRIPTION:
				return getDescription();
			case FbpmodelPackage.COMPONENT_TYPE__DOCKER_IMAGE:
				return getDockerImage();
			case FbpmodelPackage.COMPONENT_TYPE__PICTURE:
				return getPicture();
			case FbpmodelPackage.COMPONENT_TYPE__COMMAND:
				return getCommand();
			case FbpmodelPackage.COMPONENT_TYPE__AUTOMATIC_RUN:
				return isAutomaticRun();
			case FbpmodelPackage.COMPONENT_TYPE__FORK:
				return isFork();
			case FbpmodelPackage.COMPONENT_TYPE__INPUTS:
				return getInputs();
			case FbpmodelPackage.COMPONENT_TYPE__OUTPUTS:
				return getOutputs();
			case FbpmodelPackage.COMPONENT_TYPE__VARS:
				return getVars();
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
			case FbpmodelPackage.COMPONENT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FbpmodelPackage.COMPONENT_TYPE__DOCKER_IMAGE:
				setDockerImage((String)newValue);
				return;
			case FbpmodelPackage.COMPONENT_TYPE__PICTURE:
				setPicture((String)newValue);
				return;
			case FbpmodelPackage.COMPONENT_TYPE__COMMAND:
				setCommand((String)newValue);
				return;
			case FbpmodelPackage.COMPONENT_TYPE__AUTOMATIC_RUN:
				setAutomaticRun((Boolean)newValue);
				return;
			case FbpmodelPackage.COMPONENT_TYPE__FORK:
				setFork((Boolean)newValue);
				return;
			case FbpmodelPackage.COMPONENT_TYPE__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends InputPort>)newValue);
				return;
			case FbpmodelPackage.COMPONENT_TYPE__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends OutputPort>)newValue);
				return;
			case FbpmodelPackage.COMPONENT_TYPE__VARS:
				getVars().clear();
				getVars().addAll((Collection<? extends VariableDescription>)newValue);
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
			case FbpmodelPackage.COMPONENT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FbpmodelPackage.COMPONENT_TYPE__DOCKER_IMAGE:
				setDockerImage(DOCKER_IMAGE_EDEFAULT);
				return;
			case FbpmodelPackage.COMPONENT_TYPE__PICTURE:
				setPicture(PICTURE_EDEFAULT);
				return;
			case FbpmodelPackage.COMPONENT_TYPE__COMMAND:
				setCommand(COMMAND_EDEFAULT);
				return;
			case FbpmodelPackage.COMPONENT_TYPE__AUTOMATIC_RUN:
				setAutomaticRun(AUTOMATIC_RUN_EDEFAULT);
				return;
			case FbpmodelPackage.COMPONENT_TYPE__FORK:
				setFork(FORK_EDEFAULT);
				return;
			case FbpmodelPackage.COMPONENT_TYPE__INPUTS:
				getInputs().clear();
				return;
			case FbpmodelPackage.COMPONENT_TYPE__OUTPUTS:
				getOutputs().clear();
				return;
			case FbpmodelPackage.COMPONENT_TYPE__VARS:
				getVars().clear();
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
			case FbpmodelPackage.COMPONENT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FbpmodelPackage.COMPONENT_TYPE__DOCKER_IMAGE:
				return DOCKER_IMAGE_EDEFAULT == null ? dockerImage != null : !DOCKER_IMAGE_EDEFAULT.equals(dockerImage);
			case FbpmodelPackage.COMPONENT_TYPE__PICTURE:
				return PICTURE_EDEFAULT == null ? picture != null : !PICTURE_EDEFAULT.equals(picture);
			case FbpmodelPackage.COMPONENT_TYPE__COMMAND:
				return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
			case FbpmodelPackage.COMPONENT_TYPE__AUTOMATIC_RUN:
				return automaticRun != AUTOMATIC_RUN_EDEFAULT;
			case FbpmodelPackage.COMPONENT_TYPE__FORK:
				return fork != FORK_EDEFAULT;
			case FbpmodelPackage.COMPONENT_TYPE__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case FbpmodelPackage.COMPONENT_TYPE__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case FbpmodelPackage.COMPONENT_TYPE__VARS:
				return vars != null && !vars.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", dockerImage: ");
		result.append(dockerImage);
		result.append(", picture: ");
		result.append(picture);
		result.append(", command: ");
		result.append(command);
		result.append(", automaticRun: ");
		result.append(automaticRun);
		result.append(", fork: ");
		result.append(fork);
		result.append(')');
		return result.toString();
	}

} //ComponentTypeImpl
