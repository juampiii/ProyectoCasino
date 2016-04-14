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

public class SugerenciaDAO {
	public static Sugerencia loadSugerenciaByORMID(String id_Sugerencia) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadSugerenciaByORMID(session, id_Sugerencia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sugerencia getSugerenciaByORMID(String id_Sugerencia) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getSugerenciaByORMID(session, id_Sugerencia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sugerencia loadSugerenciaByORMID(String id_Sugerencia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadSugerenciaByORMID(session, id_Sugerencia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sugerencia getSugerenciaByORMID(String id_Sugerencia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getSugerenciaByORMID(session, id_Sugerencia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sugerencia loadSugerenciaByORMID(PersistentSession session, String id_Sugerencia) throws PersistentException {
		try {
			return (Sugerencia) session.load(bbdd.Sugerencia.class, id_Sugerencia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sugerencia getSugerenciaByORMID(PersistentSession session, String id_Sugerencia) throws PersistentException {
		try {
			return (Sugerencia) session.get(bbdd.Sugerencia.class, id_Sugerencia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sugerencia loadSugerenciaByORMID(PersistentSession session, String id_Sugerencia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sugerencia) session.load(bbdd.Sugerencia.class, id_Sugerencia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sugerencia getSugerenciaByORMID(PersistentSession session, String id_Sugerencia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sugerencia) session.get(bbdd.Sugerencia.class, id_Sugerencia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySugerencia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return querySugerencia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySugerencia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return querySugerencia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sugerencia[] listSugerenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listSugerenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sugerencia[] listSugerenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listSugerenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySugerencia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Sugerencia as Sugerencia");
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
	
	public static List querySugerencia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Sugerencia as Sugerencia");
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
	
	public static Sugerencia[] listSugerenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySugerencia(session, condition, orderBy);
			return (Sugerencia[]) list.toArray(new Sugerencia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sugerencia[] listSugerenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySugerencia(session, condition, orderBy, lockMode);
			return (Sugerencia[]) list.toArray(new Sugerencia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sugerencia loadSugerenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadSugerenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sugerencia loadSugerenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadSugerenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sugerencia loadSugerenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Sugerencia[] sugerencias = listSugerenciaByQuery(session, condition, orderBy);
		if (sugerencias != null && sugerencias.length > 0)
			return sugerencias[0];
		else
			return null;
	}
	
	public static Sugerencia loadSugerenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Sugerencia[] sugerencias = listSugerenciaByQuery(session, condition, orderBy, lockMode);
		if (sugerencias != null && sugerencias.length > 0)
			return sugerencias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSugerenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iterateSugerenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSugerenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iterateSugerenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSugerenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Sugerencia as Sugerencia");
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
	
	public static java.util.Iterator iterateSugerenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Sugerencia as Sugerencia");
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
	
	public static Sugerencia createSugerencia() {
		return new bbdd.Sugerencia();
	}
	
	public static boolean save(bbdd.Sugerencia sugerencia) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().saveObject(sugerencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bbdd.Sugerencia sugerencia) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().deleteObject(sugerencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Sugerencia sugerencia)throws PersistentException {
		try {
			if(sugerencia.getEs_escrita_por() != null) {
				sugerencia.getEs_escrita_por().escribe_sugerencia.remove(sugerencia);
			}
			
			if(sugerencia.getEs_atendida_por() != null) {
				sugerencia.getEs_atendida_por().atiende_sugerencia.remove(sugerencia);
			}
			
			return delete(sugerencia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Sugerencia sugerencia, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(sugerencia.getEs_escrita_por() != null) {
				sugerencia.getEs_escrita_por().escribe_sugerencia.remove(sugerencia);
			}
			
			if(sugerencia.getEs_atendida_por() != null) {
				sugerencia.getEs_atendida_por().atiende_sugerencia.remove(sugerencia);
			}
			
			try {
				session.delete(sugerencia);
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
	
	public static boolean refresh(bbdd.Sugerencia sugerencia) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().refresh(sugerencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bbdd.Sugerencia sugerencia) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().evict(sugerencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sugerencia loadSugerenciaByCriteria(SugerenciaCriteria sugerenciaCriteria) {
		Sugerencia[] sugerencias = listSugerenciaByCriteria(sugerenciaCriteria);
		if(sugerencias == null || sugerencias.length == 0) {
			return null;
		}
		return sugerencias[0];
	}
	
	public static Sugerencia[] listSugerenciaByCriteria(SugerenciaCriteria sugerenciaCriteria) {
		return sugerenciaCriteria.listSugerencia();
	}
}
