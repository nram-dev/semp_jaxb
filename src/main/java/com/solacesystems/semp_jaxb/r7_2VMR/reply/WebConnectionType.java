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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for webConnectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="webConnectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="web-tcp-port" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="web-tcp-state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="web-uptime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="web-requests" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="web-responses" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="web-encoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="web-protocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssl-version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssl-cipher-description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webConnectionType", propOrder = {

})
public class WebConnectionType {

    @XmlElement(name = "web-tcp-port")
    @XmlSchemaType(name = "unsignedInt")
    protected Long webTcpPort;
    @XmlElement(name = "web-tcp-state")
    protected String webTcpState;
    @XmlElement(name = "web-uptime")
    protected String webUptime;
    @XmlElement(name = "web-requests")
    @XmlSchemaType(name = "unsignedInt")
    protected Long webRequests;
    @XmlElement(name = "web-responses")
    @XmlSchemaType(name = "unsignedInt")
    protected Long webResponses;
    @XmlElement(name = "web-encoding")
    protected String webEncoding;
    @XmlElement(name = "web-protocol")
    protected String webProtocol;
    @XmlElement(name = "ssl-version")
    protected String sslVersion;
    @XmlElement(name = "ssl-cipher-description")
    protected String sslCipherDescription;

    /**
     * Gets the value of the webTcpPort property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWebTcpPort() {
        return webTcpPort;
    }

    /**
     * Sets the value of the webTcpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWebTcpPort(Long value) {
        this.webTcpPort = value;
    }

    /**
     * Gets the value of the webTcpState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebTcpState() {
        return webTcpState;
    }

    /**
     * Sets the value of the webTcpState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebTcpState(String value) {
        this.webTcpState = value;
    }

    /**
     * Gets the value of the webUptime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUptime() {
        return webUptime;
    }

    /**
     * Sets the value of the webUptime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUptime(String value) {
        this.webUptime = value;
    }

    /**
     * Gets the value of the webRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWebRequests() {
        return webRequests;
    }

    /**
     * Sets the value of the webRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWebRequests(Long value) {
        this.webRequests = value;
    }

    /**
     * Gets the value of the webResponses property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWebResponses() {
        return webResponses;
    }

    /**
     * Sets the value of the webResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWebResponses(Long value) {
        this.webResponses = value;
    }

    /**
     * Gets the value of the webEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebEncoding() {
        return webEncoding;
    }

    /**
     * Sets the value of the webEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebEncoding(String value) {
        this.webEncoding = value;
    }

    /**
     * Gets the value of the webProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebProtocol() {
        return webProtocol;
    }

    /**
     * Sets the value of the webProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebProtocol(String value) {
        this.webProtocol = value;
    }

    /**
     * Gets the value of the sslVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSslVersion() {
        return sslVersion;
    }

    /**
     * Sets the value of the sslVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSslVersion(String value) {
        this.sslVersion = value;
    }

    /**
     * Gets the value of the sslCipherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSslCipherDescription() {
        return sslCipherDescription;
    }

    /**
     * Sets the value of the sslCipherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSslCipherDescription(String value) {
        this.sslCipherDescription = value;
    }

}
