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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Usuario_RegistradoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression dni;
	public final StringExpression email;
	public final StringExpression password;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression cuenta;
	public final StringExpression pregunta;
	public final StringExpression respuesta;
	public final StringExpression enlace_imagen;
	public final DoubleExpression saldo;
	public final BooleanExpression inactivo;
	public final BooleanExpression desactivado;
	
	public Usuario_RegistradoDetachedCriteria() {
		super(bbdd.Usuario_Registrado.class, bbdd.Usuario_RegistradoCriteria.class);
		dni = new StringExpression("dni", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		cuenta = new StringExpression("cuenta", this.getDetachedCriteria());
		pregunta = new StringExpression("pregunta", this.getDetachedCriteria());
		respuesta = new StringExpression("respuesta", this.getDetachedCriteria());
		enlace_imagen = new StringExpression("enlace_imagen", this.getDetachedCriteria());
		saldo = new DoubleExpression("saldo", this.getDetachedCriteria());
		inactivo = new BooleanExpression("inactivo", this.getDetachedCriteria());
		desactivado = new BooleanExpression("desactivado", this.getDetachedCriteria());
	}
	
	public Usuario_RegistradoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.Usuario_RegistradoCriteria.class);
		dni = new StringExpression("dni", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		cuenta = new StringExpression("cuenta", this.getDetachedCriteria());
		pregunta = new StringExpression("pregunta", this.getDetachedCriteria());
		respuesta = new StringExpression("respuesta", this.getDetachedCriteria());
		enlace_imagen = new StringExpression("enlace_imagen", this.getDetachedCriteria());
		saldo = new DoubleExpression("saldo", this.getDetachedCriteria());
		inactivo = new BooleanExpression("inactivo", this.getDetachedCriteria());
		desactivado = new BooleanExpression("desactivado", this.getDetachedCriteria());
	}
	
	public Partida_registradoDetachedCriteria createPartida_registradosCriteria() {
		return new Partida_registradoDetachedCriteria(createCriteria("ORM_Partida_registrados"));
	}
	
	public SugerenciaDetachedCriteria createEscribe_sugerenciaCriteria() {
		return new SugerenciaDetachedCriteria(createCriteria("ORM_Escribe_sugerencia"));
	}
	
	public MovimientoDetachedCriteria createRealiza_movimientoCriteria() {
		return new MovimientoDetachedCriteria(createCriteria("ORM_Realiza_movimiento"));
	}
	
	public JuegoDetachedCriteria createTiene_favoritosCriteria() {
		return new JuegoDetachedCriteria(createCriteria("ORM_Tiene_favoritos"));
	}
	
	public Usuario_Registrado uniqueUsuario_Registrado(PersistentSession session) {
		return (Usuario_Registrado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario_Registrado[] listUsuario_Registrado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario_Registrado[]) list.toArray(new Usuario_Registrado[list.size()]);
	}
}

