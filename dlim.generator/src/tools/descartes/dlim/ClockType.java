/**
 */
package tools.descartes.dlim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Clock Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 * @see tools.descartes.dlim.DlimPackage#getClockType()
 * @model
 * @generated
 */
public enum ClockType implements Enumerator {
	/**
     * The '<em><b>Root Clock</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ROOT_CLOCK_VALUE
     * @generated
     * @ordered
     */
	ROOT_CLOCK(0, "RootClock", "ROOTCLOCK"),

	/**
     * The '<em><b>Container Clock</b></em>' literal object.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @see #CONTAINER_CLOCK_VALUE
     * @generated
     * @ordered
     */
	CONTAINER_CLOCK(1, "ContainerClock", "CONTAINERCLOCK"), /**
     * The '<em><b>Sequence Clock</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SEQUENCE_CLOCK_VALUE
     * @generated
     * @ordered
     */
	SEQUENCE_CLOCK(2, "SequenceClock", "SEQCLOCK"),

	/**
     * The '<em><b>Loop Clock</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #LOOP_CLOCK_VALUE
     * @generated
     * @ordered
     */
	LOOP_CLOCK(3, "LoopClock", "LOOPCLOCK");

	/**
     * The '<em><b>Root Clock</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Root Clock</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #ROOT_CLOCK
     * @model name="RootClock" literal="ROOTCLOCK"
     * @generated
     * @ordered
     */
	public static final int ROOT_CLOCK_VALUE = 0;

	/**
     * The '<em><b>Container Clock</b></em>' literal value.
     * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Container Clock</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONTAINER_CLOCK
     * @model name="ContainerClock" literal="CONTAINERCLOCK"
     * @generated
     * @ordered
     */
	public static final int CONTAINER_CLOCK_VALUE = 1;

	/**
     * The '<em><b>Sequence Clock</b></em>' literal value.
     * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Sequence Clock</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #SEQUENCE_CLOCK
     * @model name="SequenceClock" literal="SEQCLOCK"
     * @generated
     * @ordered
     */
	public static final int SEQUENCE_CLOCK_VALUE = 2;

	/**
     * The '<em><b>Loop Clock</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loop Clock</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #LOOP_CLOCK
     * @model name="LoopClock" literal="LOOPCLOCK"
     * @generated
     * @ordered
     */
	public static final int LOOP_CLOCK_VALUE = 3;

	/**
	 * An array of all the '<em><b>Clock Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ClockType[] VALUES_ARRAY = new ClockType[] {
            ROOT_CLOCK,
            CONTAINER_CLOCK,
            SEQUENCE_CLOCK,
            LOOP_CLOCK,
        };

	/**
     * A public read-only list of all the '<em><b>Clock Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public static final List<ClockType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Clock Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ClockType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ClockType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Clock Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ClockType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ClockType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Clock Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ClockType get(int value) {
        switch (value) {
            case ROOT_CLOCK_VALUE: return ROOT_CLOCK;
            case CONTAINER_CLOCK_VALUE: return CONTAINER_CLOCK;
            case SEQUENCE_CLOCK_VALUE: return SEQUENCE_CLOCK;
            case LOOP_CLOCK_VALUE: return LOOP_CLOCK;
        }
        return null;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private final int value;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private final String name;

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	private final String literal;

	/**
     * Only this class can construct instances.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @generated
     */
	private ClockType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getValue() {
      return value;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getName() {
      return name;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getLiteral() {
      return literal;
    }

	/**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        return literal;
    }

} // ClockType
