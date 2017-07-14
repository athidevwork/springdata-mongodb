
package com.springdata.entity.policy;

import java.io.Serializable;

public class AttorneyInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String NumberOfAttornerys;
    protected String ContinuingLawEducationHours;
    protected String AttorneyName;
    protected String StateAdmittedToBar;
    protected String StatusCode;
    protected String YearsInPractice;
    
	public String getNumberOfAttornerys() {
		return NumberOfAttornerys;
	}
	public void setNumberOfAttornerys(String numberOfAttornerys) {
		NumberOfAttornerys = numberOfAttornerys;
	}
	public String getContinuingLawEducationHours() {
		return ContinuingLawEducationHours;
	}
	public void setContinuingLawEducationHours(String continuingLawEducationHours) {
		ContinuingLawEducationHours = continuingLawEducationHours;
	}
	public String getAttorneyName() {
		return AttorneyName;
	}
	public void setAttorneyName(String attorneyName) {
		AttorneyName = attorneyName;
	}
	public String getStateAdmittedToBar() {
		return StateAdmittedToBar;
	}
	public void setStateAdmittedToBar(String stateAdmittedToBar) {
		StateAdmittedToBar = stateAdmittedToBar;
	}
	public String getStatusCode() {
		return StatusCode;
	}
	public void setStatusCode(String statusCode) {
		StatusCode = statusCode;
	}
	public String getYearsInPractice() {
		return YearsInPractice;
	}
	public void setYearsInPractice(String yearsInPractice) {
		YearsInPractice = yearsInPractice;
	}
	@Override
	public String toString() {
		return "[NumberOfAttornerys=" + NumberOfAttornerys + ", ContinuingLawEducationHours="
				+ ContinuingLawEducationHours + ", AttorneyName=" + AttorneyName + ", StateAdmittedToBar="
				+ StateAdmittedToBar + ", StatusCode=" + StatusCode + ", YearsInPractice=" + YearsInPractice + "]";
	}
}
