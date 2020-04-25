package com.capg.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;


@WebServlet("/MycalcServlet")
public class MycalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int oper1 = Integer.parseInt(request.getParameter("oper1"));
		int oper2 = Integer.parseInt(request.getParameter("oper2"));
		String action =request.getParameter("action");
		int value=0;
		if(action.equals("Add"))
		{
			value=oper1+oper2;
		}
		else if(action.equals("Sub"))
		{
			value=oper1-oper2;
		}
		else if(action.equals("Mul"))
		{
			value=oper1*oper2;
		}
		System.out.println(value);
		RequestDispatcher dispatcher = (RequestDispatcher) request.getRequestDispatcher("showServlet");
			request.setAttribute("result", value);
		dispatcher.forward(request, response);

		
	}

}
