package jwarrior.piezas.unidades;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import jwarrior.juego.jugadores.JugadorEspia;
import jwarrior.juego.jugadores.JugadorStubBuilder;
import jwarrior.piezas.unidades.mocks.UnidadStubBuilder;

import org.junit.Test;

public class GuerreroTests {

	@Test
	public void guerreroDelegaProximoComandoAJugador() {

		JugadorEspia jugadorEspia = JugadorStubBuilder.construirEspiaJugador();
		Unidad unidad = UnidadStubBuilder.construirGuerrero(jugadorEspia);
		unidad.proximoComando();
		assertThat(jugadorEspia.invocoJugarTurno(), is(true));
	}
}
