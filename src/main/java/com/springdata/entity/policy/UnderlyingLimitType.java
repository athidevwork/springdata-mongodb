
package com.springdata.entity.policy;

import java.io.Serializable;

public class UnderlyingLimitType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String PulLimit;
    protected String PualLimit;
    protected String BpulLimit;
    protected String PaulLimit;
    protected String GugalLimit;
    protected String PcohualLimit;
    protected String CaulLimit;
    protected String CaevulLimit;
    protected String HlulLimit;
    protected String HlualLimit;
    protected String EraulLimit;
    protected String ErdulLimit;
    protected String PllerdulLimit;
	public String getPulLimit() {
		return PulLimit;
	}
	public void setPulLimit(String pulLimit) {
		PulLimit = pulLimit;
	}
	public String getPualLimit() {
		return PualLimit;
	}
	public void setPualLimit(String pualLimit) {
		PualLimit = pualLimit;
	}
	public String getBpulLimit() {
		return BpulLimit;
	}
	public void setBpulLimit(String bpulLimit) {
		BpulLimit = bpulLimit;
	}
	public String getPaulLimit() {
		return PaulLimit;
	}
	public void setPaulLimit(String paulLimit) {
		PaulLimit = paulLimit;
	}
	public String getGugalLimit() {
		return GugalLimit;
	}
	public void setGugalLimit(String gugalLimit) {
		GugalLimit = gugalLimit;
	}
	public String getPcohualLimit() {
		return PcohualLimit;
	}
	public void setPcohualLimit(String pcohualLimit) {
		PcohualLimit = pcohualLimit;
	}
	public String getCaulLimit() {
		return CaulLimit;
	}
	public void setCaulLimit(String caulLimit) {
		CaulLimit = caulLimit;
	}
	public String getCaevulLimit() {
		return CaevulLimit;
	}
	public void setCaevulLimit(String caevulLimit) {
		CaevulLimit = caevulLimit;
	}
	public String getHlulLimit() {
		return HlulLimit;
	}
	public void setHlulLimit(String hlulLimit) {
		HlulLimit = hlulLimit;
	}
	public String getHlualLimit() {
		return HlualLimit;
	}
	public void setHlualLimit(String hlualLimit) {
		HlualLimit = hlualLimit;
	}
	public String getEraulLimit() {
		return EraulLimit;
	}
	public void setEraulLimit(String eraulLimit) {
		EraulLimit = eraulLimit;
	}
	public String getErdulLimit() {
		return ErdulLimit;
	}
	public void setErdulLimit(String erdulLimit) {
		ErdulLimit = erdulLimit;
	}
	public String getPllerdulLimit() {
		return PllerdulLimit;
	}
	public void setPllerdulLimit(String pllerdulLimit) {
		PllerdulLimit = pllerdulLimit;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[PulLimit=" + PulLimit + ", PualLimit=" + PualLimit + ", BpulLimit=" + BpulLimit
				+ ", PaulLimit=" + PaulLimit + ", GugalLimit=" + GugalLimit + ", PcohualLimit=" + PcohualLimit
				+ ", CaulLimit=" + CaulLimit + ", CaevulLimit=" + CaevulLimit + ", HlulLimit=" + HlulLimit
				+ ", HlualLimit=" + HlualLimit + ", EraulLimit=" + EraulLimit + ", ErdulLimit=" + ErdulLimit
				+ ", PllerdulLimit=" + PllerdulLimit + "]";
	}
}
