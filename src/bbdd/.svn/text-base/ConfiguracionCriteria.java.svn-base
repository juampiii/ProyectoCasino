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

public class ConfiguracionCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression numero_maximo_partidas;
	
	public ConfiguracionCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		numero_maximo_partidas = new IntegerExpression("numero_maximo_partidas", this);
	}
	
	public ConfiguracionCriteria(PersistentSession session) {
		this(session.createCriteria(Configuracion.class));
	}
	
	public ConfiguracionCriteria() throws PersistentException {
		this(bbdd.ProyectoNuevoPersistentManager.instance().getSession());
	}
	
	public Configuracion uniqueConfiguracion() {
		return (Configuracion) super.uniqueResult();
	}
	
	public Configuracion[] listConfiguracion() {
		java.util.List list = super.list();
		return (Configuracion[]) list.toArray(new Configuracion[list.size()]);
	}
}

