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

public class Partida_PublicaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DateExpression fecha;
	public final DoubleExpression hora_inicio;
	public final DoubleExpression hora_fin;
	
	public Partida_PublicaDetachedCriteria() {
		super(bbdd.Partida_Publica.class, bbdd.Partida_PublicaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		hora_inicio = new DoubleExpression("hora_inicio", this.getDetachedCriteria());
		hora_fin = new DoubleExpression("hora_fin", this.getDetachedCriteria());
	}
	
	public Partida_PublicaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.Partida_PublicaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		hora_inicio = new DoubleExpression("hora_inicio", this.getDetachedCriteria());
		hora_fin = new DoubleExpression("hora_fin", this.getDetachedCriteria());
	}
	
	public Juego_PublicoDetachedCriteria createJuego_PublicoCriteria() {
		return new Juego_PublicoDetachedCriteria(createCriteria("juego_Publico"));
	}
	
	public Usuario_no_IdentificadoDetachedCriteria createUsuario_no_IdentificadoCriteria() {
		return new Usuario_no_IdentificadoDetachedCriteria(createCriteria("usuario_no_Identificado"));
	}
	
	public Partida_Publica uniquePartida_Publica(PersistentSession session) {
		return (Partida_Publica) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Partida_Publica[] listPartida_Publica(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Partida_Publica[]) list.toArray(new Partida_Publica[list.size()]);
	}
}

