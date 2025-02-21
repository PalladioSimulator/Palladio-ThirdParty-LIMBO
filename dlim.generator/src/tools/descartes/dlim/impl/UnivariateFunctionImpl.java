/**
 */
package tools.descartes.dlim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tools.descartes.dlim.DlimPackage;
import tools.descartes.dlim.Function;
import tools.descartes.dlim.UnivariateFunction;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Univariate Function</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tools.descartes.dlim.impl.UnivariateFunctionImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UnivariateFunctionImpl extends FunctionImpl implements
		UnivariateFunction {
	/**
     * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFunction()
     * @generated
     * @ordered
     */
	protected Function function;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	protected UnivariateFunctionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DlimPackage.Literals.UNIVARIATE_FUNCTION;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Function getFunction() {
        return function;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetFunction(Function newFunction,
			NotificationChain msgs) {
        Function oldFunction = function;
        function = newFunction;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DlimPackage.UNIVARIATE_FUNCTION__FUNCTION, oldFunction, newFunction);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setFunction(Function newFunction) {
        if (newFunction != function) {
            NotificationChain msgs = null;
            if (function != null)
                msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DlimPackage.UNIVARIATE_FUNCTION__FUNCTION, null, msgs);
            if (newFunction != null)
                msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DlimPackage.UNIVARIATE_FUNCTION__FUNCTION, null, msgs);
            msgs = basicSetFunction(newFunction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DlimPackage.UNIVARIATE_FUNCTION__FUNCTION, newFunction, newFunction));
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DlimPackage.UNIVARIATE_FUNCTION__FUNCTION:
                return basicSetFunction(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DlimPackage.UNIVARIATE_FUNCTION__FUNCTION:
                return getFunction();
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
            case DlimPackage.UNIVARIATE_FUNCTION__FUNCTION:
                setFunction((Function)newValue);
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
            case DlimPackage.UNIVARIATE_FUNCTION__FUNCTION:
                setFunction((Function)null);
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
            case DlimPackage.UNIVARIATE_FUNCTION__FUNCTION:
                return function != null;
        }
        return super.eIsSet(featureID);
    }

} // UnivariateFunctionImpl
