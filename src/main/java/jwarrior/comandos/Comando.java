package jwarrior.comandos;

import jwarrior.unidades.Unidad;

public abstract class Comando {

	protected final Unidad unidad;

	public Comando(final Unidad unidad) {
		this.unidad = unidad;
	}

	public void ejecutarComando() {
		if (this.unidad.estaVivo()) {
			this.ejecutar();
		}
	}

	protected abstract void ejecutar();
}
