package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiddenServlet1
 */
@WebServlet("/HiddenServlet1")
public class HiddenServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HiddenServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String pageInfo=request.getParameter("page");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();

		if(pageInfo!=null && pageInfo.equals("userInfo")) {
		String username = request.getParameter("uname");
		pw.print("<h3>username recieved from form 1= "+username+"</h3>");
		}
		if(pageInfo!=null && pageInfo.equals("address")) {
		String address= request.getParameter("address");
		pw.print("<h3>address recieved from form 2= "+address+"</h3>");
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
