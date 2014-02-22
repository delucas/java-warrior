package jwarrior.comandos;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import jwarrior.piezas.unidades.mocks.UnidadEspia;
import jwarrior.piezas.unidades.mocks.UnidadMuerta;
import jwarrior.piezas.unidades.mocks.UnidadStubBuilder;

import org.junit.Test;

public class NoHacerNadaTests {

	@Test
	public void queNoHaceNada() {

		UnidadEspia unidadEspia = UnidadStubBuilder.construirStubEspia();
		NoHacerNada comando = ConstructorDeEscenarios.escenarioParaNoHacerNada(unidadEspia);
		comando.ejecutarComando();
		assertThat(unidadEspia.invocoDecir(), is(true));
	}

	@Test
	public void queSiEstaMuertaNoEjecuta() {

		UnidadMuerta unidadMuerta = UnidadStubBuilder.construirStubMuerto();
		NoHacerNada comando = ConstructorDeEscenarios.escenarioParaNoHacerNada(unidadMuerta);
		comando.ejecutarComando();
		assertThat(unidadMuerta.invocoDecir(), is(false));
	}

}
