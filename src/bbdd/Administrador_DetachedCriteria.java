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

public class Administrador_DetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression dni;
	public final StringExpression email;
	public final StringExpression password;
	
	public Administrador_DetachedCriteria() {
		super(bbdd.Administrador_.class, bbdd.Administrador_Criteria.class);
		dni = new StringExpression("dni", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public Administrador_DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.Administrador_Criteria.class);
		dni = new StringExpression("dni", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public SugerenciaDetachedCriteria createAtiende_sugerenciaCriteria() {
		return new SugerenciaDetachedCriteria(createCriteria("ORM_Atiende_sugerencia"));
	}
	
	public Administrador_ uniqueAdministrador_(PersistentSession session) {
		return (Administrador_) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrador_[] listAdministrador_(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrador_[]) list.toArray(new Administrador_[list.size()]);
	}
}

