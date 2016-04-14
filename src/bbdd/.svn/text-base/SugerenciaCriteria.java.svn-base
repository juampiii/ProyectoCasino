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

public class SugerenciaCriteria extends AbstractORMCriteria {
	public final StringExpression id_Sugerencia;
	public final StringExpression texto;
	public final DateExpression fecha;
	
	public SugerenciaCriteria(Criteria criteria) {
		super(criteria);
		id_Sugerencia = new StringExpression("id_Sugerencia", this);
		texto = new StringExpression("texto", this);
		fecha = new DateExpression("fecha", this);
	}
	
	public SugerenciaCriteria(PersistentSession session) {
		this(session.createCriteria(Sugerencia.class));
	}
	
	public SugerenciaCriteria() throws PersistentException {
		this(bbdd.ProyectoNuevoPersistentManager.instance().getSession());
	}
	
	public Usuario_RegistradoCriteria createEs_escrita_porCriteria() {
		return new Usuario_RegistradoCriteria(createCriteria("es_escrita_por"));
	}
	
	public Administrador_Criteria createEs_atendida_porCriteria() {
		return new Administrador_Criteria(createCriteria("es_atendida_por"));
	}
	
	public Sugerencia uniqueSugerencia() {
		return (Sugerencia) super.uniqueResult();
	}
	
	public Sugerencia[] listSugerencia() {
		java.util.List list = super.list();
		return (Sugerencia[]) list.toArray(new Sugerencia[list.size()]);
	}
}

