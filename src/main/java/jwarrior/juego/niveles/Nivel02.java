package jwarrior.juego.niveles;

import java.util.ArrayList;
import java.util.List;

import jwarrior.juego.Jugador;
import jwarrior.posiciones.Posicion;
import jwarrior.posiciones.Puerta;
import jwarrior.posiciones.Salida;
import jwarrior.unidades.Guerrero;
import jwarrior.unidades.Orco;

public class Nivel02 extends Nivel {

	public Nivel02(final Jugador jugador) {
		super("Nivel 02", jugador);
	}

	@Override
	public List<Posicion> obtenerPosiciones() {
		ArrayList<Posicion> posiciones = new ArrayList<>();
		posiciones.add(new Puerta());
		posiciones.add(new Posicion(new Guerrero(this.jugador.obtenerNombreDelGuerrero(), this.jugador)));
		posiciones.add(new Posicion());
		posiciones.add(new Posicion(new Orco()));
		posiciones.add(new Posicion(new Orco()));
		posiciones.add(new Posicion(new Orco()));
		posiciones.add(new Salida());

		return posiciones;
	}

}
