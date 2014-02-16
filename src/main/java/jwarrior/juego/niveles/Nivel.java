package jwarrior.juego.niveles;

import java.util.List;

import jwarrior.juego.Jugador;
import jwarrior.observadores.ObservadorDeUnidades;
import jwarrior.piezas.unidades.Guerrero;
import jwarrior.posiciones.Posicion;

public abstract class Nivel {

	private final String nombre;
	private final String plano;
	private final Jugador jugador;

	public Nivel(final String nombre, final String plano, final Jugador jugador) {
		this.nombre = nombre;
		this.plano = plano;
		this.jugador = jugador;
	}

	public List<Posicion> obtenerPosiciones(final ObservadorDeUnidades observadorDeUnidades) {
		ConstructorDeNiveles constructor = new ConstructorDeNiveles();
		return constructor.construirPosiciones(this.plano, observadorDeUnidades, crearGuerrero());
	}

	public final String obtenerNombre() {
		return this.nombre;
	}

	private Guerrero crearGuerrero() {
		Guerrero resultado = new Guerrero(this.jugador.obtenerNombreDelGuerrero(), this.jugador);
		return resultado;
	}

}
