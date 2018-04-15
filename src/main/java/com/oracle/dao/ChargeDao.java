package com.oracle.dao;

import java.util.List;

import com.oracle.vo.Charge;

public interface ChargeDao {
   public void set(Charge charge);
   public Double getFee(String charge);
   public List<Charge> getAll();
}