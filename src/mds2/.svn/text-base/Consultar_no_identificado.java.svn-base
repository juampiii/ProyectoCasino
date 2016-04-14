package mds2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class Consultar_no_identificado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultar_no_identificado frame = new Consultar_no_identificado();
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
	public Consultar_no_identificado() {
		setTitle("Consultar no identificado");
		//setBackground(SystemColor.textHighlight);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultarUsuarioNo = new JLabel("Usuario no identificado");
		lblConsultarUsuarioNo.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblConsultarUsuarioNo.setBounds(137, 42, 205, 16);
		contentPane.add(lblConsultarUsuarioNo);
		
		JLabel lblTiempoRestanteDe = new JLabel("Tiempo restante de prueba:");
		lblTiempoRestanteDe.setBounds(25, 92, 184, 16);
		contentPane.add(lblTiempoRestanteDe);
		
		JLabel lblJuegosQueHa = new JLabel("Juegos que ha jugado");
		lblJuegosQueHa.setFont(new Font("Segoe UI Light", Font.BOLD, 13));
		lblJuegosQueHa.setBounds(25, 129, 237, 16);
		contentPane.add(lblJuegosQueHa);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consultar_no_identificado.this.dispose();
				
				
			}
		});
		btnSalir.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/salir_admin.png")));
		btnSalir.setBounds(158, 390, 107, 29);
		contentPane.add(btnSalir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 157, 381, 221);
		contentPane.add(scrollPane);
	}

}
