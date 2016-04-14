package mds2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.sql.SQLException;

import javax.swing.AbstractListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import javax.swing.JList;

import bbdd.BD_Principal;
import bbdd.BD_Usuarios_registrados;
import bbdd.Usuario_Registrado;
import bbdd.Usuario_RegistradoDAO;
import bbdd.Usuario_no_Identificado;

import java.awt.Color;

public class Listar_usuarios_no_identificados extends JPanel {

	protected JPanel central = new JPanel();
	protected JPanel listado = new JPanel();
	private static JTable table;
	
	//protected static BD_Principal users = new BD_Principal();
	//protected Usuario_no_Identificado [] usuarios = users.ListarNoIdentificado();
	
	Usuario_no_Identificado[] usuarioNo;
	
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Listar_usuarios_no_identificados() {
		
		try {
			usuarioNo = Gestor_de_usuarios.bbdd.ListarNoIdentificado();
		} catch (RemoteException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}

		/*Zona central*/
		central.setBackground(Color.GRAY);

		
		
		
		
		central.setBounds(181, 98, 593, 453);
		listado.setBackground(Color.GRAY);
		listado.add(central);
		central.setLayout(null);
		
		
		//botones van aqui
		
//		JButton btnConsultar = new JButton("consultar");
//		btnConsultar.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Consultar_no_identificado ch = new Consultar_no_identificado();
//				ch.setLocationRelativeTo(null);
//				ch.setVisible(true);
//				//ch.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//				
//			}
//		});
//		btnConsultar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/consultar_admin.png")));
//		btnConsultar.setBounds(113, 384, 110, 29);
//		central.add(btnConsultar);
		
		
		//ScrollPane
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(central);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(89)
							//.addComponent(btnConsultar, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						//.addComponent(btnConsultar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						)
					.addContainerGap())
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"IP", "Tiempo restante", "objecte"
			}
		));
		
		scrollPane.setViewportView(table);

		central.setLayout(gl_contentPane);
		table.removeColumn(table.getColumn("objecte"));
		try {
			actualizaLista();
		} catch (Exception e) {
			System.out.println("error1");
		}
		
		
		
		
		
	}

	 static void actualizaLista() throws SQLException{
		
		System.out.println("estoy aqui");
		DefaultTableModel modelo = (DefaultTableModel)table.getModel();
		while (modelo.getRowCount() > 0) modelo.removeRow(0);
		int numCols = modelo.getColumnCount();
		try {
			for (Usuario_no_Identificado usr : Gestor_de_usuarios.bbdd.ListarNoIdentificado()) {
				Object [] fila = new Object[numCols]; // Hay tres columnas en la tabla
				
				fila[0] = usr.getIp();
				fila[1] = usr.getTiempo();
				fila[2] = usr;
				
				modelo.addRow(fila);
					
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("si he actualizado");
	}
	
	
}
