package mds2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.NumberFormatter;
import javax.swing.ImageIcon;

import java.awt.SystemColor;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import bbdd.BD_Principal;
import bbdd.Movimiento;

import java.awt.Color;
import java.rmi.RemoteException;
import java.text.NumberFormat;

public class Gestionar_saldo extends JPanel {

	/* Zona de declaración de variables */
	protected JPanel central = new JPanel();
	protected  JFormattedTextField cantidadI = new JFormattedTextField();
	protected  JFormattedTextField cantidadR = new JFormattedTextField();
	protected  JPanel consultar_saldo = new JPanel();
	protected  JLabel lblSaldoActual = new JLabel("Saldo Actual");
	protected  JLabel lblSaldo;
	protected JPanel historicoPanel = new JPanel();
	protected JLabel lblHistrico = new JLabel("Hist\u00F3rico");
	protected JScrollPane listadoHistorico = new JScrollPane();
	protected JLabel lblTitulo = new JLabel("Gestionar Saldo");
	protected JButton btnAceptarI = new JButton("");
	protected JPanel retirar = new JPanel();
	protected JLabel lblRetirar = new JLabel("Retirar");
	protected JButton btnaceptarR = new JButton("");
	protected DefaultListModel lista = new DefaultListModel();
	protected JList listado = new JList();

	public Gestionar_saldo() {

		cargarDatos();

		
		/* Panel centro */
		central.setBackground(Color.DARK_GRAY);

		central.setBounds(147, 97, 627, 454);
		central.setLayout(null);
		historicoPanel.setBackground(Color.GRAY);
		central.add(historicoPanel);
		consultar_saldo.setBackground(Color.GRAY);

		consultar_saldo.setBounds(10, 50, 380, 133);
		central.add(consultar_saldo);
		consultar_saldo.setLayout(null);
		lblSaldoActual.setForeground(Color.WHITE);

		lblSaldoActual.setBounds(10, 11, 191, 46);
		lblSaldoActual.setFont(new Font("Segoe UI Light", Font.BOLD, 20));

		consultar_saldo.add(lblSaldoActual);

		lblSaldo.setFont(new Font("Segoe UI Light", Font.ITALIC, 30));
		lblSaldo.setBounds(101, 56, 148, 47);
		consultar_saldo.add(lblSaldo);

		
		listado = new JList(lista);		
		listado.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		listado.setBackground(Color.LIGHT_GRAY);
		//listado.setBounds(0, 0, 334, 179);
		listadoHistorico = new JScrollPane(listado);
		
		historicoPanel.setBounds(10, 194, 380, 249);
		historicoPanel.setLayout(null);
		lblHistrico.setForeground(Color.WHITE);

		lblHistrico.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblHistrico.setBounds(10, 11, 150, 37);
		historicoPanel.add(lblHistrico);

		listadoHistorico.setBackground(SystemColor.activeCaption);
		listadoHistorico.setBounds(20, 59, 334, 179);
		historicoPanel.add(listadoHistorico);
		lblTitulo.setForeground(Color.WHITE);
		

		lblTitulo.setFont(new Font("Segoe UI Light", Font.BOLD, 30));
		lblTitulo.setBounds(10, 11, 255, 28);
		central.add(lblTitulo);

		JPanel ingresar = new JPanel();
		ingresar.setBackground(Color.GRAY);
		ingresar.setBounds(410, 50, 196, 189);
		central.add(ingresar);
		ingresar.setLayout(null);

		JLabel lblIngresar = new JLabel("Ingresar");
		lblIngresar.setForeground(Color.WHITE);
		lblIngresar.setBounds(10, 21, 99, 32);
		lblIngresar.setFont(new Font("Segoe UI Light", Font.BOLD, 20));

		ingresar.add(lblIngresar);

		
		cantidadI.setBounds(29, 79, 132, 41);
		ingresar.add(cantidadI);
		cantidadI.setColumns(10);


		btnAceptarI.setIcon(new ImageIcon(Gestionar_saldo.class.getResource("/mds2/img/aceptar.png")));
		btnAceptarI.setFont(new Font("Segoe UI Semibold", Font.BOLD, 11));
		btnAceptarI.setBounds(29, 148, 120, 30);
		btnAceptarI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresarSaldo();
			}
		});
		ingresar.add(btnAceptarI);
		retirar.setBackground(Color.GRAY);

		retirar.setBounds(409, 245, 197, 198);
		central.add(retirar);
		retirar.setLayout(null);
		lblRetirar.setForeground(Color.WHITE);

	
		lblRetirar.setFont(new Font("Segoe UI Light", Font.BOLD, 20));

		lblRetirar.setBounds(10, 11, 93, 26);
		retirar.add(lblRetirar);

		cantidadR.setColumns(10);
		cantidadR.setBounds(27, 72, 132, 41);
		retirar.add(cantidadR);

		
		btnaceptarR.setIcon(new ImageIcon(Gestionar_saldo.class
				.getResource("/mds2/img/aceptar.png")));
		btnaceptarR.setBounds(27, 144, 120, 30);
		btnaceptarR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retirarSaldo();
			}
		});
		retirar.add(btnaceptarR);
	}

	protected void retirarSaldo() {
		//Aquí iría una función para validar la cantidad de forma correcta. De momento si es vacío
				if(cantidadR.getText().equals(""))
					JOptionPane.showMessageDialog(this, "La cantidad introducida no es válida", "Cantidad Incorrecta", JOptionPane.ERROR_MESSAGE);
				else
					{
					double saldo=0;
					try {
						saldo = Usuario_registrado.bbdd.consultarUsuario(Usuario_no_identificado.dniS.get(Usuario_registrado.consultarIP())).getSaldo();
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(saldo>=Double.parseDouble(cantidadR.getText())){
					JOptionPane.showMessageDialog(this, "La operación ha sido registrada correctamente", "Aviso operación Retirar", JOptionPane.INFORMATION_MESSAGE);
					try {
						Usuario_registrado.bbdd.decrementarSaldo(Usuario_no_identificado.dniS.get(Usuario_registrado.consultarIP()), Double.parseDouble(cantidadR.getText()));
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					cantidadR.setText("");
					Usuario_registrado.cambiaCentro((new Gestionar_saldo()).central);
					}
					else{
						JOptionPane.showMessageDialog(this, "La cantidad introducida supera tu saldo", "Cantidad Incorrecta", JOptionPane.ERROR_MESSAGE);

					}
					
					}
		
	}

	protected void ingresarSaldo() {
		
		System.out.println(Double.parseDouble(cantidadI.getText())+" "+Usuario_no_identificado.dniS.get(Usuario_registrado.consultarIP()));
		//Aquí iría una función para validar la cantidad de forma correcta. De momento si es vacío
				if(cantidadI.getText().equals(""))
					JOptionPane.showMessageDialog(this, "La cantidad introducida no es válida", "Aviso operación", JOptionPane.ERROR_MESSAGE);
				else
					{
					
					JOptionPane.showMessageDialog(this, "La operación ha sido registrada correctamente", "Aviso operación Ingresar", JOptionPane.INFORMATION_MESSAGE);
					
					try {
						Usuario_registrado.bbdd.acumularSaldo(Usuario_no_identificado.dniS.get(Usuario_registrado.consultarIP()), Double.parseDouble(cantidadI.getText()));
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					cantidadI.setText("");
					Usuario_registrado.cambiaCentro((new Gestionar_saldo()).central);

					}
		
	}
	
	private void cargarDatos(){
		try {
			Usuario_registrado.usuario = Usuario_registrado.bbdd.consultarUsuario(Usuario_no_identificado.dniS.get(Usuario_registrado.consultarIP()));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lista = new DefaultListModel<String>();
		lblSaldo = new JLabel(String.valueOf(Usuario_registrado.usuario.getSaldo()) + " euros");
		lblSaldo.setForeground(Color.WHITE);
		consultar_saldo.add(lblSaldo);
		central.add(consultar_saldo);
		repaint();
		try {
			for(Movimiento mov: Usuario_registrado.bbdd.obtenerMovimientos(Usuario_no_identificado.dniS.get(Usuario_registrado.consultarIP()))){
				lista.addElement(mov.getCantidad()+" \u20AC Dia: "+mov.getFecha()+" COD - "+mov.getId_Movimiento());
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		NumberFormat format = NumberFormat.getInstance();
	    NumberFormatter formatter = new NumberFormatter(format);
	    formatter.setValueClass(Integer.class);
	    formatter.setMinimum(0);
	    formatter.setMaximum(Integer.MAX_VALUE);
	    cantidadI = new JFormattedTextField(formatter);
	    cantidadI.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    cantidadI.setBackground(Color.LIGHT_GRAY);
	    cantidadR = new JFormattedTextField(formatter);
	    cantidadR.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    cantidadR.setBackground(Color.LIGHT_GRAY);
	}

}
