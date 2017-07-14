
package com.springdata.entity.party;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CommonInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ClientInformationType ClientInformation;
    protected List<SpecialHandlingPartyType> SpecialHandlingParty;
    protected List<DisciplineDeclineListType> DisciplineDeclineList;
    protected List<PriorCarriorType> PriorCarrior;
	public ClientInformationType getClientInformation() {
		return ClientInformation;
	}
	public void setClientInformation(ClientInformationType clientInformation) {
		ClientInformation = clientInformation;
	}
	public List<SpecialHandlingPartyType> getSpecialHandlingParty() {
		return SpecialHandlingParty;
	}
	public void setSpecialHandlingParty(List<SpecialHandlingPartyType> specialHandlingParty) {
		SpecialHandlingParty = specialHandlingParty;
	}
	public List<DisciplineDeclineListType> getDisciplineDeclineList() {
		return DisciplineDeclineList;
	}
	public void setDisciplineDeclineList(List<DisciplineDeclineListType> disciplineDeclineList) {
		DisciplineDeclineList = disciplineDeclineList;
	}
	public List<PriorCarriorType> getPriorCarrior() {
		return PriorCarrior;
	}
	public void setPriorCarrior(List<PriorCarriorType> priorCarrior) {
		PriorCarrior = priorCarrior;
	}
	@Override
	public String toString() {
		return "[ClientInformation=" + ClientInformation + ", SpecialHandlingParty="
				+ SpecialHandlingParty + ", DisciplineDeclineList=" + DisciplineDeclineList + ", PriorCarrior="
				+ PriorCarrior + "]";
	}
}
