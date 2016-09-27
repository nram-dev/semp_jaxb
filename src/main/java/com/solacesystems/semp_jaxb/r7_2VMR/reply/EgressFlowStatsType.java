//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.27 at 09:48:21 AM EDT 
//


package com.solacesystems.semp_jaxb.r7_2VMR.reply;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for egress-flow-stats-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="egress-flow-stats-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flow-id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="flow-state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="egress-selector-stats" type="{}selector-stats-type" minOccurs="0"/>
 *         &lt;element name="window-size" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="used-window" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="low-message-id-ack-pending" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="high-message-id-ack-pending" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="window-closed" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="message-redelivered" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="message-confirmed-delivered" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="confirmed-delivered-store-and-forward" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="confirmed-delivered-cut-through" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="request-for-redelivery" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="unacked-messages" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="max-delivered-unacked-msgs-exceeded" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "egress-flow-stats-type", propOrder = {
    "flowId",
    "flowState",
    "egressSelectorStats",
    "windowSize",
    "usedWindow",
    "lowMessageIdAckPending",
    "highMessageIdAckPending",
    "windowClosed",
    "messageRedelivered",
    "messageConfirmedDelivered",
    "confirmedDeliveredStoreAndForward",
    "confirmedDeliveredCutThrough",
    "requestForRedelivery",
    "unackedMessages",
    "maxDeliveredUnackedMsgsExceeded"
})
public class EgressFlowStatsType {

    @XmlElement(name = "flow-id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long flowId;
    @XmlElement(name = "flow-state")
    protected String flowState;
    @XmlElement(name = "egress-selector-stats")
    protected SelectorStatsType egressSelectorStats;
    @XmlElement(name = "window-size")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger windowSize;
    @XmlElement(name = "used-window")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger usedWindow;
    @XmlElement(name = "low-message-id-ack-pending")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger lowMessageIdAckPending;
    @XmlElement(name = "high-message-id-ack-pending")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger highMessageIdAckPending;
    @XmlElement(name = "window-closed")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger windowClosed;
    @XmlElement(name = "message-redelivered")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger messageRedelivered;
    @XmlElement(name = "message-confirmed-delivered")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger messageConfirmedDelivered;
    @XmlElement(name = "confirmed-delivered-store-and-forward")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger confirmedDeliveredStoreAndForward;
    @XmlElement(name = "confirmed-delivered-cut-through")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger confirmedDeliveredCutThrough;
    @XmlElement(name = "request-for-redelivery")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger requestForRedelivery;
    @XmlElement(name = "unacked-messages")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger unackedMessages;
    @XmlElement(name = "max-delivered-unacked-msgs-exceeded")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger maxDeliveredUnackedMsgsExceeded;

    /**
     * Gets the value of the flowId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFlowId() {
        return flowId;
    }

    /**
     * Sets the value of the flowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFlowId(Long value) {
        this.flowId = value;
    }

    /**
     * Gets the value of the flowState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowState() {
        return flowState;
    }

    /**
     * Sets the value of the flowState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowState(String value) {
        this.flowState = value;
    }

    /**
     * Gets the value of the egressSelectorStats property.
     * 
     * @return
     *     possible object is
     *     {@link SelectorStatsType }
     *     
     */
    public SelectorStatsType getEgressSelectorStats() {
        return egressSelectorStats;
    }

    /**
     * Sets the value of the egressSelectorStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectorStatsType }
     *     
     */
    public void setEgressSelectorStats(SelectorStatsType value) {
        this.egressSelectorStats = value;
    }

    /**
     * Gets the value of the windowSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWindowSize() {
        return windowSize;
    }

    /**
     * Sets the value of the windowSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWindowSize(BigInteger value) {
        this.windowSize = value;
    }

    /**
     * Gets the value of the usedWindow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUsedWindow() {
        return usedWindow;
    }

    /**
     * Sets the value of the usedWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUsedWindow(BigInteger value) {
        this.usedWindow = value;
    }

    /**
     * Gets the value of the lowMessageIdAckPending property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLowMessageIdAckPending() {
        return lowMessageIdAckPending;
    }

    /**
     * Sets the value of the lowMessageIdAckPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLowMessageIdAckPending(BigInteger value) {
        this.lowMessageIdAckPending = value;
    }

    /**
     * Gets the value of the highMessageIdAckPending property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHighMessageIdAckPending() {
        return highMessageIdAckPending;
    }

    /**
     * Sets the value of the highMessageIdAckPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHighMessageIdAckPending(BigInteger value) {
        this.highMessageIdAckPending = value;
    }

    /**
     * Gets the value of the windowClosed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWindowClosed() {
        return windowClosed;
    }

    /**
     * Sets the value of the windowClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWindowClosed(BigInteger value) {
        this.windowClosed = value;
    }

    /**
     * Gets the value of the messageRedelivered property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMessageRedelivered() {
        return messageRedelivered;
    }

    /**
     * Sets the value of the messageRedelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMessageRedelivered(BigInteger value) {
        this.messageRedelivered = value;
    }

    /**
     * Gets the value of the messageConfirmedDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMessageConfirmedDelivered() {
        return messageConfirmedDelivered;
    }

    /**
     * Sets the value of the messageConfirmedDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMessageConfirmedDelivered(BigInteger value) {
        this.messageConfirmedDelivered = value;
    }

    /**
     * Gets the value of the confirmedDeliveredStoreAndForward property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConfirmedDeliveredStoreAndForward() {
        return confirmedDeliveredStoreAndForward;
    }

    /**
     * Sets the value of the confirmedDeliveredStoreAndForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConfirmedDeliveredStoreAndForward(BigInteger value) {
        this.confirmedDeliveredStoreAndForward = value;
    }

    /**
     * Gets the value of the confirmedDeliveredCutThrough property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConfirmedDeliveredCutThrough() {
        return confirmedDeliveredCutThrough;
    }

    /**
     * Sets the value of the confirmedDeliveredCutThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConfirmedDeliveredCutThrough(BigInteger value) {
        this.confirmedDeliveredCutThrough = value;
    }

    /**
     * Gets the value of the requestForRedelivery property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestForRedelivery() {
        return requestForRedelivery;
    }

    /**
     * Sets the value of the requestForRedelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestForRedelivery(BigInteger value) {
        this.requestForRedelivery = value;
    }

    /**
     * Gets the value of the unackedMessages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnackedMessages() {
        return unackedMessages;
    }

    /**
     * Sets the value of the unackedMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnackedMessages(BigInteger value) {
        this.unackedMessages = value;
    }

    /**
     * Gets the value of the maxDeliveredUnackedMsgsExceeded property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDeliveredUnackedMsgsExceeded() {
        return maxDeliveredUnackedMsgsExceeded;
    }

    /**
     * Sets the value of the maxDeliveredUnackedMsgsExceeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDeliveredUnackedMsgsExceeded(BigInteger value) {
        this.maxDeliveredUnackedMsgsExceeded = value;
    }

}
