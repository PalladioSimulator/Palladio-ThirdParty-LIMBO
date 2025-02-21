/**
 */
package tools.descartes.dlim;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Logarithmic Trend</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tools.descartes.dlim.LogarithmicTrend#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see tools.descartes.dlim.DlimPackage#getLogarithmicTrend()
 * @model
 * @generated
 */
public interface LogarithmicTrend extends Trend {
	/**
     * Returns the value of the '<em><b>Order</b></em>' attribute.
     * The default value is <code>"4.0"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Order</em>' attribute.
     * @see #setOrder(double)
     * @see tools.descartes.dlim.DlimPackage#getLogarithmicTrend_Order()
     * @model default="4.0"
     * @generated
     */
	double getOrder();

	/**
     * Sets the value of the '{@link tools.descartes.dlim.LogarithmicTrend#getOrder <em>Order</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Order</em>' attribute.
     * @see #getOrder()
     * @generated
     */
	void setOrder(double value);

} // LogarithmicTrend
