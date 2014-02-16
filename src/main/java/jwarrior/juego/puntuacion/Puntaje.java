package jwarrior.juego.puntuacion;


public class Puntaje {

	private static final int PUNTAJE_INICIAL = 10;

	private Integer puntos = PUNTAJE_INICIAL;

	public Integer obtenerPuntaje() {
		return this.puntos;
	}

	public void computar(final Integer puntos) {
		this.puntos += puntos;
	}
}
