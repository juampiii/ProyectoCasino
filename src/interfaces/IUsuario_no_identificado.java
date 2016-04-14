package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import bbdd.Gestor_de_Juegos__;
import bbdd.Juego_Publico;
import bbdd.Partida_Publica;
import bbdd.Usuario_Registrado;
import bbdd.Usuario_no_Identificado;

public interface IUsuario_no_identificado extends Remote {

	public Juego_Publico[] cargarJuegosPublicos() throws RemoteException;

	public boolean login(String aCorreo, String aPassword) throws RemoteException;

	public void registro(String aNombre, String aApellidos, String aCuenta, String aPregunta, String aRespuesta, String aEnlace_imagen, double aSaldo, String aDni, String aPassword, String aEmail) throws RemoteException;

	public boolean recordar(String aCorreo, String aPregunta, String aRespuesta) throws RemoteException;

	public boolean verificar(String aDni, String aPassword) throws RemoteException;

	public void registrarFinPartida(String aIp, String juego, double horaInicio, double horaFin) throws RemoteException;

	public void inicializar(String aIp) throws RemoteException;

	public boolean comprobar(String aIp) throws RemoteException;

	public double comprobarTiempo(String aIp) throws RemoteException;

	public boolean bloqueado(String aDni) throws RemoteException;

	public Juego_Publico consultaJuegoPublico(String aIdJuego) throws RemoteException;

	public Gestor_de_Juegos__ consultarGestor(String aDni) throws RemoteException;

	public boolean desactivado(String aDni) throws RemoteException;

	public boolean existeUsuario(String aDni, String aEmail) throws RemoteException;

	public Usuario_no_Identificado consultarNoIdentificado(String aIp) throws RemoteException;

	public String dniUsuario(String aEmail) throws RemoteException;

	public String dniGestorJuegos(String aEmail) throws RemoteException;

	public String dniGestorUsuario(Object aString_email) throws RemoteException;

	public boolean loginGestorJuego(String aCorreo, String aPassword) throws RemoteException;

	public boolean loginGestorUsuario(String aCorreo, String aPassword) throws RemoteException;

	public void reactivarUsuario(String dni) throws RemoteException ;

	public Usuario_Registrado consultarUsuario(String nie)throws RemoteException ;
}