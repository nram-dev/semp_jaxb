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
 * <p>Java class for neighborRatesStatsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="neighborRatesStatsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ingress" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="egress" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="connection" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ingress" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                   &lt;element name="egress" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                 &lt;/all>
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
@XmlType(name = "neighborRatesStatsType", propOrder = {
    "ingress",
    "egress",
    "connection"
})
public class NeighborRatesStatsType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger ingress;
    @XmlElement(required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger egress;
    protected List<NeighborRatesStatsType.Connection> connection;

    /**
     * Gets the value of the ingress property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIngress() {
        return ingress;
    }

    /**
     * Sets the value of the ingress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIngress(BigInteger value) {
        this.ingress = value;
    }

    /**
     * Gets the value of the egress property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEgress() {
        return egress;
    }

    /**
     * Sets the value of the egress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEgress(BigInteger value) {
        this.egress = value;
    }

    /**
     * Gets the value of the connection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NeighborRatesStatsType.Connection }
     * 
     * 
     */
    public List<NeighborRatesStatsType.Connection> getConnection() {
        if (connection == null) {
            connection = new ArrayList<NeighborRatesStatsType.Connection>();
        }
        return this.connection;
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
     *       &lt;all>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ingress" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *         &lt;element name="egress" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Connection {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger ingress;
        @XmlElement(required = true)
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger egress;

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
         * Gets the value of the ingress property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIngress() {
            return ingress;
        }

        /**
         * Sets the value of the ingress property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIngress(BigInteger value) {
            this.ingress = value;
        }

        /**
         * Gets the value of the egress property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEgress() {
            return egress;
        }

        /**
         * Sets the value of the egress property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEgress(BigInteger value) {
            this.egress = value;
        }

    }

}
