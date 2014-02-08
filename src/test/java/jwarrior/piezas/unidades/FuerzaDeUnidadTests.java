package jwarrior.piezas.unidades;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import jwarrior.piezas.unidades.mocks.UnidadStubBuilder;

import org.junit.Test;

public class FuerzaDeUnidadTests {

	@Test
	public void unidadForzudaTieneFuerzaMaxima() {

		Unidad unidad = UnidadStubBuilder.construirStubForzudo(10);
		assertThat(unidad.obtenerFuerzaMaxima(), is(10));
	}
}
