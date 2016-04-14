package Chat;

import javax.swing.*;
import java.net.*;
import java.io.*;
import java.lang.*;
import java.awt.*;
import java.util.*;
import javax.swing.AbstractButton;

public class publico extends JFrame {
	public publico() {
	}
	public static JLabel label1;
	public static JLabel label2;
	public static JLabel fondo;
    public static JButton Button1;
    public static JButton Button2;
    public static JTextField edit;
    public static JTextField edit2;
    public static JTextArea area;
    public static JTextPane pan;
    public static JScrollPane jscrollPane1;
   	static String mensajeCliente;
	static DataInputStream entrada=null;
	static DataOutputStream salida=null;
	Socket comunication=null;

    
 public void crear(){
   	    setTitle("Messenger");
		label1=new JLabel();
		label2=new JLabel();
		
		ImageIcon foto=new ImageIcon("fondo.jpg");
	 	Button1=new JButton("");
	    Button2=new JButton("");
	 	
	 	edit= new JTextField();
	 	edit2= new JTextField();
	 	pan=new JTextPane();
	 	jscrollPane1=new JScrollPane();
	 	fondo=new JLabel();
	 	
		getContentPane().setLayout(null);
		fondo.setIcon(foto);
		fondo.setBounds(2,2,434,450);
		
		label1.setBounds(112,10, 100, 25);
		label1.setText("Chat");
		getContentPane().add(label1);
	
	    label2.setBounds(10,328,180,25);
		label2.setText("Escribe tu mensaje aqui:");
		getContentPane().add(label2);
		
		edit.setBounds(10,348,277,20);
		getContentPane().add(edit);
		
		
		Button1.setBounds(35,370,70,25);
		Button1.setLabel("Send");
		
		getContentPane().add(Button1);
		
	    Button2.setBounds(185,370,70,25);
		Button2.setLabel("Exit");
		getContentPane().add(Button2);
		
		pan.setEditable(false);
	   	pan.setBackground(new Color(110,110,110));
	   	pan.setForeground(new Color(70,250,50));
	   	pan.setBorder(new javax.swing.border.EtchedBorder());

	   	jscrollPane1.setViewportView(pan);
		getContentPane().add(jscrollPane1);
		jscrollPane1.setBorder(new javax.swing.border.EtchedBorder());
		jscrollPane1.setOpaque(true);
        jscrollPane1.setBounds(10,35,276,290);
        getContentPane().add(fondo);
	    
	   	addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
	   	
	   	Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1click(evt);
            }
        });
        
        
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2click(evt);
            }
        });
        
        edit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
                
				if(e.getKeyCode()==e.VK_ENTER){
				enterpresionado();
				
			}
            }
        });
         
        
         
	   	
	   }
public void cargarlista(String nick){
	Vector lista=new Vector();
    lista.addElement(nick);
    System.out.println("texto"+nick);
	 for(int i=0;i<lista.size();i++){
				   System.out.print(lista.elementAt(i)+" !! ");
				   }
	
	
	  
	}
	
	
	
 private void exitForm(java.awt.event.WindowEvent evt) {
      //System.exit(0);
  }
  	  
private void Button2click(java.awt.event.ActionEvent evt) {
	//System.exit(0);
	
   }
   
public void enterpresionado(){
	String mensaje=edit.getText();
    flujo(mensaje);
    edit.setText("");
	}
	   
private void Button1click(java.awt.event.ActionEvent evt) {
	String mensaje=edit.getText();
    flujo(mensaje);
    edit.setText("");
   }
   
public void flujo(String mens){
	
			try{				
				mensajeCliente=mens;
				System.out.println("el mensaje enviado desde el cliente es :" + mensajeCliente);
				salida.writeBytes(mensajeCliente+"\n");
			   }catch (IOException e){
			   	System.out.println("error...."+e);
	           }
	}
public void conexion()throws IOException{

		try{
			comunication=new Socket("127.0.0.1",500);
			entrada=new DataInputStream(comunication.getInputStream());
			salida=new DataOutputStream(comunication.getOutputStream());
		}
		catch(IOException e){
			System.out.println("\tEl servidor no esta levantado");
			System.out.println("\t=============================");
     	}
		
		new threadCliente(entrada).start();
		System.out.print("Introducir Nick :");
	}
   
public static void main(String args[]) throws IOException{
		publico p=new publico();
		p.crear();
        p.conexion();
        p.setSize(303,430);
        p.setLocation(250,90);
        p.show();
      }
}