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

import java.io.Serializable;
public class Usuario_no_Identificado implements Serializable {
	public Usuario_no_Identificado() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Usuario_no_Identificado))
			return false;
		Usuario_no_Identificado usuario_no_identificado = (Usuario_no_Identificado)aObj;
		if ((getIp() != null && !getIp().equals(usuario_no_identificado.getIp())) || (getIp() == null && usuario_no_identificado.getIp() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getIp() == null ? 0 : getIp().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bbdd.ORMConstants.KEY_USUARIO_NO_IDENTIFICADO_PARTIDA_PUBLICAS) {
			return ORM_partida_Publicas;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String ip;
	
	private double tiempo;
	
	private java.util.Set ORM_partida_Publicas = new java.util.HashSet();
	
	public void setIp(String value) {
		this.ip = value;
	}
	
	public String getIp() {
		return ip;
	}
	
	public String getORMID() {
		return getIp();
	}
	
	public void setTiempo(double value) {
		this.tiempo = value;
	}
	
	public double getTiempo() {
		return tiempo;
	}
	
	public bbdd.Juego_Publico[] getJuego_Publicos() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = partida_Publicas.getIterator();lIter.hasNext();) {
			lValues.add(((bbdd.Partida_Publica)lIter.next()).getJuego_Publico());
		}
		return (bbdd.Juego_Publico[])lValues.toArray(new bbdd.Juego_Publico[lValues.size()]);
	}
	
	public void removeJuego_Publico(bbdd.Juego_Publico aJuego_Publico) {
		bbdd.Partida_Publica[] lPartida_Publicas = partida_Publicas.toArray();
		for(int i = 0; i < lPartida_Publicas.length; i++) {
			if(lPartida_Publicas[i].getJuego_Publico().equals(aJuego_Publico)) {
				partida_Publicas.remove(lPartida_Publicas[i]);
			}
		}
	}
	
	public void addJuego_Publico(bbdd.Partida_Publica aPartida_Publica, bbdd.Juego_Publico aJuego_Publico) {
		aPartida_Publica.setJuego_Publico(aJuego_Publico);
		partida_Publicas.add(aPartida_Publica);
	}
	
	public bbdd.Partida_Publica getPartida_PublicaByJuego_Publico(bbdd.Juego_Publico aJuego_Publico) {
		bbdd.Partida_Publica[] lPartida_Publicas = partida_Publicas.toArray();
		for(int i = 0; i < lPartida_Publicas.length; i++) {
			if(lPartida_Publicas[i].getJuego_Publico().equals(aJuego_Publico)) {
				return lPartida_Publicas[i];
			}
		}
		return null;
	}
	
	private void setORM_Partida_Publicas(java.util.Set value) {
		this.ORM_partida_Publicas = value;
	}
	
	private java.util.Set getORM_Partida_Publicas() {
		return ORM_partida_Publicas;
	}
	
	public final bbdd.Partida_PublicaSetCollection partida_Publicas = new bbdd.Partida_PublicaSetCollection(this, _ormAdapter, bbdd.ORMConstants.KEY_USUARIO_NO_IDENTIFICADO_PARTIDA_PUBLICAS, bbdd.ORMConstants.KEY_PARTIDA_PUBLICA_USUARIO_NO_IDENTIFICADO, bbdd.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIp());
	}
	
	private bbdd.BD_Usuarios_no_Identificados conforma;
	
	public bbdd.BD_Usuarios_no_Identificados getConforma()  {
		return this.conforma;
	}
	
	public void setConforma(bbdd.BD_Usuarios_no_Identificados value)  {
		this.conforma = value;
	}
	
}
