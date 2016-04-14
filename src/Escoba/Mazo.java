package Escoba;

import java.awt.Image;
/* Esta clase representa a las 52 cartas del mazo. Su estructura interna 
 * es un vector de 52 cartas.
 */
public class Mazo 
{   
    /* Atributos */
    static final int NUM_CARTAS = 40;
    private Carta[] cartas;
    private boolean cdadas[];
    private int restantes;
    /* Construye un vector de 52 lugares */    
    public Mazo(Escoba app, Juego juego){
        cartas = new Carta[NUM_CARTAS];
        cdadas = new boolean[NUM_CARTAS];
        
        for(int i = 0; i<NUM_CARTAS; i++){
            cartas[i] = new Carta(app, juego);
        }
        cargar_mazo();        
    }
    public int getCantCartas(){
        return restantes;
    }
    public void cargar_mazo()
    {
        String p;
        int i, j, cont = 0;
        for (j = 0; j<4; j++)
        {   
            for(i = 0; i<10; i++)
            {  if (j == 0)
                   p = "copa";
               else if (j==1)
                   p = "basto";
               else if (j==2)
                   p = "oro";
               else 
                   p= "espada";
               cartas[cont].num = i+1;               
               cartas[cont].palo = p;
               cont++;
            }
        }
         
    }
    public void setImagenes(Image[] imagenes){
        for(int i = 0; i<NUM_CARTAS; i++)
            cartas[i].setImage(imagenes[i]);
    }
    public void inicializar(){
        restantes = NUM_CARTAS;
        for(int i = 0; i<NUM_CARTAS;i++)
            cdadas[i] = false;
    }
    public Carta devolverCarta(){
        int n;
        while(true){
            n = (int)((double)Math.random()*NUM_CARTAS);
            if(!cdadas[n]){
                cdadas[n] = true;
                restantes--;
                return cartas[n];
            }
        }

    }
}
                
            