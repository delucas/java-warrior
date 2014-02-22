package jwarrior.comandos;

import jwarrior.piezas.PosicionEspia;
import jwarrior.piezas.unidades.Unidad;
import jwarrior.referencias.Direccion;

public class EscenarioParaDesplazarse {

	private PosicionEspia posicionActual;
	private Unidad unidad;

	public EscenarioParaDesplazarse(Unidad unidad,
			PosicionEspia posicionActual) {
		this.unidad = unidad;
		this.posicionActual = posicionActual;
	}

	public PosicionEspia obtenerPosicionOrigen() {
		return this.posicionActual;
	}

	public Desplazarse obtenerComando() {
		return new Desplazarse(Direccion.ADELANTE, this.unidad);
	}

}
