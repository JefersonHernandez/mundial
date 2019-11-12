package com.mundial.model;
import com.mundial.entities.Jugador;
import com.mundial.util.Conexion;
import com.mundial.util.GenericDao;

public class JugadorDao extends Conexion<Jugador> implements GenericDao<Jugador>{

	public JugadorDao() {
		super(Jugador.class);
		// TODO Auto-generated constructor stub
	}
	
	

}
