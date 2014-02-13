package jwarrior.piezas.unidades.mocks;

import jwarrior.comandos.Comando;
import jwarrior.juego.Jugador;
import jwarrior.piezas.unidades.Guerrero;

public class GuerreroStub extends Guerrero {

	public GuerreroStub() {
		super("Nombre", new JugadorStub());
	}
}

class JugadorStub implements Jugador {

	@Override
	public Comando jugarTurno(Guerrero guerrero) {
		return guerrero.noHacerNada();
	}

	@Override
	public String obtenerNombreDelGuerrero() {
		return "Nombre";
	}

}
