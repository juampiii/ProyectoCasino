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

public class Usuario_no_IdentificadoCriteria extends AbstractORMCriteria {
	public final StringExpression ip;
	public final DoubleExpression tiempo;
	
	public Usuario_no_IdentificadoCriteria(Criteria criteria) {
		super(criteria);
		ip = new StringExpression("ip", this);
		tiempo = new DoubleExpression("tiempo", this);
	}
	
	public Usuario_no_IdentificadoCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario_no_Identificado.class));
	}
	
	public Usuario_no_IdentificadoCriteria() throws PersistentException {
		this(bbdd.ProyectoNuevoPersistentManager.instance().getSession());
	}
	
	public Partida_PublicaCriteria createPartida_PublicasCriteria() {
		return new Partida_PublicaCriteria(createCriteria("ORM_Partida_Publicas"));
	}
	
	public Usuario_no_Identificado uniqueUsuario_no_Identificado() {
		return (Usuario_no_Identificado) super.uniqueResult();
	}
	
	public Usuario_no_Identificado[] listUsuario_no_Identificado() {
		java.util.List list = super.list();
		return (Usuario_no_Identificado[]) list.toArray(new Usuario_no_Identificado[list.size()]);
	}
}

