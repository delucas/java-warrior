package jwarrior.comandos;

import static jwarrior.referencias.Espacio.*;
import jwarrior.posiciones.Posicion;
import jwarrior.referencias.Direccion;
import jwarrior.unidades.Unidad;

public class Desplazarse extends Comando {

	private Direccion direccion;

	public Desplazarse(Direccion direccion, Unidad unidad) {
		super(unidad);
		this.direccion = direccion;
	}

	@Override
	public void ejecutar() {

		Posicion posicionActual = unidad.obtenerPosicion();
		if (posicionActual.existeContigua(direccion)) {

			Posicion posicionDestino = posicionActual.obtenerContigua(direccion);
			if (posicionDestino.hay(VACIO) || posicionDestino.hay(SALIDA)) {

				this.unidad.decir("se desplaza hacia " + direccion);
				posicionActual.moverUnidadHacia(posicionDestino);
			} else {

				this.unidad.decir("no avanza y se choca contra " + posicionDestino);
			}
		} else {
			this.unidad.decir("no puede avanzar más");
		}
	}
}
