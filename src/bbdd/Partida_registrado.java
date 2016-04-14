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
public class Partida_registrado implements Serializable {
	public Partida_registrado() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == bbdd.ORMConstants.KEY_PARTIDA_REGISTRADO_JUEGO) {
			this.juego = (bbdd.Juego) owner;
		}
		
		else if (key == bbdd.ORMConstants.KEY_PARTIDA_REGISTRADO_USUARIO_REGISTRADO) {
			this.usuario_Registrado = (bbdd.Usuario_Registrado) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private java.util.Date fecha;
	
	private double hora_inicio;
	
	private double cantidad;
	
	private double hora_fin;
	
	private bbdd.Usuario_Registrado usuario_Registrado;
	
	private bbdd.Juego juego;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setHora_inicio(double value) {
		this.hora_inicio = value;
	}
	
	public double getHora_inicio() {
		return hora_inicio;
	}
	
	public void setCantidad(double value) {
		this.cantidad = value;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
	public void setHora_fin(double value) {
		this.hora_fin = value;
	}
	
	public double getHora_fin() {
		return hora_fin;
	}
	
	public void setJuego(bbdd.Juego value) {
		if (juego != null) {
			juego.partida_registrados.remove(this);
		}
		if (value != null) {
			value.partida_registrados.add(this);
		}
	}
	
	public bbdd.Juego getJuego() {
		return juego;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Juego(bbdd.Juego value) {
		this.juego = value;
	}
	
	private bbdd.Juego getORM_Juego() {
		return juego;
	}
	
	public void setUsuario_Registrado(bbdd.Usuario_Registrado value) {
		if (usuario_Registrado != null) {
			usuario_Registrado.partida_registrados.remove(this);
		}
		if (value != null) {
			value.partida_registrados.add(this);
		}
	}
	
	public bbdd.Usuario_Registrado getUsuario_Registrado() {
		return usuario_Registrado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuario_Registrado(bbdd.Usuario_Registrado value) {
		this.usuario_Registrado = value;
	}
	
	private bbdd.Usuario_Registrado getORM_Usuario_Registrado() {
		return usuario_Registrado;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
