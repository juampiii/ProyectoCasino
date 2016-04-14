package mds2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import javax.swing.JList;

import java.awt.SystemColor;
import java.rmi.RemoteException;

import javax.swing.JScrollBar;

import utils.IsNumber;
import bbdd.Juego_Publico;
import bbdd.Partida_Publica;
import java.awt.Color;

public class Juegos_publicos extends JPanel {

	/* Zona de declaración de variables */
	JPanel central = new JPanel();
	protected JPanel listado = new JPanel();
	protected JLabel lblTitulo = new JLabel("Juegos P\u00FAblicos");
	protected JLabel lblListadoDeJuegos = new JLabel(
			"Listado de Juegos Públicos");
	protected JTable listadoJuegos = new JTable();
	private final JScrollBar scrollBarListadoJuegos = new JScrollBar();

	/**
	 * Create the panel.
	 */
	public Juegos_publicos() {
		central.setBackground(Color.DARK_GRAY);
		central.setBounds(181, 94, 593, 457);
		central.setLayout(null);
		listado.setBackground(Color.DARK_GRAY);

		listado.setBounds(10, 50, 523, 400);
		central.add(listado);
		listado.setLayout(null);
		lblTitulo.setForeground(Color.WHITE);

		lblTitulo.setFont(new Font("Segoe UI Light", Font.BOLD, 30));
		lblTitulo.setBounds(20, 10, 300, 41);
		central.add(lblTitulo);

		// = new ImageIcon();
		// array bidimencional de objetos con los datos de la tabla
		Juego_Publico[] juegos = cargarJuegosPublicos();

		// creamos la tabla
		listadoJuegos = new JTable(juegos.length, 4);
		listadoJuegos.setSelectionForeground(Color.DARK_GRAY);
		listadoJuegos.setForeground(Color.DARK_GRAY);
		listadoJuegos.setBackground(Color.DARK_GRAY);
		listadoJuegos.getTableHeader().setBackground(Color.DARK_GRAY);
		listadoJuegos.getColumnModel().getColumn(0)
				.setCellRenderer(new ImageRenderer());
		listadoJuegos.setRowHeight(100);
		listadoJuegos.getColumnModel().getColumn(0).setMaxWidth(100);
		listadoJuegos.getColumnModel().getColumn(0).setMinWidth(100);
		listadoJuegos.getColumnModel().getColumn(1).setMaxWidth(200);
		listadoJuegos.getColumnModel().getColumn(1).setMinWidth(200);
		listadoJuegos.setShowGrid(false);
		listadoJuegos.setTableHeader(null);
		listadoJuegos.setFont(new Font("Segoe UI Light", Font.BOLD, 20));

		ImageIcon aboutIcon;// = new
							// ImageIcon(Usuario_noregistrado.class.getResource("/img/games/1.png"));
		for (int i = 0; i < juegos.length; i++) {
			// System.out.println(i);
			Juego_Publico aux = juegos[i];
			// Creamos los elementos, y los añadimos a nuestra tabla
			aboutIcon = new ImageIcon(
					Usuario_no_identificado.class.getResource("/"
							+ aux.getEnlace_imagen()));
			listadoJuegos.setValueAt(aboutIcon, i, 0);
			listadoJuegos.setValueAt(aux.getNombre(), i, 1);
			listadoJuegos.setValueAt(aux.getCantidad_minima() + " €", i, 2);
			listadoJuegos.setValueAt(aux.getId_juego(), i, 3);
		}
		repaint();
		// array de String's con los títulos de las columnas
		String[] columnNames = { "Imagen", "Nombre", "Precio" };
		// se crea la Tabla

		listadoJuegos
				.setPreferredScrollableViewportSize(new Dimension(500, 300));
		// Creamos un JscrollPane y le agregamos la JTable
		JScrollPane scrollPane = new JScrollPane(listadoJuegos);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setForeground(Color.DARK_GRAY);
		scrollPane.setBackground(Color.DARK_GRAY);
		scrollPane.setBounds(10, 50, 475, 300);
		// Agregamos el JScrollPane al contenedor
		// getContentPane().add(scrollPane, BorderLayout.CENTER);

		listado.add(scrollPane);
		lblListadoDeJuegos.setForeground(Color.DARK_GRAY);

		lblListadoDeJuegos.setBackground(Color.DARK_GRAY);

		lblListadoDeJuegos.setFont(new Font("Segoe UI Light", Font.BOLD, 20));

		lblListadoDeJuegos.setBounds(10, 11, 250, 30);
		listado.add(lblListadoDeJuegos);
		listado.setBackground(Color.DARK_GRAY);
		// listado

		listadoJuegos.setBackground(SystemColor.inactiveCaption);
		listadoJuegos.setBounds(20, 45, 450, 350);

		JButton btnJugar = new JButton("");
		btnJugar.setIcon(new ImageIcon(Juegos_publicos.class
				.getResource("/mds2/img/jugar.png")));
		btnJugar.setBounds(374, 361, 111, 28);
		listado.add(btnJugar);
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jugar();
			}
		});

	}

	private Juego_Publico[] cargarJuegosPublicos() {
		// TODO Auto-generated method stub
		Juego_Publico[] juegos = null;
		try {
			return Usuario_no_identificado.usuarioNoRegistrado
					.cargarJuegosPublicos();
			// System.out.println(juegos.length);
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}

	protected void jugar() {
		// conozco la columna, solo queda buscar el elemento que hay en esa
		// posición
		int position = listadoJuegos.getSelectedRow();
		if (position < 0)
			JOptionPane.showMessageDialog(this,
					"Debes seleccionar un juego para jugar.",
					"Selecciona juego", JOptionPane.DEFAULT_OPTION);

		else {
			double tiempo = Usuario_no_identificado.usuario.getTiempo();
			if(tiempo <=0)/** AQUI VAMOS A PREGUNTAR POR EL TIEMPO */
			{
				JOptionPane.showMessageDialog(this,
						"Has agotado el tiempo de prueba. Registrate y que la suerte te acompañe!",
						"Tiempo agotado", JOptionPane.DEFAULT_OPTION);
			} else {

				// Cojo el valor del nombre del juego
				String nombreJuego = (String) listadoJuegos.getValueAt(position, 1);
				// JOptionPane.showMessageDialog(this, algo,
				// "Error: Campos Obligatorios Vacios",JOptionPane.DEFAULT_OPTION);
				// Consulto la id del juego
				String idJuego = (String) listadoJuegos.getValueAt(position, 3);

				if (Usuario_no_identificado.juegosActivos.containsKey(nombreJuego)) {
					JOptionPane.showMessageDialog(this,
							"Hay una partida activa de ese juego",
							"Partida en curso", JOptionPane.DEFAULT_OPTION);
					Usuario_no_identificado
							.cambiaCentro((new Partidas_activas_ficticias()).central);
				} else {
					// Colsulto la apuesta
					String valor = JOptionPane
							.showInputDialog("Introduzca la cantidad a apostar");
					if (IsNumber.isNumber(valor)) {

						// Se dan las condiciones para que empiece el juego
						Usuario_no_identificado.juegosActivos
								.put(nombreJuego, idJuego);
						Usuario_no_identificado.apuestas.put(nombreJuego,
								Double.parseDouble(valor));
						java.util.Date fecha = new java.util.Date();
						Double hora = fecha.getHours()
								+ (fecha.getMinutes() * 0.01);
						System.out.println(hora);
						Usuario_no_identificado.partidas.put(nombreJuego, hora);
						Usuario_no_identificado
								.cambiaCentro((new Partidas_activas_ficticias()).central);

						Usuario_no_identificado.cargarJuego(nombreJuego);

					} else {
						// Se introduce texto u otros caracteres en vez de
						// números
						JOptionPane.showMessageDialog(this,
								"Sólo se permiten números entre 1-100",
								"Formato incorrecto",
								JOptionPane.DEFAULT_OPTION);
					}

				}

			}
		}

	}
}
