package jwarrior.posiciones;

import static jwarrior.referencias.Espacio.*;
import jwarrior.referencias.Espacio;
import jwarrior.unidades.UnidadNula;

public class Puerta extends Posicion {
	public Puerta() {
		this.establecerUnidad(new UnidadNula());
	}

	@Override
	public boolean hay(Espacio espacio) {
		return PUERTA == espacio;
	}

	@Override
	public String toString() {
		return "la puerta";
	}

	@Override
	public String toCharacter() {
		return "P";
	}
}
