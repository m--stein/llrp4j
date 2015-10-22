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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for llrpDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="llrpDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="messageDefinition" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}messageDefinition"/>
 *         &lt;element name="parameterDefinition" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}parameterDefinition"/>
 *         &lt;element name="choiceDefinition" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}choiceDefinition"/>
 *         &lt;element name="enumerationDefinition" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}enumerationDefinition"/>
 *         &lt;element name="vendorDefinition" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}vendorDefinition"/>
 *         &lt;element name="namespaceDefinition" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}namespaceDefinition"/>
 *         &lt;element name="customMessageDefinition" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}customMessageDefinition"/>
 *         &lt;element name="customParameterDefinition" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}customParameterDefinition"/>
 *         &lt;element name="customChoiceDefinition" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}customChoiceDefinition"/>
 *         &lt;element name="customEnumerationDefinition" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}customEnumerationDefinition"/>
 *         &lt;element name="annotation" type="{http://www.llrp.org/ltk/schema/core/encoding/binary/1.0}annotation"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "llrpDefinition", propOrder = {
    "elements"
})
public class LlrpDefinition {

    @XmlElements({
        @XmlElement(name = "messageDefinition", type = MessageDefinition.class),
        @XmlElement(name = "parameterDefinition", type = ParameterDefinition.class),
        @XmlElement(name = "choiceDefinition", type = ChoiceDefinition.class),
        @XmlElement(name = "enumerationDefinition", type = EnumerationDefinition.class),
        @XmlElement(name = "vendorDefinition", type = VendorDefinition.class),
        @XmlElement(name = "namespaceDefinition", type = NamespaceDefinition.class),
        @XmlElement(name = "customMessageDefinition", type = CustomMessageDefinition.class),
        @XmlElement(name = "customParameterDefinition", type = CustomParameterDefinition.class),
        @XmlElement(name = "customChoiceDefinition", type = CustomChoiceDefinition.class),
        @XmlElement(name = "customEnumerationDefinition", type = CustomEnumerationDefinition.class),
        @XmlElement(name = "annotation", type = Annotation.class)
    })
    protected List<Object> elements;

    /**
     * Gets the value of the elements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageDefinition }
     * {@link ParameterDefinition }
     * {@link ChoiceDefinition }
     * {@link EnumerationDefinition }
     * {@link VendorDefinition }
     * {@link NamespaceDefinition }
     * {@link CustomMessageDefinition }
     * {@link CustomParameterDefinition }
     * {@link CustomChoiceDefinition }
     * {@link CustomEnumerationDefinition }
     * {@link Annotation }
     * 
     * 
     */
    public List<Object> getElements() {
        if (elements == null) {
            elements = new ArrayList<Object>();
        }
        return this.elements;
    }

}
