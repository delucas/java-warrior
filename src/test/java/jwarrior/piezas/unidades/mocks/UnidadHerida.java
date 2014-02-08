package jwarrior.piezas.unidades.mocks;

public class UnidadHerida extends UnidadMock {

	public UnidadHerida(Integer saludMaxima) {
		this.establecerSaludMaxima(saludMaxima);
		this.recibirGolpe(saludMaxima / 2);
	}
}