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

public class Juego_PublicoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression id_juego;
	public final StringExpression nombre;
	public final StringExpression enlace_imagen;
	public final DoubleExpression cantidad_minima;
	public final BooleanExpression desactivado;
	public final IntegerExpression numero_minimo_usuarios;
	
	public Juego_PublicoDetachedCriteria() {
		super(bbdd.Juego_Publico.class, bbdd.Juego_PublicoCriteria.class);
		id_juego = new StringExpression("id_juego", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		enlace_imagen = new StringExpression("enlace_imagen", this.getDetachedCriteria());
		cantidad_minima = new DoubleExpression("cantidad_minima", this.getDetachedCriteria());
		desactivado = new BooleanExpression("desactivado", this.getDetachedCriteria());
		numero_minimo_usuarios = new IntegerExpression("numero_minimo_usuarios", this.getDetachedCriteria());
	}
	
	public Juego_PublicoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, bbdd.Juego_PublicoCriteria.class);
		id_juego = new StringExpression("id_juego", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		enlace_imagen = new StringExpression("enlace_imagen", this.getDetachedCriteria());
		cantidad_minima = new DoubleExpression("cantidad_minima", this.getDetachedCriteria());
		desactivado = new BooleanExpression("desactivado", this.getDetachedCriteria());
		numero_minimo_usuarios = new IntegerExpression("numero_minimo_usuarios", this.getDetachedCriteria());
	}
	
	public Partida_PublicaDetachedCriteria createPartida_PublicasCriteria() {
		return new Partida_PublicaDetachedCriteria(createCriteria("ORM_Partida_Publicas"));
	}
	
	public Usuario_RegistradoDetachedCriteria createEs_favorito_deCriteria() {
		return new Usuario_RegistradoDetachedCriteria(createCriteria("ORM_Es_favorito_de"));
	}
	
	public Partida_registradoDetachedCriteria createPartida_registradosCriteria() {
		return new Partida_registradoDetachedCriteria(createCriteria("ORM_Partida_registrados"));
	}
	
	public Juego_Publico uniqueJuego_Publico(PersistentSession session) {
		return (Juego_Publico) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Juego_Publico[] listJuego_Publico(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Juego_Publico[]) list.toArray(new Juego_Publico[list.size()]);
	}
}

