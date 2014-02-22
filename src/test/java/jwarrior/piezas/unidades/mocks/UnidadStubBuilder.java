package jwarrior.piezas.unidades.mocks;

import jwarrior.juego.jugadores.JugadorEspia;
import jwarrior.piezas.PosicionEspia;
import jwarrior.piezas.unidades.Guerrero;
import jwarrior.piezas.unidades.Orco;
import jwarrior.piezas.unidades.Unidad;
import jwarrior.posiciones.PosicionStubBuilder;
import jwarrior.referencias.Espacio;

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

	public static UnidadLevementeHerida construirStubLevementeHerido(
			Integer saludMaxima) {
		return new UnidadLevementeHerida(saludMaxima);
	}

	public static UnidadForzuda construirStubForzudo(Integer fuerzaMaxima) {
		return new UnidadForzuda(fuerzaMaxima);
	}

	public static UnidadNombrada construirStubNombrado(String nombre) {
		return new UnidadNombrada(nombre);
	}

	public static Unidad construirStubPosicionado(PosicionEspia posicion) {
		return new UnidadPosicionada(posicion);
	}

	public static Unidad construirStubHablador() {
		return new UnidadHabladora();
	}

	public static Unidad construirStubGuerrero() {
		return new GuerreroStub();
	}

	public static Unidad construirGuerrero(JugadorEspia jugadorEspia) {
		return new Guerrero("Nombre", jugadorEspia);
	}

	public static Orco construirOrcoSinUnidadesCerca() {
		return new OrcoQueSienteMock(Espacio.VACIO);
	}

	public static Orco construirOrcoConGuerreroAtras() {
		return new OrcoQueSienteMock(Espacio.GUERRERO);
	}

	public static Unidad construirGuerreroConEnemigosAlrededor() {
		// TODO Auto-generated method stub
		return new GuerreroConEnemigoAlFrente();
	}

	public static UnidadEspia construirStubEspia() {
		return new UnidadEspia();
	}

	public static UnidadMuerta construirStubMuerto() {
		return new UnidadMuerta();
	}

	public static UnidadHeridaEspia construirStubHeridoEspia(Integer saludMaxima) {
		return new UnidadHeridaEspia(saludMaxima);
	}
}

class GuerreroConEnemigoAlFrente extends GuerreroStub {

	public GuerreroConEnemigoAlFrente() {
		this.establecerPosicion(PosicionStubBuilder
				.construirPosicionJuntoAEnemigo());
	}
}
