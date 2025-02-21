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
import tools.descartes.dlim.LogarithmicTrend;

/**
 * This is the item provider adapter for a {@link tools.descartes.dlim.LogarithmicTrend} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LogarithmicTrendItemProvider extends TrendItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LogarithmicTrendItemProvider(AdapterFactory adapterFactory) {
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

            addOrderPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
	 * This adds a property descriptor for the Order feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addOrderPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_LogarithmicTrend_order_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_LogarithmicTrend_order_feature", "_UI_LogarithmicTrend_type"),
                 DlimPackage.Literals.LOGARITHMIC_TREND__ORDER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This returns LogarithmicTrend.gif.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @generated
     */
	@Override
	public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/LogarithmicTrend"));
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        LogarithmicTrend logarithmicTrend = (LogarithmicTrend)object;
        return getString("_UI_LogarithmicTrend_type") + " " + logarithmicTrend.getFunctionOutputAtStart();
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

        switch (notification.getFeatureID(LogarithmicTrend.class)) {
            case DlimPackage.LOGARITHMIC_TREND__ORDER:
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
