package jwarrior.juego.puntuacion;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import jwarrior.piezas.unidades.Orco;
import jwarrior.piezas.unidades.Unidad;
import jwarrior.piezas.unidades.mocks.UnidadStubBuilder;

import org.junit.Test;

public class PuntajeTests {

	@Test
	public void alIniciarPuntajeComienzaConValorInicial() {

		Puntaje puntaje = new Puntaje();
		assertThat(puntaje.obtenerPuntaje(), is(10));
	}

	@Test
	public void alInformarPasoDeTurnoRestaPuntaje() {

		Puntaje puntaje = new Puntaje();
		puntaje.notificarTurno();
		assertThat(puntaje.obtenerPuntaje(), is(9));
	}

	@Test
	public void alInformarMuerteEnemigoSumaSaludMaximaEnemigo() {

		Puntaje puntaje = new Puntaje();
		puntaje.notificarMuerteEnemigo(new Orco());
		assertThat(puntaje.obtenerPuntaje(), is(18));
	}

	@Test
	public void alInformarFinalizacionPartidaSumaMitadDeSalud() {

		Puntaje puntaje = new Puntaje();
		puntaje.notificarFinalizacionPartida(UnidadStubBuilder.construirStubGuerrero());
		assertThat(puntaje.obtenerPuntaje(), is(20));
	}

	@Test
	public void alInformarFinalizacionPartidaHeridoSumaMitadDeSalud() {
		Puntaje puntaje = new Puntaje();
		Unidad guerrero = UnidadStubBuilder.construirStubGuerrero();
		guerrero.recibirGolpe(4);

		puntaje.notificarFinalizacionPartida(guerrero);
		assertThat(puntaje.obtenerPuntaje(), is(18));
	}
}
