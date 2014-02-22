package jwarrior.comandos;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import jwarrior.piezas.unidades.mocks.UnidadHeridaEspia;
import jwarrior.piezas.unidades.mocks.UnidadSaludable;
import jwarrior.piezas.unidades.mocks.UnidadStubBuilder;

import org.junit.Test;

public class DescansarTests {

	@Test
	public void queUnidadSaludableNoSeCura() {

		UnidadSaludable unidadEspia = UnidadStubBuilder.construirStubSaludable(20);
		Descansar comando = ConstructorDeEscenarios.escenarioParaDescansar(unidadEspia);
		comando.ejecutarComando();
		assertThat(unidadEspia.invocoCurar(), is(false));
	}

	@Test
	public void queUnidadNoSaludableSeCura() {

		UnidadHeridaEspia unidadEspia = UnidadStubBuilder.construirStubHeridoEspia(20);
		Descansar comando = ConstructorDeEscenarios.escenarioParaDescansar(unidadEspia);
		comando.ejecutarComando();
		assertThat(unidadEspia.invocoCurar(), is(true));
	}

	// TODO: falta testear, pero es responsabilidad de otra clase, cuánto se cura.
}
