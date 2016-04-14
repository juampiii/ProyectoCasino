package mds2;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Configurar_juegos extends  JPanel{
	
	protected JPanel central = new JPanel();
	protected JPanel contenedor = new JPanel();
	private JTextField textField;

	//private JPanel contenedor;
	//private JTextField textField;
	

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Configurar_juegos() {
		

		/*Zona central*/

	
		
		
		central.setBounds(181, 98, 593, 453);
		contenedor.add(central);
		central.setLayout(null);
		
		JLabel lblConfiguracion = new JLabel("Configuraci—n");
		lblConfiguracion.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblConfiguracion.setBounds(6, 6, 170, 19);
		central.add(lblConfiguracion);
		
		
		
		JButton btnguardar = new JButton("Guardar");
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnguardar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds/dos/img/guardar_admin.png")));
		btnguardar.setBounds(381, 70, 110, 29);
		central.add(btnguardar);
		
		JLabel lblNmeroMximoDe = new JLabel("N\u00FAmero m\u00E1ximo de usuarios por juego:");
		lblNmeroMximoDe.setBounds(33, 75, 286, 16);
		central.add(lblNmeroMximoDe);
		
		
		textField = new JTextField();
		textField.setBounds(289, 71, 76, 28);
		central.add(textField);
		textField.setColumns(10);
		textField.setColumns(10);
		
	}
}
