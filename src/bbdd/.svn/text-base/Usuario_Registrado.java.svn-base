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
public class Usuario_Registrado extends bbdd.Usuario implements Serializable {
	public Usuario_Registrado() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == bbdd.ORMConstants.KEY_USUARIO_REGISTRADO_PARTIDA_REGISTRADOS) {
			return ORM_partida_registrados;
		}
		else if (key == bbdd.ORMConstants.KEY_USUARIO_REGISTRADO_ESCRIBE_SUGERENCIA) {
			return ORM_escribe_sugerencia;
		}
		else if (key == bbdd.ORMConstants.KEY_USUARIO_REGISTRADO_REALIZA_MOVIMIENTO) {
			return ORM_realiza_movimiento;
		}
		else if (key == bbdd.ORMConstants.KEY_USUARIO_REGISTRADO_TIENE_FAVORITOS) {
			return ORM_tiene_favoritos;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String nombre;
	
	private String apellidos;
	
	private String cuenta;
	
	private String pregunta;
	
	private String respuesta;
	
	private String enlace_imagen;
	
	private double saldo;
	
	private boolean inactivo;
	
	private boolean desactivado;
	
	private java.util.Set ORM_partida_registrados = new java.util.HashSet();
	
	private java.util.Set ORM_escribe_sugerencia = new java.util.HashSet();
	
	private java.util.Set ORM_realiza_movimiento = new java.util.HashSet();
	
	private java.util.Set ORM_tiene_favoritos = new java.util.HashSet();
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellidos(String value) {
		this.apellidos = value;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setCuenta(String value) {
		this.cuenta = value;
	}
	
	public String getCuenta() {
		return cuenta;
	}
	
	public void setPregunta(String value) {
		this.pregunta = value;
	}
	
	public String getPregunta() {
		return pregunta;
	}
	
	public void setRespuesta(String value) {
		this.respuesta = value;
	}
	
	public String getRespuesta() {
		return respuesta;
	}
	
	public void setEnlace_imagen(String value) {
		this.enlace_imagen = value;
	}
	
	public String getEnlace_imagen() {
		return enlace_imagen;
	}
	
	public void setSaldo(double value) {
		this.saldo = value;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setInactivo(boolean value) {
		this.inactivo = value;
	}
	
	public boolean getInactivo() {
		return inactivo;
	}
	
	public void setDesactivado(boolean value) {
		this.desactivado = value;
	}
	
	public boolean getDesactivado() {
		return desactivado;
	}
	
	public bbdd.Juego[] getJuegos() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = partida_registrados.getIterator();lIter.hasNext();) {
			lValues.add(((bbdd.Partida_registrado)lIter.next()).getJuego());
		}
		return (bbdd.Juego[])lValues.toArray(new bbdd.Juego[lValues.size()]);
	}
	
	public void removeJuego(bbdd.Juego aJuego) {
		bbdd.Partida_registrado[] lPartida_registrados = partida_registrados.toArray();
		for(int i = 0; i < lPartida_registrados.length; i++) {
			if(lPartida_registrados[i].getJuego().equals(aJuego)) {
				partida_registrados.remove(lPartida_registrados[i]);
			}
		}
	}
	
	public void addJuego(bbdd.Partida_registrado aPartida_registrado, bbdd.Juego aJuego) {
		aPartida_registrado.setJuego(aJuego);
		partida_registrados.add(aPartida_registrado);
	}
	
	public bbdd.Partida_registrado getPartida_registradoByJuego(bbdd.Juego aJuego) {
		bbdd.Partida_registrado[] lPartida_registrados = partida_registrados.toArray();
		for(int i = 0; i < lPartida_registrados.length; i++) {
			if(lPartida_registrados[i].getJuego().equals(aJuego)) {
				return lPartida_registrados[i];
			}
		}
		return null;
	}
	
	private void setORM_Partida_registrados(java.util.Set value) {
		this.ORM_partida_registrados = value;
	}
	
	private java.util.Set getORM_Partida_registrados() {
		return ORM_partida_registrados;
	}
	
	public final bbdd.Partida_registradoSetCollection partida_registrados = new bbdd.Partida_registradoSetCollection(this, _ormAdapter, bbdd.ORMConstants.KEY_USUARIO_REGISTRADO_PARTIDA_REGISTRADOS, bbdd.ORMConstants.KEY_PARTIDA_REGISTRADO_USUARIO_REGISTRADO, bbdd.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Escribe_sugerencia(java.util.Set value) {
		this.ORM_escribe_sugerencia = value;
	}
	
	private java.util.Set getORM_Escribe_sugerencia() {
		return ORM_escribe_sugerencia;
	}
	
	public final bbdd.SugerenciaSetCollection escribe_sugerencia = new bbdd.SugerenciaSetCollection(this, _ormAdapter, bbdd.ORMConstants.KEY_USUARIO_REGISTRADO_ESCRIBE_SUGERENCIA, bbdd.ORMConstants.KEY_SUGERENCIA_ES_ESCRITA_POR, bbdd.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Realiza_movimiento(java.util.Set value) {
		this.ORM_realiza_movimiento = value;
	}
	
	private java.util.Set getORM_Realiza_movimiento() {
		return ORM_realiza_movimiento;
	}
	
	public final bbdd.MovimientoSetCollection realiza_movimiento = new bbdd.MovimientoSetCollection(this, _ormAdapter, bbdd.ORMConstants.KEY_USUARIO_REGISTRADO_REALIZA_MOVIMIENTO, bbdd.ORMConstants.KEY_MOVIMIENTO_ES_REALIZADO, bbdd.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Tiene_favoritos(java.util.Set value) {
		this.ORM_tiene_favoritos = value;
	}
	
	private java.util.Set getORM_Tiene_favoritos() {
		return ORM_tiene_favoritos;
	}
	
	public final bbdd.JuegoSetCollection tiene_favoritos = new bbdd.JuegoSetCollection(this, _ormAdapter, bbdd.ORMConstants.KEY_USUARIO_REGISTRADO_TIENE_FAVORITOS, bbdd.ORMConstants.KEY_JUEGO_ES_FAVORITO_DE, bbdd.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
	private bbdd.BD_Usuarios_registrados pertenece_a;
	
	public bbdd.BD_Usuarios_registrados getPertenece_a()  {
		return this.pertenece_a;
	}
	
	public void setPertenece_a(bbdd.BD_Usuarios_registrados value)  {
		this.pertenece_a = value;
	}
	
}
