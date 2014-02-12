package jwarrior.juego.niveles;

import java.util.List;

import jwarrior.juego.Jugador;
import jwarrior.posiciones.Posicion;

public class Nivel01 extends Nivel {

	public Nivel01(final Jugador jugador) {
		super("Nivel 01", jugador);
	}

	@Override
	public List<Posicion> obtenerPosiciones() {
		ConstructorDeNiveles constructor = new ConstructorDeNiveles();
		return constructor.construirPosiciones("PG____S", crearGuerrero());
	}
}
