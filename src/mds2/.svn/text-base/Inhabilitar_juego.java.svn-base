package mds2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bbdd.Juego;

public class Inhabilitar_juego extends JFrame {

	private JPanel contentPane;
	protected static Juego juego;
	protected  JButton btnNewButton = new JButton("");
	protected  JButton btnNewButton_1 = new JButton("");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inhabilitar_juego frame = new Inhabilitar_juego(juego);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param juego 
	 */
	public Inhabilitar_juego(Juego juego) {
		this.juego=juego;
		
		setTitle("Inhabilitar juego");
		//setBackground(SystemColor.textHighlight);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 299, 130);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		final JButton btnNewButton = new JButton("Desactivar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton.setEnabled(false);
				btnNewButton_1.setEnabled(true);
				bloquear();
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(Listar_juegos.class.getResource("")));

		btnNewButton.setBounds(21, 50, 104, 29);
		contentPane.add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("Activar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setEnabled(true);
				btnNewButton_1.setEnabled(false);
				desbloquear();;
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Listar_juegos.class.getResource("")));

		btnNewButton_1.setBounds(167, 50, 104, 29);
		contentPane.add(btnNewButton_1);
	}
	
	Boolean Ope;
	protected void desbloquear() {
		// TODO Auto-generated method stub
		try {
			Gestor_de_juegos.juegos.ActualizarJuego(juego.getId_juego(), juego.getNombre(), juego.getEnlace_imagen(), juego.getCantidad_minima(), false, juego.getNumero_minimo_usuarios());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Listar_juegos.actualizaLista();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//juego.setDesactivado(false);
	}

	protected void bloquear() {
		// TODO Auto-generated method stub
		System.out.println("Voy a desactivar: "+ juego.getId_juego());
		try {
			Gestor_de_juegos.juegos.InhabilitarJuego(juego.getId_juego());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Listar_juegos.actualizaLista();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//juego.setDesactivado(true);
		
		
	}

}
