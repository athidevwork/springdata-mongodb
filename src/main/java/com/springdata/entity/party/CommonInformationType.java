
package com.springdata.entity.party;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CommonInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ClientInformationType clientInformation;
    protected List<SpecialHandlingPartyType> specialHandlingParty;
    protected List<DisciplineDeclineListType> disciplineDeclineList;
    protected List<PriorCarriorType> priorCarrior;

    /**
     * Gets the value of the clientInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ClientInformationType }
     *     
     */
    public ClientInformationType getClientInformation() {
        return clientInformation;
    }

    /**
     * Sets the value of the clientInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientInformationType }
     *     
     */
    public void setClientInformation(ClientInformationType value) {
        this.clientInformation = value;
    }

    /**
     * Gets the value of the specialHandlingParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialHandlingParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialHandlingParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialHandlingPartyType }
     * 
     * 
     */
    public List<SpecialHandlingPartyType> getSpecialHandlingParty() {
        if (specialHandlingParty == null) {
            specialHandlingParty = new ArrayList<SpecialHandlingPartyType>();
        }
        return this.specialHandlingParty;
    }

    /**
     * Gets the value of the disciplineDeclineList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disciplineDeclineList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisciplineDeclineList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisciplineDeclineListType }
     * 
     * 
     */
    public List<DisciplineDeclineListType> getDisciplineDeclineList() {
        if (disciplineDeclineList == null) {
            disciplineDeclineList = new ArrayList<DisciplineDeclineListType>();
        }
        return this.disciplineDeclineList;
    }

    /**
     * Gets the value of the priorCarrior property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorCarrior property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorCarrior().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorCarriorType }
     * 
     * 
     */
    public List<PriorCarriorType> getPriorCarrior() {
        if (priorCarrior == null) {
            priorCarrior = new ArrayList<PriorCarriorType>();
        }
        return this.priorCarrior;
    }

}
