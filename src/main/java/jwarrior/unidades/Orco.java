package jwarrior.unidades;

import static jwarrior.referencias.Direccion.ATRAS;
import static jwarrior.referencias.Espacio.ENEMIGO;
import static jwarrior.referencias.Espacio.GUERRERO;
import jwarrior.comandos.Comando;

public class Orco extends Unidad {

	private static final int FUERZA_MAXIMA = 5;
	private static final int SALUD_MAXIMA = 8;

	public Orco() {
		super("Orco");
		this.tipo = ENEMIGO;

		this.establecerSaludMaxima(SALUD_MAXIMA);
		this.establecerFuerzaMaxima(FUERZA_MAXIMA);
	}

	@Override
	public Comando proximoMovimiento() {
	    Comando c = null;
	    if (this.sentir(ATRAS).hay(GUERRERO)) {
	      c = this.atacar(ATRAS);
	    } else {
	      c = this.noHacerNada();
	    }
	    return c;
	}

	@Override
	public String toCharacter() {
		return "o";
	}

}
