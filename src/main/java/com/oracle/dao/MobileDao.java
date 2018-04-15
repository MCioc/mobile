package com.oracle.dao;

import java.util.List;

import com.oracle.vo.Mobiles;

public interface MobileDao {
    public void add(Mobiles[] mobile);
    public void update(String tel);
    public List<Mobiles> getTel();
}