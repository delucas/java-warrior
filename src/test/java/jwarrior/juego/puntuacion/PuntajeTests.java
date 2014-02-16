package jwarrior.juego.puntuacion;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PuntajeTests {

	@Test
	public void puntajeInicialComienzaInicializado() {

		Puntaje puntaje = new Puntaje();
		assertThat(puntaje.obtenerPuntaje(), is(10));
	}

	@Test
	public void alComputarPuntajeCambiaValor() {

		Puntaje puntaje = new Puntaje();
		puntaje.computar(10);
		assertThat(puntaje.obtenerPuntaje(), is(20));
	}

	@Test
	public void alComputarPuntajeNegativoCambiaValor() {

		Puntaje puntaje = new Puntaje();
		puntaje.computar(-1);
		assertThat(puntaje.obtenerPuntaje(), is(9));
	}
}
