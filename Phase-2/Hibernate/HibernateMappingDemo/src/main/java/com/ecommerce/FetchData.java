package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


@WebServlet("/fetch")
public class FetchData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FetchData() {}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session= factory.openSession();
		
		List<EProduct> list=session.createQuery("from EProduct").list();
		PrintWriter out= response.getWriter();
		for(EProduct product:list)
		{
			out.print("Id:" +product.getID()+"<br>");
			out.print("name: "+product.getName()+"<br>");
			out.print("price: "+product.getPrice()+"<br>");
			out.print("Available from: "+product.getDateAdded()+"<br>");
			out.print("Color Details"+"<br>");
			List<Color> colors=product.getColors();
			for(Color c:colors)
			{
				out.print("Color Name: "+c.getName()+"<br");
			}
			out.print("Screen Sizes Details"+"<br>");
			Collection<ScreenSizes> screen=product.getScreensizes();
			for(ScreenSizes s:screen)
			{
				out.print("Size: "+s.getSize()+"<br>");
			}
			out.print("OS Details"+"<br>");
			Set<OS> os=product.getOs();
			for(OS o:os)
			{
				out.print("Size: "+o.getName()+"<br>");
			}
			out.print("Finance Details"+"<br>");
			Map finance =product.getFinance();
			if(finance.get("CREDITCARD")!=null)
			{	
				Finance f=(Finance)finance.get("CREDITCARD");
				f.getName();
			}
			if(finance.get("BANK")!=null)
			{
				Finance f=(Finance)finance.get("BANK");
				f.getName();
			}
		}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
