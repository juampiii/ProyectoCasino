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
import interfaces.IAdministrador;
import interfaces.IGestorDeJuegos;
import interfaces.IGestorDeUsuarios;
import interfaces.IUsuario_no_identificado;
import interfaces.IUsuario_registrado;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

import mds2.Usuario_registrado;

import org.orm.PersistentException;

import com.mysql.jdbc.EscapeTokenizer;


/**
 * ORM-Component Class
 */
public class BD_Principal extends UnicastRemoteObject implements IUsuario_registrado, IUsuario_no_identificado, IAdministrador, IGestorDeJuegos, IGestorDeUsuarios, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BD_Principal() throws RemoteException{
		
	}

	private bbdd.BD_Sugerencias_ gestiona = new BD_Sugerencias_();

	public bbdd.BD_Sugerencias_ getGestiona() {
		return this.gestiona;
	}

	public void setGestiona(bbdd.BD_Sugerencias_ value) {
		this.gestiona = value;
	}

	private bbdd.BD_Gestores_de_Juegos_ administra = new BD_Gestores_de_Juegos_();

	public bbdd.BD_Gestores_de_Juegos_ getAdministra() {
		return this.administra;
	}

	public void setAdministra(bbdd.BD_Gestores_de_Juegos_ value) {
		this.administra = value;
	}

	private bbdd.BD_Gestores_de_Usuarios_ gestiona_ = new BD_Gestores_de_Usuarios_();

	public bbdd.BD_Gestores_de_Usuarios_ getGestiona_() {
		return this.gestiona_;
	}

	public void setGestiona_(bbdd.BD_Gestores_de_Usuarios_ value) {
		this.gestiona_ = value;
	}

	private bbdd.BD_Movimientos contiene_ = new BD_Movimientos();

	public bbdd.BD_Movimientos getContiene_() {
		return this.contiene_;
	}

	public void setContiene_(bbdd.BD_Movimientos value) {
		this.contiene_ = value;
	}

	private bbdd.BD_Juegos contiene_elementos_de = new BD_Juegos();

	public bbdd.BD_Juegos getContiene_elementos_de() {
		return this.contiene_elementos_de;
	}

	public void setContiene_elementos_de(bbdd.BD_Juegos value) {
		this.contiene_elementos_de = value;
	}

	private bbdd.BD_juegos_publicos administra_elementos_de = new BD_juegos_publicos();

	public bbdd.BD_juegos_publicos getAdministra_elementos_de() {
		return this.administra_elementos_de;
	}

	public void setAdministra_elementos_de(bbdd.BD_juegos_publicos value) {
		this.administra_elementos_de = value;
	}

	private bbdd.BD_Usuarios_registrados almacena = new BD_Usuarios_registrados();

	public bbdd.BD_Usuarios_registrados getAlmacena() {
		return this.almacena;
	}

	public void setAlmacena(bbdd.BD_Usuarios_registrados value) {
		this.almacena = value;
	}

	private bbdd.BD_Configuraciones posee_ = new BD_Configuraciones();

	public bbdd.BD_Configuraciones getPosee_() {
		return this.posee_;
	}

	public void setPosee_(bbdd.BD_Configuraciones value) {
		this.posee_ = value;
	}

	private bbdd.BD_Usuarios_no_Identificados administra_ = new BD_Usuarios_no_Identificados();

	public bbdd.BD_Configuraciones getAdministra_() {
		return this.posee_;
	}

	public void setAdministra_(bbdd.BD_Configuraciones value) {
		this.posee_ = value;
	}

	public String VerSugerencia(int IDSugerencia) {
		// TODO: Implement Method
		return gestiona.VerSugerencia(IDSugerencia);
		//throw new UnsupportedOperationException();
	}

	public boolean verificar(String dni, String password) {
		// TODO: Implement Method
		return almacena.verificar(dni, password);
		//throw new UnsupportedOperationException();
	}

	public void registro(String nombre, String apellidos, String cuenta, String pregunta, String respuesta, String enlace_imagen, double saldo, String dni, String password, String email) {

		// TODO: Implement Method
		//throw new UnsupportedOperationException();
		almacena.registro(nombre, apellidos, cuenta,
				pregunta, respuesta, enlace_imagen,
				saldo, dni, password, email);
	}

	public void registrarFinPartida(String aIp, String juego, double horaInicio, double horaFin) {
		// TODO: Implement Method
		administra_.registrarFinPartida(aIp, juego, horaInicio, horaFin);
		//throw new UnsupportedOperationException();
	}

	public boolean recordar(String correo, String pregunta, String respuesta) {
		// TODO: Implement Method
		return almacena.recordar(correo, pregunta, respuesta);
		//throw new UnsupportedOperationException();
	}

	public double obtenerSaldo(String dni) {
		// TODO: Implement Method
		return almacena.obtenerSaldo(dni);
		//throw new UnsupportedOperationException();
	}
	
	public boolean desactivado(String dni) {
		// TODO: Implement Method
		return almacena.desactivado(dni);
		//throw new UnsupportedOperationException();
	}
	
	public boolean bloqueado(String dni) {
		// TODO: Implement Method
		return almacena.bloqueado(dni);
		//throw new UnsupportedOperationException();
	}
	
	public String dniUsuario(String correo) {
		// TODO: Implement Method
		return almacena.dniUsuario(correo);
		//throw new UnsupportedOperationException();
	}

	public String dniGestorJuegos(String correo) {
		// TODO: Implement Method
		return administra.dniGestorJuegos(correo);
		//throw new UnsupportedOperationException();
	}
	public String dniGestorUsuario(String correo) {
		// TODO: Implement Method
		return gestiona_.dniGestorUsuario(correo);
		//throw new UnsupportedOperationException();
	}
	
	/*public bbdd.Movimiento[] obtenerMovimientos(String dni) {
		// TODO: Implement Method
		return almacena.obtenerMovimientos(dni);
		//throw new UnsupportedOperationException();
	}*/
	
	@Override
	public Movimiento[] obtenerMovimientos(String aDni) throws RemoteException{
		// TODO Auto-generated method stub
		return almacena.obtenerMovimientos(aDni);
	}

	public void modificarPerfil(String nombre, String apellidos, String cuenta, String pregunta, String respuesta, String enlace_imagen, double saldo, String dni, String password, String correo) {
 
		// TODO: Implement Method
		almacena.modificarPerfil(nombre, apellidos, cuenta, pregunta, respuesta, enlace_imagen, saldo, dni, password, correo);
		// throw new UnsupportedOperationException();
	}

	public void marcarFavorito(String dni, String id_juego) {
		// TODO: Implement Method
		almacena.marcarFavorito(dni, id_juego);
	}

	public boolean login(String correo, String password) {
		// TODO: Implement Method
	return almacena.login(correo, password);
	}
	
	//he creado otro mas
	public boolean loginGestorJuego(String correo, String password) {
		// TODO: Implement Method
	return administra.loginGestorJuego(correo, password);
	}
	
	//he creado otro mas
		public boolean loginGestorUsuario(String correo, String password) {
			// TODO: Implement Method
		return gestiona_.loginGestorUsuario(correo, password);
		}

	public bbdd.Sugerencia[] ListarSugerencias() {
		// TODO: Implement Method
		return gestiona.ListarSugerencias();
	}

	public bbdd.Usuario_Registrado[] ListarRegistrados() {
		// TODO: Implement Method
		return almacena.ListarRegistrados();
	}

	public bbdd.Usuario_no_Identificado[] ListarNoIdentificado() {
		// TODO: Implement Method
		return administra_.ListarNoIdentificado();
	}

	public bbdd.Juego[] ListarJuegos() {
		// TODO: Implement Method
		return contiene_elementos_de.ListarJuegos();
	}

	public bbdd.Juego jugarJuego(String id_juego, String dni, double cantidad) {
		// TODO: Implement Method
		almacena.decrementarSaldo(dni, cantidad);
		almacena.registrarMovimiento(dni, "1", cantidad, new java.util.Date());
		return contiene_elementos_de.jugarJuego(id_juego, dni, cantidad);
	}

	public void inicializar(String ip) {
		// TODO: Implement Method
		administra_.inicializar(ip);
	}

	public void InhabilitarUsuario(String dni) {
		// TODO: Implement Method
		almacena.InhabilitarUsuario(dni);
	}

	public void InhabilitarJuego(String juego) {
		// TODO: Implement Method
		contiene_elementos_de.InhabilitarJuego(juego);
	}

	public void ingresarCantidad(String dni, double cantidad,
			java.util.Date fecha) {
		// TODO: Implement Method
		almacena.registrarMovimiento(dni, "1", cantidad, new java.util.Date());
		almacena.acumularSaldo(dni, cantidad); 
		//Esto se reemplazaría por		//la llamada al Gestor de pagos, para realizar el movimiento
		
		
		
	}

	public void gestionarBaja(String dni, java.util.Date fecha) {
		// TODO: Implement Method
		almacena.gestionarBaja(dni, fecha);
	}

	public void enviarSugerencia(String dni, String texto, java.util.Date fecha) {
		// TODO: Implement Method
		almacena.enviarSugerencia(dni, texto, fecha);
	}

	public void EliminarUsuario(String dni) {
		// TODO: Implement Method
		almacena.EliminarUsuario(dni);
	}

	public void EliminarJuego(String juego) {
		// TODO: Implement Method
		contiene_elementos_de.EliminarJuego(juego);
	}

	public void desmarcarFavorito(String dni, String id_juego) {
		// TODO: Implement Method
		almacena.desmarcarFavorito(dni, id_juego);
	}

	public void decrementarSaldo(String dni, double cantidad) {
		// TODO: Implement Method
		almacena.decrementarSaldo(dni, cantidad);
		cantidad = cantidad*-1.0;
		java.util.Date algo = new Date();
		almacena.registrarMovimiento(dni, "1", cantidad, algo );
	}

	public String[] ConsultarUsuario(String historico, float saldo) {
		// TODO: Implement Method
		return almacena.ConsultarUsuario(historico, saldo);
	}

	public Usuario_no_Identificado ConsultarNoIdentificado(String IP) {
		// TODO: Implement Method
		return administra_.ConsultarNoIdentificado(IP);
	}

	public void ConfigurarUsuarios(int NumMaxUsuarios) {
		// TODO: Implement Method
		posee_.ConfigurarUsuarios(NumMaxUsuarios);
	}

	public void ConfigurarJuegos(int NumMaxJuegos) {
		// TODO: Implement Method
		posee_.ConfigurarJuegos(NumMaxJuegos);
	}

	public double comprobarTiempo(String ip) {
		// TODO: Implement Method
		return 2.0;
	}

	public boolean comprobar(String ip) {
		// TODO: Implement Method
		return administra_.comprobar(ip);
	}

	public bbdd.Juego[] cargarRanking(String dni) {
		// TODO: Implement Method
		return almacena.cargarRanking(dni);
	}

	public bbdd.Juego[] cargarListado() {

		return contiene_elementos_de.cargarListado();
	}

	public bbdd.Juego_Publico[] cargarJuegosPublicos() {
		// TODO: Implement Method
		return administra_elementos_de.cargarJuegosPublicos();
	}

	public bbdd.Juego[] cargarFavoritos(String dni) {

		return almacena.cargarFavoritos(dni);
	}

	public void AniadirJuego(String id_juego, String nombre, String enlace_imagen, Double cantidad_minima,
			boolean desactivado, int num_minimo) {
		// TODO: Implement Method
		contiene_elementos_de.AniadirJuego(id_juego, nombre, enlace_imagen, cantidad_minima,
				desactivado, num_minimo);
	}

	public void acumularSaldo(String dni, double cantidad) {
		// TODO: Implement Method
		almacena.acumularSaldo(dni, cantidad);
		java.util.Date algo = new Date();
		almacena.registrarMovimiento(dni, "1", cantidad, algo );
		
	}

	public void ActualizarJuego(String id_juego, String nombre, String enlace_imagen, double cantidad_minima,
			boolean desactivado, int numero_minimo) {
		// TODO: Implement Method
		contiene_elementos_de.ActualizarJuego(id_juego, nombre, enlace_imagen,cantidad_minima, desactivado, numero_minimo);
	}
	
	public boolean existeUsuario(String dni, String email){
		return almacena.existeUsuario(dni, email);
	}

	public Usuario_Registrado consultarUsuario(String dni) {
		// TODO Auto-generated method stub
		return almacena.consultaUsuario(dni);
	}
	
	//agreego una funcion
	public Gestor_de_Juegos__ consultarGestor(String dni) {
		// TODO Auto-generated method stub
		return  administra.consultarGestor(dni);
	}

	

	public Juego_Publico consultaJuegoPublico(String idJuego) {
		// TODO Auto-generated method stub
		return administra_elementos_de.consultaJuegoPublico(idJuego);
	}

	public Usuario_no_Identificado consultarNoIdentificado(String IP) {
		return administra_.consultarNoIdentificado(IP);
		}



	@Override
	public void ActualizarJuego(String aNombre, String aJuego, String aImagen,
			boolean aVisible) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AniadirJuego(String aNombre, String aJuego, String aImagen,
			boolean aVisible) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	
	public void AniadirJuego(String id_juego, String nombre, String enlace_imagen,double cantidad_minima, boolean desactivado, int num_minimo) {
		contiene_elementos_de.AniadirJuego(id_juego, nombre, enlace_imagen,cantidad_minima, desactivado, num_minimo);

	}

	@Override
	public String dniGestorUsuario(Object aString_email) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reactivarUsuario(String dni) throws RemoteException {

		almacena.reactivarUsuario(dni);
		
	}

	@Override
	public void modificarPerfil(String nombre, String apellidos, String cuenta,
			String pregunta, String respuesta, String enlace_imagen, double d,
			boolean bloqueado, String dni, String password, String email)
			throws RemoteException {
		// TODO Auto-generated method stub
		
		almacena.modificarPerfil(nombre, apellidos, cuenta, pregunta, respuesta, enlace_imagen, d, bloqueado, dni, password, email);

	}










}
