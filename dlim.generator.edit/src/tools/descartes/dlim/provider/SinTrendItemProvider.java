/**
 */
package tools.descartes.dlim.provider;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import tools.descartes.dlim.SinTrend;

/**
 * This is the item provider adapter for a {@link tools.descartes.dlim.SinTrend} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class SinTrendItemProvider extends TrendItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SinTrendItemProvider(AdapterFactory adapterFactory) {
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

        }
        return itemPropertyDescriptors;
    }

	/**
     * This returns SinTrend.gif.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SinTrend"));
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        SinTrend sinTrend = (SinTrend)object;
        return getString("_UI_SinTrend_type") + " " + sinTrend.getFunctionOutputAtStart();
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
