package jwarrior.juego.puntuacion;

import jwarrior.piezas.unidades.Unidad;
import jwarrior.ui.InterfazDeUsuario;

public class Puntaje {

	private static final int PUNTAJE_INICIAL = 10;

	private Integer puntos = PUNTAJE_INICIAL;

	public Integer obtenerPuntaje() {
		return this.puntos;
	}

	// TODO: implementar una CalculadoraDePuntaje
	public void notificarTurno() {
		Integer puntos = 1;
		mensaje("-" + puntos);
		this.puntos -= puntos;
	}

	// TODO: implementar una CalculadoraDePuntaje
	public void notificarMuerteEnemigo(final Unidad unidad) {
		Integer puntos = unidad.obtenerSaludMaxima();
		mensaje("+" + puntos);
		this.puntos += puntos;
	}

	// TODO: implementar una CalculadoraDePuntaje
	public void notificarFinalizacionPartida(final Unidad guerrero) {
		Integer puntos = guerrero.obtenerSaludActual() / 2;
		mensaje("+" + puntos);
		this.puntos += puntos;
	}

	protected void mensaje(final String mensaje) {
		InterfazDeUsuario.obtenerInstancia().mensaje(mensaje);
	}
}
