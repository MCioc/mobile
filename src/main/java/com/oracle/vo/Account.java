package com.oracle.vo;

public class Account {
    Integer accountID;
    String contactPerson;
    String contactAddress;
    Double accountBalance;
	public Integer getAccountID() {
		return accountID;
	}
	public void setAccountID(Integer accountID) {
		this.accountID = accountID;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", contactPerson=" + contactPerson + ", contactAddress="
				+ contactAddress + ", accountBalance=" + accountBalance + "]";
	}
    
}
