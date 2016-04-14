package mds2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;

public class Eliminar_juego extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eliminar_juego frame = new Eliminar_juego();
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
	public Eliminar_juego() {
		setTitle("Eliminar juego");
		setBackground(SystemColor.textHighlight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnCancelar = new JButton("cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eliminar_juego.this.dispose();
				
				
			}
		});
		btnCancelar.setIcon(new ImageIcon(Eliminar_juego.class.getResource("/mds/dos/img/cancelar_admin.png")));
		btnCancelar.setBounds(19, 89, 104, 29);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eliminar_juego.this.dispose();
				
				
			}
		});
		btnAceptar.setIcon(new ImageIcon(Eliminar_juego.class.getResource("/mds/dos/img/aceptar_admin.png")));
		btnAceptar.setBounds(171, 89, 104, 29);
		contentPane.add(btnAceptar);
		
		JLabel lblestasSeguroDe = new JLabel("\u00BFEst‡ usted seguro?");
		lblestasSeguroDe.setBounds(85, 41, 151, 16);
		contentPane.add(lblestasSeguroDe);
	}
}
