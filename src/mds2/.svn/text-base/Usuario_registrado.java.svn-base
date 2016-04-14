package mds2;

import interfaces.IUsuario_registrado;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

import java.awt.SystemColor;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollBar;

import org.orm.PersistentException;

import rmi.Client;
import edu.emory.mathcs.backport.java.util.TreeMap;
import Casino.IJuego;
import Casino.CasinoVirtual;
import bbdd.BD_Principal;
import bbdd.Partida_Publica;
import bbdd.Partida_registrado;
import bbdd.Usuario_Registrado;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class Usuario_registrado extends JFrame {

	/*Zona de declaración e inicialización de elementos*/
	protected static  JPanel contenedor = new JPanel();
	protected  JPanel centro = new JPanel();
	protected  JPanel menu_registrado = new JPanel();
	//public JPanel central = new JPanel();
	protected  JPanel cabecera = new JPanel();
	protected  JButton btnChat = new JButton("");
	protected  JButton btnSaldo = new JButton("");
	protected  JButton btnPartidas = new JButton("");
	protected  JButton btnJuegos = new JButton("");
	protected  JButton btnCerrarSesion = new JButton("Cerrar Sesi\u00F3n");
	protected  JLabel lblSaldoe = new JLabel("Saldo: 300,30e");
	public static JLabel lblImagen = new JLabel("imagen");
	protected  JLabel lblNombre = new JLabel("Juampi - 16/01/2014");
	protected  JButton btnPerfil = new JButton("Perfil");
	
	//public static String dni = Usuario_no_identificado.dni;
	public static Usuario_Registrado usuario;
	//Gestión de las partidas activas
	public static HashMap<String,String> juegosActivos = new HashMap<String,String>(); //nombre-id juegos
	public static HashMap<String,Double> apuestas = new HashMap<String,Double>(); //nombre - cantidad apostada
	public static  IUsuario_registrado bbdd ;
	public static Usuario_no_identificado frame;
	static Registry registry;
	//static ICasino stub;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario_registrado frame = new Usuario_registrado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


		});
	}
	
	/**
	 * Create the frame.
	 */
	public Usuario_registrado() {
		cargarUsuario();
		
		setTitle("Usuario registrado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600); 
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedor);
		contenedor.setLayout(null);
		
		/*Menú de usuario registrado*/
		centro.setBackground(Color.DARK_GRAY);
		centro = (new BienvenidoReg()).central;
		contenedor.add(centro, 0);
		contenedor.setBackground(Color.DARK_GRAY);
		menu_registrado.setBackground(Color.DARK_GRAY);
		menu_registrado.setBounds(10, 97, 127, 454);
		contenedor.add(menu_registrado, 1);
		menu_registrado.setLayout(null);
		
		/*Botones*/

		btnJuegos.setIcon(new ImageIcon(Usuario_registrado.class.getResource("/mds2/img/juegos.png")));
		btnJuegos.setBounds(0, 0, 127, 121);
		menu_registrado.add(btnJuegos);
		btnJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				juegos();
			}
		});



		btnPartidas.setIcon(new ImageIcon(Usuario_registrado.class.getResource("/mds2/img/partidas.png")));
		btnPartidas.setBounds(0, 120, 127, 111);
		menu_registrado.add(btnPartidas);
		btnPartidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				partidas();
			}
		});
		

		btnSaldo.setIcon(new ImageIcon(Usuario_registrado.class.getResource("/mds2/img/saldo.png")));
		btnSaldo.setBounds(0, 232, 127, 111);
		menu_registrado.add(btnSaldo);
		btnSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saldo();
			}
		});
		
		btnChat.setIcon(new ImageIcon(Usuario_registrado.class.getResource("/mds2/img/chat.png")));
		btnChat.setBounds(0, 343, 127, 111);
		menu_registrado.add(btnChat);
		btnChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chat();
			}
		});
		

		
		/*Cabecera*/
		cabecera.setBounds(10, 11, 764, 80);
		cabecera.setBackground(Color.DARK_GRAY);
		contenedor.add(cabecera, 2);
		cabecera.setLayout(null);
		
		//lblImagen.setIcon(new ImageIcon(Usuario_registrado.class.getResource("/mds2/img/icono.png")));
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen.setBounds(0, 0, 80, 80);
		cabecera.add(lblImagen);
		
		//lblNombre = new JLabel(usuario.getNombre() +" "+ (new Date()).getDate());
		lblNombre.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblNombre.setForeground(Color.WHITE);
		lblSaldoe.setForeground(Color.WHITE);
		lblNombre.setBounds(101, 33, 330, 21);
		cabecera.add(lblNombre);
		
		btnPerfil.setIcon(new ImageIcon(Usuario_registrado.class.getResource("/mds2/img/profile.png")));
		btnPerfil.setBounds(550, 0, 100, 80);
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				perfil();
			}
		});
		cabecera.add(btnPerfil);
		
		btnCerrarSesion.setIcon(new ImageIcon(Usuario_registrado.class.getResource("/mds2/img/exit.png")));
		btnCerrarSesion.setBounds(660, 0, 100, 80);
		btnCerrarSesion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				cerrarSesion();
			}
		});
		cabecera.add(btnCerrarSesion);
		
		//cargarUsuario();
	}
	
	
	/*Zona de métodos:*/
	
	protected void saldo() {
		Gestionar_saldo saldo = new Gestionar_saldo();
		contenedor.getComponent(0).hide();
		contenedor.add(saldo.central, 0);
		setTitle("Saldo");

		repaint();

		
	}
	
	protected void partidas() {

		Partidas_Activas partidas = new Partidas_Activas();
		contenedor.getComponent(0).hide();
		contenedor.add(partidas.central, 0);
		setTitle("Partidas");
		repaint();
		
	}

	protected void chat() {
		Chat.publico chat = new Chat.publico();
		
		//publico p=new publico();
		chat.crear();
		try {
			chat.conexion();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chat.setSize(303,430);
		chat.setLocation(250,90);
		//chat.setModal(true);
		chat.setVisible(true);
		/*Chat_registrado chat = new Chat_registrado();
		contenedor.getComponent(0).hide();
		contenedor.add(chat.central, 0);
		setTitle("Chat registrado");
		repaint();*/
		
	}

	protected void perfil() {

		Gestionar_perfil perfil = new Gestionar_perfil();
		contenedor.getComponent(0).hide();
		contenedor.add(perfil.central, 0);
		setTitle("Gestionar perfil");
		repaint();
		
	}



	protected void juegos() {
		

		Juegos juegos = new Juegos();
		contenedor.getComponent(0).hide();
		contenedor.add(juegos.central, 0);
		setTitle("Juegos");
		repaint();
		
	}
	
	public static void cambiaCentro(JPanel panel) {
			
	
			
			contenedor.getComponent(0).hide();
			contenedor.add(panel, 0);
			
			
		}

	
	private void cerrarSesion() {
		// TODO Auto-generated method stub

		this.hide();
		Usuario_no_identificado unr = new Usuario_no_identificado();
		Usuario_no_identificado.dniS.remove(consultarIP());
		unr.setVisible(true);
	}
	
	public void cargarUsuario() {
		// TODO Auto-generated method stub
		Client cliente = new Client();
		bbdd = cliente.getStubUR();
		System.out.println("Voy a consultar: "+consultarIP());
		String dni = Usuario_no_identificado.dniS.get(consultarIP());
		
		System.out.println("Vamos a buscar a "+dni);
		usuario = null;
		try {
			usuario = bbdd.consultarUsuario(dni);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//lblImagen.setIcon(new ImageIcon(Usuario_registrado.class.getResource(usuario.getEnlace_imagen())));
		Calendar c = new GregorianCalendar();
		String dia = Integer.toString(c.get(Calendar.DATE));
		dia += "/"+Integer.toString(c.get(Calendar.MONTH));
		dia += "/"+Integer.toString(c.get(Calendar.YEAR));
		lblNombre = new JLabel(usuario.getNombre() +" - "+ dia +" - "+"Online");
		System.out.println(usuario.getEnlace_imagen());
		lblImagen = new JLabel();
		
			
		lblImagen.setIcon(new ImageIcon(Usuario_registrado.class.getResource(usuario.getEnlace_imagen())));
		repaint();

	}
	
	public static void cargarJuego(String nombreJuego){
		String idJuego = juegosActivos.get(nombreJuego);
		int apuesta = (int)Math.floor(apuestas.get(nombreJuego));
		switch (nombreJuego) {
		case "Craps":{
				try {
				    registry = LocateRegistry.getRegistry(2500);
				    CasinoVirtual.stub2 = (IJuego) registry.lookup("Crasp");
				    CasinoVirtual.stub2.ponerSaldo(apuesta, consultarIP());
				    
				} catch (Exception e1) {
				    System.err.println("Client exception: " + e1.toString());
				    e1.printStackTrace();
				}
		} break;
				
	
		
		case "Escoba":{
				try {
				    registry = LocateRegistry.getRegistry(2500);
				    CasinoVirtual.stub2 = (IJuego) registry.lookup("Escoba");
				    CasinoVirtual.stub2.ponerSaldo(apuesta, consultarIP());
				    
				} catch (Exception e1) {
				    System.err.println("Client exception: " + e1.toString());
				    e1.printStackTrace();
				}
			}break;
		
		case "GBoard":{
				try {
				    registry = LocateRegistry.getRegistry(2500);
				    CasinoVirtual.stub2 = (IJuego) registry.lookup("GBoard");
				    CasinoVirtual.stub2.ponerSaldo(apuesta, consultarIP());
				    
				} catch (Exception e1) {
				    System.err.println("Client exception: " + e1.toString());
				    e1.printStackTrace();
				}
			}break;

		
		case "Mastermind":{
				try {
				    registry = LocateRegistry.getRegistry(2500);
				    CasinoVirtual.stub2 = (IJuego) registry.lookup("Mastermind");
				    CasinoVirtual.stub2.ponerSaldo(apuesta, consultarIP());
				    
				} catch (Exception e1) {
				    System.err.println("Client exception: " + e1.toString());
				    e1.printStackTrace();
				}
			}break;

		
		case "Parejas_Simpsons":{
				try {
				    registry = LocateRegistry.getRegistry(2500);
				    CasinoVirtual.stub2 = (IJuego) registry.lookup("Parejas");
				    CasinoVirtual.stub2.ponerSaldo(apuesta, consultarIP());
				    
				} catch (Exception e1) {
				    System.err.println("Client exception: " + e1.toString());
				    e1.printStackTrace();
				}
			}break;
		  }
	}
public static String consultarIP() {
		
		try {
			 URL url = new URL("http://icanhazip.com/");
		       BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		       String ipAddress = new String();
		       ipAddress = (in.readLine()).trim();
		       return ipAddress;
		       //System.out.println("IP Address is : " + ipAddress);


		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return "182.123.123.123";
	//return "217.217.71.158";
		
	}

}
