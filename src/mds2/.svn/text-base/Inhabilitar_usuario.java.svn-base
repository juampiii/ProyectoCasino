package mds2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import bbdd.BD_Principal;
import bbdd.Usuario_Registrado;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.RemoteException;
import java.sql.SQLException;

public class Inhabilitar_usuario extends JFrame {

	private JPanel contentPane;
	protected static Usuario_Registrado user;
	//public BD_Principal users = new BD_Principal();
	protected  JButton btnAceptar = new JButton("");
	protected  JButton btnCancelar = new JButton("");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inhabilitar_usuario frame = new Inhabilitar_usuario(user);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param user 
	 */
	public Inhabilitar_usuario(Usuario_Registrado user) {
		
		try {
			 Gestor_de_usuarios.bbdd.InhabilitarUsuario(user.getDni());
		} catch (RemoteException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
		this.user=user;
		
		setTitle("Inhabilitar usuario");
		//setBackground(SystemColor.textHighlight);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 153);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEstasSeguroDe = new JLabel("");
		lblEstasSeguroDe.setBounds(87, 43, 137, 16);
		contentPane.add(lblEstasSeguroDe);
		
		btnCancelar = new JButton("Bloquear");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnCancelar.setEnabled(false);
				btnAceptar.setEnabled(true);
				bloquear();
				try {
					Listar_usuarios_registrados.actualizaLista();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("No se ha actualizado despues de bloquear");
				}
			}
		});
		btnCancelar.setIcon(new ImageIcon(Listar_juegos.class.getResource("")));
		btnCancelar.setBounds(23, 53, 104, 29);
		contentPane.add(btnCancelar);
		
		btnAceptar = new JButton("Desbloquear");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCancelar.setEnabled(true);
				btnAceptar.setEnabled(false);
				desbloquear();
				try {
					Listar_usuarios_registrados.actualizaLista();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("No se ha actualizado despues de desbloquear");
				}
			}
		});
		btnAceptar.setIcon(new ImageIcon(Listar_juegos.class.getResource("")));
		btnAceptar.setBounds(170, 53, 104, 29);
		contentPane.add(btnAceptar);
	}
Boolean Ope;
	protected void desbloquear() {
		// TODO Auto-generated method stub
		user.setInactivo(false);
		try {
			
			Gestor_de_usuarios.bbdd.modificarPerfil(user.getNombre(), user.getApellidos(), user.getCuenta(), user.getPregunta(), user.getRespuesta(), user.getEnlace_imagen(), 0.0,false, user.getDni(), user.getPassword(), user.getEmail());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Listar_usuarios_registrados.actualizaLista();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void bloquear() {
		// TODO Auto-generated method stub
		user.setInactivo(true);
		
		System.out.println("Voy a bloquear: "+ user.getDni());
		try {
			Gestor_de_usuarios.bbdd.InhabilitarUsuario(user.getDni());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Listar_usuarios_registrados.actualizaLista();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
