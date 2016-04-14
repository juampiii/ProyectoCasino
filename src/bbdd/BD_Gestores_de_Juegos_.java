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
public class BD_Gestores_de_Juegos_ {
	public BD_Gestores_de_Juegos_() {
	}
	
	private bbdd.BD_Principal es_administrado;
	
	public bbdd.BD_Principal getEs_administrado()  {
		return this.es_administrado;
	}
	
	public void setEs_administrado(bbdd.BD_Principal value)  {
		this.es_administrado = value;
	}
	
	public String dniGestorJuegos(String correo) {
		try {
			Gestor_de_Juegos__Criteria criterio = new Gestor_de_Juegos__Criteria();
			criterio.email.eq(correo);
			return criterio.uniqueGestor_de_Juegos__().getDni();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Gestor_de_Juegos__ consultarGestor(String dni) {
		try {
			return Gestor_de_Juegos__DAO.getGestor_de_Juegos__ByORMID(dni);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean loginGestorJuego(String correo, String password) {
		//TODO: Implement Method
		try {
			Gestor_de_Juegos__Criteria criterio = new Gestor_de_Juegos__Criteria();
			criterio.email.eq(correo);
			criterio.password.eq(password);
			return criterio.listGestor_de_Juegos__().length == 1;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
