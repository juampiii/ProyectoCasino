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

public class ConfiguracionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression numero_maximo_partidas;
	
	public ConfiguracionDetachedCriteria() {
		super(bbdd.Configuracion.class, bbdd.ConfiguracionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		numero_maximo_partidas = new IntegerExpression("numero_maximo_partidas", this.getDetachedCriteria());
	}
	
	public ConfiguracionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.ConfiguracionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		numero_maximo_partidas = new IntegerExpression("numero_maximo_partidas", this.getDetachedCriteria());
	}
	
	public Configuracion uniqueConfiguracion(PersistentSession session) {
		return (Configuracion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Configuracion[] listConfiguracion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Configuracion[]) list.toArray(new Configuracion[list.size()]);
	}
}

