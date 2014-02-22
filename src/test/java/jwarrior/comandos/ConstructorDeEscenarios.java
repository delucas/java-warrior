package jwarrior.comandos;

import jwarrior.piezas.PosicionEspia;
import jwarrior.piezas.Salida;
import jwarrior.piezas.unidades.Unidad;
import jwarrior.piezas.unidades.mocks.UnidadEspia;
import jwarrior.piezas.unidades.mocks.UnidadStubBuilder;
import jwarrior.posiciones.Posicion;
import jwarrior.posiciones.PosicionInexistente;
import jwarrior.referencias.Direccion;
import jwarrior.referencias.Espacio;

public class ConstructorDeEscenarios {

	public static NoHacerNada escenarioParaNoHacerNada(Unidad unidad) {
		return new NoHacerNada(unidad);
	}

	public static Descansar escenarioParaDescansar(Unidad unidad) {
		return new Descansar(unidad);
	}

	public static Atacar escenarioParaAtacar(Unidad atacante,
			UnidadEspia atacada) {

		Posicion posicionAtacada = new Posicion();
		posicionAtacada.establecerPieza(atacada);

		atacante.establecerPosicion(posicionJuntoAPosicion(posicionAtacada));
		return new Atacar(Direccion.ADELANTE, atacante);
	}

	private static Posicion posicionJuntoAPosicion(Posicion posicionAtacada) {
		return new PosicionJuntoAOtra(posicionAtacada);
	}

	public static EscenarioParaDesplazarse escenarioParaDesplazarsePorVacia() {

		Posicion posicionDestino = new Posicion();
		PosicionEspia posicionActual = posicionEspiaJuntoAPosicion(posicionDestino);
		Unidad unidad = UnidadStubBuilder.construirStubGuerrero();
		unidad.establecerPosicion(posicionActual);

		return new EscenarioParaDesplazarse(unidad, posicionActual);
	}

	public static EscenarioParaDesplazarse escenarioParaDesplazarsePorSalida() {

		Posicion posicionDestino = new Salida();
		PosicionEspia posicionActual = posicionEspiaJuntoAPosicion(posicionDestino);
		Unidad unidad = UnidadStubBuilder.construirStubGuerrero();
		unidad.establecerPosicion(posicionActual);

		return new EscenarioParaDesplazarse(unidad, posicionActual);
	}

	public static EscenarioParaDesplazarse escenarioParaNoDesplazarsePorInexistente() {

		Posicion posicionDestino = new PosicionInexistente();
		PosicionEspia posicionActual = posicionEspiaJuntoAPosicion(posicionDestino);
		Unidad unidad = UnidadStubBuilder.construirStubGuerrero();
		unidad.establecerPosicion(posicionActual);

		return new EscenarioParaDesplazarse(unidad, posicionActual);
	}

	public static EscenarioParaDesplazarse escenarioParaNoDesplazarsePorOcupada() {

		Posicion posicionDestino = new PosicionOcupada();
		PosicionEspia posicionActual = posicionEspiaJuntoAPosicion(posicionDestino);
		Unidad unidad = UnidadStubBuilder.construirStubGuerrero();
		unidad.establecerPosicion(posicionActual);

		return new EscenarioParaDesplazarse(unidad, posicionActual);
	}

	private static PosicionEspia posicionEspiaJuntoAPosicion(Posicion posicionAtacada) {
		return new PosicionEspiaJuntoAOtra(posicionAtacada);
	}
}

class PosicionOcupada extends Posicion {
	@Override
	public boolean hay(Espacio espacio) {
		return Espacio.ENEMIGO == espacio;
	}
}

class PosicionJuntoAOtra extends Posicion {

	private Posicion contigua;

	public PosicionJuntoAOtra(Posicion otraPosicion) {
		this.contigua = otraPosicion;
	}

	@Override
	public Posicion obtenerContigua(Direccion direccion) {
		return this.contigua;
	}
}

class PosicionEspiaJuntoAOtra extends PosicionEspia {

	private Posicion contigua;

	public PosicionEspiaJuntoAOtra(Posicion otraPosicion) {
		this.contigua = otraPosicion;
	}

	@Override
	public Posicion obtenerContigua(Direccion direccion) {
		return this.contigua;
	}

}
