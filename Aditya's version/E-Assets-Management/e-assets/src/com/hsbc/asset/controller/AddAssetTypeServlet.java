package com.hsbc.asset.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddAssetTypeServlet")
public class AddAssetTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("type");
		String typeBorrow = request.getParameter("borrow");
		String typeFine = request.getParameter("fine");
		String typeBan = request.getParameter("ban");
		
		RequestDispatcher rd = request.getRequestDispatcher("assettypeadded.jsp");
		rd.forward(request, response);
	
	}

}
