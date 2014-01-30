package jwarrior.comandos;

import jwarrior.posiciones.Posicion;
import jwarrior.referencias.Direccion;
import jwarrior.unidades.Unidad;

public class Atacar extends Comando {

	private Direccion direccion;

	public Atacar(final Direccion direccion, final Unidad unidad) {
		super(unidad);
		this.direccion = direccion;
	}

	@Override
	public void ejecutar() {
		Posicion posicionActual = this.unidad.obtenerPosicion();
		Posicion posicionDestino = posicionActual.obtenerContigua(direccion);

		Unidad unidadGolpeada = posicionDestino.obtenerUnidad();
		Unidad unidadGolpeadora = posicionActual.obtenerUnidad();

		this.unidad.decir("ataca y golpea a " + unidadGolpeada);

		Integer fuerza = unidadGolpeadora.obtenerFuerzaMaxima();
		unidadGolpeada.recibirGolpe(fuerza);
	}
}
