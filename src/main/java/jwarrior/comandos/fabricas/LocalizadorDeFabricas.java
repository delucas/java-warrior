package jwarrior.comandos.fabricas;

public class LocalizadorDeFabricas {

	private static LocalizadorDeFabricas instancia = new LocalizadorDeFabricas();

	private LocalizadorDeFabricas() { }
	
	public static LocalizadorDeFabricas obtenerInstancia() {
		return instancia ;
	}
	
	public FabricaDeComandos obtenerFabricaDeComandos() {
		return new InstanciadorDeComandos();
	}
	
}
