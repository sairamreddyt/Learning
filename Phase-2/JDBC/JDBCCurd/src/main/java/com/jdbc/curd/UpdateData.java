package com.jdbc.curd;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdatePageServlet
 */
@WebServlet("/updatepage")
public class UpdateData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param= request.getParameter("deptno");
		int deptno= Integer.parseInt(param);
		
		Properties prop= new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection conn= DBCOnfig.getConnect(prop);
		PrintWriter out= response.getWriter();
		if(conn!=null)
		{
			try {
				PreparedStatement stmt= 
						conn.prepareStatement("select * from dept where deptno=?");
				stmt.setInt(1, deptno);
				ResultSet rs= stmt.executeQuery();
				out.println("<h1>Welcome User, Update your data</h1>");
				if(rs.next())
				{
					out.print("<form action='update' method='post'>");
					out.print("<input type='hidden' name='deptno' value='"+rs.getString(1)+"'>");
					out.print("dname: <input type='text' name='dname' value='"+rs.getString(2)+"'><br><br>");
					out.print("loc: <input type='text' name='loc' value='"+rs.getString(3)+"'><br><br>");
					//out.print("Email: <input type='text' name='email' value='"+rs.getString(4)+"'><br><br>");
					//out.print("Password: <input type='text' name='pass' value='"+rs.getString(5)+"'><br><br>");
					out.print("<input type='submit' value='Update Data'></form>");
				}
				else {
					System.out.println("No user vailable with provided deptno, Register First");
					response.sendRedirect("index.html");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			response.getWriter().print("Error while connecting with DB");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}