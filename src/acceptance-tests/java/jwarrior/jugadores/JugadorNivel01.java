package jwarrior.jugadores;

import static jwarrior.referencias.Direccion.ADELANTE;
import jwarrior.juego.Jugador;
import jwarrior.unidades.Guerrero;
import jwarrior.comandos.Comando;

public class JugadorNivel01 implements Jugador {

	@Override
	public Comando jugarTurno(Guerrero guerrero) {
		return guerrero.desplazarse(ADELANTE);
	}

	@Override
	public String obtenerNombreDelGuerrero() {
		return "Gimli";
	}
}
