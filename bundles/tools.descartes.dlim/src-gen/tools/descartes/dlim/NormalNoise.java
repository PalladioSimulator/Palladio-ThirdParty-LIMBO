/**
 */
package tools.descartes.dlim;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Normal Noise</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tools.descartes.dlim.NormalNoise#getMean <em>Mean</em>}</li>
 *   <li>{@link tools.descartes.dlim.NormalNoise#getStandardDeviation <em>Standard Deviation</em>}</li>
 * </ul>
 *
 * @see tools.descartes.dlim.DlimPackage#getNormalNoise()
 * @model
 * @generated
 */
public interface NormalNoise extends Noise {
	/**
     * Returns the value of the '<em><b>Mean</b></em>' attribute.
     * The default value is <code>"1.0"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mean</em>' attribute.
     * @see #setMean(double)
     * @see tools.descartes.dlim.DlimPackage#getNormalNoise_Mean()
     * @model default="1.0"
     * @generated
     */
	double getMean();

	/**
     * Sets the value of the '{@link tools.descartes.dlim.NormalNoise#getMean <em>Mean</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Mean</em>' attribute.
     * @see #getMean()
     * @generated
     */
	void setMean(double value);

	/**
     * Returns the value of the '<em><b>Standard Deviation</b></em>' attribute.
     * The default value is <code>"1.0"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Deviation</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Standard Deviation</em>' attribute.
     * @see #setStandardDeviation(double)
     * @see tools.descartes.dlim.DlimPackage#getNormalNoise_StandardDeviation()
     * @model default="1.0"
     * @generated
     */
	double getStandardDeviation();

	/**
     * Sets the value of the '{@link tools.descartes.dlim.NormalNoise#getStandardDeviation <em>Standard Deviation</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @param value the new value of the '<em>Standard Deviation</em>' attribute.
     * @see #getStandardDeviation()
     * @generated
     */
	void setStandardDeviation(double value);

} // NormalNoise
