/**
 */
package tools.descartes.dlim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tools.descartes.dlim.DlimPackage;
import tools.descartes.dlim.UniformNoise;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Uniform Noise</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tools.descartes.dlim.impl.UniformNoiseImpl#getMin <em>Min</em>}</li>
 *   <li>{@link tools.descartes.dlim.impl.UniformNoiseImpl#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniformNoiseImpl extends NoiseImpl implements UniformNoise {
	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected double min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected double max = MAX_EDEFAULT;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	protected UniformNoiseImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DlimPackage.Literals.UNIFORM_NOISE;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public double getMin() {
        return min;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setMin(double newMin) {
        double oldMin = min;
        min = newMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DlimPackage.UNIFORM_NOISE__MIN, oldMin, min));
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public double getMax() {
        return max;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setMax(double newMax) {
        double oldMax = max;
        max = newMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DlimPackage.UNIFORM_NOISE__MAX, oldMax, max));
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DlimPackage.UNIFORM_NOISE__MIN:
                return getMin();
            case DlimPackage.UNIFORM_NOISE__MAX:
                return getMax();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DlimPackage.UNIFORM_NOISE__MIN:
                setMin((Double)newValue);
                return;
            case DlimPackage.UNIFORM_NOISE__MAX:
                setMax((Double)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case DlimPackage.UNIFORM_NOISE__MIN:
                setMin(MIN_EDEFAULT);
                return;
            case DlimPackage.UNIFORM_NOISE__MAX:
                setMax(MAX_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case DlimPackage.UNIFORM_NOISE__MIN:
                return min != MIN_EDEFAULT;
            case DlimPackage.UNIFORM_NOISE__MAX:
                return max != MAX_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (min: ");
        result.append(min);
        result.append(", max: ");
        result.append(max);
        result.append(')');
        return result.toString();
    }

} // UniformNoiseImpl
