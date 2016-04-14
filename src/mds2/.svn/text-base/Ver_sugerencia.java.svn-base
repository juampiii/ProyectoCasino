package mds2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import bbdd.BD_Principal;
import bbdd.Sugerencia;
import bbdd.Usuario_Registrado;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import java.awt.Color;


public class Ver_sugerencia extends JFrame {

	private JPanel contentPane;
	protected static Usuario_Registrado user;
	protected static boolean b;
	protected static Sugerencia sug;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ver_sugerencia frame = new Ver_sugerencia(sug);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param sug 
	 */
	public Ver_sugerencia(Sugerencia sug) {
		this.sug=sug;
		
		setTitle("Ver sugerencia");
		//setBackground(SystemColor.textHighlight);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSugerencia = new JLabel("Sugerencia");
		lblSugerencia.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblSugerencia.setBounds(180, 21, 111, 19);
		contentPane.add(lblSugerencia);
		
		JLabel lblSugerencia_1 = new JLabel("Sugerencia: ");
		lblSugerencia_1.setBounds(21, 78, 85, 16);
		contentPane.add(lblSugerencia_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(106, 78, 314, 126);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ver_sugerencia.this.dispose();
				
			}
		});
		btnSalir.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/salir_admin.png")));
		btnSalir.setBounds(187, 225, 104, 29);
		contentPane.add(btnSalir);
		
		textArea.setEditable(false);
		textArea.setText(sug.getTexto());
	}
}
