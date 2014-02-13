package jwarrior.piezas.unidades;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class UnidadNulaTests {

	@Test
	public void unidadNulaNoRestaSaludAlRecibirGolpe() {

		Unidad unidad = new UnidadNula();
		Integer saludInicial = unidad.obtenerSaludActual();
		unidad.recibirGolpe(10);
		assertThat(unidad.obtenerSaludActual(), is(saludInicial));
	}
}
