/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoNuevoData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = bbdd.ProyectoNuevoPersistentManager.instance().getSession().beginTransaction();
		try {
			bbdd.Usuario_no_Identificado lbbddUsuario_no_Identificado = bbdd.Usuario_no_IdentificadoDAO.createUsuario_no_Identificado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : partida_Publicas, tiempo, ip
			bbdd.Usuario_no_IdentificadoDAO.save(lbbddUsuario_no_Identificado);
			bbdd.Usuario lbbddUsuario = bbdd.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : dni
			bbdd.UsuarioDAO.save(lbbddUsuario);
			bbdd.Usuario_Registrado lbbddUsuario_Registrado = bbdd.Usuario_RegistradoDAO.createUsuario_Registrado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tiene_favoritos, realiza_movimiento, escribe_sugerencia, partida_registrados, desactivado, inactivo
			bbdd.Usuario_RegistradoDAO.save(lbbddUsuario_Registrado);
			bbdd.Juego lbbddJuego = bbdd.JuegoDAO.createJuego();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : partida_registrados, es_favorito_de, numero_minimo_usuarios, desactivado, id_juego
			bbdd.JuegoDAO.save(lbbddJuego);
			bbdd.Sugerencia lbbddSugerencia = bbdd.SugerenciaDAO.createSugerencia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_escrita_por, id_Sugerencia
			bbdd.SugerenciaDAO.save(lbbddSugerencia);
			bbdd.Administrador_ lbbddAdministrador_ = bbdd.Administrador_DAO.createAdministrador_();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : atiende_sugerencia
			bbdd.Administrador_DAO.save(lbbddAdministrador_);
			bbdd.Gestor_de_Juegos__ lbbddGestor_de_Juegos__ = bbdd.Gestor_de_Juegos__DAO.createGestor_de_Juegos__();
			// Initialize the properties of the persistent object here
			bbdd.Gestor_de_Juegos__DAO.save(lbbddGestor_de_Juegos__);
			bbdd.Gestor_de_Usuarios__ lbbddGestor_de_Usuarios__ = bbdd.Gestor_de_Usuarios__DAO.createGestor_de_Usuarios__();
			// Initialize the properties of the persistent object here
			bbdd.Gestor_de_Usuarios__DAO.save(lbbddGestor_de_Usuarios__);
			bbdd.Movimiento lbbddMovimiento = bbdd.MovimientoDAO.createMovimiento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cantidad, es_realizado, id_Movimiento
			bbdd.MovimientoDAO.save(lbbddMovimiento);
			bbdd.Juego_Publico lbbddJuego_Publico = bbdd.Juego_PublicoDAO.createJuego_Publico();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : partida_Publicas
			bbdd.Juego_PublicoDAO.save(lbbddJuego_Publico);
			bbdd.Partida_Publica lbbddPartida_Publica = bbdd.Partida_PublicaDAO.createPartida_Publica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario_no_Identificado, juego_Publico, hora_fin, hora_inicio
			bbdd.Partida_PublicaDAO.save(lbbddPartida_Publica);
			bbdd.Partida_registrado lbbddPartida_registrado = bbdd.Partida_registradoDAO.createPartida_registrado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : juego, usuario_Registrado, hora_fin, cantidad, hora_inicio
			bbdd.Partida_registradoDAO.save(lbbddPartida_registrado);
			bbdd.Configuracion lbbddConfiguracion = bbdd.ConfiguracionDAO.createConfiguracion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : numero_maximo_partidas
			bbdd.ConfiguracionDAO.save(lbbddConfiguracion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectoNuevoData createProyectoNuevoData = new CreateProyectoNuevoData();
			try {
				createProyectoNuevoData.createTestData();
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
