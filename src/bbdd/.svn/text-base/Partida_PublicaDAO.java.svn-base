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

public class Partida_PublicaDAO {
	public static Partida_Publica loadPartida_PublicaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadPartida_PublicaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_Publica getPartida_PublicaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getPartida_PublicaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_Publica loadPartida_PublicaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadPartida_PublicaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_Publica getPartida_PublicaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getPartida_PublicaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_Publica loadPartida_PublicaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Partida_Publica) session.load(bbdd.Partida_Publica.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_Publica getPartida_PublicaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Partida_Publica) session.get(bbdd.Partida_Publica.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_Publica loadPartida_PublicaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Partida_Publica) session.load(bbdd.Partida_Publica.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_Publica getPartida_PublicaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Partida_Publica) session.get(bbdd.Partida_Publica.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPartida_Publica(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return queryPartida_Publica(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPartida_Publica(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return queryPartida_Publica(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_Publica[] listPartida_PublicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listPartida_PublicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_Publica[] listPartida_PublicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listPartida_PublicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPartida_Publica(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Partida_Publica as Partida_Publica");
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
	
	public static List queryPartida_Publica(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Partida_Publica as Partida_Publica");
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
	
	public static Partida_Publica[] listPartida_PublicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPartida_Publica(session, condition, orderBy);
			return (Partida_Publica[]) list.toArray(new Partida_Publica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_Publica[] listPartida_PublicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPartida_Publica(session, condition, orderBy, lockMode);
			return (Partida_Publica[]) list.toArray(new Partida_Publica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_Publica loadPartida_PublicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadPartida_PublicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_Publica loadPartida_PublicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadPartida_PublicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_Publica loadPartida_PublicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Partida_Publica[] partida_Publicas = listPartida_PublicaByQuery(session, condition, orderBy);
		if (partida_Publicas != null && partida_Publicas.length > 0)
			return partida_Publicas[0];
		else
			return null;
	}
	
	public static Partida_Publica loadPartida_PublicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Partida_Publica[] partida_Publicas = listPartida_PublicaByQuery(session, condition, orderBy, lockMode);
		if (partida_Publicas != null && partida_Publicas.length > 0)
			return partida_Publicas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePartida_PublicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iteratePartida_PublicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePartida_PublicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iteratePartida_PublicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePartida_PublicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Partida_Publica as Partida_Publica");
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
	
	public static java.util.Iterator iteratePartida_PublicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Partida_Publica as Partida_Publica");
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
	
	public static Partida_Publica createPartida_Publica() {
		return new bbdd.Partida_Publica();
	}
	
	public static boolean save(bbdd.Partida_Publica partida_Publica) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().saveObject(partida_Publica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bbdd.Partida_Publica partida_Publica) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().deleteObject(partida_Publica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Partida_Publica partida_Publica)throws PersistentException {
		try {
			if(partida_Publica.getJuego_Publico() != null) {
				partida_Publica.getJuego_Publico().partida_Publicas.remove(partida_Publica);
			}
			
			if(partida_Publica.getUsuario_no_Identificado() != null) {
				partida_Publica.getUsuario_no_Identificado().partida_Publicas.remove(partida_Publica);
			}
			
			return delete(partida_Publica);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Partida_Publica partida_Publica, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(partida_Publica.getJuego_Publico() != null) {
				partida_Publica.getJuego_Publico().partida_Publicas.remove(partida_Publica);
			}
			
			if(partida_Publica.getUsuario_no_Identificado() != null) {
				partida_Publica.getUsuario_no_Identificado().partida_Publicas.remove(partida_Publica);
			}
			
			try {
				session.delete(partida_Publica);
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
	
	public static boolean refresh(bbdd.Partida_Publica partida_Publica) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().refresh(partida_Publica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bbdd.Partida_Publica partida_Publica) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().evict(partida_Publica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partida_Publica loadPartida_PublicaByCriteria(Partida_PublicaCriteria partida_PublicaCriteria) {
		Partida_Publica[] partida_Publicas = listPartida_PublicaByCriteria(partida_PublicaCriteria);
		if(partida_Publicas == null || partida_Publicas.length == 0) {
			return null;
		}
		return partida_Publicas[0];
	}
	
	public static Partida_Publica[] listPartida_PublicaByCriteria(Partida_PublicaCriteria partida_PublicaCriteria) {
		return partida_PublicaCriteria.listPartida_Publica();
	}
}
