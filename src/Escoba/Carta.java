package Escoba;

 import java.awt.Image;
 import java.awt.Color;
 
 public class Carta  implements Runnable
 {
    /* Atributos */
    static final int ANCHO = 55, ALTO = 85;
    public int x, y, num;
    public String palo = "";
    Image imagen;
    private Escoba app;
    private Juego juego;
    boolean visible = true, 
            activada = false, 
            escpu = false;    
   
    
    private int x2,y2,xd,yd,delay = 5; /*variables para la Animacion de mover la carta hacia una posicion (x,y)*/
    private Thread anim;
    private boolean  haciaBaza = false, esUltimaParaPozo = false;    
    
     /* Constructor */
    public Carta(Escoba applet, Juego juego){
        x = y = 0;
        num = 0;
        palo = "";
        imagen  = null;
        app = applet;
        this.juego = juego;
    }
    public void borrar(){        
        num = 0; palo = "";
        imagen = null;
        visible = activada = false;
    }
    public void activar(){
        activada = !activada;
    }
    /* Setea la imagen para la carta */
    public void setImage(Image im){
        imagen = im;
    }
    boolean contiene(int X, int Y){
        if(X>=x && X<= (x+ANCHO) && (Y>=y)&& (Y<=y+ALTO)) return true;
        else return false;
    }
    /* Setea la posicion de la carta en el tablero */
    public void setXY(int x , int y){
        this.x =  xd = x;
        this.y =  yd = y;
    }
        
    public void setCpu(boolean val){
        escpu = val;
    }
      
    /* Servicio que copia los atributos de una carta a otra
     */
    public void copiar(Carta c){
        x = xd = c.x; y = yd = c.y; 
        num = c.num;      palo = c.palo;
        imagen = c.imagen;        
        visible = c.visible;
        app = c.app;
        juego = c.juego;
    }
    
    public void irHaciaBaza(int xl, int yl){       
        haciaBaza = true; 
        xd = this.x; yd = this.y;
        x2 = xl;  y2 = yl;
        delay = 5;
        anim = new Thread(this);
        anim.start();
    }
    public void irHaciaPozo(int xl, int yl, boolean esultima){
        haciaBaza = false; 
        esUltimaParaPozo = esultima;
        xd = this.x; yd = this.y;
        x2 = xl;  y2 = yl;
        delay = 20;
        anim = new Thread(this);
        anim.start();
    }
    
	public void run(){
        int distp = 10;
        double i = 0; 
   	    while(distp > 1){	        
	        xd = (int)(x + i * (x2 - x));
	        yd = (int)(y + i * (y2 - y));
	        distp = (int)Math.sqrt(Math.pow((x2-xd),2)+Math.pow((y2-yd),2));
    	    try{
    	    	Thread.sleep(delay);
    	    }catch(InterruptedException e){}
	        i += 0.01;
	        app.pintarAnim();
    	}		    
    	this.x = xd = x2;
    	this.y = yd = y2;    	
        if(haciaBaza) juego.tirarCartaAbaza();
        else if(esUltimaParaPozo) juego.insertarCartasEnPozo();
    }
    
    public void stop(){
        if(anim!=null) anim.stop();
        anim = null;
    }
    
    public void pintar(){
        if(visible){
            if(escpu)
                app.gb.drawImage(app.fondo, x, y, app);
            else if(imagen!=null)
                app.gb.drawImage(imagen, xd, yd, app); 
        }
        if(activada){
            app.gb.setColor(Color.yellow);
            app.gb.drawRect(xd-3, yd-3, ANCHO+4, ALTO+4);
        }
    }
    
}
    