/**
 */
package de.unistuttgart.sqa.slingshot.spd.constraints;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.unistuttgart.sqa.slingshot.spd.constraints.ConstraintsPackage
 * @generated
 */
public interface ConstraintsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintsFactory eINSTANCE = de.unistuttgart.sqa.slingshot.spd.constraints.impl.ConstraintsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Target Group Size Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Group Size Constraint</em>'.
	 * @generated
	 */
	TargetGroupSizeConstraint createTargetGroupSizeConstraint();

	/**
	 * Returns a new object of class '<em>Intervall Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intervall Constraint</em>'.
	 * @generated
	 */
	IntervallConstraint createIntervallConstraint();

	/**
	 * Returns a new object of class '<em>Cooldown Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cooldown Constraint</em>'.
	 * @generated
	 */
	CooldownConstraint createCooldownConstraint();

	/**
	 * Returns a new object of class '<em>Thrashing Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thrashing Constraint</em>'.
	 * @generated
	 */
	ThrashingConstraint createThrashingConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConstraintsPackage getConstraintsPackage();

} //ConstraintsFactory