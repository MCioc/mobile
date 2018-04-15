package com.oracle.dao;

import com.oracle.vo.User;

public interface UserDao {
   public void add(User user);
   public Integer getID();
}