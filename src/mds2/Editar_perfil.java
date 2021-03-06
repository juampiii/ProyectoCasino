package mds2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Window;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

import javax.swing.SwingConstants;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JTextArea;
import javax.swing.JList;

import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JScrollBar;

import org.hibernate.annotations.Parent;

import bbdd.BD_Principal;
import bbdd.Usuario_Registrado;
import sun.awt.image.*;
import utils.SavingAnImage;
import utils.ValidaExpresion;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
public class Editar_perfil extends JDialog {


	protected JPanel central = new JPanel();
	protected JPanel modificar_perfil = new JPanel();
	protected JLabel lblImagen_1 = new JLabel("");
	protected JLabel lblNombre = new JLabel("Nombre:");
	protected JTextField lblNombrel = new JTextField("");
	protected JLabel lblApellidos = new JLabel("Apellido/s:");
	protected JTextField lblApellidosl;
	protected JLabel lblDni = new JLabel("DNI:");
	protected JTextField lblDnil = new JTextField();
	protected JLabel lblPassword = new JLabel("Contrase�a:");
	protected JTextField lblPasswordl = new JTextField("");
	protected JLabel lblCorreo = new JLabel("Correo:");
	protected JTextField lblCorreol = new JTextField("");
	protected JLabel lblNumeroCuenta = new JLabel("Cuenta Corriente:");
	protected JTextField lblNumeroCuental = new JTextField("");
	protected JTextField lblRespuesta = new JTextField("");
	protected JComboBox pregunta = new JComboBox();
	protected JButton btnCambiar = new JButton("");
	protected JScrollPane scrollPane;
	protected JLabel lbltitulo = new JLabel("Editar Perfil");
	protected JButton btnCancelar = new JButton("");
	protected JButton btnGuardar = new JButton("");
	protected String imagenGuardar = "/mds2/img/sinimg.png";
	RenderedImage salvar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editar_perfil frame = new Editar_perfil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Editar_perfil() {

		cargar();

		
		
		setTitle("Editar perfil");
		// setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		central.setBackground(Color.DARK_GRAY);
		central.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(central);
		central.setLayout(null);
		modificar_perfil.setBackground(Color.GRAY);
		// modificar_perfil.setBounds(10, 64, 509, 346);
		// central.add(modificar_perfil);
		modificar_perfil.setLayout(null);
		lblImagen_1.setBackground(Color.LIGHT_GRAY);

		/*lblImagen_1.setIcon(new ImageIcon(Registro.class
				.getResource(imagenGuardar)));*/
		lblImagen_1.setDisabledIcon(new ImageIcon(Registro.class
				.getResource("/mds2/img/sinimg.png")));
		lblImagen_1.setBounds(10, 2, 80, 80);
		modificar_perfil.add(lblImagen_1);
		lblNombre.setForeground(Color.WHITE);

		lblNombre.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblNombre.setBounds(113, 85, 60, 18);
		modificar_perfil.add(lblNombre);

		lblNombrel.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblNombrel.setBounds(223, 81, 150, 25);
		modificar_perfil.add(lblNombrel);
		lblPassword.setForeground(Color.WHITE);

		lblPassword.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblPassword.setBounds(113, 54, 100, 18);
		modificar_perfil.add(lblPassword);

		lblPasswordl.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblPasswordl.setBounds(223, 50, 150, 25);
		modificar_perfil.add(lblPasswordl);
		lblCorreo.setForeground(Color.WHITE);

		lblCorreo.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblCorreo.setBounds(116, 19, 60, 20);
		modificar_perfil.add(lblCorreo);

		lblCorreol.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblCorreol.setBounds(223, 11, 150, 28);
		modificar_perfil.add(lblCorreol);
		lblNumeroCuenta.setForeground(Color.WHITE);

		lblNumeroCuenta.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblNumeroCuenta.setBounds(118, 188, 139, 28);
		modificar_perfil.add(lblNumeroCuenta);

		lblNumeroCuental.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblNumeroCuental.setBounds(116, 228, 240, 25);
		modificar_perfil.add(lblNumeroCuental);

		lblRespuesta.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblRespuesta.setBounds(118, 308, 240, 25);
		modificar_perfil.add(lblRespuesta);

		
		pregunta.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		pregunta.setBounds(118, 267, 240, 25);
		modificar_perfil.add(pregunta);

		btnCambiar.setIcon(new ImageIcon(Registro.class
				.getResource("/mds2/img/cambiar.png")));
		btnCambiar.setBounds(0, 86, 100, 20);
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar();
			}
		});
		modificar_perfil.add(btnCambiar);

		scrollPane = new JScrollPane(modificar_perfil);
		lblApellidos.setForeground(Color.WHITE);

		lblApellidos.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblApellidos.setBounds(113, 122, 80, 18);
		modificar_perfil.add(lblApellidos);

		
		lblApellidosl.setBounds(223, 124, 150, 25);
		lblApellidosl.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		modificar_perfil.add(lblApellidosl);
		lblApellidosl.setColumns(10);
		lblDni.setForeground(Color.WHITE);
		lblDni.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblDni.setBounds(113, 157, 80, 18);

		modificar_perfil.add(lblDni);
		lblDnil.setColumns(10);
		lblDnil.setFont(new Font("Segoe UI Light", Font.ITALIC, 16));
		lblDnil.setBounds(223, 157, 150, 25);

		modificar_perfil.add(lblDnil);
		scrollPane.setBounds(10, 64, 509, 346);
		// modificar_perfil.add(scrollBar);

		central.add(scrollPane);
		lbltitulo.setForeground(Color.WHITE);
		lbltitulo.setFont(new Font("Segoe UI Light", Font.BOLD, 30));
		lbltitulo.setBounds(10, 11, 268, 42);
		central.add(lbltitulo);

		btnCancelar.setBounds(121, 421, 120, 25);
		central.add(btnCancelar);
		btnCancelar.setIcon(new ImageIcon(Registro.class
				.getResource("/mds2/img/cancelar.PNG")));

		btnGuardar.setBounds(290, 421, 120, 25);
		central.add(btnGuardar);
		btnGuardar.setIcon(new ImageIcon(Registro.class
				.getResource("/mds2/img/modificar_admin.PNG")));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarB();
			}
		});
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelar();
			}
		});
		
		

	}


	private void cargar() {
		// TODO Auto-generated method stub
		imagenGuardar = Usuario_registrado.usuario.getEnlace_imagen();
		//System.out.println("Imagen a cargar: "+imagenGuardar);
		//lblImagen_1 = new JLabel(Usuario_registrado.usuario.getEnlace_imagen());
		lblNombrel = new JTextField(Usuario_registrado.usuario.getNombre());
		lblNombrel.setBackground(Color.LIGHT_GRAY);
		lblNombrel.setForeground(Color.WHITE);
		lblPasswordl = new JTextField(Usuario_registrado.usuario.getPassword());
		lblPasswordl.setBackground(Color.LIGHT_GRAY);
		lblPasswordl.setForeground(Color.WHITE);
		lblCorreol = new JTextField(Usuario_registrado.usuario.getEmail());
		lblCorreol.setBackground(Color.LIGHT_GRAY);
		lblCorreol.setForeground(Color.WHITE);
		lblNumeroCuental = new JTextField(Usuario_registrado.usuario.getCuenta());
		lblNumeroCuental.setBackground(Color.LIGHT_GRAY);
		lblNumeroCuental.setForeground(Color.WHITE);
		lblRespuesta = new JTextField(Usuario_registrado.usuario.getRespuesta());
		lblRespuesta.setBackground(Color.LIGHT_GRAY);
		lblRespuesta.setForeground(Color.WHITE);
		pregunta = new JComboBox<String>();
		pregunta.setBackground(Color.LIGHT_GRAY);
		pregunta.setForeground(Color.WHITE);
		pregunta.addItem("\u00BFDonde nacieron tus padres?");
		pregunta.addItem("\u00BFCual es tu pel�cula favorita?");
		pregunta.addItem("\u00BFDe qu� color es tu coche?");
		pregunta.addItem("\u00BFA qu� te dedicas?");
		//pregunta.addItem(user.getPregunta());
		pregunta.setSelectedItem(Usuario_registrado.usuario.getPregunta());
		//pregunta = new JComboBox();
		lblDnil = new JTextField(Usuario_registrado.usuario.getDni());
		lblDnil.setBackground(Color.LIGHT_GRAY);
		lblDnil.setForeground(Color.WHITE);
		lblApellidosl = new JTextField(Usuario_registrado.usuario.getApellidos());
		lblApellidosl.setBackground(Color.LIGHT_GRAY);
		lblApellidosl.setForeground(Color.WHITE);
	}

	protected void cancelar() {
		// TODO Auto-generated method stub
		this.hide();

	}

	protected void guardarB() {
		int error = 0;
		// lblNombrel lblPasswordl lblCorreol lblNumeroCuental lblRespuesta
		if (lblNombrel.getText().equals("")
				|| lblPasswordl.getText().equals("")
				|| lblCorreol.getText().equals("")
				|| lblNumeroCuental.getText().equals("")
				|| lblRespuesta.getText().equals("")
				|| lblApellidosl.getText().equals("")
				|| lblDnil.getText().equals("")) {
			error = 1;

		}
		
		if (!ValidaExpresion
				.validaExpresion(
						"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
								+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
						lblCorreol.getText()))
			error = 3;
		
		
		switch (error) {
		case 1: {
			JOptionPane.showMessageDialog(this,
					"No puedes dejar campos vacios",
					"Campos vacios",
					JOptionPane.ERROR_MESSAGE);
		}

			break;
		case 3: {
			JOptionPane
			.showMessageDialog(this,
					"El correo no es v�lido",
					"Formato correo incorrecto",
					JOptionPane.ERROR_MESSAGE);
		}

			break;

		case 0: {
			
			try {
					/*Reubicamos la imagen por su dni*/
					if(salvar!=null){
						String separador = System.getProperty("file.separator");
						String directorio = System.getProperty("user.dir");
						String sPath = "src" + separador + "mds2" + separador + "img"
								+ separador + "profile" + separador + lblDnil.getText()+ ".png";
						separador = "/";
						String cadena = separador + "mds2" + separador + "img"
								+ separador + "profile" + separador + lblDnil.getText()+".png";
						File outputfile = new File(sPath);
						ImageIO.write(salvar, "png", outputfile);
						imagenGuardar = cadena;
					}
				Usuario_registrado.bbdd.modificarPerfil (lblNombrel.getText(),
						lblApellidosl.getText(), lblNumeroCuental.getText(),
						pregunta.getSelectedItem().toString(),
						lblRespuesta.getText(), imagenGuardar, 
						0.0, lblDnil.getText(), lblPasswordl.getText(), lblCorreol.getText());
				Usuario_registrado.usuario = Usuario_registrado.bbdd.consultarUsuario(lblDnil.getText());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.setVisible(false);
		}

		}
	}

	/**Funci�n encargada de la gesti�n de cambio de imagen de usuario*/
	protected void cambiar() {
		
		//Creamos la ventana, para que el usuario cargue su imagen
		JFileChooser filechooser = new JFileChooser();
		filechooser.setDialogTitle("Choose Your File");
		FileFilter imageFilter = new FileNameExtensionFilter("Image files",
				ImageIO.getReaderFileSuffixes());
		filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);//
		filechooser.setFileFilter(imageFilter);
		// below codes for select the file
		int returnval = filechooser.showOpenDialog(this);
		Image bi2;
		if (returnval == JFileChooser.APPROVE_OPTION) {
			File file = filechooser.getSelectedFile();
			BufferedImage bi;
			try { // vamos a mostrar la imagen
				bi2 = ImageIO.read(file);

				if (bi2 instanceof BufferedImage) {
					bi2 = bi2.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
				}
				Usuario_registrado.lblImagen.setIcon(new ImageIcon(bi2));
				
				lblImagen_1.setIcon(new ImageIcon(bi2));
				SavingAnImage conversor = new SavingAnImage();
				salvar = conversor.toBufferedImage(bi2);
				
				String separador = System.getProperty("file.separator");
				String directorio = System.getProperty("user.dir");
				String sPath = "src" + separador + "mds2" + separador + "img"
						+ separador + "profile" + separador + Usuario_no_identificado.consultarIP()+ ".png";
				separador = "/";
				String cadena = separador + "mds2" + separador + "img"
						+ separador + "profile" + separador + Usuario_no_identificado.consultarIP()+".png";
				File outputfile = new File(sPath);
				ImageIO.write(salvar, "png", outputfile);
				imagenGuardar = cadena;

				repaint();
			} catch (IOException e) {

			}
			// this.pack();
		}
	}

	/**Funci�n que recoje la imagen seleccionada por el usuario, la 
	 * redimensiona y la devuelve en unas dimensiones 
	 * propias de un icono*/
	public static BufferedImage scale(BufferedImage sbi, int imageType,
			int dWidth, int dHeight, double fWidth, double fHeight) {
		BufferedImage dbi = null;
		if (sbi != null) {
			dbi = new BufferedImage(dWidth, dHeight, imageType);
			Graphics2D g = dbi.createGraphics();
			AffineTransform at = AffineTransform.getScaleInstance(fWidth,
					fHeight);
			g.drawRenderedImage(sbi, at);
		}
		return dbi;
	}
	
}