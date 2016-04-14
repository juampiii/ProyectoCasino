package mds2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.RemoteException;

import javax.swing.JCheckBox;
import java.awt.Color;

public class Reactivar_Perfil extends JDialog {

	private JPanel contentPane;
	private JButton buttonCancelar;
	private JButton btnAceptar;
	private JLabel lblMensaje = new JLabel("Ha solicitado reactivar su perfil.");
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reactivar_Perfil frame = new Reactivar_Perfil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Reactivar_Perfil() {
		setBackground(Color.DARK_GRAY);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 154);
		setTitle("Reactivar Perfil");
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblMensaje.setBackground(Color.DARK_GRAY);
		lblMensaje.setForeground(Color.WHITE);
		
		lblMensaje.setFont(new Font("Segoe UI Light", Font.BOLD | Font.ITALIC, 16));
		lblMensaje.setBounds(34, 22, 330, 28);
		contentPane.add(lblMensaje);
		
		buttonCancelar = new JButton("");
		buttonCancelar.setIcon(new ImageIcon(Reactivar_Perfil.class.getResource("/mds2/img/cancelar.png")));
		buttonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				ocultar();

				
			}
		});
		buttonCancelar.setBounds(52, 76, 117, 29);
		contentPane.add(buttonCancelar);
		
		btnAceptar = new JButton("");
		btnAceptar.setIcon(new ImageIcon(Gestionar_baja.class.getResource("/mds2/img/aceptar.png")));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reactivar();
				
			}
		});
		btnAceptar.setBounds(213, 76, 117, 29);
		contentPane.add(btnAceptar);
	}
	
	protected void reactivar() {
		//desactivado
		try {
			Usuario_no_identificado.usuarioNoRegistrado.reactivarUsuario(Usuario_no_identificado.dni);
			JOptionPane
			.showMessageDialog(
					this,
					"Has reactivado correctamente tu perfil. Por favor, inicie sesión.",
					"Usuario reactivado",
					JOptionPane.INFORMATION_MESSAGE);
			this.setVisible(false);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
	
	protected void ocultar(){
		this.setVisible(false);
	
	}


}
