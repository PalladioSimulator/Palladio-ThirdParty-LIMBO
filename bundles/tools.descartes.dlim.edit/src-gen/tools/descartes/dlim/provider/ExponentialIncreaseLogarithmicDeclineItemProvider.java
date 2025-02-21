/**
 */
package tools.descartes.dlim.provider;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import tools.descartes.dlim.DlimPackage;
import tools.descartes.dlim.ExponentialIncreaseLogarithmicDecline;

/**
 * This is the item provider adapter for a {@link tools.descartes.dlim.ExponentialIncreaseLogarithmicDecline} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class ExponentialIncreaseLogarithmicDeclineItemProvider extends
		BurstItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExponentialIncreaseLogarithmicDeclineItemProvider(
			AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addLogarithmicOrderPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
	 * This adds a property descriptor for the Logarithmic Order feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLogarithmicOrderPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ExponentialIncreaseLogarithmicDecline_logarithmicOrder_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ExponentialIncreaseLogarithmicDecline_logarithmicOrder_feature", "_UI_ExponentialIncreaseLogarithmicDecline_type"),
                 DlimPackage.Literals.EXPONENTIAL_INCREASE_LOGARITHMIC_DECLINE__LOGARITHMIC_ORDER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
	 * This returns ExponentialIncreaseLogarithmicDecline.gif. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ExponentialIncreaseLogarithmicDecline"));
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        ExponentialIncreaseLogarithmicDecline exponentialIncreaseLogarithmicDecline = (ExponentialIncreaseLogarithmicDecline)object;
        return getString("_UI_ExponentialIncreaseLogarithmicDecline_type") + " " + exponentialIncreaseLogarithmicDecline.getPeak();
    }

	/**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @generated
     */
	@Override
	public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(ExponentialIncreaseLogarithmicDecline.class)) {
            case DlimPackage.EXPONENTIAL_INCREASE_LOGARITHMIC_DECLINE__LOGARITHMIC_ORDER:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
