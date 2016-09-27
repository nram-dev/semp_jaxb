//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.27 at 09:48:21 AM EDT 
//


package com.solacesystems.semp_jaxb.r7_2VMR.reply;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for redundancy-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="redundancy-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="primary"/>
 *     &lt;enumeration value="backup"/>
 *     &lt;enumeration value="static"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "redundancy-type")
@XmlEnum
public enum RedundancyType {

    @XmlEnumValue("primary")
    PRIMARY("primary"),
    @XmlEnumValue("backup")
    BACKUP("backup"),
    @XmlEnumValue("static")
    STATIC("static"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    RedundancyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RedundancyType fromValue(String v) {
        for (RedundancyType c: RedundancyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
