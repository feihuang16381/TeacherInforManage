package com.dao;

import java.util.List;
import java.util.Map;

import com.util.DBUtil;

public class StudentDao {
public  List<Map<String, Object>> GetInfor(String userName)  {
	String sql = "select  * from login  where  username = " + "'" + userName + "'";
	List<Map<String, Object>> list = null;
	try {
		list = DBUtil.executeQueryFromLogin(sql);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
	
	
	
}
}
