package com.shoaib.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.User;

import com.shoaib.connection.DbCon;
import com.shoaib.dao.UserDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/user-login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("login.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html;charset=UTF-8");
	   try(PrintWriter out = response.getWriter()){
		   out.print("This is login Servlet");
		   String email = request.getParameter("Login-email");
		   String Password = request.getParameter("Login-Password");
		   try {
			UserDao udao=new UserDao(DbCon.getConnection());
			User user=udao.userLogin(email, Password);
			if(user !=null) {
				out.print("user login");
				request.getSession().setAttribute("auth", user);
				response.sendRedirect("index.jsp");
			}else {
				out.print("user login failed!");
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   out.print(email+Password);
	   }
	}

}
