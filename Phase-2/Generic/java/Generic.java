package com.assistedproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


//@WebServlet("/GenericServlet")
public class Generic extends GenericServlet {
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
			
			PrintWriter out=resp.getWriter();
			
			out.print("Output From Generic Servlet");
			
		}
}
