
package at.erpel.schemas._1p0.documents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalForecastInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalForecastInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}LastDeliveryReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CumulativeScheduledQuantity" type="{http://erpel.at/schemas/1p0/documents}ConditionalUnitType" minOccurs="0"/&gt;
 *         &lt;element name="CumulativeReceivedQuantityLastPeriod" type="{http://erpel.at/schemas/1p0/documents}ExtendedPeriodType" minOccurs="0"/&gt;
 *         &lt;element name="CumulativeReceivedQuantitySummary" type="{http://erpel.at/schemas/1p0/documents}ExtendedPeriodType" minOccurs="0"/&gt;
 *         &lt;element name="PlanningHorizion" type="{http://erpel.at/schemas/1p0/documents}ExtendedPeriodType" minOccurs="0"/&gt;
 *         &lt;element name="MaterialAuthorization" type="{http://erpel.at/schemas/1p0/documents}ExtendedPeriodType" minOccurs="0"/&gt;
 *         &lt;element name="ProductionAuthorization" type="{http://erpel.at/schemas/1p0/documents}ExtendedPeriodType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalForecastInformationType", propOrder = {
    "documentReference",
    "lastDeliveryReference",
    "cumulativeScheduledQuantity",
    "cumulativeReceivedQuantityLastPeriod",
    "cumulativeReceivedQuantitySummary",
    "planningHorizion",
    "materialAuthorization",
    "productionAuthorization"
})
public class AdditionalForecastInformationType {

    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "LastDeliveryReference")
    protected List<ForecastASNReferenceType> lastDeliveryReference;
    @XmlElement(name = "CumulativeScheduledQuantity")
    protected ConditionalUnitType cumulativeScheduledQuantity;
    @XmlElement(name = "CumulativeReceivedQuantityLastPeriod")
    protected ExtendedPeriodType cumulativeReceivedQuantityLastPeriod;
    @XmlElement(name = "CumulativeReceivedQuantitySummary")
    protected ExtendedPeriodType cumulativeReceivedQuantitySummary;
    @XmlElement(name = "PlanningHorizion")
    protected ExtendedPeriodType planningHorizion;
    @XmlElement(name = "MaterialAuthorization")
    protected ExtendedPeriodType materialAuthorization;
    @XmlElement(name = "ProductionAuthorization")
    protected ExtendedPeriodType productionAuthorization;

    /**
     * Partner's reference to any document (e.g. CallOff, PreviousCallOff, Order, Contract, Release, Agreement).Gets the value of the documentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReference;
    }

    /**
     * Information regarding the last delivery like ASN number, ASN date, delivery date and quantities.Gets the value of the lastDeliveryReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastDeliveryReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastDeliveryReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastASNReferenceType }
     * 
     * 
     */
    public List<ForecastASNReferenceType> getLastDeliveryReference() {
        if (lastDeliveryReference == null) {
            lastDeliveryReference = new ArrayList<ForecastASNReferenceType>();
        }
        return this.lastDeliveryReference;
    }

    /**
     * Gets the value of the cumulativeScheduledQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalUnitType }
     *     
     */
    public ConditionalUnitType getCumulativeScheduledQuantity() {
        return cumulativeScheduledQuantity;
    }

    /**
     * Sets the value of the cumulativeScheduledQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalUnitType }
     *     
     */
    public void setCumulativeScheduledQuantity(ConditionalUnitType value) {
        this.cumulativeScheduledQuantity = value;
    }

    /**
     * Gets the value of the cumulativeReceivedQuantityLastPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedPeriodType }
     *     
     */
    public ExtendedPeriodType getCumulativeReceivedQuantityLastPeriod() {
        return cumulativeReceivedQuantityLastPeriod;
    }

    /**
     * Sets the value of the cumulativeReceivedQuantityLastPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedPeriodType }
     *     
     */
    public void setCumulativeReceivedQuantityLastPeriod(ExtendedPeriodType value) {
        this.cumulativeReceivedQuantityLastPeriod = value;
    }

    /**
     * Gets the value of the cumulativeReceivedQuantitySummary property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedPeriodType }
     *     
     */
    public ExtendedPeriodType getCumulativeReceivedQuantitySummary() {
        return cumulativeReceivedQuantitySummary;
    }

    /**
     * Sets the value of the cumulativeReceivedQuantitySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedPeriodType }
     *     
     */
    public void setCumulativeReceivedQuantitySummary(ExtendedPeriodType value) {
        this.cumulativeReceivedQuantitySummary = value;
    }

    /**
     * Gets the value of the planningHorizion property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedPeriodType }
     *     
     */
    public ExtendedPeriodType getPlanningHorizion() {
        return planningHorizion;
    }

    /**
     * Sets the value of the planningHorizion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedPeriodType }
     *     
     */
    public void setPlanningHorizion(ExtendedPeriodType value) {
        this.planningHorizion = value;
    }

    /**
     * Gets the value of the materialAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedPeriodType }
     *     
     */
    public ExtendedPeriodType getMaterialAuthorization() {
        return materialAuthorization;
    }

    /**
     * Sets the value of the materialAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedPeriodType }
     *     
     */
    public void setMaterialAuthorization(ExtendedPeriodType value) {
        this.materialAuthorization = value;
    }

    /**
     * Gets the value of the productionAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedPeriodType }
     *     
     */
    public ExtendedPeriodType getProductionAuthorization() {
        return productionAuthorization;
    }

    /**
     * Sets the value of the productionAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedPeriodType }
     *     
     */
    public void setProductionAuthorization(ExtendedPeriodType value) {
        this.productionAuthorization = value;
    }

}
