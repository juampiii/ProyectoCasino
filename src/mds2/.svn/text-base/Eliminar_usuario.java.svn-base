package mds2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Eliminar_usuario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eliminar_usuario frame = new Eliminar_usuario();
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
	public Eliminar_usuario() {
		setTitle("Eliminar usuario");
		setBackground(SystemColor.textHighlight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCancelar = new JButton("cancelar");
		btnCancelar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds/dos/img/cancelar_admin.png")));
		btnCancelar.setBounds(19, 102, 110, 29);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("aceptar");
		btnAceptar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds/dos/img/aceptar_admin.png")));
		btnAceptar.setBounds(173, 102, 110, 29);
		contentPane.add(btnAceptar);
		
		JLabel lblestasSeguroDe = new JLabel("\u00BFEst‡ usted seguro?");
		lblestasSeguroDe.setBounds(92, 35, 146, 16);
		contentPane.add(lblestasSeguroDe);
	}

}
