/**
 */
package tools.descartes.dlim.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tools.descartes.dlim.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class DlimFactoryImpl extends EFactoryImpl implements DlimFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @generated
     */
	public static DlimFactory init() {
        try {
            DlimFactory theDlimFactory = (DlimFactory)EPackage.Registry.INSTANCE.getEFactory(DlimPackage.eNS_URI);
            if (theDlimFactory != null) {
                return theDlimFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DlimFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @generated
     */
	public DlimFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case DlimPackage.SEQUENCE: return createSequence();
            case DlimPackage.COMBINATOR: return createCombinator();
            case DlimPackage.TIME_DEPENDENT_FUNCTION_CONTAINER: return createTimeDependentFunctionContainer();
            case DlimPackage.UNIFORM_NOISE: return createUniformNoise();
            case DlimPackage.NORMAL_NOISE: return createNormalNoise();
            case DlimPackage.CONSTANT: return createConstant();
            case DlimPackage.SIN: return createSin();
            case DlimPackage.EXPONENTIAL_INCREASE_AND_DECLINE: return createExponentialIncreaseAndDecline();
            case DlimPackage.EXPONENTIAL_INCREASE_LOGARITHMIC_DECLINE: return createExponentialIncreaseLogarithmicDecline();
            case DlimPackage.LINEAR_INCREASE_AND_DECLINE: return createLinearIncreaseAndDecline();
            case DlimPackage.ABSOLUTE_SIN: return createAbsoluteSin();
            case DlimPackage.LINEAR_TREND: return createLinearTrend();
            case DlimPackage.EXPONENTIAL_TREND: return createExponentialTrend();
            case DlimPackage.LOGARITHMIC_TREND: return createLogarithmicTrend();
            case DlimPackage.SIN_TREND: return createSinTrend();
            case DlimPackage.REFERENCE_CLOCK_OBJECT: return createReferenceClockObject();
            case DlimPackage.ARRIVAL_RATES_FROM_FILE: return createArrivalRatesFromFile();
            case DlimPackage.ABSOLUTE_VALUE_FUNCTION: return createAbsoluteValueFunction();
            case DlimPackage.POLYNOMIAL: return createPolynomial();
            case DlimPackage.POLYNOMIAL_FACTOR: return createPolynomialFactor();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case DlimPackage.CLOCK_TYPE:
                return createClockTypeFromString(eDataType, initialValue);
            case DlimPackage.OPERATOR:
                return createOperatorFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case DlimPackage.CLOCK_TYPE:
                return convertClockTypeToString(eDataType, instanceValue);
            case DlimPackage.OPERATOR:
                return convertOperatorToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Sequence createSequence() {
        SequenceImpl sequence = new SequenceImpl();
        return sequence;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Combinator createCombinator() {
        CombinatorImpl combinator = new CombinatorImpl();
        return combinator;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public TimeDependentFunctionContainer createTimeDependentFunctionContainer() {
        TimeDependentFunctionContainerImpl timeDependentFunctionContainer = new TimeDependentFunctionContainerImpl();
        return timeDependentFunctionContainer;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public UniformNoise createUniformNoise() {
        UniformNoiseImpl uniformNoise = new UniformNoiseImpl();
        return uniformNoise;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public NormalNoise createNormalNoise() {
        NormalNoiseImpl normalNoise = new NormalNoiseImpl();
        return normalNoise;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Constant createConstant() {
        ConstantImpl constant = new ConstantImpl();
        return constant;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Sin createSin() {
        SinImpl sin = new SinImpl();
        return sin;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public ExponentialIncreaseAndDecline createExponentialIncreaseAndDecline() {
        ExponentialIncreaseAndDeclineImpl exponentialIncreaseAndDecline = new ExponentialIncreaseAndDeclineImpl();
        return exponentialIncreaseAndDecline;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public ExponentialIncreaseLogarithmicDecline createExponentialIncreaseLogarithmicDecline() {
        ExponentialIncreaseLogarithmicDeclineImpl exponentialIncreaseLogarithmicDecline = new ExponentialIncreaseLogarithmicDeclineImpl();
        return exponentialIncreaseLogarithmicDecline;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public LinearIncreaseAndDecline createLinearIncreaseAndDecline() {
        LinearIncreaseAndDeclineImpl linearIncreaseAndDecline = new LinearIncreaseAndDeclineImpl();
        return linearIncreaseAndDecline;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public AbsoluteSin createAbsoluteSin() {
        AbsoluteSinImpl absoluteSin = new AbsoluteSinImpl();
        return absoluteSin;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public LinearTrend createLinearTrend() {
        LinearTrendImpl linearTrend = new LinearTrendImpl();
        return linearTrend;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public ExponentialTrend createExponentialTrend() {
        ExponentialTrendImpl exponentialTrend = new ExponentialTrendImpl();
        return exponentialTrend;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public LogarithmicTrend createLogarithmicTrend() {
        LogarithmicTrendImpl logarithmicTrend = new LogarithmicTrendImpl();
        return logarithmicTrend;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public SinTrend createSinTrend() {
        SinTrendImpl sinTrend = new SinTrendImpl();
        return sinTrend;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public ReferenceClockObject createReferenceClockObject() {
        ReferenceClockObjectImpl referenceClockObject = new ReferenceClockObjectImpl();
        return referenceClockObject;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public ArrivalRatesFromFile createArrivalRatesFromFile() {
        ArrivalRatesFromFileImpl arrivalRatesFromFile = new ArrivalRatesFromFileImpl();
        return arrivalRatesFromFile;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public AbsoluteValueFunction createAbsoluteValueFunction() {
        AbsoluteValueFunctionImpl absoluteValueFunction = new AbsoluteValueFunctionImpl();
        return absoluteValueFunction;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Polynomial createPolynomial() {
        PolynomialImpl polynomial = new PolynomialImpl();
        return polynomial;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public PolynomialFactor createPolynomialFactor() {
        PolynomialFactorImpl polynomialFactor = new PolynomialFactorImpl();
        return polynomialFactor;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public ClockType createClockTypeFromString(EDataType eDataType,
			String initialValue) {
        ClockType result = ClockType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public String convertClockTypeToString(EDataType eDataType,
			Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public Operator createOperatorFromString(EDataType eDataType,
			String initialValue) {
        Operator result = Operator.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public String convertOperatorToString(EDataType eDataType,
			Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
    public DlimPackage getDlimPackage() {
        return (DlimPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static DlimPackage getPackage() {
        return DlimPackage.eINSTANCE;
    }

} // DlimFactoryImpl
