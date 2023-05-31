package com.main.registration.servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	List<User> listUser = null;
    	String msg = (String) request.getAttribute("message");
		try {
			listUser = UserDAO.selectAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("listUser", listUser);
		request.setAttribute("msg", msg);
		RequestDispatcher dispatcher = request.getRequestDispatcher("dlt.jsp");
		dispatcher.forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	List<User> listUser = null;
		try {
			listUser = UserDAO.selectAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("viewpage.jsp");
		dispatcher.forward(request, response);
		
    }
}
