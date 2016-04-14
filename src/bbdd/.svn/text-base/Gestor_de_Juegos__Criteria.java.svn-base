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

public class Gestor_de_Juegos__Criteria extends AbstractORMCriteria {
	public final StringExpression dni;
	public final StringExpression email;
	public final StringExpression password;
	
	public Gestor_de_Juegos__Criteria(Criteria criteria) {
		super(criteria);
		dni = new StringExpression("dni", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
	}
	
	public Gestor_de_Juegos__Criteria(PersistentSession session) {
		this(session.createCriteria(Gestor_de_Juegos__.class));
	}
	
	public Gestor_de_Juegos__Criteria() throws PersistentException {
		this(bbdd.ProyectoNuevoPersistentManager.instance().getSession());
	}
	
	public SugerenciaCriteria createAtiende_sugerenciaCriteria() {
		return new SugerenciaCriteria(createCriteria("ORM_Atiende_sugerencia"));
	}
	
	public Gestor_de_Juegos__ uniqueGestor_de_Juegos__() {
		return (Gestor_de_Juegos__) super.uniqueResult();
	}
	
	public Gestor_de_Juegos__[] listGestor_de_Juegos__() {
		java.util.List list = super.list();
		return (Gestor_de_Juegos__[]) list.toArray(new Gestor_de_Juegos__[list.size()]);
	}
}

