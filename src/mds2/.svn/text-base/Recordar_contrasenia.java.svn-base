package mds2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.RemoteException;

import javax.swing.ImageIcon;

import bbdd.BD_Principal;
import java.awt.Color;

public class Recordar_contrasenia extends JDialog {

	protected JPanel contentPane;
	protected JTextField correotextField;
	protected JTextField respuestatextField;
	protected JButton btnCancelar;
	protected JButton btnAceptar;
	protected JLabel lblMensaje = new JLabel("Para recuperar tu contrase\u00F1a, rellena lo siguiente:");
	protected JLabel lblCorreo = new JLabel("Correo:");		
	protected JLabel lblPreguntaSecreta = new JLabel("Pregunta secreta:");
	protected JComboBox pregunta  = new JComboBox();

	
	
	 



	public Recordar_contrasenia() {
		setBackground(Color.DARK_GRAY);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		setTitle("Recordar Contraseña");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblMensaje.setForeground(Color.WHITE);
		
		lblMensaje.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblMensaje.setBounds(10, 22, 414, 16);
		contentPane.add(lblMensaje);
		lblCorreo.setForeground(Color.WHITE);
		


		lblCorreo.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblCorreo.setBounds(32, 56, 61, 16);
		contentPane.add(lblCorreo);
		
		correotextField = new JTextField();
		correotextField.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 13));
		correotextField.setForeground(Color.WHITE);
		correotextField.setBackground(Color.LIGHT_GRAY);
		correotextField.setBounds(93, 50, 134, 28);
		
		contentPane.add(correotextField);
		correotextField.setColumns(10);
		lblPreguntaSecreta.setForeground(Color.WHITE);
	
		lblPreguntaSecreta.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblPreguntaSecreta.setBounds(32, 102, 140, 16);
		contentPane.add(lblPreguntaSecreta);
		
		
		pregunta.setBackground(Color.DARK_GRAY);
		pregunta.setForeground(Color.WHITE);
		pregunta.setModel(new DefaultComboBoxModel(new String[] {
				"\u00BFDonde nacieron tus padres?",
				"\u00BFCual es tu película favorita?",
				"\u00BFDe qué color es tu coche?", "\u00BFA qué te dedicas?" }));
		pregunta.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 16));
		pregunta.setBounds(32, 129, 360, 25);
	
		contentPane.add(pregunta);
		
		respuestatextField = new JTextField();
		respuestatextField.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 13));
		respuestatextField.setForeground(Color.WHITE);
		respuestatextField.setBackground(Color.LIGHT_GRAY);
		respuestatextField.setColumns(10);
		respuestatextField.setBounds(32, 168, 360, 28);
		contentPane.add(respuestatextField);
		
		btnCancelar = new JButton("");
		btnCancelar.setIcon(new ImageIcon(Recordar_contrasenia.class.getResource("/mds2/img/cancelar.png")));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ocultar();
			}
		});
		btnCancelar.setBounds(49, 209, 117, 29);
		contentPane.add(btnCancelar);
		
		btnAceptar = new JButton("");
		btnAceptar.setIcon(new ImageIcon(Recordar_contrasenia.class.getResource("/mds2/img/aceptar.png")));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ContraseniaRestablecida frame = new ContraseniaRestablecida();
				//frame.setVisible(true);
				registro();
			}
		});
		btnAceptar.setBounds(223, 209, 117, 29);
		contentPane.add(btnAceptar);
	}
	
	private void ocultar(){
		this.setVisible(false);
	}
	
	private void registro() {
		boolean recordar = false;
		try {
			recordar = Usuario_no_identificado.usuarioNoRegistrado.recordar(correotextField.getText(), pregunta.getSelectedItem().toString(), respuestatextField.getText());		
			} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(correotextField.getText().equals("") || respuestatextField.getText().equals("") || !recordar){
			JOptionPane.showMessageDialog(this, "Error en los datos introducidos", "Datos incorrectos", JOptionPane.DEFAULT_OPTION);
		}
		else{
			//llamada a función y tal
			try {
				/**Falta meter la funcion consultarUsuario*/
				String nie = Usuario_no_identificado.usuarioNoRegistrado.dniUsuario(correotextField.getText());
				String passw = Usuario_no_identificado.usuarioNoRegistrado.consultarUsuario(nie).getPassword();
				String nombre = Usuario_no_identificado.usuarioNoRegistrado.consultarUsuario(nie).getNombre();
				//Usuario_no_identificado.usuarioNoRegistrado.solicitarPassword();
				//String pass = Usuario_no_identificado.usuarioNoRegistrado.
				JOptionPane.showMessageDialog(this,
						nombre+" Tu password es " + passw,
						"Contraseña reestablecida", JOptionPane.DEFAULT_OPTION);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.setVisible(false);
			}
		
		// TODO Auto-generated method stub
		
	}

}
