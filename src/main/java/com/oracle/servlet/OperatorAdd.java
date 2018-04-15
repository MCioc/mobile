package com.oracle.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.dao.OperatorDao;
import com.oracle.dao.OperatorDaoImpl;
import com.oracle.jdbc.util.ServiceFactory;
import com.oracle.vo.Operator;

/**
 * Servlet implementation class OperatorAdd
 */
public class OperatorAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OperatorAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String ID=request.getParameter("ID");
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		Integer YN=Integer.valueOf(request.getParameter("YN"));
		
		Operator oper=new Operator();
		oper.setOperater_ID(ID);
		oper.setOperator_Name(name);
		oper.setOperator_Pwd(pwd);
		oper.setIs_Admin(YN);
		
		OperatorDao dao=ServiceFactory.getObject(OperatorDaoImpl.class);
		dao.add(oper);
		
		response.sendRedirect("newoperator.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
