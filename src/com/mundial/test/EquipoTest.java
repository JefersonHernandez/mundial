package com.mundial.test;

import java.util.Date;

import com.mundial.entities.Equipo;
import com.mundial.entities.Jugador;
import com.mundial.entities.JugadorPK;
import com.mundial.model.EquipoDao;
import com.mundial.model.JugadorDao;

public class EquipoTest {
	
	public static void main(String argumentos[]) {
		
		Equipo e = new Equipo();
		e.setNombre("Barcelona");
		e.setPresidente("Luka");
		
		Equipo b = new Equipo();
		b.setNombre("Cucuta");
		b.setPresidente("Joie");
		
		Equipo c = new Equipo();
		c.setNombre("Real Madrid");
		c.setPresidente("Bencema");
		
		EquipoDao eq = new EquipoDao();
		eq.insert(e);
		eq.insert(b);
		eq.insert(c);		
	}
}
