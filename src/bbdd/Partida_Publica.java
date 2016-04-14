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
public class Partida_Publica implements Serializable {
	public Partida_Publica() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == bbdd.ORMConstants.KEY_PARTIDA_PUBLICA_USUARIO_NO_IDENTIFICADO) {
			this.usuario_no_Identificado = (bbdd.Usuario_no_Identificado) owner;
		}
		
		else if (key == bbdd.ORMConstants.KEY_PARTIDA_PUBLICA_JUEGO_PUBLICO) {
			this.juego_Publico = (bbdd.Juego_Publico) owner;
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
	
	private double hora_fin;
	
	private bbdd.Juego_Publico juego_Publico;
	
	private bbdd.Usuario_no_Identificado usuario_no_Identificado;
	
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
	
	public void setHora_fin(double value) {
		this.hora_fin = value;
	}
	
	public double getHora_fin() {
		return hora_fin;
	}
	
	public void setUsuario_no_Identificado(bbdd.Usuario_no_Identificado value) {
		if (usuario_no_Identificado != null) {
			usuario_no_Identificado.partida_Publicas.remove(this);
		}
		if (value != null) {
			value.partida_Publicas.add(this);
		}
	}
	
	public bbdd.Usuario_no_Identificado getUsuario_no_Identificado() {
		return usuario_no_Identificado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuario_no_Identificado(bbdd.Usuario_no_Identificado value) {
		this.usuario_no_Identificado = value;
	}
	
	private bbdd.Usuario_no_Identificado getORM_Usuario_no_Identificado() {
		return usuario_no_Identificado;
	}
	
	public void setJuego_Publico(bbdd.Juego_Publico value) {
		if (juego_Publico != null) {
			juego_Publico.partida_Publicas.remove(this);
		}
		if (value != null) {
			value.partida_Publicas.add(this);
		}
	}
	
	public bbdd.Juego_Publico getJuego_Publico() {
		return juego_Publico;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Juego_Publico(bbdd.Juego_Publico value) {
		this.juego_Publico = value;
	}
	
	private bbdd.Juego_Publico getORM_Juego_Publico() {
		return juego_Publico;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
