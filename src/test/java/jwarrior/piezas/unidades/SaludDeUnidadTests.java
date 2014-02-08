package jwarrior.piezas.unidades;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import jwarrior.piezas.unidades.mocks.UnidadSaludable;

import org.junit.Test;

public class SaludDeUnidadTests {

	@Test
	public void unidadSaludableComienzaConSaludMaxima() {

		Unidad unidad = UnidadStubBuilder.construirStubSaludable(20);

		assertThat(unidad.obtenerSaludActual(), is(20));
		assertThat(unidad.obtenerSaludActual(),
				is(unidad.obtenerSaludMaxima()));
	}

	@Test
	public void unidadSaludableEstaVivo() {

		UnidadSaludable unidad = UnidadStubBuilder.construirStubSaludable(20);

		assertThat(unidad.obtenerSaludActual(), is(20));
		assertThat(unidad.estaVivo(), is(true));
	}

	@Test
	public void unidadSaludableEstaSaludable() {

		UnidadSaludable unidad = UnidadStubBuilder.construirStubSaludable(20);

		assertThat(unidad.obtenerSaludActual(), is(20));
		assertThat(unidad.estaSaludable(), is(true));
	}

	@Test
	public void unidadSaludableRestaSaludAlRecibirGolpe() {

		Unidad unidad = UnidadStubBuilder.construirStubSaludable(20);
		assertThat(unidad.obtenerSaludActual(), is(20));
		unidad.recibirGolpe(10);
		assertThat(unidad.obtenerSaludActual(), is(10));
	}

	@Test
	public void unidadSaludableMuereAlRecibirGolpeMortal() {

		UnidadSaludable unidad = UnidadStubBuilder.construirStubSaludable(20);
		assertThat(unidad.obtenerSaludActual(), is(20));
		unidad.recibirGolpe(20);

		assertThat(unidad.obtenerSaludActual(), is(0));
		assertThat(unidad.estaVivo(), is(false));
		assertThat(unidad.invocoMorir(), is(true));
	}
	
	@Test
	public void unidadLevementeHeridaPuedeCurarseTotalmente() {

		Unidad unidad = UnidadStubBuilder.construirStubLevementeHerido(20);
		assertThat(unidad.obtenerSaludActual(), is(18));
		unidad.curar(2);

		assertThat(unidad.obtenerSaludActual(), is(20));
		assertThat(unidad.estaSaludable(), is(true));
	}

	@Test
	public void unidadLevementeHeridaNoSeCuraMasQueElMaximo() {

		Unidad unidad = UnidadStubBuilder.construirStubLevementeHerido(20);
		assertThat(unidad.obtenerSaludActual(), is(18));
		unidad.curar(5);

		assertThat(unidad.obtenerSaludActual(), is(20));
		assertThat(unidad.obtenerSaludActual(),
				is(unidad.obtenerSaludMaxima()));
	}
	
	@Test
	public void unidadHeridaPuedeCurarse() {

		Unidad unidad = UnidadStubBuilder.construirStubHerido(20);
		assertThat(unidad.obtenerSaludActual(), is(10));
		unidad.curar(5);

		assertThat(unidad.obtenerSaludActual(), is(15));
		assertThat(unidad.estaSaludable(), is(false));
	}
}
