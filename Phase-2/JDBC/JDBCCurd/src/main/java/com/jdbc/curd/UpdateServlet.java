package com.jdbc.curd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dname=request.getParameter("dname");
		String loc=request.getParameter("loc");
		String param=request.getParameter("deptno");
		int deptno= Integer.parseInt(param);
		Properties prop= new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection conn= DBCOnfig.getConnect(prop);
		
		if(conn!=null)
		{
			try {
				PreparedStatement stmt= 
						conn.prepareStatement("update dept set dname=?, loc=? where deptno=?");
				stmt.setString(1, dname);
				stmt.setString(2, loc);
				stmt.setInt(3, deptno);
				
				int rs=stmt.executeUpdate();
				if(rs>0)
				{
					System.out.print(rs+" rows updated in database");
					response.sendRedirect("fetch");
				}
				else
				{
					System.out.println("error while updating a data");
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