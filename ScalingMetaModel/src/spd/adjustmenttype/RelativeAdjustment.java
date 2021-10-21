/**
 */
package spd.adjustmenttype;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Adjustment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.adjustmenttype.RelativeAdjustment#getPercentageValue <em>Percentage Value</em>}</li>
 *   <li>{@link spd.adjustmenttype.RelativeAdjustment#getMinAdjustmentValue <em>Min Adjustment Value</em>}</li>
 * </ul>
 *
 * @see spd.adjustmenttype.AdjustmenttypePackage#getRelativeAdjustment()
 * @model
 * @generated
 */
public interface RelativeAdjustment extends AdjustmentType {
	/**
	 * Returns the value of the '<em><b>Percentage Value</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Value</em>' attribute.
	 * @see #setPercentageValue(double)
	 * @see spd.adjustmenttype.AdjustmenttypePackage#getRelativeAdjustment_PercentageValue()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getPercentageValue();

	/**
	 * Sets the value of the '{@link spd.adjustmenttype.RelativeAdjustment#getPercentageValue <em>Percentage Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Value</em>' attribute.
	 * @see #getPercentageValue()
	 * @generated
	 */
	void setPercentageValue(double value);

	/**
	 * Returns the value of the '<em><b>Min Adjustment Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Adjustment Value</em>' attribute.
	 * @see #setMinAdjustmentValue(int)
	 * @see spd.adjustmenttype.AdjustmenttypePackage#getRelativeAdjustment_MinAdjustmentValue()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMinAdjustmentValue();

	/**
	 * Sets the value of the '{@link spd.adjustmenttype.RelativeAdjustment#getMinAdjustmentValue <em>Min Adjustment Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Adjustment Value</em>' attribute.
	 * @see #getMinAdjustmentValue()
	 * @generated
	 */
	void setMinAdjustmentValue(int value);

} // RelativeAdjustment