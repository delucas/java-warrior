package jwarrior.sentidos;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import jwarrior.piezas.unidades.Unidad;
import jwarrior.piezas.unidades.mocks.UnidadStubBuilder;
import jwarrior.referencias.Direccion;
import jwarrior.referencias.Espacio;

import org.junit.Test;

public class SentirTests {

	@Test
	public void testQueSeSienteEnemigoAlFrente() {

		Unidad unidadConEnemigoAlFrente = UnidadStubBuilder.construirGuerreroConEnemigosAlrededor();

		Sentir sentir = new Sentir(Direccion.ADELANTE, unidadConEnemigoAlFrente );
		assertThat(sentir.hay(Espacio.ENEMIGO), is(true));

		sentir = new Sentir(Direccion.ATRAS, unidadConEnemigoAlFrente );
		assertThat(sentir.hay(Espacio.ENEMIGO), is(true));
	}

}
