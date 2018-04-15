package com.oracle.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.dao.ChargeDao;
import com.oracle.dao.ChargeDaoImpl;
import com.oracle.jdbc.util.ServiceFactory;
import com.oracle.jdbc.util.Transactional;
import com.oracle.vo.Charge;

/**
 * Servlet implementation class ChargeAdd
 */
public class ChargeSet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChargeSet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Transactional
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fee=request.getParameter("fee");
		String charge=request.getParameter("charge");
		
		Charge c=new Charge();	
		c.setCharge_Code(charge);
		
		Double d=Double.valueOf(fee);
		c.setCharge(d);
		
		ChargeDao dao=ServiceFactory.getObject(ChargeDaoImpl.class);
		dao.set(c);
		
		response.sendRedirect("getchargename.do");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
