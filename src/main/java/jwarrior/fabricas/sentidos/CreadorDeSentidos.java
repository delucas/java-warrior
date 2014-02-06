package jwarrior.fabricas.sentidos;

import jwarrior.piezas.unidades.Unidad;
import jwarrior.referencias.Direccion;
import jwarrior.sentidos.Sentir;

public class CreadorDeSentidos implements FabricaDeSentidos {

	public Sentir crearSentir(final Direccion direccion, final Unidad unidad) {
		return new Sentir(direccion, unidad);
	}
}
