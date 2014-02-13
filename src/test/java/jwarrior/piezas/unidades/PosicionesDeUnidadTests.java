package jwarrior.piezas.unidades;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import jwarrior.piezas.PosicionEspia;
import jwarrior.piezas.unidades.mocks.UnidadStubBuilder;

import org.junit.Test;

public class PosicionesDeUnidadTests {

	@Test
	public void unidadPosicionadaAlMorirLiberaPosicion() {

		PosicionEspia posicion = new PosicionEspia();
		Unidad unidad = UnidadStubBuilder.construirStubPosicionado(posicion);
		unidad.recibirGolpe(unidad.obtenerSaludActual());
		assertThat(posicion.verificarQueSeLibero(), is(true));
	}
}
