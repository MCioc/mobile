package com.oracle.dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.oracle.jdbc.util.Transactional;
import com.oracle.vo.Mobiles;

public class MobileDaoImpl implements MobileDao {

	public void add(Mobiles[] mobile) {
		for(int i=0;i<mobile.length;i++){
			Dao.executeSql("INSERT INTO tmobiles VALUES (?,?,?,?)",mobile[i].getMobile_Number(),mobile[i].getMobile_Type(),mobile[i].getCard_Number(),mobile[i].getIs_available());
		}
	}

	public List<Mobiles> getTel() {
		return Dao.query("select *from tmobiles where is_available='Y' order by mobile_number", Mobiles.class); 
	}

	public void update(String tel) {
		Dao.executeSql("UPDATE tmobiles SET IS_AVAILABLE='N' WHERE MOBILE_NUMBER=?", tel);		
	}
}
