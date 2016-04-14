/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package bbdd;

import java.io.Serializable;
public class Configuracion implements Serializable {
	public Configuracion() {
	}
	
	private int ID;
	
	private int numero_maximo_partidas;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNumero_maximo_partidas(int value) {
		this.numero_maximo_partidas = value;
	}
	
	public int getNumero_maximo_partidas() {
		return numero_maximo_partidas;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
	private bbdd.BD_Configuraciones compone;
	
	public bbdd.BD_Configuraciones getCompone()  {
		return this.compone;
	}
	
	public void setCompone(bbdd.BD_Configuraciones value)  {
		this.compone = value;
	}
	
}
