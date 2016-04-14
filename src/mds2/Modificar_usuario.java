package mds2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;

import bbdd.BD_Principal;
import bbdd.Usuario_Registrado;

import java.awt.Color;
import java.rmi.RemoteException;


public class Modificar_usuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNombre2;
	private JTextField txtEmail;
	private JTextField txtCuenta;
	private JTextField txtRespuesta;
	protected static boolean b;
	protected static Usuario_Registrado user;
	//protected BD_Principal bd = new BD_Principal();
	private JTextField txtPassword;
	private JTextField txtDni;
	private JTextField txtSaldo;
	protected String valor;
	protected String imagenGuardar = "/mds2/img/sinimg.png";

	Usuario_Registrado[] usu;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificar_usuario frame = new Modificar_usuario(b, user);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param user 
	 * @param b 
	 */
	public Modificar_usuario(final boolean b, Usuario_Registrado user) {
		
		try {
			Gestor_de_usuarios.bbdd.modificarPerfil(user.getNombre(), user.getApellidos(), user.getCuenta(), user.getPregunta(), user.getRespuesta(), user.getEnlace_imagen(), 0.0,false, user.getDni(), user.getPassword(), user.getEmail());
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setModal(true);
		this.b=b;
		this.user=user;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setTitle("Modificar usuario");
		//setBackground(SystemColor.textHighlight);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 561);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(42, 134, 61, 16);
		contentPane.add(lblNombre);
		
		JLabel lblUsuario = new JLabel("Apellidos");
		lblUsuario.setBounds(42, 180, 61, 16);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(38, 93, 81, 16);
		contentPane.add(lblContrasea);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(45, 59, 61, 16);
		contentPane.add(lblEmail);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(140, 124, 245, 28);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtNombre2 = new JTextField();
		txtNombre2.setBounds(140, 168, 245, 28);
		contentPane.add(txtNombre2);
		txtNombre2.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(140, 52, 245, 28);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(140, 86, 245, 28);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblModificarUsuario = new JLabel("Modificar usuario");
		lblModificarUsuario.setForeground(Color.DARK_GRAY);
		lblModificarUsuario.setBackground(Color.WHITE);
		lblModificarUsuario.setFont(new Font("Dialog", Font.BOLD, 18));
		lblModificarUsuario.setBounds(146, 6, 189, 33);
		contentPane.add(lblModificarUsuario);
		
		JLabel label = new JLabel("______________________________________________________");
		label.setBounds(36, 23, 384, 16);
		contentPane.add(label);
		
		JLabel lblFormaDePago = new JLabel("Forma de pago");
		lblFormaDePago.setBounds(36, 250, 95, 16);
		contentPane.add(lblFormaDePago);
		
		JLabel lblCuentaBancaria = new JLabel("Cuenta Bancaria");
		lblCuentaBancaria.setBounds(36, 303, 111, 16);
		contentPane.add(lblCuentaBancaria);
		
		txtCuenta = new JTextField();
		txtCuenta.setBounds(142, 297, 261, 28);
		contentPane.add(txtCuenta);
		txtCuenta.setColumns(10);
		
		JLabel lblCuenta = new JLabel("Cuenta");
		lblCuenta.setBounds(146, 275, 61, 16);
		contentPane.add(lblCuenta);
		
		JLabel label_2 = new JLabel("______________________________________________________");
		label_2.setBounds(36, 369, 384, 16);
		contentPane.add(label_2);
		
		JLabel label_1 = new JLabel("______________________________________________________");
		label_1.setBounds(36, 250, 384, 16);
		contentPane.add(label_1);
		
		JLabel lblPreguntaSecreta = new JLabel("Pregunta Secreta");
		lblPreguntaSecreta.setBounds(36, 369, 111, 16);
		contentPane.add(lblPreguntaSecreta);
		
		JLabel lblPregunta = new JLabel("Pregunta");
		lblPregunta.setBounds(36, 401, 61, 16);
		contentPane.add(lblPregunta);
		
		JLabel lblRespuesta = new JLabel("Respuesta");
		lblRespuesta.setBounds(36, 429, 72, 16);
		contentPane.add(lblRespuesta);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u00BFDonde nacieron tus padres?"}));
		comboBox.addItem("\u00BFDonde nacieron tus padres?");
		comboBox.addItem("\u00BFCual es tu película favorita?");
		comboBox.addItem("\u00BFDe qué color es tu coche?");
		comboBox.addItem("\u00BFA qué te dedicas?");
		
		comboBox.setBounds(121, 397, 282, 27);
		contentPane.add(comboBox);
		
		//aqui cojo valor de combo
		//valor=comboBox.getSelectedItem().toString();
		
		txtRespuesta = new JTextField("canada al norte");
		txtRespuesta.setBounds(120, 423, 283, 28);
		contentPane.add(txtRespuesta);
		txtRespuesta.setColumns(10);
		
		JLabel label_3 = new JLabel("______________________________________________________");
		label_3.setBounds(36, 457, 384, 16);
		contentPane.add(label_3);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modificar_usuario.this.dispose();
			}
		});
		btnCancelar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/cancelar_admin.png")));
		btnCancelar.setBounds(86, 485, 111, 36);
		contentPane.add(btnCancelar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(b) crear();
					else modificar();
					Listar_usuarios_registrados.actualizaLista();
					dispose();
				} catch (Exception e2) {
					System.out.println("no se ha actualizado");
				}
			}
		});
		btnGuardar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/guardar_admin.png")));
		btnGuardar.setBounds(240, 485, 111, 36);
		contentPane.add(btnGuardar);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(45, 209, 61, 16);
		contentPane.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setBounds(140, 203, 241, 28);
		contentPane.add(txtDni);
		txtDni.setColumns(10);
		
//		JLabel lblSaldoActual = new JLabel("Saldo actual");
//		lblSaldoActual.setBounds(45, 341, 90, 16);
//		contentPane.add(lblSaldoActual);
//		
//		txtSaldo = new JTextField();
//		txtSaldo.setBounds(146, 335, 144, 28);
//		contentPane.add(txtSaldo);
//		txtSaldo.setColumns(10);
		
		
		
		if(!b){
			txtDni.setEditable(false);
			//pregunta, dni , enlace_imagen, 
			txtDni.setText(user.getDni());
			txtNombre.setText(user.getNombre());
			txtNombre2.setText(user.getApellidos());
			txtEmail.setText(user.getEmail());
			txtPassword.setText(user.getPassword());
			txtCuenta.setText(user.getCuenta());
			txtRespuesta.setText(user.getRespuesta());
			String itemText = (String)comboBox.getSelectedItem( );
			System.out.println("eso es :"+itemText);
			comboBox.setSelectedItem(user.getPregunta());
			//txtSaldo.setText(String.valueOf(user.getSaldo()));
			
			//aqui cojo valor de combo
			//valor=comboBox.getSelectedItem().toString();	
			
System.out.println(valor);
		}
		
	}
	
	
	protected void modificar() {
		try {
			Gestor_de_usuarios.bbdd.modificarPerfil(txtNombre.getText(), txtNombre2.getText(), txtCuenta.getText(), valor, txtRespuesta.getText(), imagenGuardar, 0.0,false, txtDni.getText(), txtPassword.getText(), txtEmail.getText());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void crear() {
		try {
			Gestor_de_usuarios.bbdd.modificarPerfil(txtNombre.getText(), txtNombre2.getText(), txtCuenta.getText(), valor, txtRespuesta.getText(), imagenGuardar, 0.0,false, txtDni.getText(), txtPassword.getText(), txtEmail.getText());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setModal(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
