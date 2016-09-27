//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.27 at 09:48:21 AM EDT 
//


package com.solacesystems.semp_jaxb.r7_2VMR.reply;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for message-spool-message-vpn-entry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="message-spool-message-vpn-entry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all minOccurs="0">
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maximum-queues-and-topic-endpoints" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="current-queues-and-topic-endpoints" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="num-queues" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="num-topic-endpoints" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="num-sequenced-topics" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="current-messages-spooled" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="current-spool-usage-mb" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maximum-spool-usage-mb" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="allow-unknown-publisher-flow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maximum-transacted-sessions" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="current-transacted-sessions" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="transacted-sessions-local-used" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="transacted-sessions-xa-used" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="maximum-transactions" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="current-transactions" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="transactions-local-used" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="transactions-xa-used" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="current-number-of-transacted-messages" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="current-transacted-messages-usage-mb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maximum-egress-flows" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="current-egress-flows" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="maximum-ingress-flows" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="current-ingress-flows" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="event-configuration" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="event-thresholds" type="{}event-thresholds" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message-spool-message-vpn-entry", propOrder = {

})
public class MessageSpoolMessageVpnEntry {

    protected String name;
    @XmlElement(name = "maximum-queues-and-topic-endpoints")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maximumQueuesAndTopicEndpoints;
    @XmlElement(name = "current-queues-and-topic-endpoints")
    @XmlSchemaType(name = "unsignedInt")
    protected Long currentQueuesAndTopicEndpoints;
    @XmlElement(name = "num-queues")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numQueues;
    @XmlElement(name = "num-topic-endpoints")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numTopicEndpoints;
    @XmlElement(name = "num-sequenced-topics")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numSequencedTopics;
    @XmlElement(name = "current-messages-spooled")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger currentMessagesSpooled;
    @XmlElement(name = "current-spool-usage-mb")
    protected Double currentSpoolUsageMb;
    @XmlElement(name = "maximum-spool-usage-mb")
    protected Double maximumSpoolUsageMb;
    @XmlElement(name = "allow-unknown-publisher-flow")
    protected Boolean allowUnknownPublisherFlow;
    @XmlElement(name = "maximum-transacted-sessions")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maximumTransactedSessions;
    @XmlElement(name = "current-transacted-sessions")
    @XmlSchemaType(name = "unsignedInt")
    protected Long currentTransactedSessions;
    @XmlElement(name = "transacted-sessions-local-used")
    @XmlSchemaType(name = "unsignedInt")
    protected Long transactedSessionsLocalUsed;
    @XmlElement(name = "transacted-sessions-xa-used")
    @XmlSchemaType(name = "unsignedInt")
    protected Long transactedSessionsXaUsed;
    @XmlElement(name = "maximum-transactions")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maximumTransactions;
    @XmlElement(name = "current-transactions")
    @XmlSchemaType(name = "unsignedInt")
    protected Long currentTransactions;
    @XmlElement(name = "transactions-local-used")
    @XmlSchemaType(name = "unsignedInt")
    protected Long transactionsLocalUsed;
    @XmlElement(name = "transactions-xa-used")
    @XmlSchemaType(name = "unsignedInt")
    protected Long transactionsXaUsed;
    @XmlElement(name = "current-number-of-transacted-messages")
    @XmlSchemaType(name = "unsignedInt")
    protected Long currentNumberOfTransactedMessages;
    @XmlElement(name = "current-transacted-messages-usage-mb")
    protected Double currentTransactedMessagesUsageMb;
    @XmlElement(name = "maximum-egress-flows")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maximumEgressFlows;
    @XmlElement(name = "current-egress-flows")
    @XmlSchemaType(name = "unsignedInt")
    protected Long currentEgressFlows;
    @XmlElement(name = "maximum-ingress-flows")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maximumIngressFlows;
    @XmlElement(name = "current-ingress-flows")
    @XmlSchemaType(name = "unsignedInt")
    protected Long currentIngressFlows;
    @XmlElement(name = "event-configuration")
    protected MessageSpoolMessageVpnEntry.EventConfiguration eventConfiguration;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the maximumQueuesAndTopicEndpoints property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumQueuesAndTopicEndpoints() {
        return maximumQueuesAndTopicEndpoints;
    }

    /**
     * Sets the value of the maximumQueuesAndTopicEndpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumQueuesAndTopicEndpoints(Long value) {
        this.maximumQueuesAndTopicEndpoints = value;
    }

    /**
     * Gets the value of the currentQueuesAndTopicEndpoints property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentQueuesAndTopicEndpoints() {
        return currentQueuesAndTopicEndpoints;
    }

    /**
     * Sets the value of the currentQueuesAndTopicEndpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentQueuesAndTopicEndpoints(Long value) {
        this.currentQueuesAndTopicEndpoints = value;
    }

    /**
     * Gets the value of the numQueues property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumQueues() {
        return numQueues;
    }

    /**
     * Sets the value of the numQueues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumQueues(Long value) {
        this.numQueues = value;
    }

    /**
     * Gets the value of the numTopicEndpoints property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumTopicEndpoints() {
        return numTopicEndpoints;
    }

    /**
     * Sets the value of the numTopicEndpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumTopicEndpoints(Long value) {
        this.numTopicEndpoints = value;
    }

    /**
     * Gets the value of the numSequencedTopics property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSequencedTopics() {
        return numSequencedTopics;
    }

    /**
     * Sets the value of the numSequencedTopics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSequencedTopics(Long value) {
        this.numSequencedTopics = value;
    }

    /**
     * Gets the value of the currentMessagesSpooled property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentMessagesSpooled() {
        return currentMessagesSpooled;
    }

    /**
     * Sets the value of the currentMessagesSpooled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentMessagesSpooled(BigInteger value) {
        this.currentMessagesSpooled = value;
    }

    /**
     * Gets the value of the currentSpoolUsageMb property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrentSpoolUsageMb() {
        return currentSpoolUsageMb;
    }

    /**
     * Sets the value of the currentSpoolUsageMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrentSpoolUsageMb(Double value) {
        this.currentSpoolUsageMb = value;
    }

    /**
     * Gets the value of the maximumSpoolUsageMb property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumSpoolUsageMb() {
        return maximumSpoolUsageMb;
    }

    /**
     * Sets the value of the maximumSpoolUsageMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumSpoolUsageMb(Double value) {
        this.maximumSpoolUsageMb = value;
    }

    /**
     * Gets the value of the allowUnknownPublisherFlow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowUnknownPublisherFlow() {
        return allowUnknownPublisherFlow;
    }

    /**
     * Sets the value of the allowUnknownPublisherFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowUnknownPublisherFlow(Boolean value) {
        this.allowUnknownPublisherFlow = value;
    }

    /**
     * Gets the value of the maximumTransactedSessions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumTransactedSessions() {
        return maximumTransactedSessions;
    }

    /**
     * Sets the value of the maximumTransactedSessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumTransactedSessions(Long value) {
        this.maximumTransactedSessions = value;
    }

    /**
     * Gets the value of the currentTransactedSessions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentTransactedSessions() {
        return currentTransactedSessions;
    }

    /**
     * Sets the value of the currentTransactedSessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentTransactedSessions(Long value) {
        this.currentTransactedSessions = value;
    }

    /**
     * Gets the value of the transactedSessionsLocalUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransactedSessionsLocalUsed() {
        return transactedSessionsLocalUsed;
    }

    /**
     * Sets the value of the transactedSessionsLocalUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransactedSessionsLocalUsed(Long value) {
        this.transactedSessionsLocalUsed = value;
    }

    /**
     * Gets the value of the transactedSessionsXaUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransactedSessionsXaUsed() {
        return transactedSessionsXaUsed;
    }

    /**
     * Sets the value of the transactedSessionsXaUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransactedSessionsXaUsed(Long value) {
        this.transactedSessionsXaUsed = value;
    }

    /**
     * Gets the value of the maximumTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumTransactions() {
        return maximumTransactions;
    }

    /**
     * Sets the value of the maximumTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumTransactions(Long value) {
        this.maximumTransactions = value;
    }

    /**
     * Gets the value of the currentTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentTransactions() {
        return currentTransactions;
    }

    /**
     * Sets the value of the currentTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentTransactions(Long value) {
        this.currentTransactions = value;
    }

    /**
     * Gets the value of the transactionsLocalUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransactionsLocalUsed() {
        return transactionsLocalUsed;
    }

    /**
     * Sets the value of the transactionsLocalUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransactionsLocalUsed(Long value) {
        this.transactionsLocalUsed = value;
    }

    /**
     * Gets the value of the transactionsXaUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransactionsXaUsed() {
        return transactionsXaUsed;
    }

    /**
     * Sets the value of the transactionsXaUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransactionsXaUsed(Long value) {
        this.transactionsXaUsed = value;
    }

    /**
     * Gets the value of the currentNumberOfTransactedMessages property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentNumberOfTransactedMessages() {
        return currentNumberOfTransactedMessages;
    }

    /**
     * Sets the value of the currentNumberOfTransactedMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentNumberOfTransactedMessages(Long value) {
        this.currentNumberOfTransactedMessages = value;
    }

    /**
     * Gets the value of the currentTransactedMessagesUsageMb property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrentTransactedMessagesUsageMb() {
        return currentTransactedMessagesUsageMb;
    }

    /**
     * Sets the value of the currentTransactedMessagesUsageMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrentTransactedMessagesUsageMb(Double value) {
        this.currentTransactedMessagesUsageMb = value;
    }

    /**
     * Gets the value of the maximumEgressFlows property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumEgressFlows() {
        return maximumEgressFlows;
    }

    /**
     * Sets the value of the maximumEgressFlows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumEgressFlows(Long value) {
        this.maximumEgressFlows = value;
    }

    /**
     * Gets the value of the currentEgressFlows property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentEgressFlows() {
        return currentEgressFlows;
    }

    /**
     * Sets the value of the currentEgressFlows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentEgressFlows(Long value) {
        this.currentEgressFlows = value;
    }

    /**
     * Gets the value of the maximumIngressFlows property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumIngressFlows() {
        return maximumIngressFlows;
    }

    /**
     * Sets the value of the maximumIngressFlows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumIngressFlows(Long value) {
        this.maximumIngressFlows = value;
    }

    /**
     * Gets the value of the currentIngressFlows property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentIngressFlows() {
        return currentIngressFlows;
    }

    /**
     * Sets the value of the currentIngressFlows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentIngressFlows(Long value) {
        this.currentIngressFlows = value;
    }

    /**
     * Gets the value of the eventConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSpoolMessageVpnEntry.EventConfiguration }
     *     
     */
    public MessageSpoolMessageVpnEntry.EventConfiguration getEventConfiguration() {
        return eventConfiguration;
    }

    /**
     * Sets the value of the eventConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSpoolMessageVpnEntry.EventConfiguration }
     *     
     */
    public void setEventConfiguration(MessageSpoolMessageVpnEntry.EventConfiguration value) {
        this.eventConfiguration = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="event-thresholds" type="{}event-thresholds" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eventThresholds"
    })
    public static class EventConfiguration {

        @XmlElement(name = "event-thresholds", required = true)
        protected List<EventThresholds> eventThresholds;

        /**
         * Gets the value of the eventThresholds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventThresholds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEventThresholds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EventThresholds }
         * 
         * 
         */
        public List<EventThresholds> getEventThresholds() {
            if (eventThresholds == null) {
                eventThresholds = new ArrayList<EventThresholds>();
            }
            return this.eventThresholds;
        }

    }

}
