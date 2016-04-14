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
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Usuario))
			return false;
		Usuario usuario = (Usuario)aObj;
		if ((getDni() != null && !getDni().equals(usuario.getDni())) || (getDni() == null && usuario.getDni() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getDni() == null ? 0 : getDni().hashCode());
		return hashcode;
	}
	
	private String dni;
	
	private String email;
	
	private String password;
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setDni(String value) {
		this.dni = value;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getORMID() {
		return getDni();
	}
	
	public String toString() {
		return String.valueOf(getDni());
	}
	
}
