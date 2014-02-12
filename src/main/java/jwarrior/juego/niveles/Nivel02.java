package jwarrior.juego.niveles;

import java.util.List;

import jwarrior.juego.Jugador;
import jwarrior.posiciones.Posicion;

public class Nivel02 extends Nivel {

	public Nivel02(final Jugador jugador) {
		super("Nivel 02", jugador);
	}

	@Override
	public List<Posicion> obtenerPosiciones() {
		ConstructorDeNiveles constructor = new ConstructorDeNiveles();
		return constructor.construirPosiciones("PG_oooS", crearGuerrero());
	}

}
