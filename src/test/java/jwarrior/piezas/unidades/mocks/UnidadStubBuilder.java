package jwarrior.piezas.unidades.mocks;

import jwarrior.piezas.PosicionSpy;
import jwarrior.piezas.unidades.Unidad;

public class UnidadStubBuilder {
	public static Unidad construirStub() {
		return new Unidad(null, null) {
			@Override
			public String toCharacter() {
				return null;
			}
		};
	}

	public static UnidadSaludable construirStubSaludable(Integer saludMaxima) {
		return new UnidadSaludable(saludMaxima);
	}

	public static UnidadHerida construirStubHerido(Integer saludMaxima) {
		return new UnidadHerida(saludMaxima);
	}

	public static UnidadLevementeHerida construirStubLevementeHerido(Integer saludMaxima) {
		return new UnidadLevementeHerida(saludMaxima);
	}

	public static UnidadForzuda construirStubForzudo(Integer fuerzaMaxima) {
		return new UnidadForzuda(fuerzaMaxima);
	}

	public static UnidadNombrada construirStubNombrado(String nombre) {
		return new UnidadNombrada(nombre);
	}

	public static Unidad construirStubPosicionado(PosicionSpy posicion) {
		return new UnidadPosicionada(posicion);
	}

	public static Unidad construirStubHablador() {
		return new UnidadHabladora();
	}
}
