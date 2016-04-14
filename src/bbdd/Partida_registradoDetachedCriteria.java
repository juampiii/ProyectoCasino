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

public class Partida_registradoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DateExpression fecha;
	public final DoubleExpression hora_inicio;
	public final DoubleExpression cantidad;
	public final DoubleExpression hora_fin;
	
	public Partida_registradoDetachedCriteria() {
		super(bbdd.Partida_registrado.class, bbdd.Partida_registradoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		hora_inicio = new DoubleExpression("hora_inicio", this.getDetachedCriteria());
		cantidad = new DoubleExpression("cantidad", this.getDetachedCriteria());
		hora_fin = new DoubleExpression("hora_fin", this.getDetachedCriteria());
	}
	
	public Partida_registradoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.Partida_registradoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		hora_inicio = new DoubleExpression("hora_inicio", this.getDetachedCriteria());
		cantidad = new DoubleExpression("cantidad", this.getDetachedCriteria());
		hora_fin = new DoubleExpression("hora_fin", this.getDetachedCriteria());
	}
	
	public Usuario_RegistradoDetachedCriteria createUsuario_RegistradoCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("usuario_Registrado"));
	}
	
	public JuegoDetachedCriteria createJuegoCriteria() {
		return new JuegoDetachedCriteria(createCriteria("juego"));
	}
	
	public Partida_registrado uniquePartida_registrado(PersistentSession session) {
		return (Partida_registrado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Partida_registrado[] listPartida_registrado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Partida_registrado[]) list.toArray(new Partida_registrado[list.size()]);
	}
}

