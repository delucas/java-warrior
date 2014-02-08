package jwarrior.piezas.unidades;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import jwarrior.piezas.unidades.mocks.UnidadStubBuilder;
import jwarrior.sentidos.Sentir;

import org.junit.Test;

public class SentidosDeUnidadTests {

	@Test
	public void unidadPorDefectoAlSentirGeneraComandoSentir() {

		Unidad unidad = UnidadStubBuilder.construirStub();
		assertThat(unidad.sentir(null), instanceOf(Sentir.class));
	}
}
