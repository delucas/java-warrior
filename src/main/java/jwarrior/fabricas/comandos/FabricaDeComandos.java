package jwarrior.fabricas.comandos;

import jwarrior.comandos.Comando;
import jwarrior.piezas.unidades.Unidad;
import jwarrior.referencias.Direccion;

public interface FabricaDeComandos {

	Comando crearNoHacerNada(final Unidad unidad);

	Comando crearDescansar(final Unidad unidad);

	Comando crearAtacar(final Direccion direccion, final Unidad unidad);

	Comando crearDesplazarse(final Direccion direccion, final Unidad unidad);

}
