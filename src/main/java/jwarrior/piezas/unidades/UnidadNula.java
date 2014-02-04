package jwarrior.piezas.unidades;

import jwarrior.referencias.Espacio;


public class UnidadNula extends Unidad {

	public UnidadNula() {
		super("la nada", Espacio.VACIO);
	}

	@Override
	public void recibirGolpe(final Integer fuerza) {
		// no puede recibir golpes!
	}

	@Override
	public String toCharacter() {
		return "_";
	}

}
