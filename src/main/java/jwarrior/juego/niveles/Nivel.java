package jwarrior.juego.niveles;

import java.util.List;

import jwarrior.juego.Jugador;
import jwarrior.posiciones.Posicion;

public abstract class Nivel {

	protected String nombre;
	protected Jugador jugador;

	public Nivel(Jugador jugador) {
		this.jugador = jugador;
	}

	public abstract List<Posicion> obtenerPosiciones();

	public String obtenerNombre() {
		return this.nombre;
	}

}
