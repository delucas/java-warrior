package jwarrior.posiciones;

import jwarrior.referencias.Direccion;
import jwarrior.referencias.Espacio;

public class PosicionStubBuilder {

	public static Posicion construirPosicionJuntoAEnemigo() {
		return new PosicionJuntoAEnemigo();
	}

	public static Posicion construirPosicionConEnemigo() {
		return new PosicionConEnemigo();
	}
}

class PosicionJuntoAEnemigo extends Posicion {

	@Override
	public Posicion obtenerContigua(Direccion direccion) {
		return PosicionStubBuilder.construirPosicionConEnemigo();
	}
}

class PosicionConEnemigo extends Posicion {
	@Override
	public boolean hay(Espacio espacio) {
		return Espacio.ENEMIGO == espacio;
	}
}
