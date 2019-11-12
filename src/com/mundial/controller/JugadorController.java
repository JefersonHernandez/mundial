package com.mundial.controller;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mundial.entities.Equipo;
import com.mundial.entities.Jugador;
import com.mundial.entities.JugadorPK;
import com.mundial.model.EquipoDao;
import com.mundial.model.JugadorDao;

/**
 * Servlet implementation class JugadorController
 */
@WebServlet("/JugadorController")
public class JugadorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JugadorController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		JugadorPK jugadorPk = new JugadorPK();
		jugadorPk.setEquipo(Integer.parseInt(request.getParameter("selectEquipo")));
		jugadorPk.setNumero(Integer.parseInt(request.getParameter("numero")));

		EquipoDao equipoDao = new EquipoDao();
		Equipo equipo = equipoDao.find(jugadorPk.getEquipo());

		Date f = null;
		try {
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			f = sd.parse(request.getParameter("fechanacimiento"));
			System.out.println(f);
		} catch (Exception e) {
			System.out.println("Error al realizar el cast de la fecha");
		}
		// javas.sql.Date fnacimiento = new javas.sql.Date();

		Jugador jugador = new Jugador();
		jugador.setNombre(request.getParameter("nombre"));
		jugador.setEmail(request.getParameter("email"));
		jugador.setPosicion(request.getParameter("posicion"));
		jugador.setId(jugadorPk);
		jugador.setEquipoBean(equipo);

		JugadorDao jugadorDao = new JugadorDao();
		try {
			jugador.setFechanacimiento(f);
			jugadorDao.insert(jugador);
		} catch (Exception e) {
			System.out.println("Error al guardar jugador");
			System.out.println(e);
		}
		response.sendRedirect(request.getContextPath()+"/index.jsp");
		//request.getRequestDispatcher("/index.jsp").forward(request, response);
		//doGet(request, response);
	}

}
