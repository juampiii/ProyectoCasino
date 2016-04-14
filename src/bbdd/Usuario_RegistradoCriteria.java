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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Usuario_RegistradoCriteria extends AbstractORMCriteria {
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
	
	public Usuario_RegistradoCriteria(Criteria criteria) {
		super(criteria);
		dni = new StringExpression("dni", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		nombre = new StringExpression("nombre", this);
		apellidos = new StringExpression("apellidos", this);
		cuenta = new StringExpression("cuenta", this);
		pregunta = new StringExpression("pregunta", this);
		respuesta = new StringExpression("respuesta", this);
		enlace_imagen = new StringExpression("enlace_imagen", this);
		saldo = new DoubleExpression("saldo", this);
		inactivo = new BooleanExpression("inactivo", this);
		desactivado = new BooleanExpression("desactivado", this);
	}
	
	public Usuario_RegistradoCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario_Registrado.class));
	}
	
	public Usuario_RegistradoCriteria() throws PersistentException {
		this(bbdd.ProyectoNuevoPersistentManager.instance().getSession());
	}
	
	public Partida_registradoCriteria createPartida_registradosCriteria() {
		return new Partida_registradoCriteria(createCriteria("ORM_Partida_registrados"));
	}
	
	public SugerenciaCriteria createEscribe_sugerenciaCriteria() {
		return new SugerenciaCriteria(createCriteria("ORM_Escribe_sugerencia"));
	}
	
	public MovimientoCriteria createRealiza_movimientoCriteria() {
		return new MovimientoCriteria(createCriteria("ORM_Realiza_movimiento"));
	}
	
	public JuegoCriteria createTiene_favoritosCriteria() {
		return new JuegoCriteria(createCriteria("ORM_Tiene_favoritos"));
	}
	
	public Usuario_Registrado uniqueUsuario_Registrado() {
		return (Usuario_Registrado) super.uniqueResult();
	}
	
	public Usuario_Registrado[] listUsuario_Registrado() {
		java.util.List list = super.list();
		return (Usuario_Registrado[]) list.toArray(new Usuario_Registrado[list.size()]);
	}
}

