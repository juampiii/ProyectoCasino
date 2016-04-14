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

public class Usuario_no_IdentificadoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression ip;
	public final DoubleExpression tiempo;
	
	public Usuario_no_IdentificadoDetachedCriteria() {
		super(bbdd.Usuario_no_Identificado.class, bbdd.Usuario_no_IdentificadoCriteria.class);
		ip = new StringExpression("ip", this.getDetachedCriteria());
		tiempo = new DoubleExpression("tiempo", this.getDetachedCriteria());
	}
	
	public Usuario_no_IdentificadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.Usuario_no_IdentificadoCriteria.class);
		ip = new StringExpression("ip", this.getDetachedCriteria());
		tiempo = new DoubleExpression("tiempo", this.getDetachedCriteria());
	}
	
	public Partida_PublicaDetachedCriteria createPartida_PublicasCriteria() {
		return new Partida_PublicaDetachedCriteria(createCriteria("ORM_Partida_Publicas"));
	}
	
	public Usuario_no_Identificado uniqueUsuario_no_Identificado(PersistentSession session) {
		return (Usuario_no_Identificado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario_no_Identificado[] listUsuario_no_Identificado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario_no_Identificado[]) list.toArray(new Usuario_no_Identificado[list.size()]);
	}
}

