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

public class Administrador_Criteria extends AbstractORMCriteria {
	public final StringExpression dni;
	public final StringExpression email;
	public final StringExpression password;
	
	public Administrador_Criteria(Criteria criteria) {
		super(criteria);
		dni = new StringExpression("dni", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
	}
	
	public Administrador_Criteria(PersistentSession session) {
		this(session.createCriteria(Administrador_.class));
	}
	
	public Administrador_Criteria() throws PersistentException {
		this(bbdd.ProyectoNuevoPersistentManager.instance().getSession());
	}
	
	public SugerenciaCriteria createAtiende_sugerenciaCriteria() {
		return new SugerenciaCriteria(createCriteria("ORM_Atiende_sugerencia"));
	}
	
	public Administrador_ uniqueAdministrador_() {
		return (Administrador_) super.uniqueResult();
	}
	
	public Administrador_[] listAdministrador_() {
		java.util.List list = super.list();
		return (Administrador_[]) list.toArray(new Administrador_[list.size()]);
	}
}

