package jwarrior.comandos;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import jwarrior.piezas.unidades.Unidad;
import jwarrior.piezas.unidades.mocks.UnidadEspia;
import jwarrior.piezas.unidades.mocks.UnidadStubBuilder;

import org.junit.Test;

public class AtacarTests {

	@Test
	public void queUnidadAtacadaRecibeGolpe() {

		Unidad atacante = UnidadStubBuilder.construirStubGuerrero();
		UnidadEspia atacada = UnidadStubBuilder.construirStubEspia();
		Atacar comando = ConstructorDeEscenarios.escenarioParaAtacar(atacante, atacada);
		comando.ejecutarComando();
		assertThat(atacada.invocoRecibirGolpe(), is(true));
	}

	// TODO: falta testear, pero es responsabilidad de otra clase, cuánto se lastima.
}
