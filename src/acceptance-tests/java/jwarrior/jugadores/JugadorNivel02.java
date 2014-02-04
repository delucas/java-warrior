package jwarrior.jugadores;

import static jwarrior.referencias.Direccion.ADELANTE;
import static jwarrior.referencias.Espacio.ENEMIGO;
import jwarrior.comandos.Comando;
import jwarrior.juego.Jugador;
import jwarrior.piezas.unidades.Guerrero;

public class JugadorNivel02 implements Jugador {

	@Override
	public Comando jugarTurno(Guerrero guerrero) {

		Comando comando;
		if (guerrero.sentir(ADELANTE).hay(ENEMIGO)) {
			comando = guerrero.atacar(ADELANTE);
		} else {
			comando = guerrero.desplazarse(ADELANTE);
		}
		return comando;
	}

	@Override
	public String obtenerNombreDelGuerrero() {
		return "Gimli";
	}
}
