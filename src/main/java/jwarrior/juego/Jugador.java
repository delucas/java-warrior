package jwarrior.juego;

import jwarrior.unidades.Guerrero;
import jwarrior.comandos.Comando;

public interface Jugador {

	Comando jugarTurno(Guerrero guerrero);

	String obtenerNombreDelGuerrero();

}
