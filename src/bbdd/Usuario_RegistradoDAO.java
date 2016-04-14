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

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class Usuario_RegistradoDAO {
	public static Usuario_Registrado loadUsuario_RegistradoByORMID(String dni) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadUsuario_RegistradoByORMID(session, dni);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado getUsuario_RegistradoByORMID(String dni) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getUsuario_RegistradoByORMID(session, dni);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByORMID(String dni, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadUsuario_RegistradoByORMID(session, dni, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado getUsuario_RegistradoByORMID(String dni, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getUsuario_RegistradoByORMID(session, dni, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByORMID(PersistentSession session, String dni) throws PersistentException {
		try {
			return (Usuario_Registrado) session.load(bbdd.Usuario_Registrado.class, dni);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado getUsuario_RegistradoByORMID(PersistentSession session, String dni) throws PersistentException {
		try {
			return (Usuario_Registrado) session.get(bbdd.Usuario_Registrado.class, dni);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByORMID(PersistentSession session, String dni, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_Registrado) session.load(bbdd.Usuario_Registrado.class, dni, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado getUsuario_RegistradoByORMID(PersistentSession session, String dni, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_Registrado) session.get(bbdd.Usuario_Registrado.class, dni, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Registrado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return queryUsuario_Registrado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Registrado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return queryUsuario_Registrado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado[] listUsuario_RegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listUsuario_RegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado[] listUsuario_RegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listUsuario_RegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Registrado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Usuario_Registrado as Usuario_Registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Registrado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Usuario_Registrado as Usuario_Registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado[] listUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_Registrado(session, condition, orderBy);
			return (Usuario_Registrado[]) list.toArray(new Usuario_Registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado[] listUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_Registrado(session, condition, orderBy, lockMode);
			return (Usuario_Registrado[]) list.toArray(new Usuario_Registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadUsuario_RegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadUsuario_RegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_Registrado[] usuario_Registrados = listUsuario_RegistradoByQuery(session, condition, orderBy);
		if (usuario_Registrados != null && usuario_Registrados.length > 0)
			return usuario_Registrados[0];
		else
			return null;
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_Registrado[] usuario_Registrados = listUsuario_RegistradoByQuery(session, condition, orderBy, lockMode);
		if (usuario_Registrados != null && usuario_Registrados.length > 0)
			return usuario_Registrados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_RegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iterateUsuario_RegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_RegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iterateUsuario_RegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Usuario_Registrado as Usuario_Registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_RegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Usuario_Registrado as Usuario_Registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado createUsuario_Registrado() {
		return new bbdd.Usuario_Registrado();
	}
	
	public static boolean save(bbdd.Usuario_Registrado usuario_Registrado) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().saveObject(usuario_Registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bbdd.Usuario_Registrado usuario_Registrado) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().deleteObject(usuario_Registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Usuario_Registrado usuario_Registrado)throws PersistentException {
		try {
			bbdd.Partida_registrado[] lPartida_registradoss = usuario_Registrado.partida_registrados.toArray();
			for(int i = 0; i < lPartida_registradoss.length; i++) {
				lPartida_registradoss[i].setUsuario_Registrado(null);
			}
			bbdd.Sugerencia[] lEscribe_sugerencias = usuario_Registrado.escribe_sugerencia.toArray();
			for(int i = 0; i < lEscribe_sugerencias.length; i++) {
				lEscribe_sugerencias[i].setEs_escrita_por(null);
			}
			bbdd.Movimiento[] lRealiza_movimientos = usuario_Registrado.realiza_movimiento.toArray();
			for(int i = 0; i < lRealiza_movimientos.length; i++) {
				lRealiza_movimientos[i].setEs_realizado(null);
			}
			bbdd.Juego[] lTiene_favoritoss = usuario_Registrado.tiene_favoritos.toArray();
			for(int i = 0; i < lTiene_favoritoss.length; i++) {
				lTiene_favoritoss[i].es_favorito_de.remove(usuario_Registrado);
			}
			return delete(usuario_Registrado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Usuario_Registrado usuario_Registrado, org.orm.PersistentSession session)throws PersistentException {
		try {
			bbdd.Partida_registrado[] lPartida_registradoss = usuario_Registrado.partida_registrados.toArray();
			for(int i = 0; i < lPartida_registradoss.length; i++) {
				lPartida_registradoss[i].setUsuario_Registrado(null);
			}
			bbdd.Sugerencia[] lEscribe_sugerencias = usuario_Registrado.escribe_sugerencia.toArray();
			for(int i = 0; i < lEscribe_sugerencias.length; i++) {
				lEscribe_sugerencias[i].setEs_escrita_por(null);
			}
			bbdd.Movimiento[] lRealiza_movimientos = usuario_Registrado.realiza_movimiento.toArray();
			for(int i = 0; i < lRealiza_movimientos.length; i++) {
				lRealiza_movimientos[i].setEs_realizado(null);
			}
			bbdd.Juego[] lTiene_favoritoss = usuario_Registrado.tiene_favoritos.toArray();
			for(int i = 0; i < lTiene_favoritoss.length; i++) {
				lTiene_favoritoss[i].es_favorito_de.remove(usuario_Registrado);
			}
			try {
				session.delete(usuario_Registrado);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(bbdd.Usuario_Registrado usuario_Registrado) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().refresh(usuario_Registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bbdd.Usuario_Registrado usuario_Registrado) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().evict(usuario_Registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado loadUsuario_RegistradoByCriteria(Usuario_RegistradoCriteria usuario_RegistradoCriteria) {
		Usuario_Registrado[] usuario_Registrados = listUsuario_RegistradoByCriteria(usuario_RegistradoCriteria);
		if(usuario_Registrados == null || usuario_Registrados.length == 0) {
			return null;
		}
		return usuario_Registrados[0];
	}
	
	public static Usuario_Registrado[] listUsuario_RegistradoByCriteria(Usuario_RegistradoCriteria usuario_RegistradoCriteria) {
		return usuario_RegistradoCriteria.listUsuario_Registrado();
	}
}
