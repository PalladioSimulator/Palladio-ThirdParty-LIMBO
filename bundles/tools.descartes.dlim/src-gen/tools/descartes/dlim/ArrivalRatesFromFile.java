/**
 */
package tools.descartes.dlim;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Arrival Rates From File</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tools.descartes.dlim.ArrivalRatesFromFile#getFilePath <em>File Path</em>}</li>
 * </ul>
 *
 * @see tools.descartes.dlim.DlimPackage#getArrivalRatesFromFile()
 * @model
 * @generated
 */
public interface ArrivalRatesFromFile extends Function {
	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute. The
	 * default value is <code>"C:/arrivalRates/arrivalRateFile.txt"</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Path</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFilePath(String)
	 * @see tools.descartes.dlim.DlimPackage#getArrivalRatesFromFile_FilePath()
	 * @model default="C:/arrivalRates/arrivalRateFile.txt"
	 * @generated
	 */
	String getFilePath();

	/**
	 * Sets the value of the '
	 * {@link tools.descartes.dlim.ArrivalRatesFromFile#getFilePath
	 * <em>File Path</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>File Path</em>' attribute.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(String value);

} // ArrivalRatesFromFile
