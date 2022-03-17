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

@WebServlet("/save")
public class CreateData extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deptno=request.getParameter("deptno");
		String dname=request.getParameter("dname");
		String loc=request.getParameter("loc");
		//String password=request.getParameter("pass");
		
		Properties prop= new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection conn= DBCOnfig.getConnect(prop);
		
		if(conn!=null)
		{
			try {
				PreparedStatement stmt= 
						conn.prepareStatement("insert into dept (deptno,dname,loc) values(?,?,?)");
				stmt.setString(1, deptno);
				stmt.setString(2, dname);
				stmt.setString(3, loc);
				//stmt.setString(4, password);
				
				int rs=stmt.executeUpdate();
				if(rs>0)
				{
					System.out.print(rs+" rows insetred in database");
					response.sendRedirect("fetch");
				}
				else
				{
					System.out.println("error while inserting a data");
					response.sendRedirect("index.html");
				}
			} catch (Exception e) {
				// TODO: handle exception
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