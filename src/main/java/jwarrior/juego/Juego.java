package jwarrior.juego;

import java.util.LinkedList;
import java.util.List;

import jwarrior.juego.niveles.Nivel;
import jwarrior.piezas.unidades.Unidad;
import jwarrior.ui.InterfazDeUsuario;
import jwarrior.comandos.Comando;

public class Juego {

	private static final int CANTIDAD_MAXIMA_TURNOS = 100;
	private final Mapa mapa;
	private final Nivel nivel;

	public Juego(final Nivel nivel) {
		this.nivel = nivel;
		this.mapa = new Mapa(nivel.obtenerPosiciones());
	}

	private void mensaje(final String mensaje) {
		InterfazDeUsuario.obtenerInstancia().mensaje(mensaje);
	}

	public void jugar() {

		boolean juegoTerminado = false;
		int turno = 1;

		mensaje(this.nivel.obtenerNombre());
		while (!juegoTerminado) {
			mensaje("Turno: " + turno);
			mensaje(this.mapa.toString());

			List<Comando> comandos = new LinkedList<Comando>();
			for (Unidad unidad : this.mapa.obtenerUnidades()) {
				comandos.add(unidad.proximoComando());
			}
			for (Comando c : comandos) {
				c.ejecutarComando();
			}
			turno++;
			if (turno > CANTIDAD_MAXIMA_TURNOS || this.mapa.estaTerminado()) {
				juegoTerminado = true;
				mensaje("juego terminado");
//				mensaje(nivel.obtenerPuntaje());
			}
			mensaje("");
		}
	}
}
