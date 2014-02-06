package jwarrior.comandos;

import jwarrior.piezas.unidades.Unidad;

public class Descansar extends Comando {

	private static final double INDICE_DE_RESTAURACION = 0.1;

	public Descansar(final Unidad unidad) {
		super(unidad);
	}

	@Override
	public void ejecutar() {
		Unidad unidadQueReposa = this.obtenerUnidad();
		if (unidadQueReposa.estaSaludable()) {
			unidadQueReposa.decir("ya estaba completamente curado");
		} else {
			Integer cantidadARestaurar = (int) Math.round(unidadQueReposa
					.obtenerSaludMaxima() * INDICE_DE_RESTAURACION);
			unidadQueReposa.curar(cantidadARestaurar);
			unidadQueReposa.decir("está descansando y logra curarse a "
					+ unidadQueReposa.obtenerSaludActual() + "/"
					+ unidadQueReposa.obtenerSaludMaxima());
		}
	}
}
