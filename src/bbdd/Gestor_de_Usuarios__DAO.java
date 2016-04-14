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

public class Gestor_de_Usuarios__DAO {
	public static Gestor_de_Usuarios__ loadGestor_de_Usuarios__ByORMID(String dni) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadGestor_de_Usuarios__ByORMID(session, dni);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gestor_de_Usuarios__ getGestor_de_Usuarios__ByORMID(String dni) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getGestor_de_Usuarios__ByORMID(session, dni);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gestor_de_Usuarios__ loadGestor_de_Usuarios__ByORMID(String dni, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadGestor_de_Usuarios__ByORMID(session, dni, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gestor_de_Usuarios__ getGestor_de_Usuarios__ByORMID(String dni, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getGestor_de_Usuarios__ByORMID(session, dni, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gestor_de_Usuarios__ loadGestor_de_Usuarios__ByORMID(PersistentSession session, String dni) throws PersistentException {
		try {
			return (Gestor_de_Usuarios__) session.load(bbdd.Gestor_de_Usuarios__.class, dni);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gestor_de_Usuarios__ getGestor_de_Usuarios__ByORMID(PersistentSession session, String dni) throws PersistentException {
		try {
			return (Gestor_de_Usuarios__) session.get(bbdd.Gestor_de_Usuarios__.class, dni);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gestor_de_Usuarios__ loadGestor_de_Usuarios__ByORMID(PersistentSession session, String dni, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Gestor_de_Usuarios__) session.load(bbdd.Gestor_de_Usuarios__.class, dni, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gestor_de_Usuarios__ getGestor_de_Usuarios__ByORMID(PersistentSession session, String dni, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Gestor_de_Usuarios__) session.get(bbdd.Gestor_de_Usuarios__.class, dni, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGestor_de_Usuarios__(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return queryGestor_de_Usuarios__(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGestor_de_Usuarios__(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return queryGestor_de_Usuarios__(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gestor_de_Usuarios__[] listGestor_de_Usuarios__ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listGestor_de_Usuarios__ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gestor_de_Usuarios__[] listGestor_de_Usuarios__ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listGestor_de_Usuarios__ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGestor_de_Usuarios__(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Gestor_de_Usuarios__ as Gestor_de_Usuarios__");
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
	
	public static List queryGestor_de_Usuarios__(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Gestor_de_Usuarios__ as Gestor_de_Usuarios__");
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
	
	public static Gestor_de_Usuarios__[] listGestor_de_Usuarios__ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGestor_de_Usuarios__(session, condition, orderBy);
			return (Gestor_de_Usuarios__[]) list.toArray(new Gestor_de_Usuarios__[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gestor_de_Usuarios__[] listGestor_de_Usuarios__ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGestor_de_Usuarios__(session, condition, orderBy, lockMode);
			return (Gestor_de_Usuarios__[]) list.toArray(new Gestor_de_Usuarios__[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gestor_de_Usuarios__ loadGestor_de_Usuarios__ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadGestor_de_Usuarios__ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gestor_de_Usuarios__ loadGestor_de_Usuarios__ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadGestor_de_Usuarios__ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gestor_de_Usuarios__ loadGestor_de_Usuarios__ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Gestor_de_Usuarios__[] gestor_de_Usuarios__s = listGestor_de_Usuarios__ByQuery(session, condition, orderBy);
		if (gestor_de_Usuarios__s != null && gestor_de_Usuarios__s.length > 0)
			return gestor_de_Usuarios__s[0];
		else
			return null;
	}
	
	public static Gestor_de_Usuarios__ loadGestor_de_Usuarios__ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Gestor_de_Usuarios__[] gestor_de_Usuarios__s = listGestor_de_Usuarios__ByQuery(session, condition, orderBy, lockMode);
		if (gestor_de_Usuarios__s != null && gestor_de_Usuarios__s.length > 0)
			return gestor_de_Usuarios__s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGestor_de_Usuarios__ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iterateGestor_de_Usuarios__ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGestor_de_Usuarios__ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iterateGestor_de_Usuarios__ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGestor_de_Usuarios__ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Gestor_de_Usuarios__ as Gestor_de_Usuarios__");
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
	
	public static java.util.Iterator iterateGestor_de_Usuarios__ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Gestor_de_Usuarios__ as Gestor_de_Usuarios__");
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
	
	public static Gestor_de_Usuarios__ createGestor_de_Usuarios__() {
		return new bbdd.Gestor_de_Usuarios__();
	}
	
	public static boolean save(bbdd.Gestor_de_Usuarios__ gestor_de_Usuarios__) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().saveObject(gestor_de_Usuarios__);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bbdd.Gestor_de_Usuarios__ gestor_de_Usuarios__) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().deleteObject(gestor_de_Usuarios__);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Gestor_de_Usuarios__ gestor_de_Usuarios__)throws PersistentException {
		try {
			bbdd.Sugerencia[] lAtiende_sugerencias = gestor_de_Usuarios__.atiende_sugerencia.toArray();
			for(int i = 0; i < lAtiende_sugerencias.length; i++) {
				lAtiende_sugerencias[i].setEs_atendida_por(null);
			}
			return delete(gestor_de_Usuarios__);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Gestor_de_Usuarios__ gestor_de_Usuarios__, org.orm.PersistentSession session)throws PersistentException {
		try {
			bbdd.Sugerencia[] lAtiende_sugerencias = gestor_de_Usuarios__.atiende_sugerencia.toArray();
			for(int i = 0; i < lAtiende_sugerencias.length; i++) {
				lAtiende_sugerencias[i].setEs_atendida_por(null);
			}
			try {
				session.delete(gestor_de_Usuarios__);
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
	
	public static boolean refresh(bbdd.Gestor_de_Usuarios__ gestor_de_Usuarios__) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().refresh(gestor_de_Usuarios__);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bbdd.Gestor_de_Usuarios__ gestor_de_Usuarios__) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().evict(gestor_de_Usuarios__);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gestor_de_Usuarios__ loadGestor_de_Usuarios__ByCriteria(Gestor_de_Usuarios__Criteria gestor_de_Usuarios__Criteria) {
		Gestor_de_Usuarios__[] gestor_de_Usuarios__s = listGestor_de_Usuarios__ByCriteria(gestor_de_Usuarios__Criteria);
		if(gestor_de_Usuarios__s == null || gestor_de_Usuarios__s.length == 0) {
			return null;
		}
		return gestor_de_Usuarios__s[0];
	}
	
	public static Gestor_de_Usuarios__[] listGestor_de_Usuarios__ByCriteria(Gestor_de_Usuarios__Criteria gestor_de_Usuarios__Criteria) {
		return gestor_de_Usuarios__Criteria.listGestor_de_Usuarios__();
	}
}
