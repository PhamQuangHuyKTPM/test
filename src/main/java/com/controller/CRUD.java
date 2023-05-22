package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DAO;
import com.model.Student;

@WebServlet(urlPatterns = "/crud")
public class CRUD extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	DAO dao;
	
	public CRUD() {
		dao = new DAO();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String status = req.getParameter("status");
		
		
		if("update".equals(status)) {
			int id = Integer.parseInt(req.getParameter("id"));
			Student s = new Student();
			s = dao.getById(id);
			req.setAttribute("student", s);
			req.getRequestDispatcher("/views/form_update.jsp").forward(req, resp);
		}else if("add".equals(status)) {
			
			req.getRequestDispatcher("/views/form_add.jsp").forward(req, resp);
		}else if("delete".equals(status)) {
			int id = Integer.parseInt(req.getParameter("id"));
			dao.delete(id);
			resp.sendRedirect("trang-chu");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		String status = req.getParameter("status");
		
		
		String hoten = req.getParameter("hoten");
		String lop = req.getParameter("lop");
		
		if("update".equals(status)) {
			int id = Integer.parseInt(req.getParameter("id"));
			Student s = new Student(id, hoten, lop);
			dao.update(s);
			resp.sendRedirect("trang-chu");
		}
		if("add".equals(status)) {
			Student s = new Student();
			s.setHoten(hoten);
			s.setLop(lop);
			dao.insert(s);
			resp.sendRedirect("trang-chu");
		}
	}

}
