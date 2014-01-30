package jwarrior.unidades;

import static jwarrior.referencias.Espacio.GUERRERO;
import jwarrior.comandos.Comando;
import jwarrior.juego.Jugador;


public class Guerrero extends Unidad {

	private static final int FUERZA_MAXIMA = 5;
	private static final int SALUD_MAXIMA = 20;
	private final Jugador jugador;

	public Guerrero(final String nombre, final Jugador jugador) {
		super(nombre);
		this.tipo = GUERRERO;

		this.establecerSaludMaxima(SALUD_MAXIMA);
		this.establecerFuerzaMaxima(FUERZA_MAXIMA);

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
