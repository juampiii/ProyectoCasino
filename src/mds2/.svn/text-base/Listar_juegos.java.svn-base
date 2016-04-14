package mds2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import bbdd.BD_Principal;
import bbdd.Juego;
import bbdd.Usuario_Registrado;

public class Listar_juegos extends JPanel {
	
	protected JPanel central = new JPanel();
	protected JPanel listado = new JPanel();
	protected JLabel lblTitulo = new JLabel("Juegos P\u00FAblicos");
	protected JLabel lblListadoDeJuegos = new JLabel("Listado de Juegos");
	protected JTable listadoJuegos = new JTable();
	private final JScrollBar scrollBarListadoJuegos = new JScrollBar();	
	private static JTable table;
	protected Juego [] J;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listar_juegos frame = new Listar_juegos();
					frame.setLocationRelativeTo( null );
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public Listar_juegos() {
		try {
			J = Gestor_de_juegos.juegos.ListarJuegos();
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
		
		
//		lblTitulo.setFont(new Font("Segoe UI Light", Font.BOLD, 30));
//		lblTitulo.setBounds(20, 10, 300, 41);
//		central.add(lblTitulo);

		
		
		
				
				
		//JScrollPAne
				
				JScrollPane scrollPane = new JScrollPane();
				
				// A–adir juego nuevo
				JButton btnJuegoNuevo = new JButton("A–adir Juego nuevo");
				btnJuegoNuevo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							//Juego juego = (Juego)table.getModel().getValueAt(table.getSelectedRow(), 4);
							Aniadir_juego aj = new Aniadir_juego();
							aj.setVisible(true);
							//
							actualizaLista();
						} catch (Exception e2) {
							System.out.println("error Al abrir la ventana A–adir juego nuevo");
						}
					}

					
				});
				
				btnJuegoNuevo.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/add_j.png")));
				btnJuegoNuevo.setFont(new Font("Segoe UI Semibold", Font.BOLD, 11));
				btnJuegoNuevo.setBounds(46, 384, 110, 29);
				listado.add(btnJuegoNuevo);
				//Fin a–adir juego nuevo
				
				//Actualizar juego
				JButton btnActualizar = new JButton("Actualizar");
				btnActualizar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							Juego juego = (Juego)table.getModel().getValueAt(table.getSelectedRow(), 4);
							actualizar_juego aj = new actualizar_juego(juego);
							aj.setVisible(true);
						System.out.println("antes de actualizalista()");
							actualizaLista();
						} catch (Exception e2) {
							System.out.println("error Al abrir la ventana A–adir juego nuevo");
						}
					}
				});
				
				btnActualizar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/actualizar_j.png")));
				btnActualizar.setBounds(168, 384, 110, 29);
				listado.add(btnActualizar);
				//Fin Actualizar juego
				
				// Eliminar Juego
				JButton btnEliminar = new JButton("Eliminar");
				btnEliminar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							eliminar();
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						//ele.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
						
					}
				});
				btnEliminar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/eliminar_j.png")));	
				btnEliminar.setBounds(290, 384, 110, 29);
				listado.add(btnEliminar);
				//Fin Eliminar juego
				
				// Inhabilitar Juego
				JButton btnInhabilitar = new JButton("Inhabilitar");
				btnInhabilitar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						desactivar();
						try {
							actualizaLista();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						//inha.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					}
				});
				
				btnInhabilitar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/inhabilitar_j.png")));
				btnInhabilitar.setBounds(412, 384, 110, 29);
				listado.add(btnInhabilitar);
				
				// Fin Inhabilitar juego
				
				
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
									.addComponent(btnJuegoNuevo, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
									.addGap(26)
									.addComponent(btnActualizar, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
									.addGap(26)
									.addComponent(btnInhabilitar, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
									.addGap(20)
									.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap())
				);
				gl_contentPane.setVerticalGroup(
					gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnJuegoNuevo, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnActualizar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnInhabilitar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
				);
				
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Nombre", "Enlace Imagen", "Precio", "Desactivado", "objecte"
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

		// TODO Auto-generated method stub
				 
	



			static void actualizaLista() throws SQLException{
				
				System.out.println("Se actuliza el Listado");
				DefaultTableModel modelo = (DefaultTableModel)table.getModel();
				while (modelo.getRowCount() > 0) modelo.removeRow(0);
				int numCols = modelo.getColumnCount();
				try {
					for (Juego jue : Gestor_de_juegos.juegos.ListarJuegos()) {
						Object [] fila = new Object[numCols]; // Hay tres columnas en la tabla
						
						fila[0] = jue.getNombre();
						fila[1] = jue.getEnlace_imagen();
						fila[2] = jue.getCantidad_minima();
						fila[3] = desactivado(jue.getDesactivado());
						fila[4] = jue;
					
						
						modelo.addRow(fila);
							
					}
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Ha actualizado el Listado");
			}

			private static Object desactivado(boolean b) {
				// TODO Auto-generated method stub
				if (b==false)
					return "NO";
				else
					return "SI";
			}
		
			protected void eliminar() throws SQLException{
				
				int resposta = JOptionPane.showConfirmDialog(null, "Seguro que quieres eliminar?", "Eliminar", JOptionPane.YES_NO_OPTION);
				if (resposta == JOptionPane.YES_OPTION) {
					Juego jue = (Juego)table.getModel().getValueAt(table.getSelectedRow(), 4);
					
					try {
						Gestor_de_juegos.juegos.EliminarJuego(jue.getId_juego());
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				actualizaLista();
		 }	
			
			protected void desactivar() {
		// TODO Auto-generated method stub
				Juego juego = (Juego)table.getModel().getValueAt(table.getSelectedRow(), 4);
				Inhabilitar_juego inha = new Inhabilitar_juego(juego);
				inha.setLocationRelativeTo( null );
				inha.setVisible(true);
				System.out.println("NOmbre: "+juego.getNombre());
				try {
					Gestor_de_juegos.juegos.InhabilitarJuego(juego.getId_juego());
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

		
	
}
