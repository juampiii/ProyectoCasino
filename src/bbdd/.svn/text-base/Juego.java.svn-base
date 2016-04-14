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
public class Juego implements Serializable {
	public Juego() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Juego))
			return false;
		Juego juego = (Juego)aObj;
		if ((getId_juego() != null && !getId_juego().equals(juego.getId_juego())) || (getId_juego() == null && juego.getId_juego() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getId_juego() == null ? 0 : getId_juego().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bbdd.ORMConstants.KEY_JUEGO_ES_FAVORITO_DE) {
			return ORM_es_favorito_de;
		}
		else if (key == bbdd.ORMConstants.KEY_JUEGO_PARTIDA_REGISTRADOS) {
			return ORM_partida_registrados;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String id_juego;
	
	private String nombre;
	
	private String enlace_imagen;
	
	private double cantidad_minima;
	
	private boolean desactivado;
	
	private int numero_minimo_usuarios;
	
	private java.util.Set ORM_es_favorito_de = new java.util.HashSet();
	
	private java.util.Set ORM_partida_registrados = new java.util.HashSet();
	
	public void setId_juego(String value) {
		this.id_juego = value;
	}
	
	public String getId_juego() {
		return id_juego;
	}
	
	public String getORMID() {
		return getId_juego();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEnlace_imagen(String value) {
		this.enlace_imagen = value;
	}
	
	public String getEnlace_imagen() {
		return enlace_imagen;
	}
	
	public void setCantidad_minima(double value) {
		this.cantidad_minima = value;
	}
	
	public double getCantidad_minima() {
		return cantidad_minima;
	}
	
	public void setDesactivado(boolean value) {
		this.desactivado = value;
	}
	
	public boolean getDesactivado() {
		return desactivado;
	}
	
	public void setNumero_minimo_usuarios(int value) {
		this.numero_minimo_usuarios = value;
	}
	
	public int getNumero_minimo_usuarios() {
		return numero_minimo_usuarios;
	}
	
	private void setORM_Es_favorito_de(java.util.Set value) {
		this.ORM_es_favorito_de = value;
	}
	
	private java.util.Set getORM_Es_favorito_de() {
		return ORM_es_favorito_de;
	}
	
	public final bbdd.Usuario_RegistradoSetCollection es_favorito_de = new bbdd.Usuario_RegistradoSetCollection(this, _ormAdapter, bbdd.ORMConstants.KEY_JUEGO_ES_FAVORITO_DE, bbdd.ORMConstants.KEY_USUARIO_REGISTRADO_TIENE_FAVORITOS, bbdd.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public bbdd.Usuario_Registrado[] getUsuario_Registrados() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = partida_registrados.getIterator();lIter.hasNext();) {
			lValues.add(((bbdd.Partida_registrado)lIter.next()).getUsuario_Registrado());
		}
		return (bbdd.Usuario_Registrado[])lValues.toArray(new bbdd.Usuario_Registrado[lValues.size()]);
	}
	
	public void removeUsuario_Registrado(bbdd.Usuario_Registrado aUsuario_Registrado) {
		bbdd.Partida_registrado[] lPartida_registrados = partida_registrados.toArray();
		for(int i = 0; i < lPartida_registrados.length; i++) {
			if(lPartida_registrados[i].getUsuario_Registrado().equals(aUsuario_Registrado)) {
				partida_registrados.remove(lPartida_registrados[i]);
			}
		}
	}
	
	public void addUsuario_Registrado(bbdd.Partida_registrado aPartida_registrado, bbdd.Usuario_Registrado aUsuario_Registrado) {
		aPartida_registrado.setUsuario_Registrado(aUsuario_Registrado);
		partida_registrados.add(aPartida_registrado);
	}
	
	public bbdd.Partida_registrado getPartida_registradoByUsuario_Registrado(bbdd.Usuario_Registrado aUsuario_Registrado) {
		bbdd.Partida_registrado[] lPartida_registrados = partida_registrados.toArray();
		for(int i = 0; i < lPartida_registrados.length; i++) {
			if(lPartida_registrados[i].getUsuario_Registrado().equals(aUsuario_Registrado)) {
				return lPartida_registrados[i];
			}
		}
		return null;
	}
	
	private void setORM_Partida_registrados(java.util.Set value) {
		this.ORM_partida_registrados = value;
	}
	
	private java.util.Set getORM_Partida_registrados() {
		return ORM_partida_registrados;
	}
	
	public final bbdd.Partida_registradoSetCollection partida_registrados = new bbdd.Partida_registradoSetCollection(this, _ormAdapter, bbdd.ORMConstants.KEY_JUEGO_PARTIDA_REGISTRADOS, bbdd.ORMConstants.KEY_PARTIDA_REGISTRADO_JUEGO, bbdd.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_juego());
	}
	
	private bbdd.BD_Juegos forma_parte;
	
	public bbdd.BD_Juegos getForma_parte()  {
		return this.forma_parte;
	}
	
	public void setForma_parte(bbdd.BD_Juegos value)  {
		this.forma_parte = value;
	}
	
}
