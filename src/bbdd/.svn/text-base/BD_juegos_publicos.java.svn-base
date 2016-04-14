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
public class BD_juegos_publicos {
	public BD_juegos_publicos() {
	}
	
	public bbdd.Juego_Publico[] cargarJuegosPublicos() {
		//TODO: Implement Method
		Juego_PublicoCriteria criterio;
		try {
			criterio = new Juego_PublicoCriteria();
			criterio.desactivado.eq(false);
			bbdd.Juego_Publico[] lista = criterio.listJuego_Publico();
			//Juego_PublicoDAO.listJuego_PublicoByCriteria(criterio);
			return criterio.listJuego_Publico();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Juego_Publico consultaJuegoPublico(String juego){
		
		try {
			return Juego_PublicoDAO.getJuego_PublicoByORMID(juego);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	
	}
	
private bbdd.BD_Principal es_administrado_por;
	
	public bbdd.BD_Principal getEs_administrado_por()  {
		return this.es_administrado_por;
	}
	
	public void setEs_administrado_por(bbdd.BD_Principal value)  {
		this.es_administrado_por = value;
	}

	
}
