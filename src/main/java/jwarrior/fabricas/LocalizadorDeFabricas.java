package jwarrior.fabricas;

import jwarrior.fabricas.comandos.FabricaDeComandos;
import jwarrior.fabricas.comandos.InstanciadorDeComandos;
import jwarrior.fabricas.sentidos.FabricaDeSentidos;
import jwarrior.fabricas.sentidos.InstanciadorDeSentidos;


public class LocalizadorDeFabricas {

	private static LocalizadorDeFabricas instancia = new LocalizadorDeFabricas();

	private LocalizadorDeFabricas() { }
	
	public static LocalizadorDeFabricas obtenerInstancia() {
		return instancia ;
	}
	
	public FabricaDeComandos obtenerFabricaDeComandos() {
		return new InstanciadorDeComandos();
	}

	public FabricaDeSentidos obtenerFabricaDeSentidos() {
		return new InstanciadorDeSentidos();
	}
	
}
