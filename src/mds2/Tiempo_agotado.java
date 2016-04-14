package mds2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;

public class Tiempo_agotado extends JFrame {

	private JPanel contentPane;
	private JButton buttonSalir;
	private JButton btnRegistrarse;
	

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecordarContrase–a frame = new RecordarContrase–a();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	 * Create the frame.
	 */
	public Tiempo_agotado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 197);
		setTitle("Tiempo Agotado");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMensaje = new JLabel("El tiempo de prueba se ha agotado.");
		lblMensaje.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblMensaje.setBounds(34, 22, 377, 28);
		contentPane.add(lblMensaje);
		
		buttonSalir = new JButton("");
		buttonSalir.setIcon(new ImageIcon(Tiempo_agotado.class.getResource("/mds2/img/salir.PNG")));
		buttonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				salir();

				
			}
		});
		buttonSalir.setBounds(57, 97, 117, 29);
		contentPane.add(buttonSalir);
		
		btnRegistrarse = new JButton("");
		btnRegistrarse.setIcon(new ImageIcon(Tiempo_agotado.class.getResource("/mds2/img/registrarseb.PNG")));
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrarse();
				
			}
		});
		btnRegistrarse.setBounds(239, 98, 117, 29);
		contentPane.add(btnRegistrarse);
	}
	
	protected void salir() {
		// TODO Auto-generated method stub
		
	}

	private void registrarse(){
		//this.setVisible(false);

	}
}
