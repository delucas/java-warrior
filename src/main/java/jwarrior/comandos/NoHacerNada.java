package jwarrior.comandos;

import jwarrior.piezas.unidades.Unidad;


public class NoHacerNada extends Comando {

	public NoHacerNada(final Unidad unidad) {
		super(unidad);
	}

	@Override
	public void ejecutar() {
		Unidad unidadPerezosa = this.obtenerUnidad();
		unidadPerezosa.decir("no hace nada");
	}
}
