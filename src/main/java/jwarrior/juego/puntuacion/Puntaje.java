package jwarrior.juego.puntuacion;

import jwarrior.piezas.unidades.Unidad;

public class Puntaje {

	private Integer puntos = 10;

	public Integer obtenerPuntaje() {
		return this.puntos;
	}

	// TODO: implementar una CalculadoraDePuntaje
	public void notificarTurno() {
		this.puntos -= 1;
	}

	// TODO: implementar una CalculadoraDePuntaje
	public void notificarMuerteEnemigo(Unidad unidad) {
		this.puntos += unidad.obtenerSaludMaxima();
	}

	// TODO: implementar una CalculadoraDePuntaje
	public void notificarFinalizacionPartida(Unidad guerrero) {
		this.puntos += guerrero.obtenerSaludActual() / 2;
	}
}
