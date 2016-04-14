package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import bbdd.Juego;

public interface IGestorDeJuegos extends Remote{

	public Juego[] ListarJuegos() throws RemoteException;

	public void EliminarJuego(String aJuego) throws RemoteException;

	public void InhabilitarJuego(String aJuego) throws RemoteException;

	public void ConfigurarJuegos(int aNumMaxJuegos) throws RemoteException;

	public void ActualizarJuego(String aNombre, String aJuego, String aImagen, boolean aVisible) throws RemoteException;

	public void AniadirJuego(String aNombre, String aJuego, String aImagen, boolean aVisible) throws RemoteException;

	public String dniGestorJuegos(String aCorreo) throws RemoteException;

	public void ActualizarJuego(String text, String text2, String text3,
			double parseDouble, boolean seleccionado, int numMax) throws RemoteException;

	public void AniadirJuego(String text, String text2, String text3,
			double parseDouble, boolean seleccionado, int parseInt)throws RemoteException;
}