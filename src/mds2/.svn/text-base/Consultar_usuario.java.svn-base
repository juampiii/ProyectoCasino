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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;

import bbdd.BD_Principal;
import bbdd.Movimiento;
import bbdd.Usuario_Registrado;

import java.awt.Color;
import java.rmi.RemoteException;

public class Consultar_usuario extends JFrame {

	private JPanel contentPane;
	private JTable table;
	public Usuario_Registrado user;
	//protected static BD_Principal bdMove = new BD_Principal();
	Movimiento[] usu;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario_Registrado user = null;
					Consultar_usuario frame = new Consultar_usuario(user);
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
	 */
	public Consultar_usuario(Usuario_Registrado user) {
		try {
			///Meter funcion en interfaz que pasandole un dni, te devuelva Movimiento[]
			usu  =    Gestor_de_usuarios.bbdd.obtenerMovimientos(user.getDni());
		} catch (RemoteException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
		this.user=user;
		
		setTitle("Consultar usuario");
		//setBackground(SystemColor.textHighlight);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 456);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultarHistrico = new JLabel("Hist\u00F3rico");
		lblConsultarHistrico.setFont(new Font("Dialog", Font.BOLD, 18));
		lblConsultarHistrico.setBounds(26, 47, 87, 16);
		contentPane.add(lblConsultarHistrico);
		
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(124, Short.MAX_VALUE))
		);
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Saldo", "Fecha", "oculto"
			}
		));
		
		scrollPane.setViewportView(table);

		contentPane.setLayout(gl_contentPane);
		table.removeColumn(table.getColumn("oculto"));
		try {
			actualizaLista();
		} catch (Exception e) {
			System.out.println("error1");
		}
		//contentPane.add(table);
		
		
		JLabel lblSaldoActual = new JLabel("Saldo actual: ");
		lblSaldoActual.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblSaldoActual.setBounds(26, 317, 124, 16);
		contentPane.add(lblSaldoActual);
		
		JLabel label_1 = new JLabel("27\u20AC");
		label_1.setBounds(134, 318, 61, 16);
		contentPane.add(label_1);
		
		label_1.setText(String.valueOf(user.getSaldo()));
		

		
		//label_1.setText(s);
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consultar_usuario.this.dispose();
				
				
			}
			
		});
		btnSalir.setIcon(new ImageIcon(Consultar_usuario.class.getResource("/mds2/img/salir_admin.png")));
		btnSalir.setBounds(181, 356, 87, 29);
		contentPane.add(btnSalir);
	}

	private void actualizaLista() {
		// TODO Auto-generated method stub
		System.out.println("estoy aqui");
		DefaultTableModel modelo = (DefaultTableModel)table.getModel();
		while (modelo.getRowCount() > 0) modelo.removeRow(0);
		
		int numCols = modelo.getColumnCount();
		for (Movimiento mov : usu ) {
			Object [] fila = new Object[numCols]; // Hay tres columnas en la tabla
			
			fila[0] = mov.getId_Movimiento();
			fila[1] = mov.getCantidad();
			fila[2] = mov.getFecha();
			fila[3] = mov;
			
			modelo.addRow(fila);
				
		}
		System.out.println("si he actualizado");
		
	}
	
	
}
