package com.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/fetch")
public class FetchData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		Properties props= new Properties();
		InputStream in= getServletContext().getResourceAsStream("/WEB-INF/config.properties");
		props.load(in);
		Connection conn= DBCOnfig.getConnect(props);
		if(conn!=null)
		{
			try {
				Statement smt=conn.createStatement();
				ResultSet rs=smt.executeQuery("select * from emp");
				out.print("<h1>Employee Data</h1><hr>");
				out.print("<table  border:1px solid black cellspacing=5 cellpadding=5><tr><th>empno</th>");
				out.print("<th>ename</th>");
				out.print("<th>job</th>");
				out.print("<th>mgr</th>");
				out.print("<th>hiredate</th>");
				out.print("<th>sal</th></tr>");
				while(rs.next())
				{
					out.print("<tr>");
					out.print("<td>"+rs.getInt(1)+"<td>"+"<td>"+rs.getString(2)+"<td>"+"<td>"+rs.getString(3)+"<td>"+"<td>"+rs.getBigDecimal(4)+"<td>"+"<td>"+rs.getDate(5)+"<td>"+"<td>"+rs.getBigDecimal(6)+"</td>");
					out.println("</tr>");
				}
				out.print("</table>");
			} catch (Exception e) {
				// TODO: handle exception
				e.getStackTrace();
			}
		}
		else
		{
			out.print("Error while connecting with DB");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
