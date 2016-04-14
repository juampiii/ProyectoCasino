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

public class JuegoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression id_juego;
	public final StringExpression nombre;
	public final StringExpression enlace_imagen;
	public final DoubleExpression cantidad_minima;
	public final BooleanExpression desactivado;
	public final IntegerExpression numero_minimo_usuarios;
	
	public JuegoDetachedCriteria() {
		super(bbdd.Juego.class, bbdd.JuegoCriteria.class);
		id_juego = new StringExpression("id_juego", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		enlace_imagen = new StringExpression("enlace_imagen", this.getDetachedCriteria());
		cantidad_minima = new DoubleExpression("cantidad_minima", this.getDetachedCriteria());
		desactivado = new BooleanExpression("desactivado", this.getDetachedCriteria());
		numero_minimo_usuarios = new IntegerExpression("numero_minimo_usuarios", this.getDetachedCriteria());
	}
	
	public JuegoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.JuegoCriteria.class);
		id_juego = new StringExpression("id_juego", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		enlace_imagen = new StringExpression("enlace_imagen", this.getDetachedCriteria());
		cantidad_minima = new DoubleExpression("cantidad_minima", this.getDetachedCriteria());
		desactivado = new BooleanExpression("desactivado", this.getDetachedCriteria());
		numero_minimo_usuarios = new IntegerExpression("numero_minimo_usuarios", this.getDetachedCriteria());
	}
	
	public Usuario_RegistradoDetachedCriteria createEs_favorito_deCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("ORM_Es_favorito_de"));
	}
	
	public Partida_registradoDetachedCriteria createPartida_registradosCriteria() {
		return new Partida_registradoDetachedCriteria(createCriteria("ORM_Partida_registrados"));
	}
	
	public Juego uniqueJuego(PersistentSession session) {
		return (Juego) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Juego[] listJuego(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Juego[]) list.toArray(new Juego[list.size()]);
	}
}

