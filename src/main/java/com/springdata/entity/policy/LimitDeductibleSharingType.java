
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LimitDeductibleSharingType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<SharedGroupType> sharedGroup;
    protected List<SeparateLimitType> separateLimit;

    /**
     * Gets the value of the sharedGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SharedGroupType }
     * 
     * 
     */
    public List<SharedGroupType> getSharedGroup() {
        if (sharedGroup == null) {
            sharedGroup = new ArrayList<SharedGroupType>();
        }
        return this.sharedGroup;
    }

    /**
     *
     * @param sharedGroup
     */
    public void setSharedGroup(List<SharedGroupType> sharedGroup) {
        this.sharedGroup = sharedGroup;
    }

    /**
     * Gets the value of the separateLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the separateLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeparateLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeparateLimitType }
     * 
     * 
     */
    public List<SeparateLimitType> getSeparateLimit() {
        if (separateLimit == null) {
            separateLimit = new ArrayList<SeparateLimitType>();
        }
        return this.separateLimit;
    }

    /**
     *
     * @param separateLimit
     */
    public void setSeparateLimit(List<SeparateLimitType> separateLimit) {
        this.separateLimit = separateLimit;
    }

}
