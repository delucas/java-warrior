package jwarrior.juego.niveles;

import java.util.List;

import jwarrior.juego.Jugador;
import jwarrior.piezas.unidades.Guerrero;
import jwarrior.posiciones.Posicion;

public abstract class Nivel {

	private final String nombre;
	private Jugador jugador;

	public Nivel(final String nombre, final Jugador jugador) {
		this.nombre = nombre;
		this.jugador = jugador;
	}

	public abstract List<Posicion> obtenerPosiciones();

	public String obtenerNombre() {
		return this.nombre;
	}

	protected Guerrero crearGuerrero() {
		return new Guerrero(this.jugador.obtenerNombreDelGuerrero(), this.jugador);
	}

}
