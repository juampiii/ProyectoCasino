package Craps;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import Casino.ICasino;
import Casino.IJuego;




import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * CrapsApplet is an applet that allows the user to play a
 * game of craps, using a GUI interface.
 * 
 * @author William Austad
 * @version 2/24/06
 */
public class CrapsFrame extends JFrame implements GameStatus,IJuego
{
    // constants known through all of the class
	private static CrapsFrame juego;
	private String nombre = "Craps";
	static ICasino casino; 
    private Craps craps;
    private JButton roll,salir,ayuda;
    private GamePanel panel;
    private int dinero;
    private JTextField apuesta;
    private JTextArea textoayuda;
    private boolean primero = true;
    String ip;
    private String texto = "* El jugador hace un lanzamiento \ninicial - come out roll. \n* Si logra 7 � 11, el jugador gana. \n* Si sale 2 3 � 12, el jugador pierde. \n* Si el jugador saca 4, 5, 6, 8, 9 � 10,\n entonces el resultado del lanzamien-\nto es llamada �el punto� (the point).\nCuando se establece el punto, el \njugador gana si saca el punto de \nnuevo antes de sacar un 7.\nSi el jugador saca 7, pierde.";
    
    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */

    public void init()
    { 
    JRootPane rootPane = this.getRootPane();	
	rootPane.putClientProperty("defeatSystemEventQueueCheck", 
				   Boolean.TRUE);
	
        // create GamePanel
        panel = new GamePanel();

	// add button
    setLayout(null);
	roll = new JButton("Tirar");
	salir = new JButton("Salir");
	ayuda = new JButton("Ayuda");
	roll.addActionListener(new ButtonListener());
	salir.addActionListener(new ButtonListener());
	ayuda.addActionListener(new ButtonListener());
	apuesta = new JTextField();
	textoayuda = new JTextArea(10,1);
	craps = panel.getCraps();
	panel.setBounds(0, 0, 300, 290);
	roll.setBounds(0, 290, 300, 50);
	salir.setBounds(300, 0, 100, 50);
	ayuda.setBounds(400, 0, 100, 50);
	apuesta.setBounds(200, 240, 100, 50);
	textoayuda.setBounds(300, 50, 200, 290);
	add(panel);
	add(roll);
	add(salir);
	add(ayuda);
	add(apuesta);
	add(textoayuda);
	textoayuda.setVisible(false);
	textoayuda.setEditable(false);
	Rectangle rectangulo=new Rectangle(0,0,200,290);
	textoayuda.scrollRectToVisible(rectangulo);
	textoayuda.setText(texto);
/*
	setLayout(new BorderLayout());
        // add the panel to the frame
        add(panel, BorderLayout.CENTER);

        // add the roll to the frame
        add(roll, BorderLayout.SOUTH);
*/
  
    }

    private class ButtonListener implements ActionListener
    {
	public void actionPerformed(ActionEvent event)
	{
			
			System.out.print(event.getActionCommand());
			if(event.getActionCommand().equals("Salir")){
				 			    
				    try {
						casino.acabado(nombre, ip);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
				juego.setVisible(false);
				//System.exit(0);
				
			}else if(event.getActionCommand().equals("Ayuda")){
				if(textoayuda.isVisible()){
					textoayuda.setVisible(false);
				}else{
					textoayuda.setVisible(true);
				}
			}else{
			if(craps.getStatus() == CONTINUE){
	    		if(primero){
	    			try{
	    				panel.setApuesta(apuesta.getText());
	    			}catch(Exception e){
	    				return;
	    			}
					primero = false;
				}
	    		craps.roll();
	    		panel.repaint();
	    		if(craps.getStatus() != CONTINUE){
	    			if(panel.darSaldo()==0){
	    				roll.setText("No tiene dinero");
	    				roll.setEnabled(false);
	    			}else{
	    				roll.setText("Jugar otra vez");
	    			}
	    		}
	    	}else {
	    			try{
	    				panel.setApuesta(apuesta.getText());
	    			}catch(Exception e){
	    				return;
	    			}
	    		craps.init();
	    		if(panel.darSaldo()==0){
    				roll.setText("No tiene dinero");
    				roll.setEnabled(false);
    			}else{
    				roll.setText("Tirar");
    			}
	    		panel.repaint();
	    	}
		}
	}
    }
	@Override
	public int darSaldo() {
		 
		return panel.darSaldo();
	}

	@Override
	public String darIP() {	
		return ip;
	}


	public static void main(String argv[]){
		juego = new CrapsFrame();
		juego.init();
		juego.setSize(600, 400);
		
		//SERVIDOR
		
 		try {
			Registry registry = LocateRegistry.getRegistry(2500);     
		    IJuego stub = (IJuego) UnicastRemoteObject.exportObject(juego, 0);
		    registry.rebind("Crasp", stub);
		    casino = (ICasino) registry.lookup("Casino");
		    
		    System.err.println("Crasp listo");
		} catch (Exception e) {
		    System.err.println("Server exception: " + e.toString());
		    e.printStackTrace();
		}
 		
 		// SERVIDOR
	}



	@Override
	public void ponerSaldo(int d) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ponerSaldo(int saldo, String ip) {
		juego.setVisible(true);
		panel.ponerSaldo(saldo);
		this.ip = ip;
	}
  
}


