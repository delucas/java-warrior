package jwarrior.comandos;

import jwarrior.piezas.unidades.Unidad;
import jwarrior.posiciones.Posicion;
import jwarrior.referencias.Direccion;

public class Atacar extends Comando {

	private final Direccion direccion;

	public Atacar(final Direccion direccion, final Unidad unidad) {
		super(unidad);
		this.direccion = direccion;
	}

	@Override
	public void ejecutar() {
		Unidad unidadAtacante = this.obtenerUnidad();
		Posicion posicionActual = unidadAtacante.obtenerPosicion();

		Posicion posicionDestino = posicionActual.obtenerContigua(direccion);
		Unidad unidadAtacada = posicionDestino.obtenerUnidad();

		unidadAtacante.decir("ataca y golpea a " + unidadAtacada);

		Integer fuerza = unidadAtacante.obtenerFuerzaMaxima();
		unidadAtacada.recibirGolpe(fuerza);
	}
}
