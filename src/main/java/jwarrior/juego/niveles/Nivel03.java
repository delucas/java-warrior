package jwarrior.juego.niveles;

import java.util.ArrayList;
import java.util.List;

import jwarrior.juego.Jugador;
import jwarrior.posiciones.Posicion;
import jwarrior.posiciones.Puerta;
import jwarrior.posiciones.Salida;
import jwarrior.unidades.Guerrero;
import jwarrior.unidades.Orco;

public class Nivel03 extends Nivel {

	public Nivel03(Jugador jugador) {
		super(jugador);
		this.nombre = "Nivel 03";
	}

	@Override
	public List<Posicion> obtenerPosiciones() {
		ArrayList<Posicion> posiciones = new ArrayList<>();
		posiciones.add(new Puerta());
		posiciones.add(new Posicion(new Guerrero(this.jugador.obtenerNombreDelGuerrero(), this.jugador)));
		posiciones.add(new Posicion());
		posiciones.add(new Posicion(new Orco()));
		posiciones.add(new Posicion());
		posiciones.add(new Posicion(new Orco()));
		posiciones.add(new Posicion());
		posiciones.add(new Posicion(new Orco()));
		posiciones.add(new Posicion(new Orco()));
		posiciones.add(new Posicion());
		posiciones.add(new Posicion(new Orco()));
		posiciones.add(new Salida());

		return posiciones;
	}

}
