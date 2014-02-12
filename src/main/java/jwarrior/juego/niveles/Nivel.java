package jwarrior.juego.niveles;

import java.util.List;

import jwarrior.juego.Jugador;
import jwarrior.piezas.unidades.Guerrero;
import jwarrior.posiciones.Posicion;

public abstract class Nivel {

	private final String nombre;
	private final String plano;
	private Jugador jugador;

	public Nivel(final String nombre, final String plano, final Jugador jugador) {
		this.nombre = nombre;
		this.plano = plano;
		this.jugador = jugador;
	}

	public final List<Posicion> obtenerPosiciones() {
		ConstructorDeNiveles constructor = new ConstructorDeNiveles();
		return constructor.construirPosiciones(this.plano, crearGuerrero());
	}

	public final String obtenerNombre() {
		return this.nombre;
	}

	private Guerrero crearGuerrero() {
		return new Guerrero(this.jugador.obtenerNombreDelGuerrero(), this.jugador);
	}

}
