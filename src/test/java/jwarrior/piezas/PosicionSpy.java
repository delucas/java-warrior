package jwarrior.piezas;

import jwarrior.posiciones.Posicion;

public class PosicionSpy extends Posicion {

	private boolean seLibero = false;

	@Override
	public void liberar() {
		this.seLibero = true;
	}

	public boolean verificarQueSeLibero() {
		return this.seLibero;
	}

}
