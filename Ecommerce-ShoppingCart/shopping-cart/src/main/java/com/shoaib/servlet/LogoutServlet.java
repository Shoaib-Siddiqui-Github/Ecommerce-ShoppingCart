package com.shoaib.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/log-out")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()) {
			if (request.getSession().getAttribute("auth") != null) {
				request.getSession().removeAttribute("auth");
				response.sendRedirect("login.jsp");

			} else {
				response.sendRedirect("index.jsp");
			}

			/*
			 * TODO output your page here. You may use following sample code.
			 * out.println("<!DOCTYPE html>"); out.println("<html>"); out.println("<head>");
			 * out.println("<title>Servlet LogoutServlet</title>"); out.println("</head>");
			 * out.println("<body>");
			 * 
			 * HttpSession session = request.getSession();
			 * session.removeAttribute("logUser"); session.invalidate();
			 * response.sendRedirect("index.jsp");
			 * 
			 * out.println("</body>");
			 */
			
		}
	}

}
