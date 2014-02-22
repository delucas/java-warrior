package jwarrior.piezas;

import jwarrior.posiciones.Posicion;

public class PosicionEspia extends Posicion {

	private boolean seLibero = false;
	private boolean invocoMoverUnidadHacia = false;

	@Override
	public void liberar() {
		this.seLibero = true;
	}

	public boolean verificarQueSeLibero() {
		return this.seLibero;
	}

	@Override
	public void moverUnidadHacia(Posicion posicionDestino) {
		this.invocoMoverUnidadHacia = true;
	}

	public boolean invocoMoverUnidadHacia() {
		return this.invocoMoverUnidadHacia ;
	}

}
