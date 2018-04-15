package com.oracle.dao;

import com.oracle.jdbc.util.Dao;
import com.oracle.vo.User;

public class UserDaoImpl implements UserDao {

	public void add(User user) {
		Dao.executeSql("INSERT INTO tuser VALUES(null,?,?,?,?,null)",user.getMobile_Number(),user.getRoaming_Status(),user.getCom_Level(),user.getCustomer_ID());
	}

	public Integer getID() {
		User user=Dao.queryOne("SELECT max(user_id)+1 user_id FROM tuser", User.class);
		return user.getUser_ID();
	}
}
