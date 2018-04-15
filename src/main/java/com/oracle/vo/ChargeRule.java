package com.oracle.vo;

public class ChargeRule {
     String func_ID;
     String charge_Code;
     String func_Name;
	public String getFunc_ID() {
		return func_ID;
	}
	public void setFunc_ID(String func_ID) {
		this.func_ID = func_ID;
	}
	public String getCharge_Code() {
		return charge_Code;
	}
	public void setCharge_Code(String charge_Code) {
		this.charge_Code = charge_Code;
	}
	public String getFunc_Name() {
		return func_Name;
	}
	public void setFunc_Name(String func_Name) {
		this.func_Name = func_Name;
	}
	@Override
	public String toString() {
		return "ChargeRule [func_ID=" + func_ID + ", charge_Code=" + charge_Code + ", func_Name=" + func_Name + "]";
	}
	
     
}
