/**
 */
package fbpmodel.provider;


import fbpmodel.ComponentType;
import fbpmodel.FbpmodelFactory;
import fbpmodel.FbpmodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fbpmodel.ComponentType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentTypeItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDockerImagePropertyDescriptor(object);
			addPicturePropertyDescriptor(object);
			addCommandPropertyDescriptor(object);
			addAutomaticRunPropertyDescriptor(object);
			addForkPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Docker Image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDockerImagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentType_dockerImage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentType_dockerImage_feature", "_UI_ComponentType_type"),
				 FbpmodelPackage.Literals.COMPONENT_TYPE__DOCKER_IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Picture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPicturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentType_picture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentType_picture_feature", "_UI_ComponentType_type"),
				 FbpmodelPackage.Literals.COMPONENT_TYPE__PICTURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentType_command_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentType_command_feature", "_UI_ComponentType_type"),
				 FbpmodelPackage.Literals.COMPONENT_TYPE__COMMAND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Automatic Run feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutomaticRunPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentType_automaticRun_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentType_automaticRun_feature", "_UI_ComponentType_type"),
				 FbpmodelPackage.Literals.COMPONENT_TYPE__AUTOMATIC_RUN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fork feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentType_fork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentType_fork_feature", "_UI_ComponentType_type"),
				 FbpmodelPackage.Literals.COMPONENT_TYPE__FORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FbpmodelPackage.Literals.COMPONENT_TYPE__DESCRIPTION);
			childrenFeatures.add(FbpmodelPackage.Literals.COMPONENT_TYPE__INPUTS);
			childrenFeatures.add(FbpmodelPackage.Literals.COMPONENT_TYPE__OUTPUTS);
			childrenFeatures.add(FbpmodelPackage.Literals.COMPONENT_TYPE__VARS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ComponentType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentType_type") :
//			getString("_UI_ComponentType_type") + " " + label;
				 label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ComponentType.class)) {
			case FbpmodelPackage.COMPONENT_TYPE__DOCKER_IMAGE:
			case FbpmodelPackage.COMPONENT_TYPE__PICTURE:
			case FbpmodelPackage.COMPONENT_TYPE__COMMAND:
			case FbpmodelPackage.COMPONENT_TYPE__AUTOMATIC_RUN:
			case FbpmodelPackage.COMPONENT_TYPE__FORK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FbpmodelPackage.COMPONENT_TYPE__DESCRIPTION:
			case FbpmodelPackage.COMPONENT_TYPE__INPUTS:
			case FbpmodelPackage.COMPONENT_TYPE__OUTPUTS:
			case FbpmodelPackage.COMPONENT_TYPE__VARS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FbpmodelPackage.Literals.COMPONENT_TYPE__DESCRIPTION,
				 ""));

		newChildDescriptors.add
			(createChildParameter
				(FbpmodelPackage.Literals.COMPONENT_TYPE__INPUTS,
				 FbpmodelFactory.eINSTANCE.createInputPort()));

		newChildDescriptors.add
			(createChildParameter
				(FbpmodelPackage.Literals.COMPONENT_TYPE__OUTPUTS,
				 FbpmodelFactory.eINSTANCE.createOutputPort()));

		newChildDescriptors.add
			(createChildParameter
				(FbpmodelPackage.Literals.COMPONENT_TYPE__VARS,
				 FbpmodelFactory.eINSTANCE.createVariableDescription()));
	}

}
