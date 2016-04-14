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

public class SugerenciaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression id_Sugerencia;
	public final StringExpression texto;
	public final DateExpression fecha;
	
	public SugerenciaDetachedCriteria() {
		super(bbdd.Sugerencia.class, bbdd.SugerenciaCriteria.class);
		id_Sugerencia = new StringExpression("id_Sugerencia", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
	}
	
	public SugerenciaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.SugerenciaCriteria.class);
		id_Sugerencia = new StringExpression("id_Sugerencia", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
	}
	
	public Usuario_RegistradoDetachedCriteria createEs_escrita_porCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("es_escrita_por"));
	}
	
	public Administrador_DetachedCriteria createEs_atendida_porCriteria() {
		return new Administrador_DetachedCriteria(createCriteria("es_atendida_por"));
	}
	
	public Sugerencia uniqueSugerencia(PersistentSession session) {
		return (Sugerencia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Sugerencia[] listSugerencia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Sugerencia[]) list.toArray(new Sugerencia[list.size()]);
	}
}

