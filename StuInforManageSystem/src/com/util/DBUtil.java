package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DBUtil {
	public static Connection getConnection() throws Exception
	{
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/stuinformanagesystem?useUnicode=true&characterEncoding=utf8";
		String userName = "root";
		String userPWD = "";
		
		Class.forName(driverName);
		
		Connection connection = DriverManager.getConnection(url,userName,userPWD);
		
		return connection;
	}
	public static boolean execute(String sql) throws Exception
	{
		Connection connection = getConnection();
		 
		Statement  statement =  connection.createStatement();
	
		
		return statement.execute(sql);
	}
	public static List<Map<String, Object>> executeQueryFromStu(String sql) throws Exception {
		java.sql.ResultSet rs = null;
		Connection connection  = getConnection();
		Statement statement = connection.createStatement();
		rs=statement.executeQuery(sql);
		System.out.println(sql);
		List<Map<String, Object>> list =new LinkedList<Map<String, Object>>();  
		if(rs != null) {
			while(rs.next()) {
				Map<String, Object> map1 = new HashMap<String, Object>();
				
				
				int userId = rs.getInt("userId");
				String name = rs.getString("name");
				String salary = rs.getString("salary");
				String sex = rs.getString("sex");
				String sdept = rs.getString("sdept");
				String major = rs.getString("major");
				String birthday= rs.getString("birthday");
				
				map1.put("userId", userId);
				map1.put("name",name );
				map1.put("salary",salary );
				map1.put("sex",sex );
				map1.put("sdept",sdept );
				
				map1.put("major",major );
				map1.put("birthday",birthday );
				list.add(map1);
			}
		}
		return list;
		
	}
	public static void AddInfor() {
		
	}
	public static List<Map<String, Object>> executeQueryFromLogin(String sql) throws Exception {
		java.sql.ResultSet rs = null;
		Connection connection  = getConnection();
		Statement statement = connection.createStatement();
		rs=statement.executeQuery(sql);
		
		List<Map<String, Object>> list =new LinkedList<Map<String, Object>>();  
		if(rs != null) {
			while(rs.next()) {
				Map<String, Object> map1 = new HashMap<String, Object>();
				
				
				String username = rs.getString("username");
				String password = rs.getString("password");
				
				
				map1.put("username", username);
				map1.put("password",password );
			
				list.add(map1);
			}
		}
		return list;
		
	}
	
}
