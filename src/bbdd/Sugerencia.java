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
public class Sugerencia implements Serializable {
	public Sugerencia() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Sugerencia))
			return false;
		Sugerencia sugerencia = (Sugerencia)aObj;
		if ((getId_Sugerencia() != null && !getId_Sugerencia().equals(sugerencia.getId_Sugerencia())) || (getId_Sugerencia() == null && sugerencia.getId_Sugerencia() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getId_Sugerencia() == null ? 0 : getId_Sugerencia().hashCode());
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == bbdd.ORMConstants.KEY_SUGERENCIA_ES_ATENDIDA_POR) {
			this.es_atendida_por = (bbdd.Administrador_) owner;
		}
		
		else if (key == bbdd.ORMConstants.KEY_SUGERENCIA_ES_ESCRITA_POR) {
			this.es_escrita_por = (bbdd.Usuario_Registrado) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private String id_Sugerencia;
	
	private bbdd.Usuario_Registrado es_escrita_por;
	
	private bbdd.Administrador_ es_atendida_por;
	
	private String texto;
	
	private java.util.Date fecha;
	
	public void setId_Sugerencia(String value) {
		this.id_Sugerencia = value;
	}
	
	public String getId_Sugerencia() {
		return id_Sugerencia;
	}
	
	public String getORMID() {
		return getId_Sugerencia();
	}
	
	public void setTexto(String value) {
		this.texto = value;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setEs_atendida_por(bbdd.Administrador_ value) {
		if (es_atendida_por != null) {
			es_atendida_por.atiende_sugerencia.remove(this);
		}
		if (value != null) {
			value.atiende_sugerencia.add(this);
		}
	}
	
	public bbdd.Administrador_ getEs_atendida_por() {
		return es_atendida_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_atendida_por(bbdd.Administrador_ value) {
		this.es_atendida_por = value;
	}
	
	private bbdd.Administrador_ getORM_Es_atendida_por() {
		return es_atendida_por;
	}
	
	public void setEs_escrita_por(bbdd.Usuario_Registrado value) {
		if (es_escrita_por != null) {
			es_escrita_por.escribe_sugerencia.remove(this);
		}
		if (value != null) {
			value.escribe_sugerencia.add(this);
		}
	}
	
	public bbdd.Usuario_Registrado getEs_escrita_por() {
		return es_escrita_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_escrita_por(bbdd.Usuario_Registrado value) {
		this.es_escrita_por = value;
	}
	
	private bbdd.Usuario_Registrado getORM_Es_escrita_por() {
		return es_escrita_por;
	}
	
	public String toString() {
		return String.valueOf(getId_Sugerencia());
	}
	
	private bbdd.BD_Sugerencias_ forma_parte_de;
	
	public bbdd.BD_Sugerencias_ getForma_parte_de()  {
		return this.forma_parte_de;
	}
	
	public void setForma_parte_de(bbdd.BD_Sugerencias_ value)  {
		this.forma_parte_de = value;
	}
	
}
