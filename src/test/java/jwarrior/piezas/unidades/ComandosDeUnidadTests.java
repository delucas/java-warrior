package jwarrior.piezas.unidades;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import jwarrior.comandos.NoHacerNada;
import jwarrior.piezas.unidades.mocks.UnidadHerida;
import jwarrior.piezas.unidades.mocks.UnidadLevementeHerida;
import jwarrior.piezas.unidades.mocks.UnidadSaludable;

import org.junit.Test;

public class ComandosDeUnidadTests {

	@Test
	public void unidadPorDefectoProximoComandoNoHaceNada() {

		Unidad unidad = UnidadStubBuilder.construirStub();
		assertThat(unidad.proximoComando(), instanceOf(NoHacerNada.class));
	}
}

class UnidadStubBuilder {
	public static Unidad construirStub() {
		return new Unidad(null, null) {
			@Override
			public String toCharacter() {
				return null;
			}
		};
	}

	public static UnidadSaludable construirStubSaludable(Integer saludMaxima) {
		return new UnidadSaludable(saludMaxima);
	}

	public static UnidadHerida construirStubHerido(Integer saludMaxima) {
		// TODO Auto-generated method stub
		return new UnidadHerida(saludMaxima);
	}

	public static UnidadLevementeHerida construirStubLevementeHerido(Integer saludMaxima) {
		// TODO Auto-generated method stub
		return new UnidadLevementeHerida(saludMaxima);
	}
}
