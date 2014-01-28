package jwarrior.unidades;

import static jwarrior.referencias.Direccion.*;
import static jwarrior.referencias.Espacio.*;
import jwarrior.comandos.Comando;

public class Orco extends Unidad {

	public Orco() {
		super("Orco");
		this.tipo = ENEMIGO;

		this.establecerSaludMaxima(8);
		this.establecerFuerzaMaxima(5);
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
