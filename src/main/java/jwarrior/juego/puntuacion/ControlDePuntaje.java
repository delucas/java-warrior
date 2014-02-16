package jwarrior.juego.puntuacion;

import jwarrior.juego.Juego;
import jwarrior.observadores.ObservadorDePartida;
import jwarrior.observadores.ObservadorDeUnidades;
import jwarrior.piezas.unidades.Unidad;
import jwarrior.referencias.Espacio;

public class ControlDePuntaje implements ObservadorDePartida, ObservadorDeUnidades {

	private Puntaje puntaje = new Puntaje();

	@Override
	public void notificarMuerte(final Unidad unidad) {
		if (unidad.obtenerTipo() != Espacio.GUERRERO) {
			Integer puntos = unidad.obtenerSaludMaxima();
			this.puntaje.computar(puntos);
		}
	}

	@Override
	public void notificarTurno(final Juego partida) {
		Integer puntos = -1;
		this.puntaje.computar(puntos);
	}

	@Override
	public void notificarFinal(final Juego partida) {
		Integer puntos = partida.obtenerGuerrero().obtenerSaludActual() / 2;
		this.puntaje.computar(puntos);
	}

	public Integer obtenerPuntaje() {
		return this.puntaje.obtenerPuntaje();
	}

	public void establecerPuntaje(final Puntaje puntaje) {
		this.puntaje = puntaje;
	}
}
