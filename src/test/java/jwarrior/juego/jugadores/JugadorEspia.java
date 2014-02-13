package jwarrior.juego.jugadores;

import jwarrior.comandos.Comando;
import jwarrior.juego.Jugador;
import jwarrior.piezas.unidades.Guerrero;

public class JugadorEspia implements Jugador {

	private boolean jugarTurno = false;

	@Override
	public Comando jugarTurno(Guerrero guerrero) {
		this.jugarTurno  = true;
		return guerrero.noHacerNada();
	}

	public boolean invocoJugarTurno() {
		return this.jugarTurno;
	}

	@Override
	public String obtenerNombreDelGuerrero() {
		return "Nombre";
	}
}
