package jwarrior.juego.niveles;

import java.util.List;

import jwarrior.juego.Jugador;
import jwarrior.posiciones.Posicion;

public class Nivel03 extends Nivel {

	public Nivel03(final Jugador jugador) {
		super("Nivel 03", jugador);
	}

	@Override
	public List<Posicion> obtenerPosiciones() {
		ConstructorDeNiveles constructor = new ConstructorDeNiveles();
		return constructor.construirPosiciones("PG_o_o_oo_oS", crearGuerrero());
	}

}
