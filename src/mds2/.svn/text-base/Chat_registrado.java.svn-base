package mds2;

import java.awt.EventQueue;
import java.awt.Font;

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
import javax.swing.JTextArea;
import javax.swing.JList;
import java.awt.SystemColor;
import javax.swing.ImageIcon;


public class Chat_registrado extends JPanel {

	/*Zona de declaración de las variables	 */
	JPanel central = new JPanel();
	JLabel lblGestinDeSaldo = new JLabel("Chat");
	JLabel lblUsuarios = new JLabel("Usuarios");
	JLabel lblconversacion = new JLabel("Conversación");
	JTextArea txtrchat = new JTextArea();
	JList usuarios = new JList();
	JTextArea txtrEscribeElMensaje = new JTextArea();
	JButton enviar = new JButton("");
	
	public Chat_registrado() {
		

		central.setBounds(181, 96, 593, 455);
		central.setLayout(null);
		

		lblGestinDeSaldo.setFont(new Font("Segoe UI Light", Font.BOLD, 30));
		lblGestinDeSaldo.setBounds(10, 11, 255, 28);
		central.add(lblGestinDeSaldo);
		central.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		

		lblUsuarios.setSize(99, 35);
		lblUsuarios.setLocation(420, 60);
		lblUsuarios.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		central.add(lblUsuarios);
		
		

		lblconversacion.setBounds(10, 60, 133, 28);
		central.add(lblconversacion);
		lblconversacion.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		

		txtrchat.setEditable(false);
		txtrchat.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		txtrchat.setForeground(SystemColor.inactiveCaptionBorder);
		txtrchat.setBackground(SystemColor.activeCaption);
		central.add(txtrchat);
		txtrchat.setText("Juan dice: hola");
		txtrchat.setBounds(10, 100, 380, 294);
		

		usuarios.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		usuarios.setForeground(SystemColor.inactiveCaptionBorder);
		usuarios.setBackground(SystemColor.activeCaption);
		central.add(usuarios);
		usuarios.setBackground(SystemColor.activeCaption);
		usuarios.setBounds(420, 100, 150, 294);
		


		txtrEscribeElMensaje.setBounds(10, 400, 250, 46);
		txtrEscribeElMensaje.setFont(new Font("Segoe UI Light", Font.BOLD, 14));
		txtrEscribeElMensaje.setForeground(SystemColor.inactiveCaptionBorder);
		txtrEscribeElMensaje.setBackground(SystemColor.activeCaption);
		central.add(txtrEscribeElMensaje);
		txtrEscribeElMensaje.setText("escribe el mensaje");
		enviar.setIcon(new ImageIcon(Chat_registrado.class.getResource("/mds2/img/enviar.PNG")));
		enviar.setBounds(270, 410, 120, 30);
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enviar();
			}
		});
		central.add(enviar);

	}

	protected void enviar() {
		// TODO Auto-generated method stub
		
	}

}
