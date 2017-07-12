
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FormMgmtDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<FormDataType> formData;

    /**
     * Gets the value of the formData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormDataType }
     * 
     * 
     */
    public List<FormDataType> getFormData() {
        if (formData == null) {
            formData = new ArrayList<FormDataType>();
        }
        return this.formData;
    }

}
