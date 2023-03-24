package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

public class EmployeeServlet extends HttpServlet{

	String name;
	Integer empNum;
	LocalDate joining;
	Double salary;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();

		name=req.getParameter("empName");
		empNum=Integer.parseInt( req.getParameter("empNum"));  //because dopost only get string value
		joining=LocalDate.parse(req.getParameter("jDate"));
		salary=Double.parseDouble(req.getParameter("salary"));
		resp.setContentType("text/html");
		resp.getWriter().print("<h3>Employee Details Given....</h3>"
				+"<ul>"
				+"<li>Name: "+name+"</li>"
				+"<li>Number: "+empNum+"</li>"
				+"<li>Joining DAte: "+joining+"</li>"
				+"<li>Salary: "+salary+"</li>"
				+"</ul>"
				);
		ServletConfig config=getServletConfig();

		String coupen=config.getInitParameter("Coupen");

		ServletContext context=getServletContext();
		String email=context.getInitParameter("Email");

		pw.print("<h1>Data exclusivaly for schoolServlet: coupen= "+coupen
				+"<br>Data for all servlet email= "+email+"</h1>");





	}

}
