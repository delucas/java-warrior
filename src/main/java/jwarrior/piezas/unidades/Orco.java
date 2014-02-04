package jwarrior.piezas.unidades;

import static jwarrior.referencias.Direccion.ATRAS;
import static jwarrior.referencias.Espacio.ENEMIGO;
import static jwarrior.referencias.Espacio.GUERRERO;
import jwarrior.comandos.Comando;

public class Orco extends Unidad {

	private static final int FUERZA_MAXIMA = 5;
	private static final int SALUD_MAXIMA = 8;

	public Orco() {
		super("Orco", ENEMIGO);

		this.establecerSaludMaxima(SALUD_MAXIMA);
		this.establecerFuerzaMaxima(FUERZA_MAXIMA);
	}

	@Override
	public Comando proximoMovimiento() {
	    Comando proximoComando = null;
	    if (this.sentir(ATRAS).hay(GUERRERO)) {
	      proximoComando = this.atacar(ATRAS);
	    } else {
	      proximoComando = this.noHacerNada();
	    }
	    return proximoComando;
	}

	@Override
	public String toCharacter() {
		return "o";
	}

}
