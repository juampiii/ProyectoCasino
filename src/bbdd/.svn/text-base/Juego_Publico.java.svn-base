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
public class Juego_Publico extends bbdd.Juego implements Serializable {
	public Juego_Publico() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bbdd.ORMConstants.KEY_JUEGO_PUBLICO_PARTIDA_PUBLICAS) {
			return ORM_partida_Publicas;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_partida_Publicas = new java.util.HashSet();
	
	public bbdd.Usuario_no_Identificado[] getUsuario_no_Identificados() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = partida_Publicas.getIterator();lIter.hasNext();) {
			lValues.add(((bbdd.Partida_Publica)lIter.next()).getUsuario_no_Identificado());
		}
		return (bbdd.Usuario_no_Identificado[])lValues.toArray(new bbdd.Usuario_no_Identificado[lValues.size()]);
	}
	
	public void removeUsuario_no_Identificado(bbdd.Usuario_no_Identificado aUsuario_no_Identificado) {
		bbdd.Partida_Publica[] lPartida_Publicas = partida_Publicas.toArray();
		for(int i = 0; i < lPartida_Publicas.length; i++) {
			if(lPartida_Publicas[i].getUsuario_no_Identificado().equals(aUsuario_no_Identificado)) {
				partida_Publicas.remove(lPartida_Publicas[i]);
			}
		}
	}
	
	public void addUsuario_no_Identificado(bbdd.Partida_Publica aPartida_Publica, bbdd.Usuario_no_Identificado aUsuario_no_Identificado) {
		aPartida_Publica.setUsuario_no_Identificado(aUsuario_no_Identificado);
		partida_Publicas.add(aPartida_Publica);
	}
	
	public bbdd.Partida_Publica getPartida_PublicaByUsuario_no_Identificado(bbdd.Usuario_no_Identificado aUsuario_no_Identificado) {
		bbdd.Partida_Publica[] lPartida_Publicas = partida_Publicas.toArray();
		for(int i = 0; i < lPartida_Publicas.length; i++) {
			if(lPartida_Publicas[i].getUsuario_no_Identificado().equals(aUsuario_no_Identificado)) {
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
	
	public final bbdd.Partida_PublicaSetCollection partida_Publicas = new bbdd.Partida_PublicaSetCollection(this, _ormAdapter, bbdd.ORMConstants.KEY_JUEGO_PUBLICO_PARTIDA_PUBLICAS, bbdd.ORMConstants.KEY_PARTIDA_PUBLICA_JUEGO_PUBLICO, bbdd.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
	private bbdd.BD_juegos_publicos forma;
	
	public bbdd.BD_juegos_publicos getForma()  {
		return this.forma;
	}
	
	public void setForma(bbdd.BD_juegos_publicos value)  {
		this.forma = value;
	}
	
}
