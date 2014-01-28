package jwarrior.posiciones;

import static jwarrior.referencias.Espacio.*;
import jwarrior.referencias.Espacio;
import jwarrior.unidades.UnidadNula;

public class Salida extends Posicion {
	public Salida() {
		this.establecerUnidad(new UnidadNula());
	}

	@Override
	public boolean hay(Espacio espacio) {
		return SALIDA == espacio;
	}

	@Override
	public String toString() {
		return "la salida";
	}

	@Override
	public String toCharacter() {
		return "S";
	}

}
