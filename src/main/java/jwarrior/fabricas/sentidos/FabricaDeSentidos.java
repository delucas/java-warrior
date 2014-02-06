package jwarrior.fabricas.sentidos;

import jwarrior.piezas.unidades.Unidad;
import jwarrior.referencias.Direccion;
import jwarrior.sentidos.Sentir;

public interface FabricaDeSentidos {

	Sentir crearSentir(final Direccion direccion, final Unidad unidad);

}
