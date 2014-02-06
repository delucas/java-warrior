package jwarrior.comandos;

import static jwarrior.referencias.Espacio.SALIDA;
import static jwarrior.referencias.Espacio.VACIO;
import jwarrior.piezas.unidades.Unidad;
import jwarrior.posiciones.Posicion;
import jwarrior.referencias.Direccion;

public class Desplazarse extends Comando {

	private final Direccion direccion;

	public Desplazarse(final Direccion direccion, final Unidad unidad) {
		super(unidad);
		this.direccion = direccion;
	}

	@Override
	public void ejecutar() {

		final Unidad unidadSemoviente = this.obtenerUnidad();
		Posicion posicionActual = unidadSemoviente.obtenerPosicion();
		if (posicionActual.existeContigua(direccion)) {

			Posicion posicionDestino = posicionActual.obtenerContigua(direccion);
			if (posicionDestino.hay(VACIO) || posicionDestino.hay(SALIDA)) {

				unidadSemoviente.decir("se desplaza hacia " + direccion);
				posicionActual.moverUnidadHacia(posicionDestino);
			} else {

				unidadSemoviente.decir("no avanza y se choca contra " + posicionDestino);
			}
		} else {
			unidadSemoviente.decir("no puede avanzar más");
		}
	}
}
