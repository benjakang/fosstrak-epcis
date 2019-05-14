package org.fosstrak.epcis.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;

/**
 * <p>
 * Java class for QuerySchedule complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="second" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dayOfMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dayOfWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extension" type="{urn:epcglobal:epcis-query:xsd:1}QueryScheduleExtensionType" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySchedule", propOrder = {
        "second", "minute", "hour", "dayOfMonth", "month", "dayOfWeek", "extension", "any" })
public class QuerySchedule {

    protected String second;
    protected String minute;
    protected String hour;
    protected String dayOfMonth;
    protected String month;
    protected String dayOfWeek;
    protected QueryScheduleExtensionType extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the second property.
     * 
     * @return possible object is {@link String }
     */
    public String getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setSecond(String value) {
        this.second = value;
    }

    /**
     * Gets the value of the minute property.
     * 
     * @return possible object is {@link String }
     */
    public String getMinute() {
        return minute;
    }

    /**
     * Sets the value of the minute property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setMinute(String value) {
        this.minute = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     * @return possible object is {@link String }
     */
    public String getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setHour(String value) {
        this.hour = value;
    }

    /**
     * Gets the value of the dayOfMonth property.
     * 
     * @return possible object is {@link String }
     */
    public String getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Sets the value of the dayOfMonth property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setDayOfMonth(String value) {
        this.dayOfMonth = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return possible object is {@link String }
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setMonth(String value) {
        this.month = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return possible object is {@link String }
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setDayOfWeek(String value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return possible object is {@link QueryScheduleExtensionType }
     */
    public QueryScheduleExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *            allowed object is {@link QueryScheduleExtensionType }
     */
    public void setExtension(QueryScheduleExtensionType value) {
        this.extension = value;
    }

    /**
     * Gets the value of the any property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the any property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Element }
     * {@link Object }
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
