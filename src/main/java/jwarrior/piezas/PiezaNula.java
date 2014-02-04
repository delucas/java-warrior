package jwarrior.piezas;

import jwarrior.referencias.Espacio;

public class PiezaNula extends Pieza {

	public PiezaNula() {
		super(Espacio.VACIO);
	}

	@Override
	public String toCharacter() {
		return "_";
	}

}
