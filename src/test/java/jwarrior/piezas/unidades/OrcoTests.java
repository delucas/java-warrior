package jwarrior.piezas.unidades;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import jwarrior.comandos.Atacar;
import jwarrior.comandos.NoHacerNada;
import jwarrior.piezas.unidades.mocks.UnidadStubBuilder;

import org.junit.Test;

public class OrcoTests {

	@Test
	public void orcoSinGuerreroAtrasNoHaceNada() {

		Orco orco = UnidadStubBuilder.construirOrcoSinUnidadesCerca();
		assertThat(orco.proximoComando(), instanceOf(NoHacerNada.class));
	}

	@Test
	public void orcoConGuerreroAtrasAtaca() {

		Orco orco = UnidadStubBuilder.construirOrcoConGuerreroAtras();
		assertThat(orco.proximoComando(), instanceOf(Atacar.class));
	}
}
