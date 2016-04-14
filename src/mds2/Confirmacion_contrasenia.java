package mds2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Confirmacion_contrasenia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Confirmacion_contrasenia frame = new Confirmacion_contrasenia();
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
	public Confirmacion_contrasenia() {
		setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		setTitle("Contraseña restablecida");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JButton btnAceptar = new JButton("");
		btnAceptar.setIcon(new ImageIcon(Gestionar_baja.class.getResource("/mds2/img/aceptar.png")));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Partidas_Activas partidas= new Partidas_Activas();
                Confirmacion_contrasenia.this.hide();
                //cambiar por el de no registrado
				partidas.setVisible(true);
				//partidas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		
		btnAceptar.setBounds(139, 69, 117, 29);
		contentPane.add(btnAceptar);
		
		JLabel lblBaja = new JLabel("La contraseña se ha enviado a tu correo.");
		lblBaja.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblBaja.setBounds(22, 23, 373, 16);
		contentPane.add(lblBaja);
		

		
	}

}
