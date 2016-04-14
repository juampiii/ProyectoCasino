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

public class MovimientoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression id_Movimiento;
	public final FloatExpression cantidad;
	public final DateExpression fecha;
	public final TimeExpression hora;
	
	public MovimientoDetachedCriteria() {
		super(bbdd.Movimiento.class, bbdd.MovimientoCriteria.class);
		id_Movimiento = new StringExpression("id_Movimiento", this.getDetachedCriteria());
		cantidad = new FloatExpression("cantidad", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		hora = new TimeExpression("hora", this.getDetachedCriteria());
	}
	
	public MovimientoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.MovimientoCriteria.class);
		id_Movimiento = new StringExpression("id_Movimiento", this.getDetachedCriteria());
		cantidad = new FloatExpression("cantidad", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		hora = new TimeExpression("hora", this.getDetachedCriteria());
	}
	
	public Usuario_RegistradoDetachedCriteria createEs_realizadoCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("es_realizado"));
	}
	
	public Movimiento uniqueMovimiento(PersistentSession session) {
		return (Movimiento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Movimiento[] listMovimiento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Movimiento[]) list.toArray(new Movimiento[list.size()]);
	}
}

