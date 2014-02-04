package jwarrior.piezas;

import jwarrior.posiciones.Posicion;
import jwarrior.referencias.Espacio;

public abstract class Pieza {

	protected Espacio tipo;
	private Posicion posicion;

	protected Pieza(final Espacio tipo) {
		this.tipo = tipo;
	}

	// Getters / Setters

	public final Espacio obtenerTipo() {
		return tipo;
	}

	public final void establecerPosicion(final Posicion posicion) {
		this.posicion = posicion;
	}

	public final Posicion obtenerPosicion() {
		return this.posicion;
	}

	public abstract String toCharacter();

	public boolean esUnidad() {
		return false;
	}
}
