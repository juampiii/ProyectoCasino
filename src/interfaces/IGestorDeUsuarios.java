package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import bbdd.Movimiento;
import bbdd.Sugerencia;
import bbdd.Usuario_Registrado;
import bbdd.Usuario_no_Identificado;

public interface IGestorDeUsuarios extends Remote {

	public Usuario_Registrado[] ListarRegistrados() throws RemoteException;
	
	//public Usuario_Registrado[] modificarPerfil(String nombre, String apellidos, String cuenta, String pregunta, String respuesta, String enlace_imagen, double saldo, String dni, String password, String correo) throws RemoteException;

	public void EliminarUsuario(String aDni) throws RemoteException;

	public String[] ConsultarUsuario(String aHistorico, float aSaldo) throws RemoteException;

	public void InhabilitarUsuario(String aDni) throws RemoteException;

	public void ConfigurarUsuarios(int aNumMaxUsuarios) throws RemoteException;

	public Sugerencia[] ListarSugerencias() throws RemoteException;

	public String VerSugerencia(int aIDSugerencia) throws RemoteException;

	public Usuario_no_Identificado[] ListarNoIdentificado() throws RemoteException;

	public Usuario_no_Identificado ConsultarNoIdentificado(String aIP) throws RemoteException;

	public String dniGestorUsuario(String aCorreo) throws RemoteException;
	
	public Movimiento[] obtenerMovimientos(String dni) throws RemoteException;

	public void modificarPerfil(String nombre,
			String apellidos, String cuenta, String pregunta, String respuesta,
			String enlace_imagen, double d,boolean bloqueado, String dni, String password,
			String email) throws RemoteException;
}