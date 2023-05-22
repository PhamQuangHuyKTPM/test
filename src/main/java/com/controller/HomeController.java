package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DAO;
import com.model.Student;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/trang-chu")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DAO dao;
	List<Student> list;

	public HomeController() {
		dao = new DAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		list = dao.selectAll();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/views/trang-chu.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
