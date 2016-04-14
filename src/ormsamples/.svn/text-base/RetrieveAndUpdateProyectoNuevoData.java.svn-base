/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoNuevoData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = bbdd.ProyectoNuevoPersistentManager.instance().getSession().beginTransaction();
		try {
			bbdd.Usuario_no_Identificado lbbddUsuario_no_Identificado = bbdd.Usuario_no_IdentificadoDAO.loadUsuario_no_IdentificadoByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.Usuario_no_IdentificadoDAO.save(lbbddUsuario_no_Identificado);
			bbdd.Usuario lbbddUsuario = bbdd.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.UsuarioDAO.save(lbbddUsuario);
			bbdd.Usuario_Registrado lbbddUsuario_Registrado = bbdd.Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.Usuario_RegistradoDAO.save(lbbddUsuario_Registrado);
			bbdd.Juego lbbddJuego = bbdd.JuegoDAO.loadJuegoByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.JuegoDAO.save(lbbddJuego);
			bbdd.Sugerencia lbbddSugerencia = bbdd.SugerenciaDAO.loadSugerenciaByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.SugerenciaDAO.save(lbbddSugerencia);
			bbdd.Administrador_ lbbddAdministrador_ = bbdd.Administrador_DAO.loadAdministrador_ByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.Administrador_DAO.save(lbbddAdministrador_);
			bbdd.Gestor_de_Juegos__ lbbddGestor_de_Juegos__ = bbdd.Gestor_de_Juegos__DAO.loadGestor_de_Juegos__ByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.Gestor_de_Juegos__DAO.save(lbbddGestor_de_Juegos__);
			bbdd.Gestor_de_Usuarios__ lbbddGestor_de_Usuarios__ = bbdd.Gestor_de_Usuarios__DAO.loadGestor_de_Usuarios__ByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.Gestor_de_Usuarios__DAO.save(lbbddGestor_de_Usuarios__);
			bbdd.Movimiento lbbddMovimiento = bbdd.MovimientoDAO.loadMovimientoByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.MovimientoDAO.save(lbbddMovimiento);
			bbdd.Juego_Publico lbbddJuego_Publico = bbdd.Juego_PublicoDAO.loadJuego_PublicoByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.Juego_PublicoDAO.save(lbbddJuego_Publico);
			bbdd.Partida_Publica lbbddPartida_Publica = bbdd.Partida_PublicaDAO.loadPartida_PublicaByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.Partida_PublicaDAO.save(lbbddPartida_Publica);
			bbdd.Partida_registrado lbbddPartida_registrado = bbdd.Partida_registradoDAO.loadPartida_registradoByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.Partida_registradoDAO.save(lbbddPartida_registrado);
			bbdd.Configuracion lbbddConfiguracion = bbdd.ConfiguracionDAO.loadConfiguracionByQuery(null, null);
			// Update the properties of the persistent object
			bbdd.ConfiguracionDAO.save(lbbddConfiguracion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Usuario_no_Identificado by Usuario_no_IdentificadoCriteria");
		bbdd.Usuario_no_IdentificadoCriteria lbbddUsuario_no_IdentificadoCriteria = new bbdd.Usuario_no_IdentificadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddUsuario_no_IdentificadoCriteria.ip.eq();
		System.out.println(lbbddUsuario_no_IdentificadoCriteria.uniqueUsuario_no_Identificado());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		bbdd.UsuarioCriteria lbbddUsuarioCriteria = new bbdd.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddUsuarioCriteria.dni.eq();
		System.out.println(lbbddUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Usuario_Registrado by Usuario_RegistradoCriteria");
		bbdd.Usuario_RegistradoCriteria lbbddUsuario_RegistradoCriteria = new bbdd.Usuario_RegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddUsuario_RegistradoCriteria.dni.eq();
		System.out.println(lbbddUsuario_RegistradoCriteria.uniqueUsuario_Registrado());
		
		System.out.println("Retrieving Juego by JuegoCriteria");
		bbdd.JuegoCriteria lbbddJuegoCriteria = new bbdd.JuegoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddJuegoCriteria.id_juego.eq();
		System.out.println(lbbddJuegoCriteria.uniqueJuego());
		
		System.out.println("Retrieving Sugerencia by SugerenciaCriteria");
		bbdd.SugerenciaCriteria lbbddSugerenciaCriteria = new bbdd.SugerenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddSugerenciaCriteria.id_Sugerencia.eq();
		//lbbddSugerenciaCriteria.es_atendida_por.eq();
		System.out.println(lbbddSugerenciaCriteria.uniqueSugerencia());
		
		System.out.println("Retrieving Administrador_ by Administrador_Criteria");
		bbdd.Administrador_Criteria lbbddAdministrador_Criteria = new bbdd.Administrador_Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddAdministrador_Criteria.dni.eq();
		System.out.println(lbbddAdministrador_Criteria.uniqueAdministrador_());
		
		System.out.println("Retrieving Gestor_de_Juegos__ by Gestor_de_Juegos__Criteria");
		bbdd.Gestor_de_Juegos__Criteria lbbddGestor_de_Juegos__Criteria = new bbdd.Gestor_de_Juegos__Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddGestor_de_Juegos__Criteria.dni.eq();
		System.out.println(lbbddGestor_de_Juegos__Criteria.uniqueGestor_de_Juegos__());
		
		System.out.println("Retrieving Gestor_de_Usuarios__ by Gestor_de_Usuarios__Criteria");
		bbdd.Gestor_de_Usuarios__Criteria lbbddGestor_de_Usuarios__Criteria = new bbdd.Gestor_de_Usuarios__Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddGestor_de_Usuarios__Criteria.dni.eq();
		System.out.println(lbbddGestor_de_Usuarios__Criteria.uniqueGestor_de_Usuarios__());
		
		System.out.println("Retrieving Movimiento by MovimientoCriteria");
		bbdd.MovimientoCriteria lbbddMovimientoCriteria = new bbdd.MovimientoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddMovimientoCriteria.id_Movimiento.eq();
		System.out.println(lbbddMovimientoCriteria.uniqueMovimiento());
		
		System.out.println("Retrieving Juego_Publico by Juego_PublicoCriteria");
		bbdd.Juego_PublicoCriteria lbbddJuego_PublicoCriteria = new bbdd.Juego_PublicoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddJuego_PublicoCriteria.id_juego.eq();
		System.out.println(lbbddJuego_PublicoCriteria.uniqueJuego_Publico());
		
		System.out.println("Retrieving Partida_Publica by Partida_PublicaCriteria");
		bbdd.Partida_PublicaCriteria lbbddPartida_PublicaCriteria = new bbdd.Partida_PublicaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddPartida_PublicaCriteria.ID.eq();
		System.out.println(lbbddPartida_PublicaCriteria.uniquePartida_Publica());
		
		System.out.println("Retrieving Partida_registrado by Partida_registradoCriteria");
		bbdd.Partida_registradoCriteria lbbddPartida_registradoCriteria = new bbdd.Partida_registradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddPartida_registradoCriteria.ID.eq();
		System.out.println(lbbddPartida_registradoCriteria.uniquePartida_registrado());
		
		System.out.println("Retrieving Configuracion by ConfiguracionCriteria");
		bbdd.ConfiguracionCriteria lbbddConfiguracionCriteria = new bbdd.ConfiguracionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbbddConfiguracionCriteria.ID.eq();
		System.out.println(lbbddConfiguracionCriteria.uniqueConfiguracion());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoNuevoData retrieveAndUpdateProyectoNuevoData = new RetrieveAndUpdateProyectoNuevoData();
			try {
				retrieveAndUpdateProyectoNuevoData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectoNuevoData.retrieveByCriteria();
			}
			finally {
				bbdd.ProyectoNuevoPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
