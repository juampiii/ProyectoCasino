package Escoba;


public class Vector{
    Carta cartas[];
    int N = 0;
    int numCartas = 0;
    
    public Vector(int n){
        cartas = new Carta[n];        
        N = n;
        for(int i = 0; i<N; i++){
            cartas[i] = new Carta(null,null);    
        }                     
    }
    public void inicializar(){
        numCartas = 0;
        for(int i = 0; i<N; i++){
            cartas[i].borrar();
        }                
    }
    public Carta devolverCarta(int i){
        return cartas[i];
    }
    public void insertar(Carta c){
        cartas[numCartas].copiar(c);
        numCartas++;
    }
    public int esta7Oro(){
        for(int i = 0; i<N;i++){
            if(cartas[i].num == 7 && cartas[i].palo == "oro")
                return i;
        }
        return -1;
    }
    public void pintar(){
        for(int i = 0; i<N; i++){
            cartas[i].pintar();            
        }
    }
    public void detenerAnimaciones(){
        for(int i = 0; i<numCartas; i++){
            cartas[i].stop();
        }
    }
}