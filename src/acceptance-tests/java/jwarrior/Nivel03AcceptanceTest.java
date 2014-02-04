package jwarrior;

import jwarrior.juego.Juego;
import jwarrior.juego.niveles.Nivel03;
import jwarrior.jugadores.JugadorNivel03;

import org.junit.Test;

public class Nivel03AcceptanceTest {

	@Test
	public void test() {
		Juego coordinador = new Juego(new Nivel03(new JugadorNivel03()));
		coordinador.jugar();
	}
}
