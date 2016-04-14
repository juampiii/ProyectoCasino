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

public class Gestor_de_Juegos__DetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression dni;
	public final StringExpression email;
	public final StringExpression password;
	
	public Gestor_de_Juegos__DetachedCriteria() {
		super(bbdd.Gestor_de_Juegos__.class, bbdd.Gestor_de_Juegos__Criteria.class);
		dni = new StringExpression("dni", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public Gestor_de_Juegos__DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.Gestor_de_Juegos__Criteria.class);
		dni = new StringExpression("dni", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public SugerenciaDetachedCriteria createAtiende_sugerenciaCriteria() {
		return new SugerenciaDetachedCriteria(createCriteria("ORM_Atiende_sugerencia"));
	}
	
	public Gestor_de_Juegos__ uniqueGestor_de_Juegos__(PersistentSession session) {
		return (Gestor_de_Juegos__) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Gestor_de_Juegos__[] listGestor_de_Juegos__(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Gestor_de_Juegos__[]) list.toArray(new Gestor_de_Juegos__[list.size()]);
	}
}

