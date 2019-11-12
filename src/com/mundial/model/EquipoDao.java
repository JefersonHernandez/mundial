package com.mundial.model;
import com.mundial.entities.Equipo;
import com.mundial.util.Conexion;
import com.mundial.util.GenericDao;;

public class EquipoDao extends Conexion<Equipo> implements GenericDao<Equipo>{

	public EquipoDao() {
		super(Equipo.class);
		// TODO Auto-generated constructor stub
	}
	
	

}
