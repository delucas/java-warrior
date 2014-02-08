package jwarrior.piezas.unidades.mocks;

import jwarrior.piezas.unidades.Unidad;
import jwarrior.posiciones.Posicion;

public class UnidadPosicionada extends Unidad {

	protected UnidadPosicionada(Posicion posicion) {
		super(null, null);
		this.establecerPosicion(posicion);
	}

	@Override
	public String toCharacter() {
		return null;
	}

	@Override
	public void decir(String mensaje) {
	}

}
