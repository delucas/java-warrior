package jwarrior.posiciones;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import jwarrior.referencias.Espacio;

import org.junit.Test;

public class PosicionInexistenteTests {

	@Test
	public void testQuePosicionInexistenteEsInexistente() {
		Posicion inexistente = new PosicionInexistente();
		assertThat(inexistente.hay(Espacio.INEXISTENTE), is(true));
	}

	@Test
	public void testQuePosicionInexistenteSeMuestraCorrectamente() {
		Posicion inexistente = new PosicionInexistente();
		assertThat(inexistente.toString(), is("la nada"));
	}
}
