/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectoNuevoData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = bbdd.ProyectoNuevoPersistentManager.instance().getSession().beginTransaction();
		try {
			bbdd.Usuario_no_Identificado lbbddUsuario_no_Identificado = bbdd.Usuario_no_IdentificadoDAO.loadUsuario_no_IdentificadoByQuery(null, null);
			// Delete the persistent object
			bbdd.Usuario_no_IdentificadoDAO.delete(lbbddUsuario_no_Identificado);
			bbdd.Usuario lbbddUsuario = bbdd.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			bbdd.UsuarioDAO.delete(lbbddUsuario);
			bbdd.Usuario_Registrado lbbddUsuario_Registrado = bbdd.Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery(null, null);
			// Delete the persistent object
			bbdd.Usuario_RegistradoDAO.delete(lbbddUsuario_Registrado);
			bbdd.Juego lbbddJuego = bbdd.JuegoDAO.loadJuegoByQuery(null, null);
			// Delete the persistent object
			bbdd.JuegoDAO.delete(lbbddJuego);
			bbdd.Sugerencia lbbddSugerencia = bbdd.SugerenciaDAO.loadSugerenciaByQuery(null, null);
			// Delete the persistent object
			bbdd.SugerenciaDAO.delete(lbbddSugerencia);
			bbdd.Administrador_ lbbddAdministrador_ = bbdd.Administrador_DAO.loadAdministrador_ByQuery(null, null);
			// Delete the persistent object
			bbdd.Administrador_DAO.delete(lbbddAdministrador_);
			bbdd.Gestor_de_Juegos__ lbbddGestor_de_Juegos__ = bbdd.Gestor_de_Juegos__DAO.loadGestor_de_Juegos__ByQuery(null, null);
			// Delete the persistent object
			bbdd.Gestor_de_Juegos__DAO.delete(lbbddGestor_de_Juegos__);
			bbdd.Gestor_de_Usuarios__ lbbddGestor_de_Usuarios__ = bbdd.Gestor_de_Usuarios__DAO.loadGestor_de_Usuarios__ByQuery(null, null);
			// Delete the persistent object
			bbdd.Gestor_de_Usuarios__DAO.delete(lbbddGestor_de_Usuarios__);
			bbdd.Movimiento lbbddMovimiento = bbdd.MovimientoDAO.loadMovimientoByQuery(null, null);
			// Delete the persistent object
			bbdd.MovimientoDAO.delete(lbbddMovimiento);
			bbdd.Juego_Publico lbbddJuego_Publico = bbdd.Juego_PublicoDAO.loadJuego_PublicoByQuery(null, null);
			// Delete the persistent object
			bbdd.Juego_PublicoDAO.delete(lbbddJuego_Publico);
			bbdd.Partida_Publica lbbddPartida_Publica = bbdd.Partida_PublicaDAO.loadPartida_PublicaByQuery(null, null);
			// Delete the persistent object
			bbdd.Partida_PublicaDAO.delete(lbbddPartida_Publica);
			bbdd.Partida_registrado lbbddPartida_registrado = bbdd.Partida_registradoDAO.loadPartida_registradoByQuery(null, null);
			// Delete the persistent object
			bbdd.Partida_registradoDAO.delete(lbbddPartida_registrado);
			bbdd.Configuracion lbbddConfiguracion = bbdd.ConfiguracionDAO.loadConfiguracionByQuery(null, null);
			// Delete the persistent object
			bbdd.ConfiguracionDAO.delete(lbbddConfiguracion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectoNuevoData deleteProyectoNuevoData = new DeleteProyectoNuevoData();
			try {
				deleteProyectoNuevoData.deleteTestData();
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
