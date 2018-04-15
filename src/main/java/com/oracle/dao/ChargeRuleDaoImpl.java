package com.oracle.dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.oracle.vo.Charge;

public class ChargeRuleDaoImpl implements ChargeRuleDao{

	public void update(String funcid,String[] code,String name) {
		Dao.executeSql("DELETE FROM tcharge_rule WHERE FUNC_ID=? ",funcid );
		for(int i=0;i<code.length;i++){
			Dao.executeSql("INSERT INTO tcharge_rule VALUES(?,?,?)", funcid,code[i],name);
		}
	}
}
