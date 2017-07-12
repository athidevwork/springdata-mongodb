
package com.springdata.entity.party;

import java.io.Serializable;

public class PersonNameType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String surname;
    protected String givenName;
    protected String otherGivenName;
    protected String personTitlePrefix;
    protected String nameSuffix;
    protected String fullName;

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the otherGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherGivenName() {
        return otherGivenName;
    }

    /**
     * Sets the value of the otherGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherGivenName(String value) {
        this.otherGivenName = value;
    }

    /**
     * Gets the value of the personTitlePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonTitlePrefix() {
        return personTitlePrefix;
    }

    /**
     * Sets the value of the personTitlePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonTitlePrefix(String value) {
        this.personTitlePrefix = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSuffix(String value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

}
