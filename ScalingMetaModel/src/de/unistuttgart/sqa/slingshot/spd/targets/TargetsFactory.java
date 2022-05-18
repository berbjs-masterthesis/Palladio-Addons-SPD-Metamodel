/**
 */
package de.unistuttgart.sqa.slingshot.spd.targets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.unistuttgart.sqa.slingshot.spd.targets.TargetsPackage
 * @generated
 */
public interface TargetsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetsFactory eINSTANCE = de.unistuttgart.sqa.slingshot.spd.targets.impl.TargetsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Target Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Group</em>'.
	 * @generated
	 */
	TargetGroup createTargetGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TargetsPackage getTargetsPackage();

} //TargetsFactory