package com.oracle.vo;

import java.sql.Date;

public class Customer {
    Integer customer_ID;
    String id_type;
    String id_number;
    String customer_Name;
    Date customer_Birthday;
    String customer_Sex;
    String customer_Address;
	public Integer getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(Integer customer_ID) {
		this.customer_ID = customer_ID;
	}
	public String getId_type() {
		return id_type;
	}
	public void setId_type(String id_type) {
		this.id_type = id_type;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public Date getCustomer_Birthday() {
		return customer_Birthday;
	}
	public void setCustomer_Birthday(Date customer_Birthday) {
		this.customer_Birthday = customer_Birthday;
	}
	public String getCustomer_Sex() {
		return customer_Sex;
	}
	public void setCustomer_Sex(String customer_Sex) {
		this.customer_Sex = customer_Sex;
	}
	public String getCustomer_Address() {
		return customer_Address;
	}
	public void setCustomer_Address(String customer_Address) {
		this.customer_Address = customer_Address;
	}
	@Override
	public String toString() {
		return "Customer [customer_ID=" + customer_ID + ", id_type=" + id_type + ", id_number=" + id_number
				+ ", customer_Name=" + customer_Name + ", customer_Birthday=" + customer_Birthday + ", customer_Sex="
				+ customer_Sex + ", customer_Address=" + customer_Address + "]";
	}
}
