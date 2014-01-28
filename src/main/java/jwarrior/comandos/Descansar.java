package jwarrior.comandos;

import jwarrior.unidades.Unidad;

public class Descansar extends Comando {

	public Descansar(Unidad unidad) {
		super(unidad);
	}

	@Override
	public void ejecutar() {
		if (!this.unidad.estaSaludable()) {
			Integer cantidadARestaurar = (int) Math.round(this.unidad
					.obtenerSaludMaxima() * 0.1);
			this.unidad.curar(cantidadARestaurar);
			this.unidad.decir("está descansando y logra curarse a "
					+ this.unidad.obtenerSaludActual() + "/"
					+ this.unidad.obtenerSaludMaxima());
		} else {
			this.unidad.decir("ya estaba completamente curado");
		}
	}
}
