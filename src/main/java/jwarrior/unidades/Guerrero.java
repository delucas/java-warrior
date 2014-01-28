package jwarrior.unidades;

import jwarrior.juego.Jugador;
import static jwarrior.referencias.Espacio.GUERRERO;
import jwarrior.comandos.Comando;


public class Guerrero extends Unidad {

	private Jugador jugador;

	public Guerrero(String nombre, Jugador jugador) {
		super(nombre);
		this.tipo = GUERRERO;

		this.establecerSaludMaxima(20);
		this.establecerFuerzaMaxima(5);

		this.jugador = jugador;
	}

	public Comando proximoMovimiento() {
		return jugador.jugarTurno(this);
	}

	@Override
	public String toCharacter() {
		return "G";
	}
}
