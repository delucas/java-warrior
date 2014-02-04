package jwarrior.jugadores;

import static jwarrior.referencias.Direccion.ADELANTE;
import static jwarrior.referencias.Espacio.ENEMIGO;
import jwarrior.juego.Jugador;
import jwarrior.piezas.unidades.Guerrero;
import jwarrior.comandos.Comando;

public class JugadorNivel03 implements Jugador {

	@Override
	public Comando jugarTurno(Guerrero guerrero) {

		Comando comando;
		if (guerrero.sentir(ADELANTE).hay(ENEMIGO)) {
			comando = guerrero.atacar(ADELANTE);
		} else {
			if (guerrero.estaSaludable()) {
				comando = guerrero.desplazarse(ADELANTE);
			} else {
				comando = guerrero.descansar();
			}
		}
		return comando;
	}

	@Override
	public String obtenerNombreDelGuerrero() {
		return "Gimli";
	}
}
