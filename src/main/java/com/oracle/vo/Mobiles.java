package com.oracle.vo;

public class Mobiles {
    String mobile_Number;
    String mobile_Type;
    String card_Number;
    String is_available;
	public String getMobile_Number() {
		return mobile_Number;
	}
	public void setMobile_Number(String mobile_Number) {
		this.mobile_Number = mobile_Number;
	}
	public String getMobile_Type() {
		return mobile_Type;
	}
	public void setMobile_Type(String mobile_Type) {
		this.mobile_Type = mobile_Type;
	}
	public String getCard_Number() {
		return card_Number;
	}
	public void setCard_Number(String card_Number) {
		this.card_Number = card_Number;
	}
	public String getIs_available() {
		return is_available;
	}
	public void setIs_available(String is_available) {
		this.is_available = is_available;
	}
	@Override
	public String toString() {
		return "Mobiles [mobile_Number=" + mobile_Number + ", mobile_Type=" + mobile_Type + ", card_Number="
				+ card_Number + ", is_available=" + is_available + "]";
	}
	
    
}
