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
 * <p>Java class for message-spool-message-vpn-stats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="message-spool-message-vpn-stats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message-vpn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bind-stats" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message-spool-message-vpn-stats", propOrder = {
    "messageVpn",
    "bindStats"
})
public class MessageSpoolMessageVpnStats {

    @XmlElement(name = "message-vpn", required = true)
    protected String messageVpn;
    @XmlElement(name = "bind-stats", required = true)
    protected Object bindStats;

    /**
     * Gets the value of the messageVpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageVpn() {
        return messageVpn;
    }

    /**
     * Sets the value of the messageVpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageVpn(String value) {
        this.messageVpn = value;
    }

    /**
     * Gets the value of the bindStats property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBindStats() {
        return bindStats;
    }

    /**
     * Sets the value of the bindStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBindStats(Object value) {
        this.bindStats = value;
    }

}
