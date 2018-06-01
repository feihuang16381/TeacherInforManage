package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.StudentDao;
import com.entity.Teacher;

/**
 * Servlet implementation class editTeacherServlet
 */
@WebServlet("/editTeacherServlet")
public class editTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editTeacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	HttpSession session = request.getSession();
	
	int condition =Integer.parseInt(session.getAttribute("condition").toString());
	System.out.println("session:"+condition);

    String name =  request.getParameter("name");    
    String sex =  request.getParameter("sex");
    String sdept =  request.getParameter("sdept");
    String major =  request.getParameter("major");
    String birthday =  request.getParameter("birthday");
    int userId = Integer.parseInt(request.getParameter("userId"));
    float salary =  Float.parseFloat(request.getParameter("salary"));
    
    
    Teacher teacher = new Teacher();
    teacher.setId((Integer)userId);
    teacher.setName(name);
    teacher.setSalary(salary);
    teacher.setSex(sex);
    teacher.setSdept(sdept);
    teacher.setMajor(major);
    teacher.setBirthday(birthday);
    	
    
    StudentDao studentDao = new StudentDao();
    studentDao.EditTeacher(teacher, condition);
    
    System.out.println("修改成功");
    request.getRequestDispatcher("editTeacher.jsp").forward(request, response);
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
