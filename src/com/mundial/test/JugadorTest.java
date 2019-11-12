package com.mundial.test;

import java.util.Date;
import java.util.List;

import com.mundial.entities.Equipo;
import com.mundial.entities.Jugador;
import com.mundial.entities.JugadorPK;
import com.mundial.model.EquipoDao;
import com.mundial.model.JugadorDao;

public class JugadorTest {

	public static void main(String argumentos[]) {

		EquipoDao eq = new EquipoDao();
		/*
		 * List<Equipo> lista = eq.list(); for (int i = 0; i < lista.size(); i++) {
		 * System.out.println(lista.get(i).getNombre()); }
		 */

		Jugador j = new Jugador();
		j.setEmail("fake@mail");
		j.setFechanacimiento(new Date());
		j.setNombre("Cristaaiano");
		j.setPosicion("Delantero");
		j.setEquipoBean(eq.find(1));
		JugadorPK jp = new JugadorPK();
		jp.setEquipo(j.getEquipoBean().getId());

		 jp.setNumero(3);
		j.setId(jp);
		JugadorDao jDao = new JugadorDao();
		jDao.insert(j);

		/*
		 * Jugador jj = new Jugador(); jj.setEmail("fake@mail");
		 * jj.setFechanacimiento(new Date()); jj.setNombre("Cristaaiano");
		 * jj.setPosicion("Delantero"); jj.setEquipoBean(eq.find(1)); JugadorPK jpj =
		 * new JugadorPK(); jpj.setEquipo(1); jpj.setNumero(1); jj.setId(jpj);
		 * JugadorDao jjDao = new JugadorDao(); jDao.insert(jj);
		 */
	}

}
