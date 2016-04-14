package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

import bbdd.Juego;
import bbdd.Movimiento;
import bbdd.Usuario_Registrado;

public interface IUsuario_registrado extends Remote {

	public void acumularSaldo(String aDni, double aCantidad) throws RemoteException;

	public void ingresarCantidad(String aDni, double aCantidad, Date aFecha) throws RemoteException;

	public void decrementarSaldo(String aDni, double aCantidad) throws RemoteException;

	public Juego[] cargarFavoritos(String aDni) throws RemoteException;

	public Juego[] cargarRanking(String aDni) throws RemoteException;

	public Juego[] cargarListado() throws RemoteException;

	public Movimiento[] obtenerMovimientos(String aDni) throws RemoteException;

	public double obtenerSaldo(String aDni) throws RemoteException;

	public void marcarFavorito(String aDni, String aId_juego) throws RemoteException;

	public void desmarcarFavorito(String aDni, String aId_juego) throws RemoteException;

	public void modificarPerfil(String aNombre, String aApellidos, String aCuenta, String aPregunta, String aRespuesta, String aEnlace_imagen, double aSaldo, String aDni, String aPassword, String aEmail) throws RemoteException;

	public void enviarSugerencia(String aDni, String aTexto, Date aFecha) throws RemoteException;

	public void gestionarBaja(String aDni, Date aFecha) throws RemoteException;

	public Juego jugarJuego(String aId_juego, String aDni, double aCantidad) throws RemoteException;

	public Usuario_Registrado consultarUsuario(String aDni) throws RemoteException;

	public String dniUsuario(String aCorreo) throws RemoteException;
}