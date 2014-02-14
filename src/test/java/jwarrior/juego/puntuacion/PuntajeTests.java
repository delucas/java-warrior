package jwarrior.juego.puntuacion;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import jwarrior.piezas.unidades.Orco;
import jwarrior.piezas.unidades.Unidad;
import jwarrior.piezas.unidades.mocks.UnidadStubBuilder;
import jwarrior.ui.InterfazDeUsuario;
import jwarrior.ui.mocks.SalidaMock;

import org.junit.Test;

public class PuntajeTests {

	@Test
	public void alIniciarPuntajeComienzaConValorInicial() {

		Puntaje puntaje = new PuntajeMudo();
		assertThat(puntaje.obtenerPuntaje(), is(10));
	}

	@Test
	public void alInformarPasoDeTurnoRestaPuntaje() {

		Puntaje puntaje = new PuntajeMudo();
		puntaje.notificarTurno();
		assertThat(puntaje.obtenerPuntaje(), is(9));
	}

	@Test
	public void alInformarMuerteEnemigoSumaSaludMaximaEnemigo() {

		Puntaje puntaje = new PuntajeMudo();
		puntaje.notificarMuerteEnemigo(new Orco());
		assertThat(puntaje.obtenerPuntaje(), is(18));
	}

	@Test
	public void alInformarFinalizacionPartidaSumaMitadDeSalud() {

		Puntaje puntaje = new PuntajeMudo();
		puntaje.notificarFinalizacionPartida(UnidadStubBuilder.construirStubGuerrero());
		assertThat(puntaje.obtenerPuntaje(), is(20));
	}

	@Test
	public void alInformarFinalizacionPartidaHeridoSumaMitadDeSalud() {
		Puntaje puntaje = new PuntajeMudo();
		Unidad guerrero = UnidadStubBuilder.construirStubGuerrero();
		guerrero.recibirGolpe(4);

		puntaje.notificarFinalizacionPartida(guerrero);
		assertThat(puntaje.obtenerPuntaje(), is(18));
	}

	@Test
	public void puntajeEnviaMensaje() {

		SalidaMock salida = new SalidaMock();
		InterfazDeUsuario.establecerSalida(salida);

		Puntaje puntaje = new Puntaje();
		puntaje.notificarTurno();
		assertThat(salida.envioMensaje(), is(true));
	}
}

class PuntajeMudo extends Puntaje {
	@Override
	protected void mensaje(String mensaje) {
		// No dice nada
	}
}
