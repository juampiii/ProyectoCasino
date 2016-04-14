package mds2;

import interfaces.IUsuario_no_identificado;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import rmi.Client;
import Casino.CasinoVirtual;
import Casino.ICasino;
import Casino.IJuego;
import bbdd.Usuario_no_Identificado;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.Color;

public class Usuario_no_identificado extends JFrame implements ICasino {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8065692923147000763L;
	/**
	 * 
	 */
	/* Zona de declaración e inicialización de elementos */
	protected static JPanel contenedor = new JPanel();
	protected JPanel centro = new JPanel();
	protected JPanel menu_registrado = new JPanel();
	// public JPanel central = new JPanel();
	protected JPanel cabecera = new JPanel();
	protected JButton btnRegistrarse = new JButton("");
	protected JButton btnPartidas = new JButton("");
	protected JButton btnJuegos = new JButton("");
	protected JLabel lblUsuario = new JLabel("Usuario:");
	protected JLabel lblPassword = new JLabel("Contrase\u00F1a:");
	protected JLabel lblRecordar = new JLabel(
			"\u00BFHas olvidado la contrase\u00F1a?");
	protected JTextField textFieldUsuario = new JTextField("alguno@example.es");
	protected JPasswordField textFieldPassword = new JPasswordField("");
	protected JButton btnEntrar = new JButton("");
	protected JButton buttonRecordar = new JButton("");
	protected JLabel lblTiempoRestante = new JLabel(
			"Tiempo restante: 5:30 horas");
	public static String dni = null;
	public static String direccionIP = "127.0.0.1";
	//relaciona el nombre de un juego, con su id
	public static HashMap<String,String> juegosActivos = new HashMap<String,String>();
	//Recoge para cada juego, el dinero apostado
	public static HashMap<String,Double> apuestas = new HashMap<String,Double>();
	//recoge la hora de inicio, según nuestra forma de almacenarla
	public static HashMap<String, Double> partidas = new HashMap<String, Double>();
	//HashMap con todos los usuarios registrados -> IP - dni
	public static HashMap<String,String> dniS = new HashMap<String,String>();
	//De la base de datos tendré sólo la conexión, y mi usuario actual
	//protected static BD_Principal bbdd = new BD_Principal();
	public static IUsuario_no_identificado usuarioNoRegistrado ;
	public static Usuario_no_Identificado usuario;
    Client cliente;
    //
	public static Usuario_no_identificado frame;
	static Registry registry;
	static CasinoVirtual frame2;
	static ICasino stub;
    public static IJuego stub2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Usuario_no_identificado();
					frame.setBackground(Color.DARK_GRAY);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
		//SERVIDOR
		
 		try {
			registry = LocateRegistry.createRegistry(2500);  
			
			frame2 = new CasinoVirtual();
		    stub = (ICasino) UnicastRemoteObject.exportObject(frame2, 0);
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
	public Usuario_no_identificado() {

		inicializar();

		setTitle("Casino - Usuario no identificado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		contenedor.setBackground(Color.DARK_GRAY);
		setContentPane(contenedor);
		contenedor.setLayout(null);
		centro.setForeground(Color.DARK_GRAY);
		centro = (new Bienvenido()).central;
		
		

		textFieldUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		/* Menú de usuario registrado */
		cabecera.setBackground(Color.DARK_GRAY);
		contenedor.add(centro, 0);
		menu_registrado.setBounds(10, 150, 127, 454);
		menu_registrado.setBackground(Color.DARK_GRAY);
		menu_registrado.setLayout(null);
		contenedor.add(menu_registrado, 1);
		/*centro*/

		
		/* Botones */

		btnJuegos.setIcon(new ImageIcon(Usuario_no_identificado.class
				.getResource("/mds2/img/juegos.png")));
		btnJuegos.setBounds(0, 0, 127, 121);
		menu_registrado.add(btnJuegos);
		btnJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				juegos();
			}
		});

		btnPartidas.setIcon(new ImageIcon(Usuario_no_identificado.class
				.getResource("/mds2/img/partidas.png")));
		btnPartidas.setBounds(0, 120, 127, 111);
		menu_registrado.add(btnPartidas);
		btnPartidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				partidas();
			}
		});

		btnRegistrarse.setIcon(new ImageIcon(Usuario_no_identificado.class
				.getResource("/mds2/img/registrarse.png")));
		btnRegistrarse.setBounds(0, 232, 127, 111);
		menu_registrado.add(btnRegistrarse);
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrarse();
			}
		});

		/* Cabecera */
		cabecera.setBackground(Color.DARK_GRAY);
		cabecera.setBounds(10, 11, 764, 80);
		contenedor.add(cabecera, 2);
		cabecera.setLayout(null);
		lblUsuario.setForeground(Color.WHITE);

		lblUsuario.setFont(new Font("Segoe UI Light", Font.BOLD, 15));

		lblUsuario.setBounds(10, 11, 78, 23);
		cabecera.add(lblUsuario);
		lblPassword.setForeground(Color.WHITE);

		lblPassword.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblPassword.setBounds(175, 11, 89, 23);
		cabecera.add(lblPassword);
		lblRecordar.setForeground(Color.WHITE);

		lblRecordar.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblRecordar.setBounds(10, 45, 225, 23);
		cabecera.add(lblRecordar);
		textFieldUsuario.setBackground(Color.LIGHT_GRAY);
		textFieldUsuario.setForeground(Color.WHITE);
		textFieldUsuario.setFont(new Font("Segoe UI Light", Font.BOLD, 14));

		textFieldUsuario.setBounds(72, 11, 93, 24);
		cabecera.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		textFieldPassword.setBackground(Color.LIGHT_GRAY);
		textFieldPassword.setForeground(Color.WHITE);
		textFieldPassword.setFont(new Font("Segoe UI Light", Font.BOLD, 14));

		textFieldPassword.setBounds(274, 11, 93, 24);
		cabecera.add(textFieldPassword);
		textFieldPassword.setColumns(10);
		btnEntrar.setIcon(new ImageIcon(Usuario_no_identificado.class
				.getResource("/mds2/img/entrar.png")));

		btnEntrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				entrarB();
			}
		});
		btnEntrar.setBounds(397, 11, 89, 23);
		cabecera.add(btnEntrar);

		buttonRecordar.setIcon(new ImageIcon(Usuario_no_identificado.class
				.getResource("/mds2/img/recordar.png")));
		buttonRecordar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				recordar();
			}
		});

		buttonRecordar.setBounds(245, 45, 89, 23);
		cabecera.add(buttonRecordar);
		lblTiempoRestante.setForeground(Color.WHITE);

		lblTiempoRestante.setBounds(548, 28, 206, 41);
		lblTiempoRestante.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		cabecera.add(lblTiempoRestante);


	}

	private void inicializar() {
		
		direccionIP= consultarIP();
		cliente= new Client();
		usuarioNoRegistrado = cliente.getStubUNR();
		//usuarioRegistrado = cliente.getStubUR();
		//Vamos a consultar el usuario:
		try {
			usuario = usuarioNoRegistrado.consultarNoIdentificado(direccionIP);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//En caso de que no esté registrada la ip, vamos a crear un usuario nuevo
		if(usuario==null){
			try {
				usuarioNoRegistrado.inicializar(direccionIP);
				usuario = usuarioNoRegistrado.consultarNoIdentificado(direccionIP);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else{
			double tiempo = usuario.getTiempo();
			if(tiempo <=0){
				lblTiempoRestante = new JLabel(
						"Tiempo restante: 0:00 hs");
			JOptionPane.showMessageDialog(this,
					"Has agotado el tiempo de prueba. Registrate y que la suerte te acompañe!",
					"Tiempo agotado", JOptionPane.DEFAULT_OPTION);
			}
			else{
			lblTiempoRestante = new JLabel(
					"Tiempo restante: "+tiempo+"0 hs");
			}
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
		return null;
		
		//Usuario para prueba de que no queda tiempo:
		//return "192.168.1.4";
		
	}
	protected void recordar() {
		// TODO Auto-generated method stub
		Recordar_contrasenia recordar = new Recordar_contrasenia();
		recordar.setModal(true);
		recordar.setVisible(true);
	}

	protected void entrarB() {
		// función de login con todas las variantes existentes
		String email = textFieldUsuario.getText();
		String password = textFieldPassword.getText();
		// Es un usuario registrado
		try {
			if (usuarioNoRegistrado.login(email, password)) {
				dni = usuarioNoRegistrado.dniUsuario(email);
				System.out.println(dni);

				// Si está desactivado -> reactivar perfil
				if (usuarioNoRegistrado.desactivado(dni)) {
					Reactivar_Perfil perfil = new Reactivar_Perfil();
					perfil.setModal(true);
					perfil.setVisible(true);
				} else {
					// Comprobamos que no esté bloqueado
					if (usuarioNoRegistrado.bloqueado(dni)) {
						// Si está bloqueado, damos el mensaje de error:
						JOptionPane
								.showMessageDialog(
										this,
										"El perfíl ha sido bloqueado por un mal uso. Contacta con administración",
										"Usuario bloqueado",
										JOptionPane.ERROR_MESSAGE);
					} else {
						// El usuario es correcto
						// Caso correcto usuario registrado, creamos la ventana
						System.out.println("Caso correcto");
						dniS.put(Usuario_registrado.consultarIP(), usuarioNoRegistrado.dniUsuario(email));
						Usuario_registrado ur = new Usuario_registrado();
					 
						
						System.out.println("He metido "+  "dni "+usuarioNoRegistrado.dniUsuario(email));
						this.setVisible(false);
						ur.setVisible(true);
					}
				}

			}
			else{
				
				if (usuarioNoRegistrado.loginGestorJuego(email, password)) {
					System.out.println("Existo Gestor de Juegos");
					dni = usuarioNoRegistrado.dniGestorJuegos(email);
					System.out.println(dni);
					
					Gestor_de_juegos gdj = new Gestor_de_juegos();
					this.setVisible(false);
					gdj.setVisible(true);
				}
				
				if (usuarioNoRegistrado.loginGestorUsuario(email, password)) {
					System.out.println("Existo Gestor de Usuario");
					dni = usuarioNoRegistrado.dniGestorUsuario(email);
					System.out.println(dni);
					
					Gestor_de_usuarios gdu = new Gestor_de_usuarios();
					this.setVisible(false);
					gdu.setVisible(true);
				}
				else {
					JOptionPane
					.showMessageDialog(
							this,
							"Hay un problema con tu usuario/contraseña.",
							"Usuario incorrecto",
							JOptionPane.ERROR_MESSAGE);
					System.out.println("usuario o contrase–a incorrecta");
					
				}
			}
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void partidas() {

		Partidas_activas_ficticias partidas = new Partidas_activas_ficticias();
		contenedor.getComponent(0).hide();
		contenedor.add(partidas.central, 0);
		setTitle("Partidas Activas Ficticias");
		repaint();

	}

	/* Zona de métodos: */

	protected void registrarse() {
		Registro registro = new Registro();
		registro.setModal(true);
		registro.setVisible(true);

	}

	protected void juegos() {

		Juegos_publicos juegos = new Juegos_publicos();
		contenedor.getComponent(0).hide();
		contenedor.add(juegos.central, 0);
		setTitle("Juegos públicos");
		repaint();

	}
	
	public static void cambiaCentro(JPanel panel) {
		
		contenedor.getComponent(0).hide();
		contenedor.add(panel, 0);
		
		
	}

	
	public static void cargarJuego(String nombreJuego){
		String idJuego = juegosActivos.get(nombreJuego);
		int apuesta = (int)Math.floor(Usuario_no_identificado.apuestas.get(nombreJuego));
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
				    stub2 = (IJuego) registry.lookup("Escoba");
				    CasinoVirtual.stub2.ponerSaldo(apuesta, consultarIP());
				    
				} catch (Exception e1) {
				    System.err.println("Client exception: " + e1.toString());
				    e1.printStackTrace();
				}
			}break;
		
		case "GBoard":{
				try {
				    registry = LocateRegistry.getRegistry(2500);
				    stub2 = (IJuego) registry.lookup("GBoard");
				    CasinoVirtual.stub2.ponerSaldo(apuesta, consultarIP());
				    
				} catch (Exception e1) {
				    System.err.println("Client exception: " + e1.toString());
				    e1.printStackTrace();
				}
			}break;

		
		case "Mastermind":{
				try {
				    registry = LocateRegistry.getRegistry(2500);
				    stub2 = (IJuego) registry.lookup("Mastermind");
				    CasinoVirtual.stub2.ponerSaldo(apuesta, consultarIP());
				    
				} catch (Exception e1) {
				    System.err.println("Client exception: " + e1.toString());
				    e1.printStackTrace();
				}
			}break;

		
		case "Parejas_Simpsons":{
				try {
				    registry = LocateRegistry.getRegistry(2500);
				    stub2 = (IJuego) registry.lookup("Parejas");
				    CasinoVirtual.stub2.ponerSaldo(apuesta, consultarIP());
				    
				} catch (Exception e1) {
				    System.err.println("Client exception: " + e1.toString());
				    e1.printStackTrace();
				}
			}break;
		  }
	}
	
	@Override
	public void acabado(String algo, String ip) throws RemoteException {
		String direccion = ip;
		//ABANDONAR PARTIDA FICTICIA
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
			//ABANDONAR_PARTIDA
		}
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
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else{
				Usuario_registrado.bbdd.ingresarCantidad(Usuario_no_identificado.dniS.get(ip), stub2.darSaldo(), new java.util.Date());
			}
			//Actualizamos el panel
			/*Usuario_registrado
			.cambiaCentro((new Partidas_Activas()).central);*/
		;
		}	

}
