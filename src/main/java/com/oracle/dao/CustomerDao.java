package com.oracle.dao;

import com.oracle.vo.Customer;

public interface CustomerDao {
   public void add(Customer c);
   public Integer getID();
}