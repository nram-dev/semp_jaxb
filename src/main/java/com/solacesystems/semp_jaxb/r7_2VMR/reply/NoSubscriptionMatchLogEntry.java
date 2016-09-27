//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.27 at 09:48:21 AM EDT 
//


package com.solacesystems.semp_jaxb.r7_2VMR.reply;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for no-subscription-match-log-entry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="no-subscription-match-log-entry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="client-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="client-username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vpn-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="topic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "no-subscription-match-log-entry", propOrder = {

})
public class NoSubscriptionMatchLogEntry {

    protected String timestamp;
    @XmlElement(name = "client-name", required = true)
    protected String clientName;
    @XmlElement(name = "client-username", required = true)
    protected String clientUsername;
    @XmlElement(name = "vpn-name", required = true)
    protected String vpnName;
    @XmlElement(required = true)
    protected String topic;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the clientUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientUsername() {
        return clientUsername;
    }

    /**
     * Sets the value of the clientUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientUsername(String value) {
        this.clientUsername = value;
    }

    /**
     * Gets the value of the vpnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnName() {
        return vpnName;
    }

    /**
     * Sets the value of the vpnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnName(String value) {
        this.vpnName = value;
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
