package jwarrior.juego;

import java.util.LinkedList;
import java.util.List;

import jwarrior.piezas.unidades.Unidad;
import jwarrior.posiciones.Posicion;
import jwarrior.posiciones.PosicionInexistente;
import jwarrior.referencias.Espacio;

public class Mapa {

	private final List<Posicion> posiciones;
	private Unidad guerrero;

	public Mapa(final List<Posicion> posiciones) {
		this.posiciones = posiciones;

		for (Posicion posicion : this.posiciones) {
			posicion.establecerMapa(this);
			if (posicion.hay(Espacio.GUERRERO)) {
				this.guerrero = posicion.obtenerUnidad();
			}
		}
	}

	public boolean estaTerminado() {
		return !this.guerrero.estaVivo()
				|| this.guerrero.obtenerPosicion().hay(Espacio.SALIDA);
	}

	public List<Unidad> obtenerUnidades() {
		List<Unidad> unidades = new LinkedList<Unidad>();
		for (Posicion p : this.posiciones) {
			if (p.obtenerPieza().esUnidad()) {
				unidades.add((Unidad) p.obtenerPieza());
			}
		}
		return unidades;
	}

	public Posicion obtenerPosicionRelativa(final Posicion posicion, final int offset) {
		int indice = -1;
		for (int i = 0; i < posiciones.size() && indice == -1; i++) {
			if (posiciones.get(i) == posicion) {
				indice = i;
			}
		}

		int posicionRelativa = indice + offset;

		if (posicionRelativa < 0 || posicionRelativa > posiciones.size() - 1) {
			return new PosicionInexistente();
		}
		return posiciones.get(posicionRelativa);
	}

	@Override
	public String toString() {
		String resultado = new String(new char[posiciones.size()]).replace(
				"\0", "-");
		resultado += "\n";
		for (Posicion posicion : posiciones) {
			resultado += posicion.toCharacter();
		}
		resultado += "\n";
		resultado += new String(new char[posiciones.size()]).replace("\0", "-");
		return resultado;
	}
}
