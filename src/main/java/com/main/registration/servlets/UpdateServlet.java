package com.main.registration.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateServlet() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String uname=request.getParameter("uname");
		String email=request.getParameter("email");
		String username=request.getParameter("username");
		 String password=request.getParameter("password");
		 String mobileNo=request.getParameter("number");
		 UserDAO.updateProfile(uname, email, username, password, mobileNo);
		 request.setAttribute("message", "Updated Successfully");
		 RequestDispatcher dispatcher = request.getRequestDispatcher("ViewServlet");
		 dispatcher.forward(request, response);
    }

}
