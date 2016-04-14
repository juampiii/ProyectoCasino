package mds2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;

public class Administrar_chat extends JPanel{

	protected JPanel central = new JPanel();
	protected JPanel contenedor = new JPanel();

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Administrar_chat() {
		
/*Zona central*/

	
		
		
		
		central.setBounds(181, 98, 593, 453);
		contenedor.add(central);
		central.setLayout(null);
		
		JLabel lblConversasion = new JLabel("Conversaci—n");
		lblConversasion.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblConversasion.setBounds(16, 6, 150, 14);
		central.add(lblConversasion);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 32, 368, 340);
		central.add(scrollPane);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane.setViewportView(textArea_1);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds/dos/img/enviar_admin.png")));
		btnEnviar.setBounds(293, 377, 91, 29);
		central.add(btnEnviar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(397, 32, 150, 340);
		central.add(scrollPane_1);
		
		JList list_1 = new JList();
		scrollPane_1.setViewportView(list_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(17, 379, 270, 27);
		central.add(scrollPane_2);
		
		JTextArea textArea = new JTextArea();
		scrollPane_2.setViewportView(textArea);
		
		JButton btnInhabilitar = new JButton("Inhabilitar");
		btnInhabilitar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds/dos/img/inhabilitar_admin.png")));
		btnInhabilitar.setBounds(419, 377, 109, 29);
		central.add(btnInhabilitar);
		
		JLabel lblUsuarios = new JLabel("Usuarios");
		lblUsuarios.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblUsuarios.setBounds(397, 5, 91, 16);
		central.add(lblUsuarios);
	}
}
