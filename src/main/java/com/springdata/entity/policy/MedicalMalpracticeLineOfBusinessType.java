
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MedicalMalpracticeLineOfBusinessType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<MedicalMalpracticeCoverageType> MedicalMalpracticeCoverage;

    /**
     * Gets the value of the medicalMalpracticeCoverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicalMalpracticeCoverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicalMalpracticeCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicalMalpracticeCoverageType }
     * 
     * 
     */
    public List<MedicalMalpracticeCoverageType> getMedicalMalpracticeCoverage() {
        if (MedicalMalpracticeCoverage == null) {
            MedicalMalpracticeCoverage = new ArrayList<MedicalMalpracticeCoverageType>();
        }
        return this.MedicalMalpracticeCoverage;
    }

	@Override
	public String toString() {
		return "[MedicalMalpracticeCoverage=" + MedicalMalpracticeCoverage + "]";
	}

}
