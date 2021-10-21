/**
 */
package spd.policyconstraint.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import spd.SpdPackage;

import spd.adjustmenttype.AdjustmenttypePackage;

import spd.adjustmenttype.impl.AdjustmenttypePackageImpl;

import spd.impl.SpdPackageImpl;

import spd.palladio.PalladioPackage;
import spd.palladio.impl.PalladioPackageImpl;
import spd.policyconstraint.CooldownConstraint;
import spd.policyconstraint.GroupSizeConstraint;
import spd.policyconstraint.IntervallConstraint;
import spd.policyconstraint.PolicyConstraint;
import spd.policyconstraint.PolicyconstraintFactory;
import spd.policyconstraint.PolicyconstraintPackage;
import spd.policyconstraint.TimeBasedConstraint;

import spd.scalingtrigger.ScalingtriggerPackage;

import spd.scalingtrigger.impl.ScalingtriggerPackageImpl;

import spd.targetgroup.TargetgroupPackage;

import spd.targetgroup.impl.TargetgroupPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyconstraintPackageImpl extends EPackageImpl implements PolicyconstraintPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeBasedConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupSizeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervallConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cooldownConstraintEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see spd.policyconstraint.PolicyconstraintPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PolicyconstraintPackageImpl() {
		super(eNS_URI, PolicyconstraintFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PolicyconstraintPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PolicyconstraintPackage init() {
		if (isInited) return (PolicyconstraintPackage)EPackage.Registry.INSTANCE.getEPackage(PolicyconstraintPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPolicyconstraintPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PolicyconstraintPackageImpl thePolicyconstraintPackage = registeredPolicyconstraintPackage instanceof PolicyconstraintPackageImpl ? (PolicyconstraintPackageImpl)registeredPolicyconstraintPackage : new PolicyconstraintPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SpdPackage.eNS_URI);
		SpdPackageImpl theSpdPackage = (SpdPackageImpl)(registeredPackage instanceof SpdPackageImpl ? registeredPackage : SpdPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetgroupPackage.eNS_URI);
		TargetgroupPackageImpl theTargetgroupPackage = (TargetgroupPackageImpl)(registeredPackage instanceof TargetgroupPackageImpl ? registeredPackage : TargetgroupPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdjustmenttypePackage.eNS_URI);
		AdjustmenttypePackageImpl theAdjustmenttypePackage = (AdjustmenttypePackageImpl)(registeredPackage instanceof AdjustmenttypePackageImpl ? registeredPackage : AdjustmenttypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ScalingtriggerPackage.eNS_URI);
		ScalingtriggerPackageImpl theScalingtriggerPackage = (ScalingtriggerPackageImpl)(registeredPackage instanceof ScalingtriggerPackageImpl ? registeredPackage : ScalingtriggerPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PalladioPackage.eNS_URI);
		PalladioPackageImpl thePalladioPackage = (PalladioPackageImpl)(registeredPackage instanceof PalladioPackageImpl ? registeredPackage : PalladioPackage.eINSTANCE);

		// Create package meta-data objects
		thePolicyconstraintPackage.createPackageContents();
		theSpdPackage.createPackageContents();
		theTargetgroupPackage.createPackageContents();
		theAdjustmenttypePackage.createPackageContents();
		theScalingtriggerPackage.createPackageContents();
		thePalladioPackage.createPackageContents();

		// Initialize created meta-data
		thePolicyconstraintPackage.initializePackageContents();
		theSpdPackage.initializePackageContents();
		theTargetgroupPackage.initializePackageContents();
		theAdjustmenttypePackage.initializePackageContents();
		theScalingtriggerPackage.initializePackageContents();
		thePalladioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePolicyconstraintPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PolicyconstraintPackage.eNS_URI, thePolicyconstraintPackage);
		return thePolicyconstraintPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyConstraint() {
		return policyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeBasedConstraint() {
		return timeBasedConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroupSizeConstraint() {
		return groupSizeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupSizeConstraint_MinSize() {
		return (EAttribute)groupSizeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupSizeConstraint_MaxSize() {
		return (EAttribute)groupSizeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntervallConstraint() {
		return intervallConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntervallConstraint_Offset() {
		return (EAttribute)intervallConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntervallConstraint_IntervallDuration() {
		return (EAttribute)intervallConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCooldownConstraint() {
		return cooldownConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCooldownConstraint_CooldownTime() {
		return (EAttribute)cooldownConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCooldownConstraint_MaxScalingOperations() {
		return (EAttribute)cooldownConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyconstraintFactory getPolicyconstraintFactory() {
		return (PolicyconstraintFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		policyConstraintEClass = createEClass(POLICY_CONSTRAINT);

		timeBasedConstraintEClass = createEClass(TIME_BASED_CONSTRAINT);

		groupSizeConstraintEClass = createEClass(GROUP_SIZE_CONSTRAINT);
		createEAttribute(groupSizeConstraintEClass, GROUP_SIZE_CONSTRAINT__MIN_SIZE);
		createEAttribute(groupSizeConstraintEClass, GROUP_SIZE_CONSTRAINT__MAX_SIZE);

		intervallConstraintEClass = createEClass(INTERVALL_CONSTRAINT);
		createEAttribute(intervallConstraintEClass, INTERVALL_CONSTRAINT__OFFSET);
		createEAttribute(intervallConstraintEClass, INTERVALL_CONSTRAINT__INTERVALL_DURATION);

		cooldownConstraintEClass = createEClass(COOLDOWN_CONSTRAINT);
		createEAttribute(cooldownConstraintEClass, COOLDOWN_CONSTRAINT__COOLDOWN_TIME);
		createEAttribute(cooldownConstraintEClass, COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SpdPackage theSpdPackage = (SpdPackage)EPackage.Registry.INSTANCE.getEPackage(SpdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		policyConstraintEClass.getESuperTypes().add(theSpdPackage.getPolicyConstraint());
		timeBasedConstraintEClass.getESuperTypes().add(this.getPolicyConstraint());
		groupSizeConstraintEClass.getESuperTypes().add(this.getPolicyConstraint());
		intervallConstraintEClass.getESuperTypes().add(this.getTimeBasedConstraint());
		cooldownConstraintEClass.getESuperTypes().add(this.getTimeBasedConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(policyConstraintEClass, PolicyConstraint.class, "PolicyConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeBasedConstraintEClass, TimeBasedConstraint.class, "TimeBasedConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupSizeConstraintEClass, GroupSizeConstraint.class, "GroupSizeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupSizeConstraint_MinSize(), ecorePackage.getEInt(), "minSize", null, 1, 1, GroupSizeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroupSizeConstraint_MaxSize(), ecorePackage.getEInt(), "maxSize", null, 1, 1, GroupSizeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intervallConstraintEClass, IntervallConstraint.class, "IntervallConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntervallConstraint_Offset(), ecorePackage.getEInt(), "offset", null, 1, 1, IntervallConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntervallConstraint_IntervallDuration(), ecorePackage.getEInt(), "intervallDuration", null, 1, 1, IntervallConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cooldownConstraintEClass, CooldownConstraint.class, "CooldownConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCooldownConstraint_CooldownTime(), ecorePackage.getEDouble(), "cooldownTime", null, 1, 1, CooldownConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCooldownConstraint_MaxScalingOperations(), ecorePackage.getEInt(), "maxScalingOperations", null, 1, 1, CooldownConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PolicyconstraintPackageImpl