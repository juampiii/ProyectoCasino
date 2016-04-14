package mds2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.*;

import bbdd.BD_Principal;

public class Partidas_Activas extends JPanel {

	
	/*Zona de declaración de variables*/
	
	public JPanel central = new JPanel();
	JPanel partida = new JPanel();
	JPanel listado_de_partidas = new JPanel();
	JLabel lblActivas = new JLabel("Activas");
	JLabel lblPartidasActivas = new JLabel("Partidas Activas");
	JList listado = new JList();

	
	public Partidas_Activas() {
		central.setBackground(Color.DARK_GRAY);
		central.setBounds(181, 94, 593, 471);
		central.setLayout(null);
		partida.setBounds(15, 62, 400, 398);
		
		partida.setBackground(Color.GRAY);
		central.add(partida);
		partida.setLayout(null);
		String texto = "<html><body><center>Seleccione la partida en<br> la zona derecha, y a continuaci\u00F3n,<br> seleccione ver para cargarla,<br> o abandonar para retirarse</center></body></html";
		JLabel Mensaje = new JLabel(texto);
		Mensaje.setForeground(Color.WHITE);
		Mensaje.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		Mensaje.setBounds(66, 73, 246, 192);
		partida.add(Mensaje);
		lblPartidasActivas.setForeground(Color.WHITE);
		lblPartidasActivas.setBounds(15, 21, 395, 30);
		
		lblPartidasActivas.setFont(new Font("Segoe UI Light", Font.BOLD, 30));
		central.add(lblPartidasActivas);
		
		DefaultListModel lista = new DefaultListModel();
		for(Map.Entry partida: Usuario_registrado.juegosActivos.entrySet())
			lista.addElement(partida.getKey());
		//lista.addElement("Partida1"); lista.addElement("Partida2"); lista.addElement("Partida3"); lista.addElement("Partida4"); lista.addElement("Partida5"); lista.addElement("Partida6"); lista.addElement("Partida7");		lista.addElement("Partida1");		lista.addElement("Partida1"); lista.addElement("Partida2"); lista.addElement("Partida3"); lista.addElement("Partida4"); lista.addElement("Partida5"); lista.addElement("Partida6"); lista.addElement("Partida7");		lista.addElement("Partida1");		lista.addElement("Partida1"); lista.addElement("Partida2"); lista.addElement("Partida3"); lista.addElement("Partida4"); lista.addElement("Partida5"); lista.addElement("Partida6"); lista.addElement("Partida7");		lista.addElement("Partida1");
		listado = new JList(lista);
		listado.setForeground(Color.WHITE);
		
		listado.setBounds(20, 52, 18, 300);
		
		listado.setBackground(Color.GRAY);
		listado.setBounds(10, 40, 143, 184);
		JScrollPane scrollBarListadoPartidas = new JScrollPane(listado);
		scrollBarListadoPartidas.setBounds(10, 41, 143, 300);
		listado_de_partidas.setBackground(Color.DARK_GRAY);
		//listadoJuegos.add(scrollBarListadoJuegos);
		listado_de_partidas.add(scrollBarListadoPartidas);
		listado_de_partidas.setBounds(420, 40, 163, 420);
		central.add(listado_de_partidas);
		listado_de_partidas.setLayout(null);
		lblActivas.setForeground(Color.WHITE);
		
		lblActivas.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblActivas.setBounds(10, 11, 120, 30);
		listado_de_partidas.add(lblActivas);

	}
}
