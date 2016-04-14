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

import java.sql.Time;
import java.util.ArrayList;

import mds2.Juegos;
import mds2.Usuario_registrado;

import org.hibernate.classic.Session;
import org.orm.PersistentException;
import org.orm.PersistentManager;
import org.orm.PersistentTransaction;

/**
 * ORM-Component Class
 */
public class BD_Usuarios_registrados {
	public BD_Usuarios_registrados() {
	}
	
	private bbdd.BD_Principal es_almacenado;

	public bbdd.BD_Principal getEs_almacenado()  {
		return this.es_almacenado;
	}
	
	public void setEs_almacenado(bbdd.BD_Principal value)  {
		this.es_almacenado = value;
	}
	
	public void registro(String nombre, String apellidos, String cuenta, String pregunta, String respuesta, String enlace_imagen, double saldo, String dni, String password, String email) {
		//TODO: Implement Method
		Usuario_Registrado usuario = 	Usuario_RegistradoDAO.createUsuario_Registrado();
		usuario.setApellidos(apellidos);
		usuario.setNombre(nombre);
		usuario.setCuenta(cuenta);
		usuario.setPregunta(pregunta);
		usuario.setRespuesta(respuesta);
		usuario.setEnlace_imagen(enlace_imagen);
		usuario.setSaldo(saldo);
		usuario.setDni(dni);
		usuario.setPassword(password);
		usuario.setEmail(email);

		try {
			Usuario_RegistradoDAO.save(usuario);
			Usuario user = UsuarioDAO.getUsuarioByORMID(dni);
			user.setPassword(password);
			user.setEmail(email);
			UsuarioDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String VerSugerencia(String IDSugerencia) {
		//TODO: Implement Method
		Sugerencia sugerencia  = new Sugerencia();
		SugerenciaCriteria criterio;
		try {
			criterio = new SugerenciaCriteria();
			criterio.id_Sugerencia.eq(IDSugerencia);
			sugerencia = criterio.uniqueSugerencia();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sugerencia.getTexto();
	}
	
	public boolean verificar(String dni, String password) {
		//TODO: Implement Method
		Usuario_RegistradoCriteria usuario;
		try {
			usuario = new Usuario_RegistradoCriteria();
			usuario.password.eq(password);
			usuario.dni.eq(dni);
			if(usuario.listUsuario_Registrado().length==0)
				return false;
			else
				return true;
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
	
	public String solicitarPassword(String dni) {
		//TODO: Implement Method
		Usuario_RegistradoCriteria usuario;
		try {
			usuario = new Usuario_RegistradoCriteria();
			usuario.dni.eq(dni);
			Usuario user = usuario.uniqueUsuario_Registrado();
			if(usuario.listUsuario_Registrado().length==0)
				return "";
			else
				return user.getPassword();
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "";
	}
	
	public void registrarMovimiento(String dni, String idMovimiento, double cantidad, java.util.Date fecha) {
		//TODO: Implement Method
		System.out.println("Usuario "+ dni+ "cantidad "+ cantidad);
		Usuario_RegistradoCriteria usuario;
		try {
			//Consulto al usuario actual
			usuario = new Usuario_RegistradoCriteria();
			usuario.dni.eq(dni);
			Usuario_Registrado user = usuario.uniqueUsuario_Registrado();
			Movimiento mov = new Movimiento();
			//Establezco la información del movimiento
			mov.setCantidad((float)cantidad); 
			java.util.Date dia = new java.util.Date();
			String id = dia.getSeconds()+""+dia.getMinutes()+""+dia.getHours()+""+dia.getDay()+""+dia.getMonth()+""+dia.getYear();
			mov.setId_Movimiento(dni+id);
			mov.setEs_realizado(user);
			mov.setFecha(fecha);
			Time tiempo = new Time(fecha.getHours(), fecha.getMinutes(), fecha.getSeconds());
			mov.setHora(tiempo);
			//Almaceno el movimiento
			MovimientoDAO.save(mov);
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean recordar(String correo, String pregunta, String respuesta) {
		//TODO: Implement Method
		Usuario_RegistradoCriteria criterio;
		try {
			criterio = new Usuario_RegistradoCriteria();
			criterio.email.eq(correo);
			criterio.pregunta.eq(pregunta);
			criterio.respuesta.equals(respuesta);
			return criterio.listUsuario_Registrado().length == 1;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
	
	public void reactivar(String dni) {
		
		Usuario_RegistradoCriteria criterio;
		try {
			criterio = new Usuario_RegistradoCriteria();
			criterio.dni.eq(dni);
			Usuario_Registrado user = criterio.uniqueUsuario_Registrado();
			/**
			 * 
			 * 
			 * 
			 * 
			 * 
			 * CUAL DE LOS DOS ES????
			 * 
			 * */
			user.setDesactivado(false);
			user.setInactivo(false);
			Usuario_RegistradoDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	public double obtenerSaldo(String dni) {
		Usuario_RegistradoCriteria criterio;
		try {
			criterio = new Usuario_RegistradoCriteria();
			criterio.dni.eq(dni);
			Usuario_Registrado user = criterio.uniqueUsuario_Registrado();
			return user.getSaldo();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0.0;
	}
	
	public bbdd.Movimiento[] obtenerMovimientos(String dni) {
		//TODO: Implement Method
		Usuario_RegistradoCriteria criterio;
		try {
			criterio = new Usuario_RegistradoCriteria();
			criterio.dni.eq(dni);
			Usuario_Registrado user = criterio.uniqueUsuario_Registrado();
			return user.realiza_movimiento.toArray();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void modificarPerfil(String nombre, String apellidos, String cuenta, String pregunta, String respuesta, String enlace_imagen, double saldo, String dni, String password, String correo) {


		Usuario_RegistradoCriteria criterio;
		try {
			criterio = new Usuario_RegistradoCriteria();
			criterio.email.eq(cuenta);
			Usuario_Registrado user = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(dni);
			user.setApellidos(apellidos);
			user.setNombre(nombre);
			user.setPregunta(pregunta);
			user.setRespuesta(respuesta);
			user.setEnlace_imagen(enlace_imagen);
			user.setPassword(password);
			user.setEmail(correo);
			Usuario_RegistradoDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void marcarFavorito(String dni, String id_juego) {
		//TODO: Implement Method
		Usuario_Registrado user;
		try {
			
			user = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(dni);
			user.tiene_favoritos.add(JuegoDAO.loadJuegoByORMID(id_juego));
			Usuario_RegistradoDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public boolean login(String correo, String password) {
		//TODO: Implement Method
		try {
			Usuario_RegistradoCriteria criterio = new Usuario_RegistradoCriteria();
			criterio.email.eq(correo);
			criterio.password.eq(password);
			return criterio.listUsuario_Registrado().length == 1;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public bbdd.Sugerencia[] ListarSugerencias() {
		//TODO: Implement Method
		try {
			SugerenciaCriteria criterio = new SugerenciaCriteria();
			return criterio.listSugerencia();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public bbdd.Usuario_Registrado[] ListarRegistrados() {
		//TODO: Implement Method
		try {
			Usuario_RegistradoCriteria criterio = new Usuario_RegistradoCriteria();
			criterio.desactivado.eq(false);
			return criterio.listUsuario_Registrado();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}
	
	public void InhabilitarUsuario(String dni) {
		//TODO: Implement Method
		Usuario_Registrado user;
		try {
			user = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(dni);
			user.setInactivo(true);
			Usuario_RegistradoDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void gestionarBaja(String dni, java.util.Date fecha) {
		Usuario_RegistradoCriteria criterio;
		try {
			criterio = new Usuario_RegistradoCriteria();
			criterio.dni.eq(dni);
			Usuario_Registrado user = criterio.uniqueUsuario_Registrado();
			user.setDesactivado(true);
			Usuario_RegistradoDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void enviarSugerencia(String dni, String texto, java.util.Date fecha) {
		//TODO: Implement Method
		Usuario_RegistradoCriteria criterio;
		try {
			criterio = new Usuario_RegistradoCriteria();
			criterio.dni.eq(dni);
			Usuario_Registrado user = criterio.uniqueUsuario_Registrado();
			Sugerencia sugerencia = new Sugerencia();
			sugerencia.setFecha(fecha);
			//sugerencia.setEs_escrita_por(user);
			String id = fecha.getSeconds()+""+fecha.getMinutes()+""+fecha.getHours()+""+fecha.getDay()+""+fecha.getMonth()+""+fecha.getYear();
			Administrador_ admin = Administrador_DAO.getAdministrador_ByORMID("11223344E");
			sugerencia.setEs_atendida_por(admin);
			sugerencia.setId_Sugerencia(user.getDni()+id);
			sugerencia.setTexto(texto);
			user.escribe_sugerencia.add(sugerencia);
			Usuario_RegistradoDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void EliminarUsuario(String dni) {
		//TODO: Implement Method
		Usuario_RegistradoCriteria criterio;
		try {
			criterio = new Usuario_RegistradoCriteria();
			criterio.dni.eq(dni);
			Usuario_Registrado user = criterio.uniqueUsuario_Registrado();
			user.setDesactivado(true);
			Usuario_RegistradoDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//gestionarBaja(dni, new java.util.Date());
	};
	
	public void desmarcarFavorito(String dni, String id_juego) {

		Usuario_Registrado user;
		try {
			user = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(dni);
			user.tiene_favoritos.remove(JuegoDAO.loadJuegoByORMID(id_juego));
			Usuario_RegistradoDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void decrementarSaldo(String dni, double cantidad) {
		//TODO: Implement Method
		Usuario_Registrado user;
		try {
			user = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(dni);
			user.setSaldo(user.getSaldo()-cantidad);
			Usuario_RegistradoDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String[] ConsultarUsuario(String historico, float saldo) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void ConfigurarUsuario(int NumMaxUsuarios) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public bbdd.Juego[] cargarRanking(String dni) {
		//TODO: Implement Method
		Usuario_Registrado user;
		Juego[] juegosRanking = new Juego[3];
		try {
			ArrayList<Juego> juegos = new ArrayList<Juego>();
			user = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(dni);
			for(int i=0; i<3; i++){
				juegosRanking[i] = JuegoDAO.getJuegoByORMID(String.valueOf(i));
			}
	
			return juegosRanking;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public bbdd.Juego[] cargarFavoritos(String dni) {
		//TODO: Implement Method
		Usuario_Registrado user;
		try {
			user = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(dni);
			return user.tiene_favoritos.toArray();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void acumularSaldo(String dni, double cantidad) {
		//TODO: Implement Method
		Usuario_Registrado user;
		try {
			user = Usuario_RegistradoDAO.loadUsuario_RegistradoByORMID(dni);
			user.setSaldo(user.getSaldo()+cantidad);
			Usuario_RegistradoDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean existeUsuario(String dni, String email){

		try {
			//Consultamos el dni:
			Usuario_RegistradoCriteria criterio = new Usuario_RegistradoCriteria();
			criterio.dni.eq(dni);
			if(Usuario_RegistradoDAO.listUsuario_RegistradoByCriteria(criterio).length>0)
				return true;
			
			//Consultamos el email			
			criterio = new Usuario_RegistradoCriteria();
			criterio.email.eq(email);
			if(Usuario_RegistradoDAO.listUsuario_RegistradoByCriteria(criterio).length>0)
				return true;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean bloqueado(String dni){
		try {
			return Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(dni).getInactivo();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean desactivado(String dni){
		try {
			return Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(dni).getDesactivado();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public String dniUsuario(String correo) {
		try {
			Usuario_RegistradoCriteria criterio = new Usuario_RegistradoCriteria();
			criterio.email.eq(correo);
			return criterio.uniqueUsuario_Registrado().getDni();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Usuario_Registrado consultaUsuario(String dni) {
		try {
			System.out.println("Estoy buscando a "+ dni);
			return Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(dni);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void reactivarUsuario(String dni) {
		// TODO Auto-generated method stub
		try {
		Usuario_Registrado user = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(dni);
		user.setDesactivado(false);
		Usuario_RegistradoDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void modificarPerfil(String nombre, String apellidos, String cuenta,
			String pregunta, String respuesta, String enlace_imagen, double d,
			boolean bloqueado, String dni, String password, String email) {
		// TODO Auto-generated method stub
		Usuario_RegistradoCriteria criterio;
		try {
			criterio = new Usuario_RegistradoCriteria();
			criterio.email.eq(cuenta);
			Usuario_Registrado user = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(dni);
			user.setApellidos(apellidos);
			user.setNombre(nombre);
			user.setPregunta(pregunta);
			user.setRespuesta(respuesta);
			user.setEnlace_imagen(enlace_imagen);
			user.setPassword(password);
			user.setInactivo(bloqueado);
			user.setEmail(email);
			Usuario_RegistradoDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
