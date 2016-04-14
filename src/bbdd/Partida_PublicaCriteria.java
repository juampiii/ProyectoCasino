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

public class Partida_PublicaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DateExpression fecha;
	public final DoubleExpression hora_inicio;
	public final DoubleExpression hora_fin;
	
	public Partida_PublicaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		fecha = new DateExpression("fecha", this);
		hora_inicio = new DoubleExpression("hora_inicio", this);
		hora_fin = new DoubleExpression("hora_fin", this);
	}
	
	public Partida_PublicaCriteria(PersistentSession session) {
		this(session.createCriteria(Partida_Publica.class));
	}
	
	public Partida_PublicaCriteria() throws PersistentException {
		this(bbdd.ProyectoNuevoPersistentManager.instance().getSession());
	}
	
	public Juego_PublicoCriteria createJuego_PublicoCriteria() {
		return new Juego_PublicoCriteria(createCriteria("ORM_Juego_Publico"));
	}
	
	public Usuario_no_IdentificadoCriteria createUsuario_no_IdentificadoCriteria() {
		return new Usuario_no_IdentificadoCriteria(createCriteria("ORM_Usuario_no_Identificado"));
	}
	
	public Partida_Publica uniquePartida_Publica() {
		return (Partida_Publica) super.uniqueResult();
	}
	
	public Partida_Publica[] listPartida_Publica() {
		java.util.List list = super.list();
		return (Partida_Publica[]) list.toArray(new Partida_Publica[list.size()]);
	}
}

