package Chat;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;

class servidor{

public static void main(String abc[]) throws IOException{

		ServerSocket serv=null;
		boolean listening=true;
			
		try{
		   	serv=new ServerSocket(500);
       		System.out.println(".::Servidor activo :");
       while(listening){
       	Socket sock=null;
        try {
        	System.out.println("Esperando Usiarios");
        	
           sock=serv.accept();
            } catch (IOException e) {
                System.err.println("Accept failed: " + serv + ", " + e.getMessage());
                continue;
            }
            nuevocliente k=new nuevocliente(sock);
	        k.start();
	        }
	        		 
	    }catch(IOException e){
			System.out.println("error :"+e);
		}
	}
}

class nuevocliente extends Thread{
	Socket scli=null;
	DataInputStream entrada=null;
	DataOutputStream salida=null;
	public static Vector clientesActivos=new Vector();
	public static Vector prueba=new Vector();
	publico in=new publico();
public nuevocliente(Socket scliente){
	scli=scliente;
	clientesActivos.addElement(this);
	//in.lista.addElement(this);
	//in.cargarlista();
	System.out.println("cliente agregado: "+this);
			
}
/*public void cargar(){
     in.cargarlista(clientesActivos);	
}*/


public void run() {
	System.out.println(".::Esperando Mensajes :");
	String mencli;
	try{
	entrada=new DataInputStream(scli.getInputStream());
    salida=new DataOutputStream(scli.getOutputStream());
    this.setName(entrada.readLine());
    in.cargarlista(this.getName());
       } catch (IOException e) {
            e.printStackTrace();
        }
     mencli=null;
     
    
    while(true){ 
    	try{mencli=entrada.readLine();}
    	catch (IOException e) {System.out.println("El cliente termino la conexion");break;}
    	System.out.println("mensaje recibido "+mencli);
        envia(mencli);
        }
        
System.out.println("Se removio un usuario");
 clientesActivos.removeElement(this); 
  try{
      System.out.println("Se desconecto un usuario");	
      scli.close();
     }
	catch(Exception et){
	System.out.println("no se puede cerrar el socket");
 	}   
     
}
     
	
public void envia(String mencli2){
//InetAddress carac=new InetAddress(get);
String IP=scli.getInetAddress().getHostAddress();//IP
//String host=scli.getInetAddress().getHostName();//nombre del la maquina
	
for(int i=0;i<clientesActivos.size();i++){
System.out.println("MENSAJE DEVUELTO:"+mencli2);

  try{
  	  ((nuevocliente)(clientesActivos.elementAt(i))).salida.writeUTF(this.getName().toUpperCase()+/*":"+host+*/" >"+ mencli2);	
	 }catch (IOException e) {
       e.printStackTrace();
     }
 }
 }
}
