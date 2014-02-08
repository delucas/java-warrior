package jwarrior.piezas.unidades;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import jwarrior.comandos.Atacar;
import jwarrior.comandos.Descansar;
import jwarrior.comandos.Desplazarse;
import jwarrior.comandos.NoHacerNada;
import jwarrior.piezas.unidades.mocks.UnidadStubBuilder;

import org.junit.Test;

public class ComandosDeUnidadTests {

	@Test
	public void unidadPorDefectoProximoComandoNoHaceNada() {

		Unidad unidad = UnidadStubBuilder.construirStub();
		assertThat(unidad.proximoComando(), instanceOf(NoHacerNada.class));
	}

	@Test
	public void unidadPorDefectoAlAtacarGeneraComandoAtacar() {

		Unidad unidad = UnidadStubBuilder.construirStub();
		assertThat(unidad.atacar(null), instanceOf(Atacar.class));
	}

	@Test
	public void unidadPorDefectoAlDesplazarseGeneraComandoDesplazarse() {

		Unidad unidad = UnidadStubBuilder.construirStub();
		assertThat(unidad.desplazarse(null), instanceOf(Desplazarse.class));
	}

	@Test
	public void unidadPorDefectoAlDescansarGeneraComandoDescansar() {

		Unidad unidad = UnidadStubBuilder.construirStub();
		assertThat(unidad.descansar(), instanceOf(Descansar.class));
	}
}
