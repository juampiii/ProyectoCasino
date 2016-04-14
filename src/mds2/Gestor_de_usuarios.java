package mds2;

import interfaces.IGestorDeUsuarios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.rmi.RemoteException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import rmi.Client;

public class Gestor_de_usuarios extends JFrame {

	public JPanel contenedor = new JPanel();
	public JPanel centro = new JPanel();
	public JPanel cabecera = new JPanel();
	public JPanel menu_lateral = new JPanel();
	protected JTable table;
	protected JTextField textField;
	public JButton btnUsuarios = new JButton("");
	public JButton btnNoUsuarios = new JButton("");
	public JButton btnSugerencias = new JButton("");
	public JButton btnChat = new JButton("");
	public static  IGestorDeUsuarios bbdd;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestor_de_usuarios frame = new Gestor_de_usuarios();
					//frame.setLocationRelativeTo( null );
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
	public Gestor_de_usuarios() {
		cargar();
		setTitle("Gestor de usuarios");
		//setBackground(SystemColor.textHighlight);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 727);
		contenedor.setBackground(Color.DARK_GRAY);
		
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedor);
		contenedor.setLayout(null);
		
		/*Menu de gestor de usuarios */
		
	
	/*	menu_lateral.setBounds(28, 112, 128, 549);
		contenedor.add(menu_lateral);
		menu_lateral.setLayout(null);*/
		
		contenedor.add(centro, 0);
		menu_lateral.setBackground(Color.DARK_GRAY);
		menu_lateral.setBounds(28,112,128,549);
		contenedor.add(menu_lateral, 1);
		menu_lateral.setLayout(null);
		
		/*Botones*/
		
		
		
		/* listar usuarios */
		
		
		btnUsuarios.setIcon(new ImageIcon(Gestor_de_usuarios.class.getResource("/mds2/img/usuario_registrado.png")));
		btnUsuarios.setBounds(0, 0, 127, 111);
		menu_lateral.add(btnUsuarios);
		contenedor.add(menu_lateral);
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listarUsuarios();
			}
		});
		//btnUsuarios.addActionListener(new ButtonOpenNewWindowListener());

		/* usuario no registrado */
		
		
		btnNoUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listarNoIdentificados();
			}
		});
		btnNoUsuarios.setIcon(new ImageIcon(Gestor_de_usuarios.class.getResource("/mds2/img/listar_usuarios.png")));
		btnNoUsuarios.setBounds(0, 111, 127, 111);
		menu_lateral.add(btnNoUsuarios);
		
		
		
		//boton Chat 
		
		btnChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chat();
			}
		});
		btnChat.setIcon(new ImageIcon(Gestor_de_usuarios.class.getResource("/mds2/img/chat2.png")));
		btnChat.setBounds(0, 222, 127, 111);
		menu_lateral.add(btnChat);
		
		// boton sugerencias
		
		btnSugerencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sugerencias();
			}
		});
		btnSugerencias.setIcon(new ImageIcon(Gestor_de_usuarios.class.getResource("/mds2/img/sugerencias.png")));
		btnSugerencias.setBounds(0, 333, 127, 111);
		menu_lateral.add(btnSugerencias);

	
		
		
		
		/*Cabecera*/
		JPanel cabecera = new JPanel();
		cabecera.setBackground(Color.DARK_GRAY);
		cabecera.setBounds(28, 6, 746, 80);
		contenedor.add(cabecera);
		cabecera.setLayout(null);
		
		JLabel lblImagen = new JLabel("imagen");
		lblImagen.setIcon(new ImageIcon(Gestor_de_usuarios.class.getResource("/mds2/img/icono2.png")));
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen.setBounds(0, 0, 80, 80);
		cabecera.add(lblImagen);
		
		JLabel lblMustan = new JLabel("Gestor de Usuarios");
		lblMustan.setBackground(Color.WHITE);
		lblMustan.setEnabled(false);
		lblMustan.setFont(new Font("Dialog", Font.BOLD, 20));
		lblMustan.setBounds(101, 33, 253, 21);
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
		btnCerrarSesin.setIcon(new ImageIcon(Gestor_de_usuarios.class.getResource("/mds2/img/exit_2.png")));
		
		btnCerrarSesin.setBounds(612, 1, 107, 80);
		cabecera.add(btnCerrarSesin);
		
		JLabel lblPanelGestorDe = new JLabel("Bienvenido a Panel Gestor de Usuarios");
		lblPanelGestorDe.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblPanelGestorDe.setEnabled(false);
		lblPanelGestorDe.setForeground(Color.WHITE);
		lblPanelGestorDe.setBackground(Color.WHITE);
		lblPanelGestorDe.setBounds(264, 229, 463, 77);
		contenedor.add(lblPanelGestorDe);
		
		JLabel lblPorFavorUse = new JLabel("Por favor use men\u00FA lateral para administrar Usuarios");
		lblPorFavorUse.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblPorFavorUse.setEnabled(false);
		lblPorFavorUse.setForeground(Color.WHITE);
		lblPorFavorUse.setBackground(Color.WHITE);
		lblPorFavorUse.setBounds(204, 318, 505, 30);
		contenedor.add(lblPorFavorUse);
		
	}
	
/* Metodos */
	
	
	private void cargar() {
		// TODO Auto-generated method stub
		
		Client cliente = new Client();
		bbdd = cliente.getStubGU();

		
	}

	protected void listarUsuarios() {

		Listar_usuarios_registrados listarUsuariosRegistrados = new Listar_usuarios_registrados();
		contenedor.getComponent(0).hide();
		contenedor.add(listarUsuariosRegistrados.central, 0);
		setTitle("Listar Usuarios Registrados");
		repaint();
		
	}
	
	protected void listarNoIdentificados() {

		Listar_usuarios_no_identificados listarUsuariosNoIdentificados = new Listar_usuarios_no_identificados();
		contenedor.getComponent(0).hide();
		contenedor.add(listarUsuariosNoIdentificados.central, 0);
		setTitle("Listar Usuarios no Registrados");
		repaint();
		
	}
	
	protected void configuracionU() {

		Configurar_juegos configurarUsuarios = new Configurar_juegos();
		contenedor.getComponent(0).hide();
		contenedor.add(configurarUsuarios.central, 0);
		setTitle("Configurar Usuarios");
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
	
	protected void sugerencias() {

		 Listar_sugerencias listarSugerencias= new Listar_sugerencias();
		contenedor.getComponent(0).hide();
		contenedor.add(listarSugerencias.central, 0);
		setTitle("Sugerencias");
		repaint();
		
	}
}


