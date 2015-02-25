//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.28 at 10:30:28 AM IST 
//


package org.wso2.carbon.eventprocessing.executiongenerator.internal.templatestructure.temperatureanalysis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Template complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Template">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TemplateQuery" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConditionParameters" type="{}ConditionParameters"/>
 *         &lt;element name="Parameters" type="{}Parameters"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Template", propOrder = {
    "description",
    "templateQuery",
    "conditionParameters",
    "parameters"
})
public class Template {

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "TemplateQuery", required = true)
    protected String templateQuery;
    @XmlElement(name = "ConditionParameters", required = true)
    protected ConditionParameters conditionParameters;
    @XmlElement(name = "Parameters", required = true)
    protected Parameters parameters;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the templateQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateQuery() {
        return templateQuery;
    }

    /**
     * Sets the value of the templateQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateQuery(String value) {
        this.templateQuery = value;
    }

    /**
     * Gets the value of the conditionParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionParameters }
     *     
     */
    public ConditionParameters getConditionParameters() {
        return conditionParameters;
    }

    /**
     * Sets the value of the conditionParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionParameters }
     *     
     */
    public void setConditionParameters(ConditionParameters value) {
        this.conditionParameters = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link Parameters }
     *     
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameters }
     *     
     */
    public void setParameters(Parameters value) {
        this.parameters = value;
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

}