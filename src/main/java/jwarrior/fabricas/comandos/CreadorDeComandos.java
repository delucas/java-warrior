package jwarrior.fabricas.comandos;

import jwarrior.comandos.Atacar;
import jwarrior.comandos.Comando;
import jwarrior.comandos.Descansar;
import jwarrior.comandos.Desplazarse;
import jwarrior.comandos.NoHacerNada;
import jwarrior.piezas.unidades.Unidad;
import jwarrior.referencias.Direccion;

public class CreadorDeComandos implements FabricaDeComandos {

	public Comando crearNoHacerNada(final Unidad unidad) {
		return new NoHacerNada(unidad);
	}

	public Comando crearDescansar(final Unidad unidad) {
		return new Descansar(unidad);
	}

	public Comando crearAtacar(final Direccion direccion, final Unidad unidad) {
		return new Atacar(direccion, unidad);
	}

	public Comando crearDesplazarse(final Direccion direccion, final Unidad unidad) {
		return new Desplazarse(direccion, unidad);
	}

}
