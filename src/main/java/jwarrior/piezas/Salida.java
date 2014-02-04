package jwarrior.piezas;

import static jwarrior.referencias.Espacio.SALIDA;
import jwarrior.posiciones.Posicion;
import jwarrior.referencias.Espacio;

public class Salida extends Posicion {

	public Salida() {
		this.establecerPieza(new PiezaNula());
	}

	@Override
	public boolean hay(final Espacio espacio) {
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
