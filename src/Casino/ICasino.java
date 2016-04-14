package Casino;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICasino extends Remote{
	public void acabado(String nombre, String ip) throws RemoteException;
	 
}
