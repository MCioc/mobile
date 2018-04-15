package com.oracle.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.dao.CustomerDao;
import com.oracle.dao.CustomerDaoImpl;
import com.oracle.dao.MobileDao;
import com.oracle.dao.MobileDaoImpl;
import com.oracle.dao.UserDao;
import com.oracle.dao.UserDaoImpl;
import com.oracle.jdbc.util.ServiceFactory;
import com.oracle.jdbc.util.Transactional;
import com.oracle.vo.Customer;
import com.oracle.vo.User;

/**
 * Servlet implementation class UserAdd
 */
public class UserAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Transactional
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		Customer c=new Customer();
		c.setId_type((String)request.getSession().getAttribute("type"));
		c.setId_number((String)request.getSession().getAttribute("number"));
		c.setCustomer_Name((String)request.getSession().getAttribute("name"));
		c.setCustomer_Sex((String)request.getSession().getAttribute("sex"));
		c.setCustomer_Birthday((Date)request.getSession().getAttribute("birthday"));
		c.setCustomer_Address((String)request.getSession().getAttribute("address"));
		
		CustomerDao dao=ServiceFactory.getObject(CustomerDaoImpl.class);
        dao.add(c);
        
		String tel=request.getParameter("tel");
		String state=request.getParameter("state");
		String lv=request.getParameter("lv");
		Integer cusid=Integer.valueOf(request.getParameter("userid"));
		
		User user=new User();
		user.setMobile_Number(tel);
		user.setRoaming_Status(state);
		user.setCom_Level(lv);
		user.setCustomer_ID(cusid);
		
		UserDao udao=ServiceFactory.getObject(UserDaoImpl.class);
		udao.add(user);
		
		MobileDao mdao=ServiceFactory.getObject(MobileDaoImpl.class);
		mdao.update(tel);
		
		response.sendRedirect("saveinfo.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
