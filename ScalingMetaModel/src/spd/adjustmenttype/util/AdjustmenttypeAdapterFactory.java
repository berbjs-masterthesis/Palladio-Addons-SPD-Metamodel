/**
 */
package spd.adjustmenttype.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import spd.adjustmenttype.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see spd.adjustmenttype.AdjustmenttypePackage
 * @generated
 */
public class AdjustmenttypeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdjustmenttypePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjustmenttypeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AdjustmenttypePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdjustmenttypeSwitch<Adapter> modelSwitch =
		new AdjustmenttypeSwitch<Adapter>() {
			@Override
			public Adapter caseAdjustmentType(AdjustmentType object) {
				return createAdjustmentTypeAdapter();
			}
			@Override
			public Adapter caseRelativeAdjustment(RelativeAdjustment object) {
				return createRelativeAdjustmentAdapter();
			}
			@Override
			public Adapter caseAbsoluteAdjustment(AbsoluteAdjustment object) {
				return createAbsoluteAdjustmentAdapter();
			}
			@Override
			public Adapter caseStepAdjustment(StepAdjustment object) {
				return createStepAdjustmentAdapter();
			}
			@Override
			public Adapter caseSpd_AdjustmentType(spd.AdjustmentType object) {
				return createSpd_AdjustmentTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link spd.adjustmenttype.AdjustmentType <em>Adjustment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.adjustmenttype.AdjustmentType
	 * @generated
	 */
	public Adapter createAdjustmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.adjustmenttype.RelativeAdjustment <em>Relative Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.adjustmenttype.RelativeAdjustment
	 * @generated
	 */
	public Adapter createRelativeAdjustmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.adjustmenttype.AbsoluteAdjustment <em>Absolute Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.adjustmenttype.AbsoluteAdjustment
	 * @generated
	 */
	public Adapter createAbsoluteAdjustmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.adjustmenttype.StepAdjustment <em>Step Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.adjustmenttype.StepAdjustment
	 * @generated
	 */
	public Adapter createStepAdjustmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spd.AdjustmentType <em>Adjustment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spd.AdjustmentType
	 * @generated
	 */
	public Adapter createSpd_AdjustmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AdjustmenttypeAdapterFactory
