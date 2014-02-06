package jwarrior.fabricas;

import jwarrior.fabricas.comandos.FabricaDeComandos;
import jwarrior.fabricas.comandos.CreadorDeComandos;
import jwarrior.fabricas.sentidos.FabricaDeSentidos;
import jwarrior.fabricas.sentidos.CreadorDeSentidos;


public final class LocalizadorDeFabricas {

	private static LocalizadorDeFabricas instancia = new LocalizadorDeFabricas();

	private LocalizadorDeFabricas() { }

	public static LocalizadorDeFabricas obtenerInstancia() {
		return instancia;
	}

	public FabricaDeComandos obtenerFabricaDeComandos() {
		return new CreadorDeComandos();
	}

	public FabricaDeSentidos obtenerFabricaDeSentidos() {
		return new CreadorDeSentidos();
	}

}
