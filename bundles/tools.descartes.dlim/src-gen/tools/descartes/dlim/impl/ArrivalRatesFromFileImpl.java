/**
 */
package tools.descartes.dlim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tools.descartes.dlim.ArrivalRatesFromFile;
import tools.descartes.dlim.DlimPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Arrival Rates From File</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tools.descartes.dlim.impl.ArrivalRatesFromFileImpl#getFilePath <em>File Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrivalRatesFromFileImpl extends FunctionImpl implements
		ArrivalRatesFromFile {
	/**
     * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFilePath()
     * @generated
     * @ordered
     */
	protected static final String FILE_PATH_EDEFAULT = "C:/arrivalRates/arrivalRateFile.txt";

	/**
     * The cached value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFilePath()
     * @generated
     * @ordered
     */
	protected String filePath = FILE_PATH_EDEFAULT;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	protected ArrivalRatesFromFileImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DlimPackage.Literals.ARRIVAL_RATES_FROM_FILE;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getFilePath() {
        return filePath;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setFilePath(String newFilePath) {
        String oldFilePath = filePath;
        filePath = newFilePath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DlimPackage.ARRIVAL_RATES_FROM_FILE__FILE_PATH, oldFilePath, filePath));
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DlimPackage.ARRIVAL_RATES_FROM_FILE__FILE_PATH:
                return getFilePath();
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
            case DlimPackage.ARRIVAL_RATES_FROM_FILE__FILE_PATH:
                setFilePath((String)newValue);
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
            case DlimPackage.ARRIVAL_RATES_FROM_FILE__FILE_PATH:
                setFilePath(FILE_PATH_EDEFAULT);
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
            case DlimPackage.ARRIVAL_RATES_FROM_FILE__FILE_PATH:
                return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
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
        result.append(" (filePath: ");
        result.append(filePath);
        result.append(')');
        return result.toString();
    }

} // ArrivalRatesFromFileImpl
