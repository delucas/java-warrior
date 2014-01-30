package jwarrior.posiciones;

import jwarrior.juego.Mapa;
import jwarrior.referencias.Direccion;
import jwarrior.referencias.Espacio;
import jwarrior.unidades.Unidad;
import jwarrior.unidades.UnidadNula;

public class Posicion {

	private Mapa mapa;
	protected Unidad unidad;

	public Posicion() {
		this(new UnidadNula());
	}

	public Posicion(final Unidad unidad) {
		this.establecerUnidad(unidad);
	}

	public boolean hay(final Espacio espacio) {
		return this.unidad.obtenerTipo() == espacio;
	}

	public void establecerMapa(final Mapa mapa) {
		this.mapa = mapa;
	}

	public Unidad obtenerUnidad() {
		return this.unidad;
	}

	public void establecerUnidad(final Unidad unidad) {
		this.unidad = unidad;
		this.unidad.establecerPosicion(this);
	}

	public Posicion obtenerContigua(final Direccion direccion) {
		int offset = 1;
		if (direccion == Direccion.ATRAS) {
			offset = -1;
		}

		return mapa.obtenerPosicionRelativa(this, offset);
	}

	public void moverUnidadHacia(final Posicion posicionDestino) {
		posicionDestino.establecerUnidad(this.unidad);
		this.unidad = new UnidadNula();
	}

	public void liberar() {
		this.unidad = new UnidadNula();
	}

	public boolean existeContigua(final Direccion direccion) {
		return !this.obtenerContigua(direccion).hay(Espacio.INEXISTENTE);
	}

	@Override
	public String toString() {
		return this.unidad.toString();
	}

	public String toCharacter() {
		return this.obtenerUnidad().toCharacter();
	}
}
