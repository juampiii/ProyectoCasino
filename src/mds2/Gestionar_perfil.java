package mds2;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLDocument.Iterator;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;

import java.awt.SystemColor;
import java.rmi.RemoteException;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JScrollBar;

import bbdd.BD_Principal;
import bbdd.Usuario_Registrado;

import java.awt.Color;

public class Gestionar_perfil extends JPanel {

	/*Zona de declaración de las variables */
		protected JPanel central = new JPanel();
		protected JPanel ver_perfil = new JPanel();
		protected JLabel lblImagen_1 = new JLabel("");
		protected JLabel lblNombre = new JLabel("Nombre:");
		protected JLabel lblNombrel = new JLabel("Alguno Ninguno");
		protected JLabel lblApellidos = new JLabel("Apellidos:");
		protected JLabel lblApellidosl = new JLabel("");
		protected JLabel lblDni = new JLabel("DNI: ");
		protected JLabel lblDnil = new JLabel("");
		protected JLabel lblPassword = new JLabel("Contraseña:");
		protected JLabel lblPasswordl = new JLabel("********");
		protected JLabel lblCorreo = new JLabel("Correo:");
		protected JLabel lblCorreol = new JLabel("jrv849@ual.es");
		protected JLabel lblNumeroCuenta = new JLabel("Cuenta Corriente:");
		protected JLabel lblNumeroCuental = new JLabel("XXXX XXXX XX XXXXXXXXXX");
		protected JLabel lblPregunta = new JLabel("¿Donde Nacieron tus padres?");
		protected JLabel lblRespuesta = new JLabel("Canada, al norte");
		protected JLabel label = new JLabel("Gestionar Perf\u00EDl");
		protected JLabel lblSugerencias = new JLabel("Sugerencias:");
		protected JTextArea textAreaSugerencia = new JTextArea("Escribe aquí");
		protected JButton btnEnviar = new JButton("");
		protected JPanel gestionar_perfil = new JPanel();
		protected JButton btnEditar = new JButton("");
		protected JButton btnBaja = new JButton("");
		protected JPanel Sugerencias = new JPanel();
		protected JScrollPane jScrollPanelInformacion = new JScrollPane();
		
		
	public Gestionar_perfil() {
		cargar();
		central.setBackground(Color.DARK_GRAY);

		central.setBounds(181, 100, 593, 450);
		central.setLayout(null);
		ver_perfil.setBackground(Color.GRAY);
		

		ver_perfil.setBounds(0, 0, 418, 354);
		jScrollPanelInformacion.setBounds(10, 85, 418, 354);
		jScrollPanelInformacion.setLayout(null);
		//central.add(ver_perfil);
		ver_perfil.setLayout(null);
		

		

		lblImagen_1.setBounds(10, 11, 74, 67);
		ver_perfil.add(lblImagen_1);
		

		lblPasswordl.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblPasswordl.setBounds(207, 86, 204, 14);
		ver_perfil.add(lblPasswordl);
		lblApellidos.setForeground(Color.WHITE);
		
		
		lblApellidos.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblApellidosl.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblApellidos.setBounds(113, 145, 94, 28);
		lblApellidosl.setBounds(207, 145, 204, 28);
		ver_perfil.add(lblApellidos);
		ver_perfil.add(lblApellidosl);
		lblDni.setForeground(Color.WHITE);
		
		//.setBounds(113, 168, 94, 28);
		lblDni.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblDnil.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblDni.setBounds(113, 168, 94, 28);
		lblDnil.setBounds(207, 168, 94, 28);
		ver_perfil.add(lblDni);
		ver_perfil.add(lblDnil);
		
		
		lblNumeroCuental.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblNumeroCuental.setBounds(113, 245, 225, 28);
		ver_perfil.add(lblNumeroCuental);
		lblNumeroCuenta.setForeground(Color.WHITE);
		

		lblNumeroCuenta.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblNumeroCuenta.setBounds(115, 205, 184, 28);
		ver_perfil.add(lblNumeroCuenta);
		lblPassword.setForeground(Color.WHITE);
		

		lblPassword.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblPassword.setBounds(113, 76, 94, 29);
		ver_perfil.add(lblPassword);
		

		lblNombrel.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblNombrel.setBounds(207, 36, 150, 18);
		ver_perfil.add(lblNombrel);
		lblNombre.setForeground(Color.WHITE);
		


		lblNombre.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblNombre.setBounds(113, 36, 60, 18);
		ver_perfil.add(lblNombre);
		

		lblRespuesta.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblRespuesta.setBounds(115, 325, 204, 18);
		ver_perfil.add(lblRespuesta);
		lblCorreo.setForeground(Color.WHITE);
		

		lblCorreo.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblCorreo.setBounds(113, 116, 60, 18);
		ver_perfil.add(lblCorreo);
		

		lblPregunta.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblPregunta.setBounds(115, 285, 204, 18);
		ver_perfil.add(lblPregunta);
		

		lblCorreol.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblCorreol.setBounds(207, 116, 204, 18);
		ver_perfil.add(lblCorreol);
		///jScrollPanelInformacion.setBounds(406, 0, 17, 364);
		
		jScrollPanelInformacion.add(ver_perfil);
		
		central.add(jScrollPanelInformacion);
		gestionar_perfil.setBackground(Color.GRAY);

		gestionar_perfil.setBounds(443, 11, 140, 218);
		central.add(gestionar_perfil);
		gestionar_perfil.setLayout(null);
		
		

		btnEditar.setIcon(new ImageIcon(Gestionar_perfil.class.getResource("/mds2/img/editarPerfil.PNG")));
		btnEditar.setBounds(10, 30, 120, 25);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editar();
			}
		});
		gestionar_perfil.add(btnEditar);
		

		btnBaja.setIcon(new ImageIcon(Gestionar_perfil.class.getResource("/mds2/img/darseBaja.PNG")));
		btnBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gestionarBaja();
			}
		});
		btnBaja.setBounds(10, 90, 120, 25);
		gestionar_perfil.add(btnBaja);
		Sugerencias.setBackground(Color.GRAY);
		

		Sugerencias.setBounds(443, 240, 140, 220);
		central.add(Sugerencias);
		Sugerencias.setLayout(null);
		lblSugerencias.setForeground(Color.WHITE);
		

		lblSugerencias.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblSugerencias.setBounds(8, 24, 120, 25);
		Sugerencias.add(lblSugerencias);
		textAreaSugerencia.setForeground(Color.WHITE);
		


		textAreaSugerencia.setBackground(Color.LIGHT_GRAY);
		textAreaSugerencia.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		textAreaSugerencia.setLineWrap(true); 
		textAreaSugerencia.setWrapStyleWord(true); 
		textAreaSugerencia.setBounds(10, 63, 120, 105);
		textAreaSugerencia.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	textAreaSugerencia.setText("");
            }    
        });
		Sugerencias.add(textAreaSugerencia);
	
		
		btnEnviar.setIcon(new ImageIcon(Gestionar_perfil.class.getResource("/mds2/img/enviar.PNG")));
		btnEnviar.setBounds(5, 179, 120, 25);
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enviarSugerencia();
			}
		});
		Sugerencias.add(btnEnviar);
		label.setForeground(Color.WHITE);
		
		label.setFont(new Font("Segoe UI Light", Font.BOLD, 30));
		label.setBounds(37, 22, 293, 42);
		central.add(label);

	}

	
	/*Zona de creación de métodos de los botones*/
	protected void enviarSugerencia() {
		java.util.Iterator<Entry<String, String>> iter = Usuario_no_identificado.dniS.entrySet().iterator();
		Map.Entry el;


		while (iter.hasNext()) {
			el = (Map.Entry)iter.next();
		System.out.println("Clave: " + el.getKey() + " | Valor: " + el.getValue());
		}
		if(textAreaSugerencia.getText().length()<9 || textAreaSugerencia.getText().length()>50)
			JOptionPane.showMessageDialog(this, "La longitud del mensaje no es correcta", "Sugerencia no válida", JOptionPane.DEFAULT_OPTION);
		else{
			try {
				Usuario_registrado.bbdd.enviarSugerencia(Usuario_no_identificado.dniS.get(Usuario_registrado.consultarIP()), textAreaSugerencia.getText(), new java.util.Date());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//"La sugerencia será tratada por los técnicos.
			
			JOptionPane.showMessageDialog(this, "La sugerencia será tratada por los técnicos", "Confirmacion sugerencia", JOptionPane.DEFAULT_OPTION);
			textAreaSugerencia.setText("Escriba su sugerencia aquí");
			repaint();
		}
			

		
	}

	protected void gestionarBaja() {
		// TODO Auto-generated method stub
		Gestionar_baja modificar = new Gestionar_baja();
		modificar.setLocationRelativeTo(null);
		modificar.setModal(true);
		//registro.setDefaultCloseOperation(operation);
		//this.hide();
		modificar.setVisible(true);
		
	}

	protected void editar() {
		Editar_perfil modificar = new Editar_perfil();
		modificar.setModal(true);
		modificar.setVisible(true);
		repaint();

		
	}
	
	private void cargar() {
		// TODO Auto-generated method stub
		lblImagen_1 = new JLabel(Usuario_registrado.usuario.getEnlace_imagen());
		lblNombrel = new JLabel(Usuario_registrado.usuario.getNombre());
		lblNombrel.setForeground(Color.WHITE);
		lblPasswordl = new JLabel(Usuario_registrado.usuario.getPassword());
		lblPasswordl.setForeground(Color.WHITE);
		lblCorreol = new JLabel(Usuario_registrado.usuario.getEmail());
		lblCorreol.setForeground(Color.WHITE);
		lblNumeroCuental = new JLabel(Usuario_registrado.usuario.getCuenta());
		lblNumeroCuental.setForeground(Color.WHITE);
		lblRespuesta = new JLabel(Usuario_registrado.usuario.getRespuesta());
		lblRespuesta.setForeground(Color.WHITE);
		//pregunta = new JComboBox();
		lblDnil = new JLabel(Usuario_registrado.usuario.getDni());
		lblDnil.setForeground(Color.WHITE);
		lblApellidosl = new JLabel(Usuario_registrado.usuario.getApellidos());
		lblApellidosl.setForeground(Color.WHITE);
		lblPregunta = new JLabel(Usuario_registrado.usuario.getPregunta());
		lblPregunta.setForeground(Color.WHITE);
		String imga ="";
		try {
			imga = Usuario_registrado.bbdd.consultarUsuario(Usuario_no_identificado.dniS.get(Usuario_registrado.consultarIP())).getEnlace_imagen();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblImagen_1.setIcon(new ImageIcon(Usuario_registrado.class.getResource(imga)));

	}

}
