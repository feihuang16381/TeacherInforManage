package com.Servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.util.DBUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setAttribute("name", "黄飞");

		request.setAttribute("age", 18);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		String userName = request.getParameter("username");
		String passWd = request.getParameter("password");
		if(userName!=null&&passWd!=null) {
		String sql = "select  * from login  where  username = " + "'" + userName + "'";
		
		try {
			List<Map<String, Object>> list = DBUtil.executeQueryFromLogin(sql);
			request.setAttribute("List<Map>:", list);
			if (list.get(0).get("username") != null && list.get(0).get("password") != null) {
				System.out.println(list.get(0).get("username"));
				System.out.println(list.get(0).get("password"));
				if (list.get(0).get("username").equals(userName) && list.get(0).get("password").equals(passWd)) {
					HttpSession session = request.getSession();
					session.setAttribute("userName", userName);
					System.out.println("success");
					System.out.println(list.get(0).get("username"));
					System.out.println(list.get(0).get("password"));
				} else {
					System.out.println("failed");
					System.out.println("userName" + userName);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
