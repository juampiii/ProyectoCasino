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

public class Partida_registradoDAO {
	public static Partida_registrado loadPartida_registradoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadPartida_registradoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_registrado getPartida_registradoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getPartida_registradoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_registrado loadPartida_registradoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadPartida_registradoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_registrado getPartida_registradoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getPartida_registradoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_registrado loadPartida_registradoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Partida_registrado) session.load(bbdd.Partida_registrado.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_registrado getPartida_registradoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Partida_registrado) session.get(bbdd.Partida_registrado.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_registrado loadPartida_registradoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Partida_registrado) session.load(bbdd.Partida_registrado.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_registrado getPartida_registradoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Partida_registrado) session.get(bbdd.Partida_registrado.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPartida_registrado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return queryPartida_registrado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPartida_registrado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return queryPartida_registrado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_registrado[] listPartida_registradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listPartida_registradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_registrado[] listPartida_registradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listPartida_registradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPartida_registrado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Partida_registrado as Partida_registrado");
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
	
	public static List queryPartida_registrado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Partida_registrado as Partida_registrado");
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
	
	public static Partida_registrado[] listPartida_registradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPartida_registrado(session, condition, orderBy);
			return (Partida_registrado[]) list.toArray(new Partida_registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_registrado[] listPartida_registradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPartida_registrado(session, condition, orderBy, lockMode);
			return (Partida_registrado[]) list.toArray(new Partida_registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_registrado loadPartida_registradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadPartida_registradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_registrado loadPartida_registradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadPartida_registradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_registrado loadPartida_registradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Partida_registrado[] partida_registrados = listPartida_registradoByQuery(session, condition, orderBy);
		if (partida_registrados != null && partida_registrados.length > 0)
			return partida_registrados[0];
		else
			return null;
	}
	
	public static Partida_registrado loadPartida_registradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Partida_registrado[] partida_registrados = listPartida_registradoByQuery(session, condition, orderBy, lockMode);
		if (partida_registrados != null && partida_registrados.length > 0)
			return partida_registrados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePartida_registradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iteratePartida_registradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePartida_registradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iteratePartida_registradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePartida_registradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Partida_registrado as Partida_registrado");
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
	
	public static java.util.Iterator iteratePartida_registradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Partida_registrado as Partida_registrado");
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
	
	public static Partida_registrado createPartida_registrado() {
		return new bbdd.Partida_registrado();
	}
	
	public static boolean save(bbdd.Partida_registrado partida_registrado) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().saveObject(partida_registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bbdd.Partida_registrado partida_registrado) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().deleteObject(partida_registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Partida_registrado partida_registrado)throws PersistentException {
		try {
			if(partida_registrado.getUsuario_Registrado() != null) {
				partida_registrado.getUsuario_Registrado().partida_registrados.remove(partida_registrado);
			}
			
			if(partida_registrado.getJuego() != null) {
				partida_registrado.getJuego().partida_registrados.remove(partida_registrado);
			}
			
			return delete(partida_registrado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Partida_registrado partida_registrado, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(partida_registrado.getUsuario_Registrado() != null) {
				partida_registrado.getUsuario_Registrado().partida_registrados.remove(partida_registrado);
			}
			
			if(partida_registrado.getJuego() != null) {
				partida_registrado.getJuego().partida_registrados.remove(partida_registrado);
			}
			
			try {
				session.delete(partida_registrado);
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
	
	public static boolean refresh(bbdd.Partida_registrado partida_registrado) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().refresh(partida_registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bbdd.Partida_registrado partida_registrado) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().evict(partida_registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_registrado loadPartida_registradoByCriteria(Partida_registradoCriteria partida_registradoCriteria) {
		Partida_registrado[] partida_registrados = listPartida_registradoByCriteria(partida_registradoCriteria);
		if(partida_registrados == null || partida_registrados.length == 0) {
			return null;
		}
		return partida_registrados[0];
	}
	
	public static Partida_registrado[] listPartida_registradoByCriteria(Partida_registradoCriteria partida_registradoCriteria) {
		return partida_registradoCriteria.listPartida_registrado();
	}
}
