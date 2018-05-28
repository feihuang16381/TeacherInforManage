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

import com.dao.StudentDao;
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

	

		String userName = request.getParameter("username");
		String passWd = request.getParameter("password");

		StudentDao studentdao = new StudentDao();
		List<Map<String, Object>> list = studentdao.GetInfor(userName);
		request.setAttribute("List<Map>:", list);

		if(!" ".equals(userName)&&!" ".equals(passWd)) {
		if (list.get(0).get("username").equals(userName) && list.get(0).get("password").equals(passWd)) {
			HttpSession session = request.getSession();
			session.setAttribute("userName", userName);	
			System.out.println("login success");
			response.sendRedirect("GetInfor");
			

		} else {
			System.out.println("failed");
			response.sendRedirect("index.jsp");

		}
		}
		
		else 
			response.sendRedirect("index.jsp");
			
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
