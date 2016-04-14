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

public class MovimientoCriteria extends AbstractORMCriteria {
	public final StringExpression id_Movimiento;
	public final FloatExpression cantidad;
	public final DateExpression fecha;
	public final TimeExpression hora;
	
	public MovimientoCriteria(Criteria criteria) {
		super(criteria);
		id_Movimiento = new StringExpression("id_Movimiento", this);
		cantidad = new FloatExpression("cantidad", this);
		fecha = new DateExpression("fecha", this);
		hora = new TimeExpression("hora", this);
	}
	
	public MovimientoCriteria(PersistentSession session) {
		this(session.createCriteria(Movimiento.class));
	}
	
	public MovimientoCriteria() throws PersistentException {
		this(bbdd.ProyectoNuevoPersistentManager.instance().getSession());
	}
	
	public Usuario_RegistradoCriteria createEs_realizadoCriteria() {
		return new Usuario_RegistradoCriteria(createCriteria("es_realizado"));
	}
	
	public Movimiento uniqueMovimiento() {
		return (Movimiento) super.uniqueResult();
	}
	
	public Movimiento[] listMovimiento() {
		java.util.List list = super.list();
		return (Movimiento[]) list.toArray(new Movimiento[list.size()]);
	}
}

