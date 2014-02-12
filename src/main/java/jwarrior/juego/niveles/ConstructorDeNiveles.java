package jwarrior.juego.niveles;

import java.util.ArrayList;
import java.util.List;

import jwarrior.piezas.Puerta;
import jwarrior.piezas.Salida;
import jwarrior.piezas.unidades.Guerrero;
import jwarrior.piezas.unidades.Orco;
import jwarrior.posiciones.Posicion;

public class ConstructorDeNiveles {

	public List<Posicion> construirPosiciones(final String plano, final Guerrero guerrero) {
		List<Posicion> posiciones = new ArrayList<Posicion>();

		for (char c : plano.toCharArray()) {
			posiciones.add(new PosicionCodificada(c).construirPosicion(guerrero));
		}
		return posiciones;
	}

}

class PosicionCodificada {
	private final char codigo;

	public PosicionCodificada(final char codigo) {
		this.codigo = codigo;
	}

	public Posicion construirPosicion(final Guerrero guerrero) {
		Posicion retorno = new Posicion();
		if (esPuerta()) {
			retorno = new Puerta();
		}
		if (esGuerrero()) {
			retorno = new Posicion(guerrero);
		}
		if (esSalida()) {
			retorno = new Salida();
		}
		if (esOrco()) {
			retorno = new Posicion(new Orco());
		}
		return retorno;
	}

	private boolean esGuerrero() {
		return 'G' == this.codigo;
	}

	private boolean esPuerta() {
		return 'P' == this.codigo;
	}

	private boolean esSalida() {
		return 'S' == this.codigo;
	}

	private boolean esOrco() {
		return 'o' == this.codigo;
	}
}
