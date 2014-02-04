package jwarrior.comandos;

import jwarrior.piezas.unidades.Unidad;

public class Descansar extends Comando {

	private static final double INDICE_DE_RESTAURACION = 0.1;

	public Descansar(final Unidad unidad) {
		super(unidad);
	}

	@Override
	public void ejecutar() {
		if (this.unidad.estaSaludable()) {
			this.unidad.decir("ya estaba completamente curado");
		} else {
			Integer cantidadARestaurar = (int) Math.round(this.unidad
					.obtenerSaludMaxima() * INDICE_DE_RESTAURACION);
			this.unidad.curar(cantidadARestaurar);
			this.unidad.decir("está descansando y logra curarse a "
					+ this.unidad.obtenerSaludActual() + "/"
					+ this.unidad.obtenerSaludMaxima());
		}
	}
}
