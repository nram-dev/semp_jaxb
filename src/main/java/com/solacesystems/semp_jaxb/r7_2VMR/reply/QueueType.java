//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.27 at 09:48:21 AM EDT 
//


package com.solacesystems.semp_jaxb.r7_2VMR.reply;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="spooled-messages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="spooled-message" type="{}spooled-message" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="info" type="{}qendpt-info-type" minOccurs="0"/>
 *         &lt;element name="subscriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subscription" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="topic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stats" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="message-spool-stats" type="{}message-spool-stats-type" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rates" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="qendpt-data-rates" type="{}qendpt-data-rates" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queueType", propOrder = {
    "name",
    "spooledMessages",
    "info",
    "subscriptions",
    "stats",
    "rates"
})
public class QueueType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "spooled-messages")
    protected QueueType.SpooledMessages spooledMessages;
    protected QendptInfoType info;
    protected QueueType.Subscriptions subscriptions;
    protected QueueType.Stats stats;
    protected List<QueueType.Rates> rates;

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
     * Gets the value of the spooledMessages property.
     * 
     * @return
     *     possible object is
     *     {@link QueueType.SpooledMessages }
     *     
     */
    public QueueType.SpooledMessages getSpooledMessages() {
        return spooledMessages;
    }

    /**
     * Sets the value of the spooledMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueType.SpooledMessages }
     *     
     */
    public void setSpooledMessages(QueueType.SpooledMessages value) {
        this.spooledMessages = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link QendptInfoType }
     *     
     */
    public QendptInfoType getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link QendptInfoType }
     *     
     */
    public void setInfo(QendptInfoType value) {
        this.info = value;
    }

    /**
     * Gets the value of the subscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link QueueType.Subscriptions }
     *     
     */
    public QueueType.Subscriptions getSubscriptions() {
        return subscriptions;
    }

    /**
     * Sets the value of the subscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueType.Subscriptions }
     *     
     */
    public void setSubscriptions(QueueType.Subscriptions value) {
        this.subscriptions = value;
    }

    /**
     * Gets the value of the stats property.
     * 
     * @return
     *     possible object is
     *     {@link QueueType.Stats }
     *     
     */
    public QueueType.Stats getStats() {
        return stats;
    }

    /**
     * Sets the value of the stats property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueType.Stats }
     *     
     */
    public void setStats(QueueType.Stats value) {
        this.stats = value;
    }

    /**
     * Gets the value of the rates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueueType.Rates }
     * 
     * 
     */
    public List<QueueType.Rates> getRates() {
        if (rates == null) {
            rates = new ArrayList<QueueType.Rates>();
        }
        return this.rates;
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
     *         &lt;element name="qendpt-data-rates" type="{}qendpt-data-rates" minOccurs="0"/>
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
        "qendptDataRates"
    })
    public static class Rates {

        @XmlElement(name = "qendpt-data-rates")
        protected QendptDataRates qendptDataRates;

        /**
         * Gets the value of the qendptDataRates property.
         * 
         * @return
         *     possible object is
         *     {@link QendptDataRates }
         *     
         */
        public QendptDataRates getQendptDataRates() {
            return qendptDataRates;
        }

        /**
         * Sets the value of the qendptDataRates property.
         * 
         * @param value
         *     allowed object is
         *     {@link QendptDataRates }
         *     
         */
        public void setQendptDataRates(QendptDataRates value) {
            this.qendptDataRates = value;
        }

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
     *         &lt;element name="spooled-message" type="{}spooled-message" maxOccurs="unbounded" minOccurs="0"/>
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
        "spooledMessage"
    })
    public static class SpooledMessages {

        @XmlElement(name = "spooled-message")
        protected List<SpooledMessage> spooledMessage;

        /**
         * Gets the value of the spooledMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the spooledMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpooledMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpooledMessage }
         * 
         * 
         */
        public List<SpooledMessage> getSpooledMessage() {
            if (spooledMessage == null) {
                spooledMessage = new ArrayList<SpooledMessage>();
            }
            return this.spooledMessage;
        }

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
     *         &lt;element name="message-spool-stats" type="{}message-spool-stats-type" minOccurs="0"/>
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
        "messageSpoolStats"
    })
    public static class Stats {

        @XmlElement(name = "message-spool-stats")
        protected MessageSpoolStatsType messageSpoolStats;

        /**
         * Gets the value of the messageSpoolStats property.
         * 
         * @return
         *     possible object is
         *     {@link MessageSpoolStatsType }
         *     
         */
        public MessageSpoolStatsType getMessageSpoolStats() {
            return messageSpoolStats;
        }

        /**
         * Sets the value of the messageSpoolStats property.
         * 
         * @param value
         *     allowed object is
         *     {@link MessageSpoolStatsType }
         *     
         */
        public void setMessageSpoolStats(MessageSpoolStatsType value) {
            this.messageSpoolStats = value;
        }

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
     *         &lt;element name="subscription" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="topic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "subscription"
    })
    public static class Subscriptions {

        protected List<QueueType.Subscriptions.Subscription> subscription;

        /**
         * Gets the value of the subscription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subscription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubscription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueueType.Subscriptions.Subscription }
         * 
         * 
         */
        public List<QueueType.Subscriptions.Subscription> getSubscription() {
            if (subscription == null) {
                subscription = new ArrayList<QueueType.Subscriptions.Subscription>();
            }
            return this.subscription;
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
         *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="topic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "creator",
            "topic"
        })
        public static class Subscription {

            protected String creator;
            protected String topic;

            /**
             * Gets the value of the creator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreator() {
                return creator;
            }

            /**
             * Sets the value of the creator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreator(String value) {
                this.creator = value;
            }

            /**
             * Gets the value of the topic property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTopic() {
                return topic;
            }

            /**
             * Sets the value of the topic property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTopic(String value) {
                this.topic = value;
            }

        }

    }

}
