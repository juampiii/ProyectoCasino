package mds2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import javax.swing.JList;

import java.awt.SystemColor;
import java.rmi.RemoteException;
import java.util.HashMap;

import javax.swing.JScrollBar;

import org.orm.PersistentException;

import utils.IsNumber;
import bbdd.BD_Juegos;
import bbdd.Juego;
import bbdd.Partida_registrado;
import java.awt.Color;

public class Juegos extends JPanel {

	/* Zona de declaración de variables */
	protected JPanel central = new JPanel();
	protected JPanel listado = new JPanel();
	protected JLabel lblTitulo = new JLabel("Juegos");
	protected JLabel lblListadoDeJuegos = new JLabel("Listado de Juegos");
	protected JTable listadoJuegos = new JTable();
	protected JPanel favoritos = new JPanel();
	protected JLabel lblFavoritos = new JLabel("Favoritos");
	protected JList listadoFavoritos = new JList();
	protected JPanel ranking = new JPanel();
	protected JLabel lblRanking = new JLabel("Ranking");
	protected JList listadoRanking = new JList();
	private final JScrollBar scrollBarFavoritos = new JScrollBar();
	private final JScrollBar scrollBarRanking = new JScrollBar();
	protected DefaultListModel lista;
	protected DefaultListModel listaFavoritos;
	protected DefaultListModel listaRanking;
	protected JScrollPane scrollBarListadoJuegos;
	protected JScrollPane scrollBarListadoFavoritos;
	protected JScrollPane scrollBarListadoRanking;
	public static HashMap<String, String> hashFavoritos = new HashMap<String, String>();
	private Juego[] juegos = null;

	/**
	 * Create the panel.
	 * 
	 * @throws PersistentException
	 */
	public Juegos() {

		inicializar();
	}

	protected void inicializar(){
		central.setBackground(Color.DARK_GRAY);
		
		central.setBounds(181, 94, 593, 457);
		central.setLayout(null);
		listado.setBackground(Color.DARK_GRAY);

		listado.setBounds(10, 50, 366, 400);
		central.add(listado);
		listado.setLayout(null);
		lblTitulo.setForeground(Color.WHITE);

		lblTitulo.setFont(new Font("Segoe UI Light", Font.BOLD, 30));
		lblTitulo.setBounds(20, 10, 300, 41);
		central.add(lblTitulo);
		lblListadoDeJuegos.setForeground(Color.WHITE);

		lblListadoDeJuegos.setFont(new Font("Segoe UI Light", Font.BOLD, 20));

		lblListadoDeJuegos.setBounds(10, 11, 250, 30);
		listado.add(lblListadoDeJuegos);

		/* Obtenemos el listado de juegos */

		cargar();
		//System.out.println("He cargado juegos: ");
		/* Listado de juegos */
		// creamos la tabla
		listadoJuegos = new JTable(juegos.length, 4);
		listadoJuegos.getColumnModel().getColumn(0)
				.setCellRenderer(new ImageRenderer());
		listadoJuegos.setRowHeight(100);
		listadoJuegos.getColumnModel().getColumn(0).setMaxWidth(100);
		listadoJuegos.getColumnModel().getColumn(0).setMinWidth(100);
		listadoJuegos.getColumnModel().getColumn(1).setMaxWidth(100);
		listadoJuegos.getColumnModel().getColumn(1).setMinWidth(100);
		listadoJuegos.setShowGrid(false);
		listadoJuegos.setTableHeader(null);
		listadoJuegos.setFont(new Font("Segoe UI Light", Font.BOLD, 15));

		for (int i = 0; i < juegos.length; i++) {
			// System.out.println(i);
			Juego aux = juegos[i];
			System.out.println("Voy a tratar a "+aux.getNombre());
			// Creamos los elementos, y los añadimos a nuestra tabla
			ImageIcon aboutIcon = new ImageIcon(
					Usuario_no_identificado.class.getResource("/"
							+ aux.getEnlace_imagen()));
			listadoJuegos.setValueAt(aboutIcon, i, 0);
			listadoJuegos.setValueAt(aux.getNombre(), i, 1);
			listadoJuegos.setValueAt(aux.getCantidad_minima() + " €", i, 2);
			listadoJuegos.setValueAt(aux.getId_juego(), i, 3);
		}
		// array de String's con los títulos de las columnas
		String[] columnNames = { "Imagen", "Nombre", "Precio" };
		// se crea la Tabla

		listadoJuegos
				.setPreferredScrollableViewportSize(new Dimension(500, 300));
		// Creamos un JscrollPane y le agregamos la JTable
		JScrollPane scrollBarListadoJuegos = new JScrollPane(listadoJuegos);
		scrollBarListadoJuegos.setBounds(5, 45, 356, 284);
		// Agregamos el JScrollPane al contenedor
		listado.add(scrollBarListadoJuegos);

		JButton btnJugar = new JButton("Jugar");
		btnJugar.setIcon(null);
		btnJugar.setBounds(136, 366, 89, 23);

		JButton btnFavorito = new JButton("Favorito");
		btnFavorito.setBounds(243, 366, 89, 23);
		listado.add(btnFavorito);
		btnFavorito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marcarFavorito();
			}
		});
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int posicion = listadoJuegos.getSelectedRow();
				if(posicion>=0){
					String game = listadoJuegos.getValueAt(posicion, 1).toString();
					jugar(game, listadoJuegos.getSelectedRow());
					}
				else
					jugar("Error", listadoJuegos.getSelectedRow());
			}
		});
		listado.add(btnJugar);
		favoritos.setBackground(Color.DARK_GRAY);

		// Favoritos
		favoritos.setBounds(386, 50, 197, 216);
		// Juego[] juegos = usuario.cargarListado();
		central.add(favoritos);
		favoritos.setLayout(null);
		lblFavoritos.setForeground(Color.WHITE);

		lblFavoritos.setFont(new Font("Segoe UI Light", Font.BOLD, 20));

		lblFavoritos.setBounds(24, 11, 150, 30);
		favoritos.add(lblFavoritos);

		listaFavoritos = new DefaultListModel();
		// Obtenemos el listado de favoritos

		cargarFavoritos();
		listadoFavoritos = new JList(listaFavoritos);
		listadoFavoritos.setBackground(Color.WHITE);
		scrollBarListadoFavoritos = new JScrollPane(listadoFavoritos);
		scrollBarListadoFavoritos.setBounds(10, 40, 180, 150);
		favoritos.add(scrollBarListadoFavoritos);

		JButton btnDesmarcar = new JButton("Quitar");
		btnDesmarcar.setBounds(101, 193, 89, 23);
		favoritos.add(btnDesmarcar);
		
		JButton buttonJugarFavorito = new JButton("Jugar");
		buttonJugarFavorito.setBounds(10, 193, 89, 23);
		favoritos.add(buttonJugarFavorito);
		btnDesmarcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desmarcarFavorito();
			}
		});
		buttonJugarFavorito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println();
				int pocision = listadoFavoritos.getSelectedIndex();
				if(pocision >= 0)
					jugar(listadoFavoritos.getSelectedValue().toString(), listadoFavoritos.getSelectedIndex());
				else
					jugar("Error", -1);
			}
		});
		ranking.setBackground(Color.DARK_GRAY);

		ranking.setBounds(386, 277, 197, 169);
		central.add(ranking);
		ranking.setLayout(null);
		lblRanking.setForeground(Color.WHITE);

		lblRanking.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblRanking.setBounds(22, 11, 150, 30);
		ranking.add(lblRanking);

		listaRanking = new DefaultListModel();
		cargarRanking();

		listadoRanking = new JList(listaRanking);
		listadoRanking.setBackground(Color.WHITE);

		scrollBarListadoRanking = new JScrollPane(listadoRanking);

		scrollBarListadoRanking.setBounds(10, 40, 180, 100);
		ranking.add(scrollBarListadoRanking);
		
		JButton buttonJugarRanking = new JButton("Jugar");
		buttonJugarRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pocision = listadoRanking.getSelectedIndex();
				if(pocision >= 0)
					jugar(listadoRanking.getSelectedValue().toString(), listadoRanking.getSelectedIndex());
				else
					jugar("Error", -1);
			}
		});
		buttonJugarRanking.setBounds(56, 146, 89, 23);
		ranking.add(buttonJugarRanking);

		// listadoRanking.add(scrollBarRanking);

	}
	private void cargarRanking() {
		// TODO Auto-generated method stub

		try {
			for (Juego juego : Usuario_registrado.bbdd
					.cargarRanking(Usuario_no_identificado.dniS.get(Usuario_registrado.consultarIP()))) {
				if (juego != null)
					listaRanking.addElement(juego.getNombre());
			}
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private void cargarFavoritos() {
		// TODO Auto-generated method stub
		try {
			for (Juego juego : Usuario_registrado.bbdd
					.cargarFavoritos(Usuario_no_identificado.dniS.get(Usuario_registrado.consultarIP()))) {
				listaFavoritos.addElement(juego.getNombre());
				hashFavoritos.put(juego.getNombre(), juego.getId_juego());
			}
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	private void cargar() {
		// TODO Auto-generated method stub
		try {
			juegos = Usuario_registrado.bbdd.cargarListado();
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	protected void jugar(String nombre, int position) {
		//System.out.println("He recibido la peticion para el juego "+ nombre+" en "+ position);
		// conozco la columna, solo queda buscar el elemento que hay en esa
		// posición
		String idJuego = "";
		String nombreJuego= nombre;
		boolean encontrado= false;
		for(int i=0; i< juegos.length; i++)
			if(!encontrado){
				//System.out.println(juegos[i].getNombre()+ " "+juegos[i].getNombre().equals(nombre));
				if(juegos[i].getNombre().equals(nombre)){
					encontrado = true;
					idJuego = juegos[i].getId_juego();
				}
			}
			else{
				break;
			}
		

		//System.out.println("La id es "+ idJuego);
		
		if (position < 0){
			JOptionPane.showMessageDialog(this,
					"Debes seleccionar un juego para jugar.",
					"Selecciona juego", JOptionPane.DEFAULT_OPTION);
			
		}
		else{

			

			if (Usuario_registrado.juegosActivos.containsKey(nombreJuego)) {
				JOptionPane.showMessageDialog(this,
						"Hay una partida activa de ese juego",
						"Partida en curso", JOptionPane.DEFAULT_OPTION);
				Usuario_registrado
						.cambiaCentro((new Partidas_Activas()).central);
			} else {
				String valor = JOptionPane
						.showInputDialog("Introduzca la cantidad a apostar");
				if (IsNumber.isNumber(valor)) {
					if (Double.parseDouble(valor) > Usuario_registrado.usuario
							.getSaldo()) {
						JOptionPane.showMessageDialog(this,
								"No puedes apostar mas dinero del que tienes",
								"Cantidad no valida",
								JOptionPane.DEFAULT_OPTION);
					} else {
						//APUESTA
						//Se dan las condiciones para que empiece el juego
						Usuario_registrado.juegosActivos.put(nombreJuego, idJuego);
						Usuario_registrado.apuestas.put(nombreJuego,
								Double.parseDouble(valor));
						//System.out.println(nombreJuego + " apostado: "+ valor);
						try {
							Usuario_registrado.bbdd.jugarJuego(idJuego,
									Usuario_no_identificado.dniS.get(Usuario_registrado.consultarIP()),
									Double.parseDouble(valor));
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (RemoteException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Usuario_registrado.cargarJuego(nombreJuego);	
						
					}
				} else {
					//Se introduce texto u otros caracteres en  vez de números
					JOptionPane.showMessageDialog(this,
							"Sólo se permiten números entre 1-100",
							"Formato incorrecto",
							JOptionPane.DEFAULT_OPTION);
				}

			
			}
		}

	}

	protected void desmarcarFavorito() {

		int position = listadoFavoritos.getSelectedIndex();
		System.out.println(listadoFavoritos.getSelectedValue());

		if (position < 0)
			JOptionPane.showMessageDialog(this,
					"Debes seleccionar un juego para jugar.",
					"Error: Selecciona un juego", JOptionPane.ERROR_MESSAGE);
		else {
			String algo = (String) listadoJuegos.getValueAt(position, 1);
			JOptionPane.showMessageDialog(this, algo, "Añadido a favoritos",
					JOptionPane.ERROR_MESSAGE);
			try {
				Usuario_registrado.bbdd.desmarcarFavorito(Usuario_no_identificado.dniS.get(Usuario_registrado.consultarIP()),
						(String) hashFavoritos.get(listadoFavoritos
								.getSelectedValue()));
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Usuario_registrado.cambiaCentro((new Juegos()).central);

		}

	}

	protected void marcarFavorito() {
		// conozco la columna, solo queda buscar el elemento que hay en esa
		// posición
		int position = listadoJuegos.getSelectedRow();

		// Usuario_registrado.bbdd.marcarFavorito(dni, id_juego);
		if (position < 0)
			JOptionPane.showMessageDialog(this,
					"Debes seleccionar un juego para jugar.",
					"Error: Selecciona un juego", JOptionPane.ERROR_MESSAGE);
		else {
			String algo = (String) listadoJuegos.getValueAt(position, 1);
			JOptionPane.showMessageDialog(this, algo, "Añadido a favoritos",
					JOptionPane.ERROR_MESSAGE);
			try {
				Usuario_registrado.bbdd.marcarFavorito(Usuario_no_identificado.dniS.get(Usuario_registrado.consultarIP()),
						(String) listadoJuegos.getValueAt(position, 3));
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Usuario_registrado.cambiaCentro((new Juegos()).central);
		}

	}
}
