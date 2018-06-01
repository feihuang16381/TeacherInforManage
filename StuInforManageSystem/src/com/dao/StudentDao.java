package com.dao;

import java.util.List;
import java.util.Map;

import javax.swing.JInternalFrame;

import com.entity.Teacher;
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

public   void AddTeacher(Teacher teacher ) {
	
	String sql="insert teacher(userId,name,salary,sex,sdept,major,birthday) values ("+teacher.getId()+",'"+teacher.getName()+"',"
	+teacher.getSalary()+",'"+teacher.getSex()+"','"+teacher.getSdept()+"','"+teacher.getMajor()+"','"+teacher.getBirthday()+"')";
	
	try {
		DBUtil.execute(sql);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void EditTeacher(Teacher teacher,int condition) {
	String sql = "update teacher set userId ="+teacher.getId()+",name = '"+teacher.getName()+"',salary = '"+teacher.getSalary()
	+"',sex = '"+teacher.getSex()+"',sdept ='"+teacher.getSdept()+"',major ='"+teacher.getMajor()+"',birthday = '"+teacher.getBirthday()
	+"'  where userId = "+condition ;
	
	try {
		DBUtil.execute(sql);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(sql);
}

public void deleteByCondition(int condition) {
	String sql = "delete from teacher where userId ="+condition;
	
	try {
		DBUtil.execute(sql);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
