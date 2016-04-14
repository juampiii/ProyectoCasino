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

public class Partida_registradoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DateExpression fecha;
	public final DoubleExpression hora_inicio;
	public final DoubleExpression cantidad;
	public final DoubleExpression hora_fin;
	
	public Partida_registradoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		fecha = new DateExpression("fecha", this);
		hora_inicio = new DoubleExpression("hora_inicio", this);
		cantidad = new DoubleExpression("cantidad", this);
		hora_fin = new DoubleExpression("hora_fin", this);
	}
	
	public Partida_registradoCriteria(PersistentSession session) {
		this(session.createCriteria(Partida_registrado.class));
	}
	
	public Partida_registradoCriteria() throws PersistentException {
		this(bbdd.ProyectoNuevoPersistentManager.instance().getSession());
	}
	
	public Usuario_RegistradoCriteria createUsuario_RegistradoCriteria() {
		return new Usuario_RegistradoCriteria(createCriteria("ORM_Usuario_Registrado"));
	}
	
	public JuegoCriteria createJuegoCriteria() {
		return new JuegoCriteria(createCriteria("ORM_Juego"));
	}
	
	public Partida_registrado uniquePartida_registrado() {
		return (Partida_registrado) super.uniqueResult();
	}
	
	public Partida_registrado[] listPartida_registrado() {
		java.util.List list = super.list();
		return (Partida_registrado[]) list.toArray(new Partida_registrado[list.size()]);
	}
}

