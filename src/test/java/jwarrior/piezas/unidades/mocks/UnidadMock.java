package jwarrior.piezas.unidades.mocks;

import jwarrior.piezas.unidades.Unidad;
import jwarrior.referencias.Espacio;

public abstract class UnidadMock extends Unidad {

	protected UnidadMock() {
		super(null, null);
	}

	protected UnidadMock(String nombre, Espacio espacio) {
		super(nombre, espacio);
	}

	private boolean invocoMorir = false;

	@Override
	public String toCharacter() {
		return null;
	}

	@Override
	public void decir(String mensaje) {
	}

	@Override
	public void morir() {
		this.invocoMorir = true;
	}

	public boolean invocoMorir() {
		return this.invocoMorir;
	}

}
