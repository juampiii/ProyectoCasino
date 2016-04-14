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
public class Movimiento implements Serializable {
	public Movimiento() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Movimiento))
			return false;
		Movimiento movimiento = (Movimiento)aObj;
		if ((getId_Movimiento() != null && !getId_Movimiento().equals(movimiento.getId_Movimiento())) || (getId_Movimiento() == null && movimiento.getId_Movimiento() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getId_Movimiento() == null ? 0 : getId_Movimiento().hashCode());
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == bbdd.ORMConstants.KEY_MOVIMIENTO_ES_REALIZADO) {
			this.es_realizado = (bbdd.Usuario_Registrado) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private String id_Movimiento;
	
	private bbdd.Usuario_Registrado es_realizado;
	
	private float cantidad;
	
	private java.util.Date fecha;
	
	private java.sql.Time hora;
	
	public void setId_Movimiento(String value) {
		this.id_Movimiento = value;
	}
	
	public String getId_Movimiento() {
		return id_Movimiento;
	}
	
	public String getORMID() {
		return getId_Movimiento();
	}
	
	public void setCantidad(float value) {
		this.cantidad = value;
	}
	
	public float getCantidad() {
		return cantidad;
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setHora(java.sql.Time value) {
		this.hora = value;
	}
	
	public java.sql.Time getHora() {
		return hora;
	}
	
	public void setEs_realizado(bbdd.Usuario_Registrado value) {
		if (es_realizado != null) {
			es_realizado.realiza_movimiento.remove(this);
		}
		if (value != null) {
			value.realiza_movimiento.add(this);
		}
	}
	
	public bbdd.Usuario_Registrado getEs_realizado() {
		return es_realizado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_realizado(bbdd.Usuario_Registrado value) {
		this.es_realizado = value;
	}
	
	private bbdd.Usuario_Registrado getORM_Es_realizado() {
		return es_realizado;
	}
	
	public String toString() {
		return String.valueOf(getId_Movimiento());
	}
	
	private bbdd.BD_Movimientos es_almacenado;
	
	public bbdd.BD_Movimientos getEs_almacenado()  {
		return this.es_almacenado;
	}
	
	public void setEs_almacenado(bbdd.BD_Movimientos value)  {
		this.es_almacenado = value;
	}
	
}
