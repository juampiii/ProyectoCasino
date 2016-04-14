package Casino;

import interfaces.IUsuario_no_identificado;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import bbdd.Usuario_no_Identificado;
import mds2.Partidas_Activas;
import mds2.Partidas_activas_ficticias;
import mds2.Registro;
import mds2.Usuario_no_identificado;
import mds2.Usuario_registrado;
import rmi.Client;
import rmi.Hello;

public class CasinoVirtual extends JFrame implements ICasino {

	protected static JPanel contentPane;
	static Registry registry;
	static CasinoVirtual frame;
	static ICasino stub;
    public static IJuego stub2;
    public static int port = 2500;


    
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new CasinoVirtual();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
		//SERVIDOR
		
 		try {
			registry = LocateRegistry.createRegistry(port);  
		    stub = (ICasino) UnicastRemoteObject.exportObject(frame, 0);
		    registry.rebind("Casino", stub);
		    
		    System.err.println("Casino listo");
		} catch (Exception e) {
		    System.err.println("Server exception: " + e.toString());
		    e.printStackTrace();
		}
 		
 		// SERVIDOR
 		
 		
		
	}

	/**
	 * Create the frame.
	 */
	public CasinoVirtual() {
	}
	
	 

	@Override
	public void acabado(String algo, String ip) throws RemoteException {
		String direccion = ip;
		//System.out.println("Petición de abandono de "+ ip+ " del juego "+ algo+ " saldo: "+ stub2.darSaldo());
		if(Usuario_no_identificado.dniS.get(ip) == null){
			java.util.Date fecha = new java.util.Date();
			Double horaFin = fecha.getHours()+(fecha.getMinutes()*0.01);
			Double horaInicio = Usuario_no_identificado.partidas.remove(algo);
			String juego = Usuario_no_identificado.juegosActivos.remove(algo);
			try {
				Usuario_no_identificado.usuarioNoRegistrado.registrarFinPartida(Usuario_no_identificado.direccionIP, juego, horaInicio, horaFin);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Quitamos de nuestro Hash tanto el juego, como la apuesta
			Usuario_no_identificado.apuestas.remove(algo);
			Usuario_no_identificado.juegosActivos.remove(algo);
			Usuario_no_identificado
			.cambiaCentro((new Partidas_activas_ficticias()).central);
			int opcion = JOptionPane.showConfirmDialog(this, "Regístrate para ganar dinero real!", "Abandonar partida ficticia", JOptionPane.OK_OPTION);
			if(opcion != 1){
				Registro registro = new Registro();
				registro.setModal(true);
				registro.setVisible(true);

			}
		}
		else{
			//Usuario_registrado.
			Usuario_registrado.apuestas.remove(algo);
			Usuario_registrado.juegosActivos.remove(algo);
			
			int i = JOptionPane.showOptionDialog(this, 
			        "Como quieres cobrar las ganancias?", 
			        "Abandonar partida", 
			        JOptionPane.OK_CANCEL_OPTION, 
			        JOptionPane.INFORMATION_MESSAGE, 
			        null, 
			        new String[]{"Cuenta", "Saldo"}, // this is the array
			        "default");
			/**Si elige saldo, lo actualizamos:*/
			if(i>0)
				try {
					Usuario_registrado.bbdd.acumularSaldo(Usuario_no_identificado.dniS.get(ip), stub2.darSaldo());
					Usuario_registrado.usuario = Usuario_registrado.bbdd.consultarUsuario(Usuario_no_identificado.dniS.get(ip));
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else{
				Usuario_registrado.bbdd.ingresarCantidad(Usuario_no_identificado.dniS.get(ip), stub2.darSaldo(), new java.util.Date());
				Usuario_registrado.usuario = Usuario_registrado.bbdd.consultarUsuario(Usuario_no_identificado.dniS.get(ip));

				
			}
			//Actualizamos el panel
			/*Usuario_registrado
			.cambiaCentro((new Partidas_Activas()).central);*/
		;
		}
			
		
		
	}
	

}
