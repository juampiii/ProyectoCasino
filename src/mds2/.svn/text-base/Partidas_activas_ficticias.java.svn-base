package mds2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.Map;

import javax.swing.*;

import Casino.CasinoVirtual;
import bbdd.Partida_Publica;

public class Partidas_activas_ficticias extends JPanel {

	
	/*Zona de declaración de variables*/
	
	public JPanel central = new JPanel();
	JPanel partida = new JPanel();
	JPanel listado_de_partidas = new JPanel();
	JLabel lblActivas = new JLabel("Activas");
	JLabel lblPartidasActivas = new JLabel("Partidas Activas Ficticias");
	JList listado = new JList();
	//JButton btnAbandonar = new JButton("");
;



	


	
	public Partidas_activas_ficticias() {
		central.setForeground(Color.DARK_GRAY);
		central.setBackground(Color.DARK_GRAY);
		central.setBounds(181, 94, 593, 471);
		central.setLayout(null);
		partida.setBounds(15, 62, 400, 398);
		
		partida.setBackground(Color.GRAY);
		central.add(partida);
		partida.setLayout(null);
		String texto = "<html><body><center>En la zona derecha podrás ver las partidas <br> que tienes cargadas actualmente <br>"
				+ " Regístrate para ganar dinero</center></body></html";
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
		for(Map.Entry partida: Usuario_no_identificado.juegosActivos.entrySet())
			lista.addElement(partida.getKey());
		//lista.addElement("Partida1"); lista.addElement("Partida2"); lista.addElement("Partida3"); lista.addElement("Partida4"); lista.addElement("Partida5"); lista.addElement("Partida6"); lista.addElement("Partida7");		lista.addElement("Partida1");		lista.addElement("Partida1"); lista.addElement("Partida2"); lista.addElement("Partida3"); lista.addElement("Partida4"); lista.addElement("Partida5"); lista.addElement("Partida6"); lista.addElement("Partida7");		lista.addElement("Partida1");		lista.addElement("Partida1"); lista.addElement("Partida2"); lista.addElement("Partida3"); lista.addElement("Partida4"); lista.addElement("Partida5"); lista.addElement("Partida6"); lista.addElement("Partida7");		lista.addElement("Partida1");
		listado = new JList(lista);
		listado.setFont(new Font("Tahoma", Font.BOLD, 12));
		listado.setForeground(Color.WHITE);
		
		listado.setBounds(20, 52, 18, 300);
		
		listado.setBackground(Color.GRAY);
		listado.setBounds(10, 40, 143, 184);
		JScrollPane scrollBarListadoPartidas = new JScrollPane(listado);
		scrollBarListadoPartidas.setBounds(10, 41, 143, 300);
		listado_de_partidas.setBackground(Color.DARK_GRAY);
		listado_de_partidas.setForeground(Color.DARK_GRAY);
		//listadoJuegos.add(scrollBarListadoJuegos);
		listado_de_partidas.add(scrollBarListadoPartidas);
		listado_de_partidas.setBounds(420, 40, 163, 420);
		central.add(listado_de_partidas);
		listado_de_partidas.setLayout(null);
		lblActivas.setForeground(Color.WHITE);
		
		lblActivas.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblActivas.setBounds(10, 11, 120, 30);
		listado_de_partidas.add(lblActivas);
		//listado_de_partidas.add(listado);
		
		
		
		
		
		/*btnAbandonar.setIcon(new ImageIcon(Partidas_Activas_noregistrado.class.getResource("/mds2/img/abandonar.png")));
		btnAbandonar.setBounds(75, 386, 88, 23);
		listado_de_partidas.add(btnAbandonar);
		
		btnAbandonar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//abandonar();
			}
		});*/
	}

	/*protected void abandonar() {
		int position = listado.getSelectedIndex();
		if(position<0)
			JOptionPane.showMessageDialog(this, "Debes seleccionar la partida a cerrar", "Error: Selecciona un elemento", JOptionPane.ERROR_MESSAGE);
		else{
		String algo = (String) listado.getSelectedValue();
		int valor = JOptionPane.showConfirmDialog(this, "Si abandonas la partida, perderas lo apostado", "Gestion de cobro ficticio", JOptionPane.OK_CANCEL_OPTION);
		//Si confirma el abandonar
		if(valor==0){
			//Lo que tenga que hacer al abandonar para el no registrado: 
			//cogemos la partida y la almacenamos
			
			java.util.Date fecha = new java.util.Date();
			Double horaFin = fecha.getHours()+(fecha.getMinutes()*0.01);
			Double horaInicio = Usuario_noregistrado.partidas.remove(algo);
			String juego = Usuario_noregistrado.juegosActivos.remove(algo);
			try {
				Usuario_noregistrado.usuarioNoRegistrado.registrarFinPartida(Usuario_noregistrado.direccionIP, juego, horaInicio, horaFin);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Quitamos de nuestro Hash tanto el juego, como la apuesta
			Usuario_noregistrado.apuestas.remove(algo);
			Usuario_noregistrado.juegosActivos.remove(algo);
			
			//Actualizamos el panel
			Usuario_noregistrado
			.cambiaCentro((new Partidas_Activas_noregistrado()).central);
		}
		}
		
	}*/


}
