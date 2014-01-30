package jwarrior.posiciones;

import jwarrior.referencias.Espacio;

public class PosicionInexistente extends Posicion {

	@Override
	public boolean hay(final Espacio espacio) {
		return Espacio.INEXISTENTE == espacio;
	}

	@Override
	public String toString() {
		return "la nada";
	}

}
