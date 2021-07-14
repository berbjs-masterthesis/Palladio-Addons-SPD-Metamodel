/**
 */
package spd.scalingtrigger.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spd.scalingtrigger.HDDUSAGETYPE;
import spd.scalingtrigger.HDDUtilizationTrigger;
import spd.scalingtrigger.ScalingtriggerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HDD Utilization Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.impl.HDDUtilizationTriggerImpl#getUsageType <em>Usage Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HDDUtilizationTriggerImpl extends ProcessingResourceUtilizationBasedTriggerImpl implements HDDUtilizationTrigger {
	/**
	 * The default value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageType()
	 * @generated
	 * @ordered
	 */
	protected static final HDDUSAGETYPE USAGE_TYPE_EDEFAULT = HDDUSAGETYPE.READ;

	/**
	 * The cached value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageType()
	 * @generated
	 * @ordered
	 */
	protected HDDUSAGETYPE usageType = USAGE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDDUtilizationTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalingtriggerPackage.Literals.HDD_UTILIZATION_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDDUSAGETYPE getUsageType() {
		return usageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageType(HDDUSAGETYPE newUsageType) {
		HDDUSAGETYPE oldUsageType = usageType;
		usageType = newUsageType == null ? USAGE_TYPE_EDEFAULT : newUsageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalingtriggerPackage.HDD_UTILIZATION_TRIGGER__USAGE_TYPE, oldUsageType, usageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScalingtriggerPackage.HDD_UTILIZATION_TRIGGER__USAGE_TYPE:
				return getUsageType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScalingtriggerPackage.HDD_UTILIZATION_TRIGGER__USAGE_TYPE:
				setUsageType((HDDUSAGETYPE)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScalingtriggerPackage.HDD_UTILIZATION_TRIGGER__USAGE_TYPE:
				setUsageType(USAGE_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScalingtriggerPackage.HDD_UTILIZATION_TRIGGER__USAGE_TYPE:
				return usageType != USAGE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (usageType: ");
		result.append(usageType);
		result.append(')');
		return result.toString();
	}

} //HDDUtilizationTriggerImpl
