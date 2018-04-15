package com.oracle.dao;

import com.oracle.jdbc.util.Dao;
import com.oracle.vo.Customer;

public class CustomerDaoImpl implements CustomerDao {

	public void add(Customer c) {
			Dao.executeSql("INSERT INTO tcustomer VALUES(null,?,?,?,?,?,?)", c.getId_type(),c.getId_number(),c.getCustomer_Name(),c.getCustomer_Birthday(),c.getCustomer_Sex(),c.getCustomer_Address());
	}

	public Integer getID() {
		Customer id=Dao.queryOne("SELECT max(customer_id)+1 customer_id FROM tcustomer", Customer.class);
		return id.getCustomer_ID();
	}     
}
