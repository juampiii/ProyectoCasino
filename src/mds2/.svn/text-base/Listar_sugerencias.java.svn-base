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
import bbdd.Sugerencia;
import bbdd.Usuario_Registrado;
import bbdd.Usuario_RegistradoDAO;
import bbdd.Usuario_no_Identificado;

import java.awt.Color;


public class Listar_sugerencias extends JPanel {

	protected JPanel central = new JPanel();
	protected JPanel listado = new JPanel();
	private static JTable table;
	
	//protected static BD_Principal users = new BD_Principal();
	//protected Sugerencia [] sugerencias = users.ListarSugerencias();

	Sugerencia[] sug;
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Listar_sugerencias() {
		
		try {
			sug = Gestor_de_usuarios.bbdd.ListarSugerencias();
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
		
		JButton btnVerSugerencias = new JButton("Ver Sugerencias");
		btnVerSugerencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Sugerencia sug = (Sugerencia)table.getModel().getValueAt(table.getSelectedRow(), 3);
					Ver_sugerencia vs = new Ver_sugerencia(sug);
					vs.setVisible(true);
					//
//					actualizaLista();
				} catch (Exception e2) {
					System.out.println("error4");
				}
			}
		});
		btnVerSugerencias.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/consultar_admin.png")));
		btnVerSugerencias.setBounds(113, 384, 110, 29);
		central.add(btnVerSugerencias);
		
		
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
							.addGap(157)
							.addComponent(btnVerSugerencias, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnVerSugerencias, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(18))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"DNI", "Titulo Mensaje","Fecha", "objecte"
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
			for (Sugerencia usr : Gestor_de_usuarios.bbdd.ListarSugerencias()) {
				Object [] fila = new Object[numCols]; // Hay tres columnas en la tabla
				
				fila[0] = usr.getEs_escrita_por();
				fila[1] = usr.getTexto();
				fila[2] = usr.getFecha();
				fila[3] = usr;
				
				modelo.addRow(fila);
					
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("si he actualizado");
	}
	
	
}
