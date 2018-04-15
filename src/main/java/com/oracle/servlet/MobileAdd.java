package com.oracle.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.dao.MobileDao;
import com.oracle.dao.MobileDaoImpl;
import com.oracle.jdbc.util.ServiceFactory;
import com.oracle.jdbc.util.Transactional;
import com.oracle.vo.Mobiles;

/**
 * Servlet implementation class MobileAdd
 */
public class MobileAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MobileAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Transactional
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type=request.getParameter("MType");
		Long t1=Long.valueOf(request.getParameter("T1"));
		Long t2=Long.valueOf(request.getParameter("T2"));
	    
		Mobiles[] m=new Mobiles[(int) (t2-t1+1)];
		for(int i=0;i<(int)(t2-t1+1);i++){
			Long t=t1+i;
			Mobiles ms=new Mobiles();
			ms.setMobile_Number(t+"");
			ms.setMobile_Type(type);
			ms.setCard_Number((t1+"").substring(0, 3));
		    ms.setIs_available("Y");
			m[i]=ms;
		}
		
		MobileDao dao=ServiceFactory.getObject(MobileDaoImpl.class);
		dao.add(m);
		
		response.sendRedirect("resource.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
