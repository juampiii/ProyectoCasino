package mds2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Configurar_usuarios extends JPanel {

	protected JPanel central = new JPanel();
	protected JPanel listado = new JPanel();
	protected JTextField textField;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Configurar_usuarios() {
	
		/*Zona central*/

		
		
		
	
		central.setBounds(181, 98, 593, 453);
		listado.add(central);
		central.setLayout(null);
		
		JLabel lblConfiguracion = new JLabel("Configuraci—n");
		lblConfiguracion.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblConfiguracion.setBounds(6, 6, 170, 19);
		central.add(lblConfiguracion);
		
		
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnActualizar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds/dos/img/guardar_admin.png")));
		btnActualizar.setBounds(381, 70, 110, 29);
		central.add(btnActualizar);
		
		JLabel lblNmeroMximoDe = new JLabel("N\u00FAmero m\u00E1ximo de juegos por jugador:");
		lblNmeroMximoDe.setBounds(33, 75, 286, 16);
		central.add(lblNmeroMximoDe);
		
		
		textField.setBounds(293, 69, 58, 28);
		central.add(textField);
		textField.setColumns(10);
		
	}

}
