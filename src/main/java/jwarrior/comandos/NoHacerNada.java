package jwarrior.comandos;

import jwarrior.unidades.Unidad;


public class NoHacerNada extends Comando {

	public NoHacerNada(final Unidad unidad) {
		super(unidad);
	}

	@Override
	public void ejecutar() {
		this.unidad.decir("no hace nada");
	}
}
