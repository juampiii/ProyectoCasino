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



import javax.swing.UIManager;

import bbdd.Usuario_Registrado;

import java.awt.Color;

public class Listar_usuarios_registrados extends JPanel {

	protected JPanel central = new JPanel();
	protected JPanel listado = new JPanel();
	private static JTable table;
	Usuario_Registrado[] usuarios;
	
	//protected Usuario_Registrado [] usuarios = users.ListarRegistrados();
	
	
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Listar_usuarios_registrados() {
		
		try {
			usuarios = Gestor_de_usuarios.bbdd.ListarRegistrados();
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
		JButton btnModificar = new JButton("Modificar usuario");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Usuario_Registrado user = (Usuario_Registrado)table.getModel().getValueAt(table.getSelectedRow(), 5);
					Modificar_usuario mu = new Modificar_usuario(false, user);
					mu.setVisible(true);
					//
					actualizaLista();
				} catch (Exception e2) {
					System.out.println("error Al abrir la ventana Modificar usuario");
				}
			}
		});
		
		btnModificar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/modificar_admin.png")));
		btnModificar.setBounds(242, 384, 110, 29);
		central.add(btnModificar);
		
		
		//boton eliminar
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar();
			}
		});
		
		//Boton consultar 
		btnEliminar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/eliminar_admin.png")));	
		btnEliminar.setBounds(364, 384, 110, 29);
		central.add(btnEliminar);
		
//		JButton btnConsultar = new JButton("consultar");
//		btnConsultar.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Consultar_usuario ch = new Consultar_usuario();
//				ch.setLocationRelativeTo(null);
//				ch.setVisible(true);
//				//ch.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//				
//			}
//		});
////		btnConsultar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/consultar_admin.png")));
////		btnConsultar.setBounds(113, 384, 110, 29);
		//central.add(btnConsultar);
		// fin boton consultar
		
		//ScrollPane
		JScrollPane scrollPane = new JScrollPane();
		
//		JButton btnConsultarHistorico = new JButton("Consultar Historico");
//		btnConsultarHistorico.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		
		JButton btnConsultar1 = new JButton("Consultar Historico");
		btnConsultar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario_Registrado user = (Usuario_Registrado)table.getModel().getValueAt(table.getSelectedRow(), 5);
				Consultar_usuario ch = new Consultar_usuario(user);
				//ch.setLocationRelativeTo(null);
				ch.setVisible(true);
				//ch.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
			}
		});
		btnConsultar1.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/consultar_admin.png")));
		btnConsultar1.setBounds(113, 384, 110, 29);
		
		JButton btnBloquear = new JButton("Bloquear");
		btnBloquear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario_Registrado user = (Usuario_Registrado)table.getModel().getValueAt(table.getSelectedRow(), 5);
				Inhabilitar_usuario bloquear = new Inhabilitar_usuario(user);
				//bloquear.setLocationRelativeTo(null);
				bloquear.setVisible(true);
				//ch.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
			}
		});
		btnBloquear.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/inhabilitar_admin.png")));
		btnBloquear.setBounds(113, 384, 110, 29);
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(central);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(61)
							.addComponent(btnConsultar1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBloquear, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnConsultar1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBloquear, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"DNI", "Nombre", "Apellidos", "Saldo","Bloqueado", "objecte"
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
		//while (modelo.getRowCount() > 0) modelo.removeRow(0);
		int numCols = modelo.getColumnCount();
		try {
			for (Usuario_Registrado usr : Gestor_de_usuarios.bbdd.ListarRegistrados()) {
				Object [] fila = new Object[numCols]; // Hay tres columnas en la tabla
				
				fila[0] = usr.getDni();
				fila[1] = usr.getNombre();
				fila[2] = usr.getApellidos();
				fila[3] = usr.getSaldo();
				fila[4] = usr.getInactivo();
				fila[5] = usr;
				
				modelo.addRow(fila);
					
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("si he actualizado");
	}
	 

	void eliminar(){
		
		int resposta = JOptionPane.showConfirmDialog(null, "Seguro que quieres eliminar?", "Eliminar", JOptionPane.YES_NO_OPTION);
		if (resposta == JOptionPane.YES_OPTION) {
			
			Usuario_Registrado user = (Usuario_Registrado)table.getModel().getValueAt(table.getSelectedRow(), 5);
			String dni = (String) table.getModel().getValueAt(table.getSelectedRow(), 0);
			try {
				Gestor_de_usuarios.bbdd.EliminarUsuario(dni);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			actualizaLista();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
