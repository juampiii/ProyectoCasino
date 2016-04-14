package mds2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Window;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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
import javax.swing.plaf.FileChooserUI;
import javax.swing.JTextArea;
import javax.swing.JList;

import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JScrollBar;

import org.hibernate.annotations.Parent;

import bbdd.BD_Principal;
import bbdd.Juego;
import bbdd.JuegoDAO;
import bbdd.Usuario_Registrado;
import sun.awt.image.*;
import utils.SavingAnImage;
import utils.ValidaExpresion;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

public class Aniadir_juego extends JFrame {

	protected JPanel contentPane = new JPanel();
	protected Juego j = new Juego();
	
	//declaracion nombre
	protected JTextField textField_nombre= new JTextField("");
	protected JLabel lblNombre = new JLabel("Nombre");
	//declaracion juego
	protected JTextField textField_juego= new JTextField("");
	//declaracion enlace imagen
	protected JTextField textField_enlaceImagen= new JTextField("");
	protected JLabel lblImagen = new JLabel("Enlace Imagen");
	//declaracion num max
	protected JLabel lblNumeroMinimoDe = new JLabel("numero minimo");
	protected JTextField textField_numMax= new JTextField("1");
	protected JTextField textField_1= new JTextField("1");
	//declaracion cantidad minima usuarios
	protected JLabel lblcantidad_minima = new JLabel("Cantidad minima");
	protected JTextField textField_cantidad = new JTextField("");
	protected boolean seleccionado=false;
	protected int numMax=1;
	protected double cantidad;
	protected static boolean b;
	protected static Juego juego;
	//Declaracion radio buttons
	
	
	
	protected JRadioButton rdbtnSi = new JRadioButton("");
	protected JRadioButton rdbtnNo = new JRadioButton("");
	
	protected JLabel lblVisibleParaUsuario = new JLabel("");
	protected JLabel lblCorreol = new JLabel("");
	protected JLabel lblIDJuego = new JLabel("5");

	
	protected String imagenGuardar = "/mds2/img/sinimg.png";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aniadir_juego frame = new Aniadir_juego();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param juego 
	 * @param b 
	 */
	public Aniadir_juego() {
		
		
	
		setTitle("A–adir juego");
		//setBackground(SystemColor.textHighlight);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 573, 449);
		contentPane.setBackground(Color.GRAY);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblNombre.setBounds(38, 115, 78, 16);
		contentPane.add(lblNombre);
		
		
		lblImagen.setBounds(38, 155, 131, 16);
		contentPane.add(lblImagen);
		
		
		
		JLabel lblVisibleParaUsuario = new JLabel("Desactivar para actualizar?");
		lblVisibleParaUsuario.setBounds(38, 291, 187, 16);
		contentPane.add(lblVisibleParaUsuario);
		
		JLabel lblAadirJuegoNuevo = new JLabel("A\u00F1adir juego");
		lblAadirJuegoNuevo.setBackground(Color.WHITE);
		lblAadirJuegoNuevo.setForeground(Color.DARK_GRAY);
		lblAadirJuegoNuevo.setFont(new Font("Dialog", Font.BOLD, 20));
		lblAadirJuegoNuevo.setBounds(207, 19, 195, 28);
		contentPane.add(lblAadirJuegoNuevo);
		
		
		
		textField_nombre = new JTextField();
		textField_nombre.setBounds(184, 109, 244, 28);
		contentPane.add(textField_nombre);
		textField_nombre.setColumns(10);
		
		textField_enlaceImagen = new JTextField();
		textField_enlaceImagen.setBounds(184, 149, 244, 28);
		contentPane.add(textField_enlaceImagen);
		textField_enlaceImagen.setColumns(10);

		
		
		JRadioButton rdbtnSi = new JRadioButton("Si", false);
		rdbtnSi.setBounds(237, 287, 58, 23);
		contentPane.add(rdbtnSi);
		
		JRadioButton rdbtnNo = new JRadioButton("No", true);
		rdbtnNo.setBounds(307, 287, 58, 23);
		contentPane.add(rdbtnNo);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnSi);
		group.add(rdbtnNo);
		
		rdbtnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionado=true;
			}
		});
		
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionado=false;
			}
		});
		
		JButton btnExaminar_1 = new JButton("Examinar");
		btnExaminar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar();
			}
		});
		btnExaminar_1.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/examinar_admin.png")));
		btnExaminar_1.setBounds(440, 150, 102, 29);
		contentPane.add(btnExaminar_1);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aniadir_juego.this.dispose();
				
				
			}
		});
		btnCancelar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/cancelar_admin.png")));
		btnCancelar.setBounds(125, 346, 102, 29);
		contentPane.add(btnCancelar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 crear();
					
					 Listar_juegos.actualizaLista();
					dispose();
				} catch (Exception e2) {
					System.out.println("no se ha guardado el Juego");
				}
			}
		});
		btnGuardar.setIcon(new ImageIcon(Listar_juegos.class.getResource("/mds2/img/guardar_admin.png")));

		btnGuardar.setBounds(293, 346, 102, 29);
		contentPane.add(btnGuardar);
		
		JLabel lblcantidad_minima = new JLabel("Cantidad minima");
		lblcantidad_minima.setBounds(38, 195, 127, 16);
		contentPane.add(lblcantidad_minima);
		
		textField_cantidad = new JTextField();
		textField_cantidad.setBounds(184, 189, 134, 28);
		contentPane.add(textField_cantidad);
		textField_cantidad.setColumns(10);
		
		lblNumeroMinimoDe.setBounds(38, 242, 205, 34);
		contentPane.add(lblNumeroMinimoDe);
		
		
		textField_1.setBounds(184, 245, 134, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
	}
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
	
	
	protected void cambiar() {
		// TODO Auto-generated method stub
		JFileChooser filechooser = new JFileChooser();
		filechooser.setDialogTitle("Choose Your File");
		FileFilter imageFilter = new FileNameExtensionFilter("Image files",
				ImageIO.getReaderFileSuffixes());
		filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		filechooser.setFileFilter(imageFilter);
		// below codes for select the file
		int returnval = filechooser.showOpenDialog(this);
		Image bi2;
		if (returnval == JFileChooser.APPROVE_OPTION) {
			File file = filechooser.getSelectedFile();
			BufferedImage bi;
			try { // display the image in jlabel
				bi2 = ImageIO.read(file);

				if (bi2 instanceof BufferedImage) {
					bi2 = bi2.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
				}
			//	lblImagen_1.setIcon(new ImageIcon(bi2));
				SavingAnImage conversor = new SavingAnImage();
				RenderedImage salvar = conversor.toBufferedImage(bi2);

				String separador = System.getProperty("file.separator");
				String directorio = System.getProperty("user.dir");
				String sPath = "src" + separador + "mds2" + separador + "img"
						+ separador + "games" + separador + "xxx.png";
				separador = "/";
				String cadena = separador + "mds2" + separador + "img"
						+ separador + "games" + separador + "3.png";
				File outputfile = new File(sPath);
				ImageIO.write(salvar, "png", outputfile);
				imagenGuardar = cadena;

				repaint();
				
				textField_enlaceImagen.setText(imagenGuardar);
			} catch (IOException e) {

			}
			// this.pack();
			
		}
	}
	 void crear()  throws Exception{
		
		Gestor_de_juegos.juegos.AniadirJuego(textField_juego.getText(), textField_nombre.getText(), textField_enlaceImagen.getText(), Double.parseDouble(textField_cantidad.getText()),seleccionado , Integer.parseInt(textField_1.getText()));
	}
}
