package com.capg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/EmpServlet")
public class EmpServlet extends GenericServlet implements Servlet{
	private static final long serialVersionUID = 1L;
 
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String empid=request.getParameter("eid");
		String ename=request.getParameter("ename");
		int salary= Integer.parseInt(request.getParameter("esal"));
		String eadd=request.getParameter("eadd");
		String area=request.getParameter("earea");
		String city=request.getParameter("ecity");
		int pincode= Integer.parseInt(request.getParameter("epin"));
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<hmtl><body>");
		out.println("<p>Id is"+empid+"</p><br>");
		out.println("<p>Name is"+ename+"</p>");
		out.println("<p>Salary is"+salary+"</p><br>");
		out.println("<p>House No.is"+eadd+"</p><br>");
		out.println("<p>Area is"+area+"</p><br>");
		out.println("<p>City is"+city+"</p><br>");
		out.println("<p>Pincode  is"+pincode+"</p><br>");
		out.println("</body></html>");
		out.close();
	}
	
}
