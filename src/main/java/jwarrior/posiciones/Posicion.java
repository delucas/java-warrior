package jwarrior.posiciones;

import jwarrior.juego.Mapa;
import jwarrior.piezas.Pieza;
import jwarrior.piezas.PiezaNula;
import jwarrior.piezas.unidades.Unidad;
import jwarrior.piezas.unidades.UnidadNula;
import jwarrior.referencias.Direccion;
import jwarrior.referencias.Espacio;

public class Posicion {

	private Mapa mapa;
	protected Pieza pieza;

	public Posicion() {
		this(new PiezaNula());
	}

	public Posicion(final Pieza pieza) {
		this.establecerPieza(pieza);
	}

	public boolean hay(final Espacio espacio) {
		return this.pieza.obtenerTipo() == espacio;
	}

	public void establecerMapa(final Mapa mapa) {
		this.mapa = mapa;
	}

	public Pieza obtenerPieza() {
		return this.pieza;
	}

	public Unidad obtenerUnidad() {
		Unidad retorno = new UnidadNula();
		if (this.pieza.esUnidad()) {
			retorno = (Unidad) this.pieza;
		}
		return retorno;
	}

	public final void establecerPieza(final Pieza pieza) {
		this.pieza = pieza;
		this.pieza.establecerPosicion(this);
	}

	public Posicion obtenerContigua(final Direccion direccion) {
		int offset = 1;
		if (direccion == Direccion.ATRAS) {
			offset = -1;
		}

		return mapa.obtenerPosicionRelativa(this, offset);
	}

	public void moverUnidadHacia(final Posicion posicionDestino) {
		posicionDestino.establecerPieza(this.pieza);
		this.pieza = new PiezaNula();
	}

	public void liberar() {
		this.pieza = new PiezaNula();
	}

	public boolean existeContigua(final Direccion direccion) {
		return !this.obtenerContigua(direccion).hay(Espacio.INEXISTENTE);
	}

	@Override
	public String toString() {
		return this.pieza.toString();
	}

	public String toCharacter() {
		return this.obtenerPieza().toCharacter();
	}
}
