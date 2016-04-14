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

import org.orm.PersistentException;

/**
 * ORM-Component Class
 */
public class BD_Gestores_de_Usuarios_ {
	public BD_Gestores_de_Usuarios_() {
	}
	
private bbdd.BD_Principal es_gestionado_por;
	
	public bbdd.BD_Principal getEs_gestionado_por()  {
		return this.es_gestionado_por;
	}
	
	public void setEs_gestionado_por(bbdd.BD_Principal value)  {
		this.es_gestionado_por = value;
	}

	public boolean loginGestorUsuario(String correo, String password) {
		//TODO: Implement Method
		try {
			Gestor_de_Usuarios__Criteria criterio = new Gestor_de_Usuarios__Criteria();
			criterio.email.eq(correo);
			criterio.password.eq(password);
			return criterio.listGestor_de_Usuarios__().length == 1;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public String dniGestorUsuario(String correo) {
		try {
			Gestor_de_Usuarios__Criteria criterio = new Gestor_de_Usuarios__Criteria();
			criterio.email.eq(correo);
			return criterio.uniqueGestor_de_Usuarios__().getDni();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
