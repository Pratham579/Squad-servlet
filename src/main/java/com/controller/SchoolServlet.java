package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SchoolServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s=req.getParameter("school");   // to fetch information in input tag we use req.getParameter
		String add=req.getParameter("sAddress");  //we pass the name of input tag in the getParameter
		
		PrintWriter pw=resp.getWriter();
		
		pw.print("<h1>Thank You For Giving School Details </h1>");
		pw.print("<h4>School NAme = "+s+"</h4>");
		pw.print("<h4>School Address = "+add+"</h4>");
		
		
	}

}
