package jwarrior.juego;


import java.util.LinkedList;
import java.util.List;

import jwarrior.posiciones.Posicion;
import jwarrior.posiciones.PosicionInexistente;
import jwarrior.referencias.Espacio;
import jwarrior.unidades.Unidad;

public class Mapa {

	private List<Posicion> posiciones;
	private Unidad guerrero;

	public Mapa(List<Posicion> posiciones) {
		this.posiciones = posiciones;

		for (Posicion posicion : this.posiciones) {
			posicion.establecerMapa(this);
			if (posicion.hay(Espacio.GUERRERO)) {
				this.guerrero = posicion.obtenerUnidad();
			}
		}
	}

	public boolean estaTerminado() {
		return !this.guerrero.estaVivo() ||
				this.guerrero.obtenerPosicion().hay(Espacio.SALIDA);
	}

	public List<Unidad> obtenerUnidades() {
		List<Unidad> unidades = new LinkedList<>();
		for (Posicion p : this.posiciones) {
			if (! p.hay(Espacio.VACIO)) {
				unidades.add(p.obtenerUnidad());
			}
		}
		return unidades;
	}

	public Posicion obtenerPosicionRelativa(Posicion posicion, int offset) {
		int i = 0, indice = -1;
		for (Posicion p : posiciones) {
			if (p == posicion) {
				indice = i;
			}
			i++;
		}
		// el indice podría conocerlo la "posicion"

		int posicionRelativa = indice + offset;

		if (posicionRelativa < 0 || posicionRelativa > posiciones.size() - 1) {
			return new PosicionInexistente();
		}
		return posiciones.get(posicionRelativa);
	}

	@Override
	public String toString() {
		String resultado = new String(new char[posiciones.size()]).replace("\0", "-");
		resultado += "\n";
		for (Posicion posicion : posiciones) {
			resultado += posicion.toCharacter();
		}
		resultado += "\n";
		resultado += new String(new char[posiciones.size()]).replace("\0", "-");
		return resultado;
	}
}
