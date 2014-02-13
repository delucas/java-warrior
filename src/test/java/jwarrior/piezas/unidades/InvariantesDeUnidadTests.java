package jwarrior.piezas.unidades;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import jwarrior.piezas.unidades.mocks.UnidadStubBuilder;
import jwarrior.ui.InterfazDeUsuario;
import jwarrior.ui.mocks.SalidaMock;

import org.junit.Test;

public class InvariantesDeUnidadTests {

	@Test
	public void unidadNombradaDiceSuNombre() {

		Unidad unidad = UnidadStubBuilder.construirStubNombrado("Legolas");
		assertThat(unidad.toString(), is("Legolas"));
	}

	@Test
	public void unidadEsUnidad() {

		Unidad unidad = UnidadStubBuilder.construirStubNombrado("Legolas");
		assertThat(unidad.esUnidad(), is(true));
	}

	@Test
	public void unidadAlDecirEnviaMensaje() {

		SalidaMock salida = new SalidaMock();
		InterfazDeUsuario.establecerSalida(salida);

		Unidad unidad = UnidadStubBuilder.construirStubHablador();
		unidad.decir("Una frase");
		assertThat(salida.envioMensaje(), is(true));
	}

	@Test
	public void cadaUnidadSabeDecirSuRepresentacion() {

		Map<Unidad, String> representaciones = new HashMap<Unidad, String>();
		representaciones.put(new UnidadNula(), "_");
		representaciones.put(new Orco(), "o");
		representaciones.put(UnidadStubBuilder.construirStubGuerrero(), "G");

		for (Entry<Unidad, String> par : representaciones.entrySet()) {
			assertThat(par.getKey().toCharacter(), is(par.getValue()));
		}
	}
}
