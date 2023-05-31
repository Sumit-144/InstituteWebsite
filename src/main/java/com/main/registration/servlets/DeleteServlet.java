package com.main.registration.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DeleteServlet() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		boolean status=UserDAO.delete(username);
		if(status) {
			request.setAttribute("message", "Deleted Successfully");
			RequestDispatcher dispatcher = request.getRequestDispatcher("ViewServlet");
			dispatcher.forward(request, response);
    }
    }

}
