/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models;

import org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>QThresholds Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.models.QThresholdsModel#getInput <em>Input</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.QThresholdsModel#getTargetResponseTime <em>Target
 * Response Time</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.QThresholdsModel#getResponseTimeStimulus <em>Response
 * Time Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.QThresholdsModel#getExponentialSteepness
 * <em>Exponential Steepness</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.QThresholdsModel#getUtilizationStimulus
 * <em>Utilization Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.QThresholdsModel#getEpsilon <em>Epsilon</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.models.ModelsPackage#getQThresholdsModel()
 * @model
 * @generated
 */
public interface QThresholdsModel extends LearningBasedModel {

    /**
     * Returns the value of the '<em><b>Input</b></em>' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Input</em>' containment reference.
     * @see #setInput(Stimulus)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getQThresholdsModel_Input()
     * @model containment="true" required="true"
     * @generated
     */
    Stimulus getInput();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.models.QThresholdsModel#getInput
     * <em>Input</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Input</em>' containment reference.
     * @see #getInput()
     * @generated
     */
    void setInput(Stimulus value);

    /**
     * Returns the value of the '<em><b>Target Response Time</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Target Response Time</em>' attribute.
     * @see #setTargetResponseTime(double)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getQThresholdsModel_TargetResponseTime()
     * @model
     * @generated
     */
    double getTargetResponseTime();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.models.QThresholdsModel#getTargetResponseTime <em>Target
     * Response Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Target Response Time</em>' attribute.
     * @see #getTargetResponseTime()
     * @generated
     */
    void setTargetResponseTime(double value);

    /**
     * Returns the value of the '<em><b>Response Time Stimulus</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Response Time Stimulus</em>' containment reference.
     * @see #setResponseTimeStimulus(OperationResponseTime)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getQThresholdsModel_ResponseTimeStimulus()
     * @model containment="true" required="true"
     * @generated
     */
    OperationResponseTime getResponseTimeStimulus();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.models.QThresholdsModel#getResponseTimeStimulus
     * <em>Response Time Stimulus</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Response Time Stimulus</em>' containment reference.
     * @see #getResponseTimeStimulus()
     * @generated
     */
    void setResponseTimeStimulus(OperationResponseTime value);

    /**
     * Returns the value of the '<em><b>Exponential Steepness</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Exponential Steepness</em>' attribute.
     * @see #setExponentialSteepness(double)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getQThresholdsModel_ExponentialSteepness()
     * @model
     * @generated
     */
    double getExponentialSteepness();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.models.QThresholdsModel#getExponentialSteepness
     * <em>Exponential Steepness</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Exponential Steepness</em>' attribute.
     * @see #getExponentialSteepness()
     * @generated
     */
    void setExponentialSteepness(double value);

    /**
     * Returns the value of the '<em><b>Utilization Stimulus</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Utilization Stimulus</em>' containment reference.
     * @see #setUtilizationStimulus(Stimulus)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getQThresholdsModel_UtilizationStimulus()
     * @model containment="true" required="true"
     * @generated
     */
    Stimulus getUtilizationStimulus();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.models.QThresholdsModel#getUtilizationStimulus
     * <em>Utilization Stimulus</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Utilization Stimulus</em>' containment reference.
     * @see #getUtilizationStimulus()
     * @generated
     */
    void setUtilizationStimulus(Stimulus value);

    /**
     * Returns the value of the '<em><b>Epsilon</b></em>' attribute. The default value is
     * <code>"0.05"</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Epsilon</em>' attribute.
     * @see #setEpsilon(double)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getQThresholdsModel_Epsilon()
     * @model default="0.05" dataType="org.palladiosimulator.spd.datatypes.PercentDouble"
     *        required="true"
     * @generated
     */
    double getEpsilon();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.models.QThresholdsModel#getEpsilon
     * <em>Epsilon</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Epsilon</em>' attribute.
     * @see #getEpsilon()
     * @generated
     */
    void setEpsilon(double value);
} // QThresholdsModel