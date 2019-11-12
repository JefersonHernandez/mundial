package com.mundial.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mundial.entities.Equipo;
import com.mundial.model.EquipoDao;

/**
 * Servlet implementation class EquipoController
 */
@WebServlet("/EquipoController")
public class EquipoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EquipoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Equipo equipo = new Equipo();
		equipo.setNombre(request.getParameter("nombre"));
		equipo.setPresidente(request.getParameter("presidente"));
		
		EquipoDao equipoDao = new EquipoDao();
		try {
			equipoDao.insert(equipo);
		}catch(Exception e) {
			System.out.print("Error al guardar equipo");
		}
		response.sendRedirect(request.getContextPath()+"/index.jsp");
		//request.getRequestDispatcher("/index.jsp").forward(request, response);
		//doGet(request, response);
	}

}
