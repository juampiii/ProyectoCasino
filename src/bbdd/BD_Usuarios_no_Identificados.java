/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package bbdd;

import java.util.ArrayList;

import org.orm.PersistentException;

/**
 * ORM-Component Class
 */
public class BD_Usuarios_no_Identificados {
	public BD_Usuarios_no_Identificados() {
	}
	
	private bbdd.BD_Principal administrado_por;
	
	public bbdd.BD_Principal getAdministrado_por()  {
		return this.administrado_por;
	}
	
	public void setAdministrado_por(bbdd.BD_Principal value)  {
		this.administrado_por = value;
	}

	
	
	public void registrarFinPartida(String aIp, String juego, double horaInicio, double horaFin) {
		//TODO: Implement Method
		try {
			Partida_Publica partida = new Partida_Publica();
			partida.setHora_inicio(horaInicio);
			partida.setHora_fin(horaFin);
			partida.setFecha(new java.util.Date());
			Usuario_no_Identificado usuario = Usuario_no_IdentificadoDAO.getUsuario_no_IdentificadoByORMID(aIp);
			Juego_Publico juegoPub = Juego_PublicoDAO.getJuego_PublicoByORMID(juego);
			partida.setJuego_Publico(juegoPub);
			partida.setUsuario_no_Identificado(usuario);
			Usuario_no_IdentificadoDAO.save(usuario);

			usuario.partida_Publicas.add(partida);

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void inicializar(String ip) {
		try {
			Usuario_no_Identificado user = Usuario_no_IdentificadoDAO.createUsuario_no_Identificado();
			user.setIp(ip);
			user.setTiempo(20.0);
			Usuario_no_IdentificadoDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean comprobar(String ip) {
		//TODO: Implement Method
		try {
			return Usuario_no_IdentificadoDAO.getUsuario_no_IdentificadoByORMID(ip).getTiempo()>0;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
	
	public double comprobarTiempo(String ip) {
		try {
			return Usuario_no_IdentificadoDAO.getUsuario_no_IdentificadoByORMID(ip).getTiempo();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0.0;
	}
	
	public Usuario_no_Identificado[] ListarNoIdentificado() {
		/**
		 * No tengo ni idea de lo que buscas que devuelva esta función....
		 * */
		try {
			Usuario_no_IdentificadoCriteria criterio = new Usuario_no_IdentificadoCriteria ();
			return criterio.listUsuario_no_Identificado();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Usuario_no_Identificado ConsultarNoIdentificado(String IP) {
		/**
		 * No tengo ni idea de lo que buscas que devuelva esta función....
		 * */
		try {
			return Usuario_no_IdentificadoDAO.getUsuario_no_IdentificadoByORMID(IP);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Usuario_no_Identificado consultarNoIdentificado(String IP) {
		/**
		 * No tengo ni idea de lo que buscas que devuelva esta función....
		 * */
		try {
			return Usuario_no_IdentificadoDAO.getUsuario_no_IdentificadoByORMID(IP);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
}
