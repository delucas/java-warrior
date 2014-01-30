package jwarrior.juego.niveles;

import java.util.List;

import jwarrior.juego.Jugador;
import jwarrior.posiciones.Posicion;

public abstract class Nivel {

	private String nombre;
	protected Jugador jugador;

	public Nivel(final String nombre, final Jugador jugador) {
		this.nombre = nombre;
		this.jugador = jugador;
	}

	public abstract List<Posicion> obtenerPosiciones();

	public String obtenerNombre() {
		return this.nombre;
	}

}
