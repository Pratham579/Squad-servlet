package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Icecream
 */
@WebServlet("/Icecream")
public class Icecream extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Icecream() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String flavour=request.getParameter("icecream");
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		pw.print("We are in the doGet....");
		switch (flavour) {
		case "Chocolate": pw.print("<h3>Price of chocolate ice-cream= "+100+"</h3>");
		break;
		case "Venila": pw.print("<h3>Price of Venila ice-cream= "+50+"</h3>");
		break;
		case "Strawberry": pw.print("<h3>Price of Strawberry ice-cream= "+80+"</h3>");
		break;
		case "Butter Scotch": pw.print("<h3>Price of Butter Scotch ice-cream= "+110+"</h3>");
		break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + flavour);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("Car");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("We are in the doPost....");
		pw.print("<h3>Your car "+name+" price is 1452020</h3>");
	}

}
