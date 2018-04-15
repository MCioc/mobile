package com.oracle.dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.oracle.jdbc.util.Transactional;
import com.oracle.vo.Charge;

public class ChargeDaoImpl implements ChargeDao {

	public void set(Charge charge) {
		Dao.executeSql("UPDATE `tcharge` SET `CHARGE`=? WHERE (`CHARGE_CODE`=?)", charge.getCharge(),charge.getCharge_Code());	
	}

	public Double getFee(String charge) {
		Charge c=Dao.queryOne("SELECT * FROM tcharge WHERE CHARGE_CODE=?", Charge.class, charge);
		System.out.println(c.toString());
		return c.getCharge();
	}
	public List<Charge> getAll() {
		List<Charge> ca=Dao.query("SELECT * FROM tcharge", Charge.class);
		return ca;
	}
}
