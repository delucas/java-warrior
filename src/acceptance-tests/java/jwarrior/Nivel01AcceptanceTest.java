package jwarrior;

import jwarrior.juego.Juego;
import jwarrior.juego.niveles.Nivel01;
import jwarrior.jugadores.JugadorNivel01;

import org.junit.Test;

public class Nivel01AcceptanceTest {

	@Test
	public void test() {
		Juego coordinador = new Juego(new Nivel01(new JugadorNivel01()));
		coordinador.jugar();
	}
}
