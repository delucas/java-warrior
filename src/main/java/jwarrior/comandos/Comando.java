package jwarrior.comandos;

import jwarrior.piezas.unidades.Unidad;

public abstract class Comando {

	private final Unidad unidad;

	public Comando(final Unidad unidadProtagonista) {
		this.unidad = unidadProtagonista;
	}

	public void ejecutarComando() {
		if (this.unidad.estaVivo()) {
			this.ejecutar();
		}
	}

	protected abstract void ejecutar();

	public Unidad obtenerUnidad() {
		return this.unidad;
	}
}
