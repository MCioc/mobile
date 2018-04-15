package com.oracle.vo;

public class Charge {
	String charge_Code;
    String charge_Name;
    Double charge;
	public String getCharge_Code() {
		return charge_Code;
	}
	public void setCharge_Code(String charge_Code) {
		this.charge_Code = charge_Code;
	}
	public String getCharge_Name() {
		return charge_Name;
	}
	public void setCharge_Name(String charge_Name) {
		this.charge_Name = charge_Name;
	}
	public Double getCharge() {
		return charge;
	}
	public void setCharge(Double chager) {
		this.charge = chager;
	}
	@Override
	public String toString() {
		return "Charge [charge_Code=" + charge_Code + ", charge_Name=" + charge_Name + ", chager=" + charge + "]";
	}
	
	
    
}
