package com.xiaoshuo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import com.xiaoshuo.dao.GuanliDao;
import com.xiaoshuo.dao.Impl.GuanLiDaoImpl;
import com.xiaoshuo.entity.GuanLi;
import com.xiaoshuo.util.DBManager;

public class GuanLiServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("name");
		String pwd = request.getParameter("password");

		GuanliDao ud = new GuanLiDaoImpl();
		GuanLi user = (GuanLi) ud.selectUserByName(username);

		if (user != null && user.getPassword().equals(pwd)) { //��¼�ɹ�
			request.getRequestDispatcher("/hotai/index.html").forward(request, response);
			return;
		}
		//��¼ʧ��
		response.sendRedirect("/xiaoshuo/hotai/login.html");
	}

//		String yhm=request.getParameter("yhm");
//		String mm=request.getParameter("mm");
//		if(yhm.equals("name")&&mm.equals("password")){
//			 request.getRequestDispatcher("/hotai/index.html").forward(request, response);
//		}else{
//			 response.sendRedirect("/xiaoshuo/hotai/login.html");
//		}
//		
//	}
}
