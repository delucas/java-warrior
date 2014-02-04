package jwarrior.piezas;

import static jwarrior.referencias.Espacio.PUERTA;
import jwarrior.posiciones.Posicion;
import jwarrior.referencias.Espacio;

public class Puerta extends Posicion {

	public Puerta() {
		this.establecerPieza(new PiezaNula());
	}

	@Override
	public boolean hay(final Espacio espacio) {
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
