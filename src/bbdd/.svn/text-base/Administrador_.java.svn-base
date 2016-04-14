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
public class Administrador_ extends bbdd.Usuario implements Serializable {
	public Administrador_() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bbdd.ORMConstants.KEY_ADMINISTRADOR__ATIENDE_SUGERENCIA) {
			return ORM_atiende_sugerencia;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_atiende_sugerencia = new java.util.HashSet();
	
	private void setORM_Atiende_sugerencia(java.util.Set value) {
		this.ORM_atiende_sugerencia = value;
	}
	
	private java.util.Set getORM_Atiende_sugerencia() {
		return ORM_atiende_sugerencia;
	}
	
	public final bbdd.SugerenciaSetCollection atiende_sugerencia = new bbdd.SugerenciaSetCollection(this, _ormAdapter, bbdd.ORMConstants.KEY_ADMINISTRADOR__ATIENDE_SUGERENCIA, bbdd.ORMConstants.KEY_SUGERENCIA_ES_ATENDIDA_POR, bbdd.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
