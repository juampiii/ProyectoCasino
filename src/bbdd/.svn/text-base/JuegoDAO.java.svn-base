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

public class JuegoDAO {
	public static Juego loadJuegoByORMID(String id_juego) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadJuegoByORMID(session, id_juego);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego getJuegoByORMID(String id_juego) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getJuegoByORMID(session, id_juego);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego loadJuegoByORMID(String id_juego, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadJuegoByORMID(session, id_juego, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego getJuegoByORMID(String id_juego, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getJuegoByORMID(session, id_juego, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego loadJuegoByORMID(PersistentSession session, String id_juego) throws PersistentException {
		try {
			return (Juego) session.load(bbdd.Juego.class, id_juego);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego getJuegoByORMID(PersistentSession session, String id_juego) throws PersistentException {
		try {
			return (Juego) session.get(bbdd.Juego.class, id_juego);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego loadJuegoByORMID(PersistentSession session, String id_juego, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Juego) session.load(bbdd.Juego.class, id_juego, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego getJuegoByORMID(PersistentSession session, String id_juego, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Juego) session.get(bbdd.Juego.class, id_juego, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJuego(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return queryJuego(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJuego(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return queryJuego(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego[] listJuegoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listJuegoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego[] listJuegoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listJuegoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJuego(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Juego as Juego");
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
	
	public static List queryJuego(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Juego as Juego");
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
	
	public static Juego[] listJuegoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryJuego(session, condition, orderBy);
			return (Juego[]) list.toArray(new Juego[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego[] listJuegoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryJuego(session, condition, orderBy, lockMode);
			return (Juego[]) list.toArray(new Juego[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego loadJuegoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadJuegoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego loadJuegoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadJuegoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego loadJuegoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Juego[] juegos = listJuegoByQuery(session, condition, orderBy);
		if (juegos != null && juegos.length > 0)
			return juegos[0];
		else
			return null;
	}
	
	public static Juego loadJuegoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Juego[] juegos = listJuegoByQuery(session, condition, orderBy, lockMode);
		if (juegos != null && juegos.length > 0)
			return juegos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateJuegoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iterateJuegoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJuegoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iterateJuegoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJuegoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Juego as Juego");
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
	
	public static java.util.Iterator iterateJuegoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Juego as Juego");
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
	
	public static Juego createJuego() {
		return new bbdd.Juego();
	}
	
	public static boolean save(bbdd.Juego juego) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().saveObject(juego);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bbdd.Juego juego) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().deleteObject(juego);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Juego juego)throws PersistentException {
		try {
			bbdd.Usuario_Registrado[] lEs_favorito_des = juego.es_favorito_de.toArray();
			for(int i = 0; i < lEs_favorito_des.length; i++) {
				lEs_favorito_des[i].tiene_favoritos.remove(juego);
			}
			bbdd.Partida_registrado[] lPartida_registradoss = juego.partida_registrados.toArray();
			for(int i = 0; i < lPartida_registradoss.length; i++) {
				lPartida_registradoss[i].setJuego(null);
			}
			return delete(juego);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Juego juego, org.orm.PersistentSession session)throws PersistentException {
		try {
			bbdd.Usuario_Registrado[] lEs_favorito_des = juego.es_favorito_de.toArray();
			for(int i = 0; i < lEs_favorito_des.length; i++) {
				lEs_favorito_des[i].tiene_favoritos.remove(juego);
			}
			bbdd.Partida_registrado[] lPartida_registradoss = juego.partida_registrados.toArray();
			for(int i = 0; i < lPartida_registradoss.length; i++) {
				lPartida_registradoss[i].setJuego(null);
			}
			try {
				session.delete(juego);
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
	
	public static boolean refresh(bbdd.Juego juego) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().refresh(juego);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bbdd.Juego juego) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().evict(juego);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego loadJuegoByCriteria(JuegoCriteria juegoCriteria) {
		Juego[] juegos = listJuegoByCriteria(juegoCriteria);
		if(juegos == null || juegos.length == 0) {
			return null;
		}
		return juegos[0];
	}
	
	public static Juego[] listJuegoByCriteria(JuegoCriteria juegoCriteria) {
		return juegoCriteria.listJuego();
	}
}
