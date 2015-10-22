//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.29 at 10:28:14 AM CEST 
//


package org.llrp.ltk.schema.core;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customMessageDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customMessageDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annotation" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="field" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}fieldDefinition"/>
 *           &lt;element name="reserved" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}reservedDefinition"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="parameter" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}parameterReference"/>
 *           &lt;element name="choice" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}choiceReference"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}name" />
 *       &lt;attribute name="vendor" use="required" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}name" />
 *       &lt;attribute name="subtype" use="required" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}customMessageSubtype" />
 *       &lt;attribute name="namespace" use="required" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}name" />
 *       &lt;attribute name="responseType" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}name" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customMessageDefinition", propOrder = {
    "annotation",
    "fieldOrReserved",
    "parameterOrChoice"
})
public class CustomMessageDefinition {

    protected List<Annotation> annotation;
    @XmlElements({
        @XmlElement(name = "field", type = FieldDefinition.class),
        @XmlElement(name = "reserved", type = ReservedDefinition.class)
    })
    protected List<Object> fieldOrReserved;
    @XmlElements({
        @XmlElement(name = "parameter", type = ParameterReference.class),
        @XmlElement(name = "choice", type = ChoiceReference.class)
    })
    protected List<Object> parameterOrChoice;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "vendor", required = true)
    protected String vendor;
    @XmlAttribute(name = "subtype", required = true)
    protected int subtype;
    @XmlAttribute(name = "namespace", required = true)
    protected String namespace;
    @XmlAttribute(name = "responseType")
    protected String responseType;

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * 
     * 
     */
    public List<Annotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<Annotation>();
        }
        return this.annotation;
    }

    /**
     * Gets the value of the fieldOrReserved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldOrReserved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldOrReserved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldDefinition }
     * {@link ReservedDefinition }
     * 
     * 
     */
    public List<Object> getFieldOrReserved() {
        if (fieldOrReserved == null) {
            fieldOrReserved = new ArrayList<Object>();
        }
        return this.fieldOrReserved;
    }

    /**
     * Gets the value of the parameterOrChoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterOrChoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterOrChoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterReference }
     * {@link ChoiceReference }
     * 
     * 
     */
    public List<Object> getParameterOrChoice() {
        if (parameterOrChoice == null) {
            parameterOrChoice = new ArrayList<Object>();
        }
        return this.parameterOrChoice;
    }

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
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     */
    public int getSubtype() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     */
    public void setSubtype(int value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseType(String value) {
        this.responseType = value;
    }

}
