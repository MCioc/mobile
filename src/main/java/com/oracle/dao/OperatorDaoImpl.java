package com.oracle.dao;

import com.oracle.jdbc.util.Dao;
import com.oracle.jdbc.util.Transactional;
import com.oracle.vo.Operator;

public class OperatorDaoImpl implements OperatorDao {

	public Operator getAll(String name, String pwd) {
		Operator oper=Dao.queryOne("SELECT * FROM toperator WHERE OPERATOR_NAME=? AND OPERATOR_PWD=?", Operator.class, name,pwd);
		return oper;
	}

	public void add(Operator oper) {
		Dao.executeSql("INSERT INTO toperator VALUES(?,?,?,?)",oper.getOperater_ID(),oper.getOperator_Name(),oper.getOperator_Pwd(),oper.getIs_Admin());
	}

}
