package com.oracle.vo;

public class Operator {
     String operater_ID;
     String operator_Name;
     String operator_Pwd;
     Integer is_Admin;
	public String getOperater_ID() {
		return operater_ID;
	}
	public void setOperater_ID(String operater_ID) {
		this.operater_ID = operater_ID;
	}
	public String getOperator_Name() {
		return operator_Name;
	}
	public void setOperator_Name(String operator_Name) {
		this.operator_Name = operator_Name;
	}
	public String getOperator_Pwd() {
		return operator_Pwd;
	}
	public void setOperator_Pwd(String operator_Pwd) {
		this.operator_Pwd = operator_Pwd;
	}
	public Integer getIs_Admin() {
		return is_Admin;
	}
	public void setIs_Admin(Integer is_Admin) {
		this.is_Admin = is_Admin;
	}
	@Override
	public String toString() {
		return "Operator [operater_ID=" + operater_ID + ", operator_Name=" + operator_Name + ", operator_Pwd="
				+ operator_Pwd + ", is_Admin=" + is_Admin + "]";
	}
     
}
