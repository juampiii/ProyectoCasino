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

public class ConfiguracionDAO {
	public static Configuracion loadConfiguracionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadConfiguracionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion getConfiguracionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getConfiguracionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion loadConfiguracionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadConfiguracionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion getConfiguracionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getConfiguracionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion loadConfiguracionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Configuracion) session.load(bbdd.Configuracion.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion getConfiguracionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Configuracion) session.get(bbdd.Configuracion.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion loadConfiguracionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Configuracion) session.load(bbdd.Configuracion.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion getConfiguracionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Configuracion) session.get(bbdd.Configuracion.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConfiguracion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return queryConfiguracion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConfiguracion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return queryConfiguracion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion[] listConfiguracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listConfiguracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion[] listConfiguracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listConfiguracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConfiguracion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Configuracion as Configuracion");
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
	
	public static List queryConfiguracion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Configuracion as Configuracion");
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
	
	public static Configuracion[] listConfiguracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryConfiguracion(session, condition, orderBy);
			return (Configuracion[]) list.toArray(new Configuracion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion[] listConfiguracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryConfiguracion(session, condition, orderBy, lockMode);
			return (Configuracion[]) list.toArray(new Configuracion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion loadConfiguracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadConfiguracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion loadConfiguracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadConfiguracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion loadConfiguracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Configuracion[] configuracions = listConfiguracionByQuery(session, condition, orderBy);
		if (configuracions != null && configuracions.length > 0)
			return configuracions[0];
		else
			return null;
	}
	
	public static Configuracion loadConfiguracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Configuracion[] configuracions = listConfiguracionByQuery(session, condition, orderBy, lockMode);
		if (configuracions != null && configuracions.length > 0)
			return configuracions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateConfiguracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iterateConfiguracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateConfiguracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iterateConfiguracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateConfiguracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Configuracion as Configuracion");
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
	
	public static java.util.Iterator iterateConfiguracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Configuracion as Configuracion");
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
	
	public static Configuracion createConfiguracion() {
		return new bbdd.Configuracion();
	}
	
	public static boolean save(bbdd.Configuracion configuracion) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().saveObject(configuracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bbdd.Configuracion configuracion) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().deleteObject(configuracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(bbdd.Configuracion configuracion) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().refresh(configuracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bbdd.Configuracion configuracion) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().evict(configuracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion loadConfiguracionByCriteria(ConfiguracionCriteria configuracionCriteria) {
		Configuracion[] configuracions = listConfiguracionByCriteria(configuracionCriteria);
		if(configuracions == null || configuracions.length == 0) {
			return null;
		}
		return configuracions[0];
	}
	
	public static Configuracion[] listConfiguracionByCriteria(ConfiguracionCriteria configuracionCriteria) {
		return configuracionCriteria.listConfiguracion();
	}
}
