package mds2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

import bbdd.BD_Principal;

import java.awt.Color;
import java.rmi.RemoteException;

public class Gestionar_baja extends JDialog {

	private JPanel contentPane;
	private JPasswordField textFieldPassword;
	final JCheckBox chckbxConfirmar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestionar_baja frame = new Gestionar_baja();
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
	public Gestionar_baja(){
		setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		setTitle("Gestionar baja");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 180);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setIcon(new ImageIcon(Gestionar_baja.class.getResource("/mds2/img/cancelar.png")));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//perfil_registrado partidas= new perfil_registrado();
                Gestionar_baja.this.hide();
                //cambiar por el de no registrado
				//partidas.setVisible(true);
				//partidas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		btnCancelar.setBounds(58, 101, 117, 29);
		contentPane.add(btnCancelar);
		
		
		JLabel lblBaja = new JLabel("Ha solicitado la baja del perfil.");
		lblBaja.setForeground(Color.WHITE);
		lblBaja.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblBaja.setBounds(21, 11, 373, 16);
		contentPane.add(lblBaja);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblContrasea.setBounds(21, 34, 107, 29);
		contentPane.add(lblContrasea);
		
		textFieldPassword = new JPasswordField();
		textFieldPassword.setForeground(Color.WHITE);
		textFieldPassword.setBackground(Color.GRAY);
		//textFieldPassword.setText();
		textFieldPassword.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		textFieldPassword.setBounds(138, 38, 120, 25);
		contentPane.add(textFieldPassword);
		textFieldPassword.setColumns(10);
		
		chckbxConfirmar = new JCheckBox("Confirmo que deseo solicitar la baja");
		chckbxConfirmar.setBackground(Color.DARK_GRAY);
		chckbxConfirmar.setForeground(Color.WHITE);
		chckbxConfirmar.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		chckbxConfirmar.setBounds(42, 70, 287, 23);
		contentPane.add(chckbxConfirmar);
		
		JButton btnAceptar = new JButton("");
		btnAceptar.setIcon(new ImageIcon(Gestionar_baja.class.getResource("/mds2/img/aceptar.png")));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//perfil_registrado partidas= new perfil_registrado();
                gestionarBaja();
                //cambiar por el de no registrado
                //partidas.setVisible(true);
                //partidas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		btnAceptar.setBounds(212, 101, 117, 29);
		contentPane.add(btnAceptar);
		
	}

	protected void gestionarBaja() {
		// TODO Auto-generated method stub
		Boolean value = chckbxConfirmar.isSelected();
		String password = textFieldPassword.getText();
		System.out.println(password);
		if(value){
			//Gestionar_baja.this.hide();
			/*AQUI FALTA COMPROBAR SI ES CORRECTA*/
			if(password.equals("") || password.equals("*****") )
				JOptionPane.showMessageDialog(this, "Error: Debes introducir tu contraseña", "Error en la contraseña",JOptionPane.DEFAULT_OPTION);
			else{
				try {
					Usuario_registrado.bbdd.gestionarBaja(Usuario_no_identificado.dniS.get(Usuario_registrado.consultarIP()), new java.util.Date());
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);
				}


			}
		else
			JOptionPane.showMessageDialog(this, "Error: Debes confirmar que deseas borrar tu perfil", "Confirma la operación",JOptionPane.DEFAULT_OPTION);

		
		
	}
}
