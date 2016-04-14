/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListProyectoNuevoData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuario_no_Identificado...");
		bbdd.Usuario_no_Identificado[] bbddUsuario_no_Identificados = bbdd.Usuario_no_IdentificadoDAO.listUsuario_no_IdentificadoByQuery(null, null);
		int length = Math.min(bbddUsuario_no_Identificados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddUsuario_no_Identificados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		bbdd.Usuario[] bbddUsuarios = bbdd.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(bbddUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_Registrado...");
		bbdd.Usuario_Registrado[] bbddUsuario_Registrados = bbdd.Usuario_RegistradoDAO.listUsuario_RegistradoByQuery(null, null);
		length = Math.min(bbddUsuario_Registrados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddUsuario_Registrados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Juego...");
		bbdd.Juego[] bbddJuegos = bbdd.JuegoDAO.listJuegoByQuery(null, null);
		length = Math.min(bbddJuegos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddJuegos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Sugerencia...");
		bbdd.Sugerencia[] bbddSugerencias = bbdd.SugerenciaDAO.listSugerenciaByQuery(null, null);
		length = Math.min(bbddSugerencias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddSugerencias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador_...");
		bbdd.Administrador_[] bbddAdministrador_s = bbdd.Administrador_DAO.listAdministrador_ByQuery(null, null);
		length = Math.min(bbddAdministrador_s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddAdministrador_s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Gestor_de_Juegos__...");
		bbdd.Gestor_de_Juegos__[] bbddGestor_de_Juegos__s = bbdd.Gestor_de_Juegos__DAO.listGestor_de_Juegos__ByQuery(null, null);
		length = Math.min(bbddGestor_de_Juegos__s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddGestor_de_Juegos__s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Gestor_de_Usuarios__...");
		bbdd.Gestor_de_Usuarios__[] bbddGestor_de_Usuarios__s = bbdd.Gestor_de_Usuarios__DAO.listGestor_de_Usuarios__ByQuery(null, null);
		length = Math.min(bbddGestor_de_Usuarios__s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddGestor_de_Usuarios__s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Movimiento...");
		bbdd.Movimiento[] bbddMovimientos = bbdd.MovimientoDAO.listMovimientoByQuery(null, null);
		length = Math.min(bbddMovimientos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddMovimientos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Juego_Publico...");
		bbdd.Juego_Publico[] bbddJuego_Publicos = bbdd.Juego_PublicoDAO.listJuego_PublicoByQuery(null, null);
		length = Math.min(bbddJuego_Publicos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddJuego_Publicos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Partida_Publica...");
		bbdd.Partida_Publica[] bbddPartida_Publicas = bbdd.Partida_PublicaDAO.listPartida_PublicaByQuery(null, null);
		length = Math.min(bbddPartida_Publicas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddPartida_Publicas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Partida_registrado...");
		bbdd.Partida_registrado[] bbddPartida_registrados = bbdd.Partida_registradoDAO.listPartida_registradoByQuery(null, null);
		length = Math.min(bbddPartida_registrados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddPartida_registrados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Configuracion...");
		bbdd.Configuracion[] bbddConfiguracions = bbdd.ConfiguracionDAO.listConfiguracionByQuery(null, null);
		length = Math.min(bbddConfiguracions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bbddConfiguracions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Usuario_no_Identificado by Criteria...");
		bbdd.Usuario_no_IdentificadoCriteria lbbddUsuario_no_IdentificadoCriteria = new bbdd.Usuario_no_IdentificadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddUsuario_no_IdentificadoCriteria.ip.eq();
		lbbddUsuario_no_IdentificadoCriteria.setMaxResults(ROW_COUNT);
		bbdd.Usuario_no_Identificado[] bbddUsuario_no_Identificados = lbbddUsuario_no_IdentificadoCriteria.listUsuario_no_Identificado();
		int length =bbddUsuario_no_Identificados== null ? 0 : Math.min(bbddUsuario_no_Identificados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddUsuario_no_Identificados[i]);
		}
		System.out.println(length + " Usuario_no_Identificado record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		bbdd.UsuarioCriteria lbbddUsuarioCriteria = new bbdd.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddUsuarioCriteria.dni.eq();
		lbbddUsuarioCriteria.setMaxResults(ROW_COUNT);
		bbdd.Usuario[] bbddUsuarios = lbbddUsuarioCriteria.listUsuario();
		length =bbddUsuarios== null ? 0 : Math.min(bbddUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Usuario_Registrado by Criteria...");
		bbdd.Usuario_RegistradoCriteria lbbddUsuario_RegistradoCriteria = new bbdd.Usuario_RegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddUsuario_RegistradoCriteria.dni.eq();
		lbbddUsuario_RegistradoCriteria.setMaxResults(ROW_COUNT);
		bbdd.Usuario_Registrado[] bbddUsuario_Registrados = lbbddUsuario_RegistradoCriteria.listUsuario_Registrado();
		length =bbddUsuario_Registrados== null ? 0 : Math.min(bbddUsuario_Registrados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddUsuario_Registrados[i]);
		}
		System.out.println(length + " Usuario_Registrado record(s) retrieved."); 
		
		System.out.println("Listing Juego by Criteria...");
		bbdd.JuegoCriteria lbbddJuegoCriteria = new bbdd.JuegoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddJuegoCriteria.id_juego.eq();
		lbbddJuegoCriteria.setMaxResults(ROW_COUNT);
		bbdd.Juego[] bbddJuegos = lbbddJuegoCriteria.listJuego();
		length =bbddJuegos== null ? 0 : Math.min(bbddJuegos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddJuegos[i]);
		}
		System.out.println(length + " Juego record(s) retrieved."); 
		
		System.out.println("Listing Sugerencia by Criteria...");
		bbdd.SugerenciaCriteria lbbddSugerenciaCriteria = new bbdd.SugerenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddSugerenciaCriteria.id_Sugerencia.eq();
		//bbdd.Administrador_Criteria lbbddSugerenciaCriteria_Administrador_ = lbbddSugerenciaCriteria.createEs_atendida_porCriteria();
		//lbbddSugerenciaCriteria_Administrador_.dni.eq();
		lbbddSugerenciaCriteria.setMaxResults(ROW_COUNT);
		bbdd.Sugerencia[] bbddSugerencias = lbbddSugerenciaCriteria.listSugerencia();
		length =bbddSugerencias== null ? 0 : Math.min(bbddSugerencias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddSugerencias[i]);
		}
		System.out.println(length + " Sugerencia record(s) retrieved."); 
		
		System.out.println("Listing Administrador_ by Criteria...");
		bbdd.Administrador_Criteria lbbddAdministrador_Criteria = new bbdd.Administrador_Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddAdministrador_Criteria.dni.eq();
		lbbddAdministrador_Criteria.setMaxResults(ROW_COUNT);
		bbdd.Administrador_[] bbddAdministrador_s = lbbddAdministrador_Criteria.listAdministrador_();
		length =bbddAdministrador_s== null ? 0 : Math.min(bbddAdministrador_s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddAdministrador_s[i]);
		}
		System.out.println(length + " Administrador_ record(s) retrieved."); 
		
		System.out.println("Listing Gestor_de_Juegos__ by Criteria...");
		bbdd.Gestor_de_Juegos__Criteria lbbddGestor_de_Juegos__Criteria = new bbdd.Gestor_de_Juegos__Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddGestor_de_Juegos__Criteria.dni.eq();
		lbbddGestor_de_Juegos__Criteria.setMaxResults(ROW_COUNT);
		bbdd.Gestor_de_Juegos__[] bbddGestor_de_Juegos__s = lbbddGestor_de_Juegos__Criteria.listGestor_de_Juegos__();
		length =bbddGestor_de_Juegos__s== null ? 0 : Math.min(bbddGestor_de_Juegos__s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddGestor_de_Juegos__s[i]);
		}
		System.out.println(length + " Gestor_de_Juegos__ record(s) retrieved."); 
		
		System.out.println("Listing Gestor_de_Usuarios__ by Criteria...");
		bbdd.Gestor_de_Usuarios__Criteria lbbddGestor_de_Usuarios__Criteria = new bbdd.Gestor_de_Usuarios__Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddGestor_de_Usuarios__Criteria.dni.eq();
		lbbddGestor_de_Usuarios__Criteria.setMaxResults(ROW_COUNT);
		bbdd.Gestor_de_Usuarios__[] bbddGestor_de_Usuarios__s = lbbddGestor_de_Usuarios__Criteria.listGestor_de_Usuarios__();
		length =bbddGestor_de_Usuarios__s== null ? 0 : Math.min(bbddGestor_de_Usuarios__s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddGestor_de_Usuarios__s[i]);
		}
		System.out.println(length + " Gestor_de_Usuarios__ record(s) retrieved."); 
		
		System.out.println("Listing Movimiento by Criteria...");
		bbdd.MovimientoCriteria lbbddMovimientoCriteria = new bbdd.MovimientoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddMovimientoCriteria.id_Movimiento.eq();
		lbbddMovimientoCriteria.setMaxResults(ROW_COUNT);
		bbdd.Movimiento[] bbddMovimientos = lbbddMovimientoCriteria.listMovimiento();
		length =bbddMovimientos== null ? 0 : Math.min(bbddMovimientos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddMovimientos[i]);
		}
		System.out.println(length + " Movimiento record(s) retrieved."); 
		
		System.out.println("Listing Juego_Publico by Criteria...");
		bbdd.Juego_PublicoCriteria lbbddJuego_PublicoCriteria = new bbdd.Juego_PublicoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddJuego_PublicoCriteria.id_juego.eq();
		lbbddJuego_PublicoCriteria.setMaxResults(ROW_COUNT);
		bbdd.Juego_Publico[] bbddJuego_Publicos = lbbddJuego_PublicoCriteria.listJuego_Publico();
		length =bbddJuego_Publicos== null ? 0 : Math.min(bbddJuego_Publicos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddJuego_Publicos[i]);
		}
		System.out.println(length + " Juego_Publico record(s) retrieved."); 
		
		System.out.println("Listing Partida_Publica by Criteria...");
		bbdd.Partida_PublicaCriteria lbbddPartida_PublicaCriteria = new bbdd.Partida_PublicaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddPartida_PublicaCriteria.ID.eq();
		lbbddPartida_PublicaCriteria.setMaxResults(ROW_COUNT);
		bbdd.Partida_Publica[] bbddPartida_Publicas = lbbddPartida_PublicaCriteria.listPartida_Publica();
		length =bbddPartida_Publicas== null ? 0 : Math.min(bbddPartida_Publicas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddPartida_Publicas[i]);
		}
		System.out.println(length + " Partida_Publica record(s) retrieved."); 
		
		System.out.println("Listing Partida_registrado by Criteria...");
		bbdd.Partida_registradoCriteria lbbddPartida_registradoCriteria = new bbdd.Partida_registradoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddPartida_registradoCriteria.ID.eq();
		lbbddPartida_registradoCriteria.setMaxResults(ROW_COUNT);
		bbdd.Partida_registrado[] bbddPartida_registrados = lbbddPartida_registradoCriteria.listPartida_registrado();
		length =bbddPartida_registrados== null ? 0 : Math.min(bbddPartida_registrados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddPartida_registrados[i]);
		}
		System.out.println(length + " Partida_registrado record(s) retrieved."); 
		
		System.out.println("Listing Configuracion by Criteria...");
		bbdd.ConfiguracionCriteria lbbddConfiguracionCriteria = new bbdd.ConfiguracionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbbddConfiguracionCriteria.ID.eq();
		lbbddConfiguracionCriteria.setMaxResults(ROW_COUNT);
		bbdd.Configuracion[] bbddConfiguracions = lbbddConfiguracionCriteria.listConfiguracion();
		length =bbddConfiguracions== null ? 0 : Math.min(bbddConfiguracions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bbddConfiguracions[i]);
		}
		System.out.println(length + " Configuracion record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectoNuevoData listProyectoNuevoData = new ListProyectoNuevoData();
			try {
				listProyectoNuevoData.listTestData();
				//listProyectoNuevoData.listByCriteria();
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
