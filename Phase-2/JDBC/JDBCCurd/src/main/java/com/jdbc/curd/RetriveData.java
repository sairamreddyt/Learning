package com.jdbc.curd;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Servlet implementation class RetriveData
 */
@WebServlet("/fetch")
public class RetriveData extends HttpServlet {
	private static final long serialVersionUID = 1L;       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		Properties props= new Properties();
		props.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection conn= DBCOnfig.getConnect(props);
		out.print("<h1>Dept Details<h1>");
		if(conn!=null)
		{
			try {
				Statement smt=conn.createStatement();
				ResultSet rs=smt.executeQuery("select * from dept");
				while(rs.next())
				{
					out.print(rs.getBigDecimal(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "
							+"<a href='updatepage?deptno="+rs.getInt(1)+"'>update </a>"
							+"<a href='delete?deptno="+rs.getInt(1)+"'>delete</a><br>");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			out.print("connection failed");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
