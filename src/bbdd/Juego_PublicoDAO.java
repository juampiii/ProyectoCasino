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

public class Juego_PublicoDAO {
	public static Juego_Publico loadJuego_PublicoByORMID(String id_juego) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadJuego_PublicoByORMID(session, id_juego);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego_Publico getJuego_PublicoByORMID(String id_juego) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getJuego_PublicoByORMID(session, id_juego);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego_Publico loadJuego_PublicoByORMID(String id_juego, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadJuego_PublicoByORMID(session, id_juego, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego_Publico getJuego_PublicoByORMID(String id_juego, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return getJuego_PublicoByORMID(session, id_juego, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego_Publico loadJuego_PublicoByORMID(PersistentSession session, String id_juego) throws PersistentException {
		try {
			return (Juego_Publico) session.load(bbdd.Juego_Publico.class, id_juego);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego_Publico getJuego_PublicoByORMID(PersistentSession session, String id_juego) throws PersistentException {
		try {
			return (Juego_Publico) session.get(bbdd.Juego_Publico.class, id_juego);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego_Publico loadJuego_PublicoByORMID(PersistentSession session, String id_juego, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Juego_Publico) session.load(bbdd.Juego_Publico.class, id_juego, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego_Publico getJuego_PublicoByORMID(PersistentSession session, String id_juego, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Juego_Publico) session.get(bbdd.Juego_Publico.class, id_juego, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJuego_Publico(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return queryJuego_Publico(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJuego_Publico(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return queryJuego_Publico(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego_Publico[] listJuego_PublicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listJuego_PublicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego_Publico[] listJuego_PublicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return listJuego_PublicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJuego_Publico(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Juego_Publico as Juego_Publico");
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
	
	public static List queryJuego_Publico(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Juego_Publico as Juego_Publico");
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
	
	public static Juego_Publico[] listJuego_PublicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryJuego_Publico(session, condition, orderBy);
			return (Juego_Publico[]) list.toArray(new Juego_Publico[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego_Publico[] listJuego_PublicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryJuego_Publico(session, condition, orderBy, lockMode);
			return (Juego_Publico[]) list.toArray(new Juego_Publico[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego_Publico loadJuego_PublicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadJuego_PublicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego_Publico loadJuego_PublicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return loadJuego_PublicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego_Publico loadJuego_PublicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Juego_Publico[] juego_Publicos = listJuego_PublicoByQuery(session, condition, orderBy);
		if (juego_Publicos != null && juego_Publicos.length > 0)
			return juego_Publicos[0];
		else
			return null;
	}
	
	public static Juego_Publico loadJuego_PublicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Juego_Publico[] juego_Publicos = listJuego_PublicoByQuery(session, condition, orderBy, lockMode);
		if (juego_Publicos != null && juego_Publicos.length > 0)
			return juego_Publicos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateJuego_PublicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iterateJuego_PublicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJuego_PublicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = bbdd.ProyectoNuevoPersistentManager.instance().getSession();
			return iterateJuego_PublicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJuego_PublicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Juego_Publico as Juego_Publico");
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
	
	public static java.util.Iterator iterateJuego_PublicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From bbdd.Juego_Publico as Juego_Publico");
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
	
	public static Juego_Publico createJuego_Publico() {
		return new bbdd.Juego_Publico();
	}
	
	public static boolean save(bbdd.Juego_Publico juego_Publico) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().saveObject(juego_Publico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(bbdd.Juego_Publico juego_Publico) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().deleteObject(juego_Publico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Juego_Publico juego_Publico)throws PersistentException {
		try {
			bbdd.Partida_Publica[] lPartida_Publicass = juego_Publico.partida_Publicas.toArray();
			for(int i = 0; i < lPartida_Publicass.length; i++) {
				lPartida_Publicass[i].setJuego_Publico(null);
			}
			bbdd.Usuario_Registrado[] lEs_favorito_des = juego_Publico.es_favorito_de.toArray();
			for(int i = 0; i < lEs_favorito_des.length; i++) {
				lEs_favorito_des[i].tiene_favoritos.remove(juego_Publico);
			}
			bbdd.Partida_registrado[] lPartida_registradoss = juego_Publico.partida_registrados.toArray();
			for(int i = 0; i < lPartida_registradoss.length; i++) {
				lPartida_registradoss[i].setJuego(null);
			}
			return delete(juego_Publico);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(bbdd.Juego_Publico juego_Publico, org.orm.PersistentSession session)throws PersistentException {
		try {
			bbdd.Partida_Publica[] lPartida_Publicass = juego_Publico.partida_Publicas.toArray();
			for(int i = 0; i < lPartida_Publicass.length; i++) {
				lPartida_Publicass[i].setJuego_Publico(null);
			}
			bbdd.Usuario_Registrado[] lEs_favorito_des = juego_Publico.es_favorito_de.toArray();
			for(int i = 0; i < lEs_favorito_des.length; i++) {
				lEs_favorito_des[i].tiene_favoritos.remove(juego_Publico);
			}
			bbdd.Partida_registrado[] lPartida_registradoss = juego_Publico.partida_registrados.toArray();
			for(int i = 0; i < lPartida_registradoss.length; i++) {
				lPartida_registradoss[i].setJuego(null);
			}
			try {
				session.delete(juego_Publico);
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
	
	public static boolean refresh(bbdd.Juego_Publico juego_Publico) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().refresh(juego_Publico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(bbdd.Juego_Publico juego_Publico) throws PersistentException {
		try {
			bbdd.ProyectoNuevoPersistentManager.instance().getSession().evict(juego_Publico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Juego_Publico loadJuego_PublicoByCriteria(Juego_PublicoCriteria juego_PublicoCriteria) {
		Juego_Publico[] juego_Publicos = listJuego_PublicoByCriteria(juego_PublicoCriteria);
		if(juego_Publicos == null || juego_Publicos.length == 0) {
			return null;
		}
		return juego_Publicos[0];
	}
	
	public static Juego_Publico[] listJuego_PublicoByCriteria(Juego_PublicoCriteria juego_PublicoCriteria) {
		return juego_PublicoCriteria.listJuego_Publico();
	}
}
