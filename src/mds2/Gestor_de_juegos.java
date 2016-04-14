package mds2;

import interfaces.IGestorDeJuegos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import rmi.Client;

public class Gestor_de_juegos extends JFrame {

	public JPanel contenedor = new JPanel();
	public JPanel centro = new JPanel();
	public JPanel cabecera = new JPanel();
	public JTextField textField;
	public JButton btnJuegos = new JButton("");
	public JPanel menu_lateral = new JPanel();
	static String dni = Gestor_de_juegos.dni;
	public static IGestorDeJuegos juegos;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestor_de_juegos frame = new Gestor_de_juegos();
					frame.setLocationRelativeTo( null );
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
	public Gestor_de_juegos() {
		cargar();
		setTitle("Gestor de juegos");
		//setBackground(SystemColor.textHighlight);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 830, 600);
		contenedor = new JPanel();
		contenedor.setBackground(Color.DARK_GRAY);
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedor);
		contenedor.setLayout(null);
		
		/*Menu de gestor de juegos */
		menu_lateral.setBackground(Color.DARK_GRAY);
		
		menu_lateral.setBounds(10, 97, 127, 352);
		contenedor.add(menu_lateral);
		menu_lateral.setLayout(null);
		
		/*Botones*/
		
		contenedor.add(centro, 0);
		menu_lateral.setBounds(10,97,127,454);
		contenedor.add(menu_lateral, 1);
		menu_lateral.setLayout(null);
		
		/* listar juegos */
		btnJuegos.setIcon(new ImageIcon(Gestor_de_juegos.class.getResource("/mds2/img/listar_juegos.png")));
		btnJuegos.setBounds(0, 0, 127, 121);
		menu_lateral.add(btnJuegos);
		btnJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				juegos();
			}
		});
			
		
		
//		/* boton configuracion */
//		JButton btnConfigurar = new JButton("");
//		
//		btnConfigurar.setIcon(new ImageIcon(Gestor_de_juegos.class.getResource("/mds2/img/configurar.png")));
//		btnConfigurar.setBounds(0, 120, 127, 111);
//		menu_lateral.add(btnConfigurar);
//		btnConfigurar.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				Configurar_Juegos();
//			}
//		});
		
		
		/* boton Chat */
		JButton btnChat = new JButton("");
		
		
		btnChat.setIcon(new ImageIcon(Gestor_de_juegos.class.getResource("/mds2/img/chat2.png")));
		btnChat.setBounds(0, 120, 127, 111);
		menu_lateral.add(btnChat);
		
		btnChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chat();
			}
		});
		
		//JButton btnChat = new JButton("");
		//btnChat.setIcon(new ImageIcon(saldo_registrado.class.getResource("/mds2/img/chat.png")));
		//btnChat.setBounds(0, 343, 127, 111);
		//menu_lateral.add(btnChat);
		

		
		/*Cabecera*/
		cabecera.setBackground(Color.DARK_GRAY);
		
		cabecera.setBounds(28, 6, 746, 80);
		contenedor.add(cabecera);
		cabecera.setLayout(null);
		
		JLabel lblImagen = new JLabel("imagen");
		lblImagen.setIcon(new ImageIcon(Gestor_de_juegos.class.getResource("/mds2/img/icono2.png")));
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen.setBounds(0, 0, 80, 80);
		cabecera.add(lblImagen);
		
		JLabel lblMustan = new JLabel("Gestor de Juegos");
		lblMustan.setEnabled(false);
		lblMustan.setBackground(Color.WHITE);
		lblMustan.setForeground(Color.WHITE);
		lblMustan.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblMustan.setBounds(92, 29, 167, 21);
		cabecera.add(lblMustan);
		
		
		JButton btnCerrarSesin = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario_no_identificado unr = new Usuario_no_identificado();
				Usuario_no_identificado.dni = null;
				unr.setVisible(true);
				dispose();
			}
		});
		btnCerrarSesin.setIcon(new ImageIcon(Gestor_de_juegos.class.getResource("/mds2/img/exit_2.png")));
		
		btnCerrarSesin.setBounds(612, 1, 107, 80);
		cabecera.add(btnCerrarSesin);
		
		JLabel lblPanelGestorDe = new JLabel("Bienvenido a Panel Gestor de Juegos");
		lblPanelGestorDe.setEnabled(false);
		lblPanelGestorDe.setBackground(Color.WHITE);
		lblPanelGestorDe.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblPanelGestorDe.setForeground(Color.WHITE);
		lblPanelGestorDe.setBounds(268, 220, 399, 41);
		contenedor.add(lblPanelGestorDe);
		
		JLabel lblPorFavorUse = new JLabel("Por favor use men\u00FA lateral para administrar juegos");
		lblPorFavorUse.setBackground(Color.WHITE);
		lblPorFavorUse.setEnabled(false);
		lblPorFavorUse.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblPorFavorUse.setForeground(Color.WHITE);
		lblPorFavorUse.setBounds(197, 260, 542, 87);
		contenedor.add(lblPorFavorUse);
		
		
	}
	/* Metodos */
	
	
	private void cargar() {
		// TODO Auto-generated method stub
		Client cliente  = new Client();
		juegos = cliente.getStubGJ();
	}

	protected void juegos() {

		Listar_juegos juegos2 = new Listar_juegos();
		contenedor.getComponent(0).hide();
		contenedor.add(juegos2.central, 0);
		setTitle("Listar Juegos");
		repaint();
		
	}

	protected void Configurar_Juegos() {

		Configurar_juegos Cjuegos = new Configurar_juegos();
		contenedor.getComponent(0).hide();
		contenedor.add(Cjuegos.central, 0);
		setTitle("Configurar Juegos");
		repaint();
		
	}
	
	protected void Administrar_Chat() {

		Administrar_chat Cjuegos = new Administrar_chat();
		contenedor.getComponent(0).hide();
		contenedor.add(Cjuegos.central, 0);
		setTitle("Configurar Juegos");
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
}
