package jwarrior.sentidos;

import jwarrior.posiciones.Posicion;
import jwarrior.referencias.Direccion;
import jwarrior.referencias.Espacio;
import jwarrior.unidades.Unidad;

public class Sentir {

	private Direccion direccion;
	private Unidad unidad;

	public Sentir(Direccion direccion, Unidad unidad) {
		this.direccion = direccion;
		this.unidad = unidad;
	}

	public boolean hay(Espacio espacio) {
		Posicion posicionActual = unidad.obtenerPosicion();
		Posicion posicionDestino = posicionActual.obtenerContigua(direccion);

		return posicionDestino.hay(espacio);
	}

}
