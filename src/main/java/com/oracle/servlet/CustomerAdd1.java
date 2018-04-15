package com.oracle.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.dao.CustomerDao;
import com.oracle.dao.CustomerDaoImpl;
import com.oracle.dao.UserDao;
import com.oracle.dao.UserDaoImpl;
import com.oracle.jdbc.util.ServiceFactory;
import com.oracle.jdbc.util.Transactional;
import com.oracle.vo.Customer;

/**
 * Servlet implementation class CustomerAdd1
 */
public class CustomerAdd1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerAdd1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		Date birthday=Date.valueOf(request.getParameter("birthday"));
		String address=request.getParameter("address");
		
		request.getSession().setAttribute("name", name);
		request.getSession().setAttribute("sex", sex);
		request.getSession().setAttribute("birthday",birthday);
		request.getSession().setAttribute("address", address);
		
		CustomerDao dao=ServiceFactory.getObject(CustomerDaoImpl.class);
        request.setAttribute("cusid", dao.getID());
		
        request.getRequestDispatcher("newuser.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
