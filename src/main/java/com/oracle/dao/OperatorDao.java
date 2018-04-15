package com.oracle.dao;

import com.oracle.vo.Operator;

public interface OperatorDao {
     public Operator getAll(String name,String pwd);
     public void add(Operator oper);
}
