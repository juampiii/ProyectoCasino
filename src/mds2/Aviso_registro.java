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

public class Aviso_registro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aviso_registro frame = new Aviso_registro();
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
	public Aviso_registro() {
		setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		setTitle("Aviso Registro");
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
                Aviso_registro.this.hide();
                //cambiar por el de no registrado
				partidas.setVisible(true);
				//partidas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		btnAceptar.setBounds(139, 69, 117, 29);
		contentPane.add(btnAceptar);
		
		JLabel lblBaja = new JLabel("Revise los pasos en el correo para activar su cuenta.");
		lblBaja.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblBaja.setBounds(10, 25, 373, 33);
		contentPane.add(lblBaja);
		

		
	}

}
