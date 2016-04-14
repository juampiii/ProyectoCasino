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

public class Juego_PublicoCriteria extends AbstractORMCriteria {
	public final StringExpression id_juego;
	public final StringExpression nombre;
	public final StringExpression enlace_imagen;
	public final DoubleExpression cantidad_minima;
	public final BooleanExpression desactivado;
	public final IntegerExpression numero_minimo_usuarios;
	
	public Juego_PublicoCriteria(Criteria criteria) {
		super(criteria);
		id_juego = new StringExpression("id_juego", this);
		nombre = new StringExpression("nombre", this);
		enlace_imagen = new StringExpression("enlace_imagen", this);
		cantidad_minima = new DoubleExpression("cantidad_minima", this);
		desactivado = new BooleanExpression("desactivado", this);
		numero_minimo_usuarios = new IntegerExpression("numero_minimo_usuarios", this);
	}
	
	public Juego_PublicoCriteria(PersistentSession session) {
		this(session.createCriteria(Juego_Publico.class));
	}
	
	public Juego_PublicoCriteria() throws PersistentException {
		this(bbdd.ProyectoNuevoPersistentManager.instance().getSession());
	}
	
	public Partida_PublicaCriteria createPartida_PublicasCriteria() {
		return new Partida_PublicaCriteria(createCriteria("ORM_Partida_Publicas"));
	}
	
	public Usuario_RegistradoCriteria createEs_favorito_deCriteria() {
		return new Usuario_RegistradoCriteria(createCriteria("ORM_Es_favorito_de"));
	}
	
	public Partida_registradoCriteria createPartida_registradosCriteria() {
		return new Partida_registradoCriteria(createCriteria("ORM_Partida_registrados"));
	}
	
	public Juego_Publico uniqueJuego_Publico() {
		return (Juego_Publico) super.uniqueResult();
	}
	
	public Juego_Publico[] listJuego_Publico() {
		java.util.List list = super.list();
		return (Juego_Publico[]) list.toArray(new Juego_Publico[list.size()]);
	}
}

