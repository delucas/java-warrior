package jwarrior.sentidos;

import jwarrior.piezas.unidades.Unidad;
import jwarrior.posiciones.Posicion;
import jwarrior.referencias.Direccion;
import jwarrior.referencias.Espacio;

public class Sentir {

	private final Direccion direccion;
	private final Unidad unidad;

	public Sentir(final Direccion direccion, final Unidad unidad) {
		this.direccion = direccion;
		this.unidad = unidad;
	}

	public boolean hay(final Espacio espacio) {
		Posicion posicionActual = unidad.obtenerPosicion();
		Posicion posicionDestino = posicionActual.obtenerContigua(direccion);

		return posicionDestino.hay(espacio);
	}

}
