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

public class Usuario_no_IdentificadoDAO {
	public static Usuario_no_Identificado loadUsuario_no_IdentificadoByORMID(String ip) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadUsuario_no_IdentificadoByORMID(session, ip);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_no_Identificado getUsuario_no_IdentificadoByORMID(String ip) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getUsuario_no_IdentificadoByORMID(session, ip);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_no_Identificado loadUsuario_no_IdentificadoByORMID(String ip, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadUsuario_no_IdentificadoByORMID(session, ip, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_no_Identificado getUsuario_no_IdentificadoByORMID(String ip, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getUsuario_no_IdentificadoByORMID(session, ip, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_no_Identificado loadUsuario_no_IdentificadoByORMID(PersistentSession session, String ip) throws PersistentException {
		try {
			return (Usuario_no_Identificado) session.load(bbdd.Usuario_no_Identificado.class, ip);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_no_Identificado getUsuario_no_IdentificadoByORMID(PersistentSession session, String ip) throws PersistentException {
		try {
			return (Usuario_no_Identificado) session.get(bbdd.Usuario_no_Identificado.class, ip);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_no_Identificado loadUsuario_no_IdentificadoByORMID(PersistentSession session, String ip, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_no_Identificado) session.load(bbdd.Usuario_no_Identificado.class, ip, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_no_Identificado getUsuario_no_IdentificadoByORMID(PersistentSession session, String ip, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_no_Identificado) session.get(bbdd.Usuario_no_Identificado.class, ip, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_no_Identificado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return queryUsuario_no_Identificado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_no_Identificado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return queryUsuario_no_Identificado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_no_Identificado[] listUsuario_no_IdentificadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listUsuario_no_IdentificadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_no_Identificado[] listUsuario_no_IdentificadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listUsuario_no_IdentificadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_no_Identificado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Usuario_no_Identificado as Usuario_no_Identificado");
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
	
	public static List queryUsuario_no_Identificado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Usuario_no_Identificado as Usuario_no_Identificado");
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
	
	public static Usuario_no_Identificado[] listUsuario_no_IdentificadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_no_Identificado(session, condition, orderBy);
			return (Usuario_no_Identificado[]) list.toArray(new Usuario_no_Identificado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_no_Identificado[] listUsuario_no_IdentificadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_no_Identificado(session, condition, orderBy, lockMode);
			return (Usuario_no_Identificado[]) list.toArray(new Usuario_no_Identificado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_no_Identificado loadUsuario_no_IdentificadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadUsuario_no_IdentificadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_no_Identificado loadUsuario_no_IdentificadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadUsuario_no_IdentificadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_no_Identificado loadUsuario_no_IdentificadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_no_Identificado[] usuario_no_Identificados = listUsuario_no_IdentificadoByQuery(session, condition, orderBy);
		if (usuario_no_Identificados != null && usuario_no_Identificados.length > 0)
			return usuario_no_Identificados[0];
		else
			return null;
	}
	
	public static Usuario_no_Identificado loadUsuario_no_IdentificadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_no_Identificado[] usuario_no_Identificados = listUsuario_no_IdentificadoByQuery(session, condition, orderBy, lockMode);
		if (usuario_no_Identificados != null && usuario_no_Identificados.length > 0)
			return usuario_no_Identificados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_no_IdentificadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iterateUsuario_no_IdentificadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_no_IdentificadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iterateUsuario_no_IdentificadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_no_IdentificadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Usuario_no_Identificado as Usuario_no_Identificado");
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
	
	public static java.util.Iterator iterateUsuario_no_IdentificadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Usuario_no_Identificado as Usuario_no_Identificado");
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
	
	public static Usuario_no_Identificado createUsuario_no_Identificado() {
		return new bbdd.Usuario_no_Identificado();
	}
	
	public static boolean save(bbdd.Usuario_no_Identificado usuario_no_Identificado) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().saveObject(usuario_no_Identificado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bbdd.Usuario_no_Identificado usuario_no_Identificado) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().deleteObject(usuario_no_Identificado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Usuario_no_Identificado usuario_no_Identificado)throws PersistentException {
		try {
			bbdd.Partida_Publica[] lPartida_Publicass = usuario_no_Identificado.partida_Publicas.toArray();
			for(int i = 0; i < lPartida_Publicass.length; i++) {
				lPartida_Publicass[i].setUsuario_no_Identificado(null);
			}
			return delete(usuario_no_Identificado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Usuario_no_Identificado usuario_no_Identificado, org.orm.PersistentSession session)throws PersistentException {
		try {
			bbdd.Partida_Publica[] lPartida_Publicass = usuario_no_Identificado.partida_Publicas.toArray();
			for(int i = 0; i < lPartida_Publicass.length; i++) {
				lPartida_Publicass[i].setUsuario_no_Identificado(null);
			}
			try {
				session.delete(usuario_no_Identificado);
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
	
	public static boolean refresh(bbdd.Usuario_no_Identificado usuario_no_Identificado) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().refresh(usuario_no_Identificado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bbdd.Usuario_no_Identificado usuario_no_Identificado) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().evict(usuario_no_Identificado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_no_Identificado loadUsuario_no_IdentificadoByCriteria(Usuario_no_IdentificadoCriteria usuario_no_IdentificadoCriteria) {
		Usuario_no_Identificado[] usuario_no_Identificados = listUsuario_no_IdentificadoByCriteria(usuario_no_IdentificadoCriteria);
		if(usuario_no_Identificados == null || usuario_no_Identificados.length == 0) {
			return null;
		}
		return usuario_no_Identificados[0];
	}
	
	public static Usuario_no_Identificado[] listUsuario_no_IdentificadoByCriteria(Usuario_no_IdentificadoCriteria usuario_no_IdentificadoCriteria) {
		return usuario_no_IdentificadoCriteria.listUsuario_no_Identificado();
	}
}
