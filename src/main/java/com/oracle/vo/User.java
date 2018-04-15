package com.oracle.vo;

public class User {
	Integer user_ID;
    String mobile_Number;
    String roaming_Status;
    String com_Level;
    Integer customer_ID;
    Integer accont_ID;
	public Integer getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(Integer user_ID) {
		this.user_ID = user_ID;
	}
	public String getMobile_Number() {
		return mobile_Number;
	}
	public void setMobile_Number(String mobile_Number) {
		this.mobile_Number = mobile_Number;
	}
	public String getRoaming_Status() {
		return roaming_Status;
	}
	public void setRoaming_Status(String roaming_Status) {
		this.roaming_Status = roaming_Status;
	}
	public String getCom_Level() {
		return com_Level;
	}
	public void setCom_Level(String com_Level) {
		this.com_Level = com_Level;
	}
	public Integer getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(Integer customer_ID) {
		this.customer_ID = customer_ID;
	}
	public Integer getAccont_ID() {
		return accont_ID;
	}
	public void setAccont_ID(Integer accont_ID) {
		this.accont_ID = accont_ID;
	}
	@Override
	public String toString() {
		return "User [user_ID=" + user_ID + ", mobile_Number=" + mobile_Number + ", roaming_Status=" + roaming_Status
				+ ", com_Level=" + com_Level + ", customer_ID=" + customer_ID + ", accont_ID=" + accont_ID + "]";
	}
    
}
