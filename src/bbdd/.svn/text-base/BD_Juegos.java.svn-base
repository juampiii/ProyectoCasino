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

import java.util.List;

import org.orm.PersistentException;

/**
 * ORM-Component Class
 */
public class BD_Juegos {
	public BD_Juegos() {
	}
	
private bbdd.BD_Principal es_contenido;
	
	public bbdd.BD_Principal getEs_contenido()  {
		return this.es_contenido;
	}
	
	public void setEs_contenido(bbdd.BD_Principal value)  {
		this.es_contenido = value;
	}

	
	public bbdd.Juego[] cargarListado() {
		//TODO: Implement Method
		System.out.println("Has preguntado por los juegos del catálogo");
		JuegoCriteria criterio;
		try {
			criterio = new JuegoCriteria();
			criterio.desactivado.eq(false);
			return JuegoDAO.listJuegoByCriteria(criterio);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public bbdd.Juego[] ListarJuegos(){
		//TODO: Implement Method
		JuegoCriteria criterio;
		try {
			criterio = new JuegoCriteria();
			return JuegoDAO.listJuegoByCriteria(criterio);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void EliminarJuego(String juego) {
		//TODO: Implement Method
		try {
			bbdd.JuegoDAO.delete(bbdd.JuegoDAO.getJuegoByORMID(juego));
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void InhabilitarJuego(String juego) {
		//TODO: Implement Method
		try {
			Juego juegoa = JuegoDAO.getJuegoByORMID(juego);
			juegoa.setDesactivado(true);
			JuegoDAO.save(juegoa);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void ActualizarJuego(String id_juego, String nombre,String enlace_imagen, double cantidad_minima, boolean visible, int num_minimo) {
		//TODO: Implement Method
		try {
			/**
			 * 
			 * El parámetro juego que recibo de que es???*/
			Juego juegoa = JuegoDAO.getJuegoByORMID(id_juego);
			juegoa.setNombre(nombre);
			juegoa.setEnlace_imagen(enlace_imagen);
			juegoa.setDesactivado(visible);
			juegoa.setCantidad_minima(cantidad_minima);
			juegoa.setNumero_minimo_usuarios(num_minimo);
			JuegoDAO.save(juegoa);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public bbdd.Juego jugarJuego(String id_juego, String dni, Double cantidad) {
		//TODO: Implement Method
		try {
			//System.out.print("Voy a registrar la partida juego: " + id_juego+" dni "+ dni + " Cantidad apostada: "+ cantidad);
			//cojo el juego y el usuario
			Juego juegoa = JuegoDAO.getJuegoByORMID(id_juego);
			Usuario_Registrado usuario = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(dni);
			Partida_registrado partida =Partida_registradoDAO.createPartida_registrado();
			partida.setUsuario_Registrado(usuario);
			partida.setJuego(juegoa);
			//Creo la partida sin la hora fin
			java.util.Date fecha = new java.util.Date();
			partida.setFecha(fecha);
			//partida.setHora_fin(fecha.getHours()+(fecha.getMinutes()/100));
			partida.setHora_inicio((fecha.getHours())+(fecha.getMinutes()/100));
			partida.setHora_fin(0);

			partida.setCantidad(cantidad);
			
			//Guardo la partida
			System.out.print(Partida_registradoDAO.save(partida));//Partida_registradoDAO.save(partida);
			//Devuelvo el juego
			
			return juegoa;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void AniadirJuego(String id_juego, String nombre, String enlace_imagen,double cantidad_minima, boolean desactivado, int num_minimo) {
		
		/**
		 * 
		 * 
		 * Lo mismo de antes, no se es juego, y faltan parámetros (cantidad mínima y el id)
		 * 
		 * NOTA: si quieres para el id puedes usar lo que yo hago en sugerencias (toda la fecha), dado
		 * que una fecha nunca se va a repetir (hora minuto segundo dia mes año*/
		Juego juegoa = JuegoDAO.createJuego();
		juegoa.setId_juego(id_juego);
		juegoa.setNombre(nombre);
		juegoa.setEnlace_imagen(enlace_imagen);
		juegoa.setDesactivado(desactivado);
		try {
			JuegoDAO.save(juegoa);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
