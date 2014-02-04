package jwarrior;

import jwarrior.juego.Juego;
import jwarrior.juego.niveles.Nivel02;
import jwarrior.jugadores.JugadorNivel02;

import org.junit.Test;

public class Nivel02AcceptanceTest {

	@Test
	public void test() {
		Juego coordinador = new Juego(new Nivel02(new JugadorNivel02()));
		coordinador.jugar();
	}
}
