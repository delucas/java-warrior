package jwarrior.juego;

import jwarrior.unidades.Guerrero;
import jwarrior.comandos.Comando;

public interface Jugador {

	public Comando jugarTurno(Guerrero guerrero);

	public String obtenerNombreDelGuerrero();

}
