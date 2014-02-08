package jwarrior.piezas.unidades.mocks;

public class UnidadLevementeHerida extends UnidadMock {

	public UnidadLevementeHerida(Integer saludMaxima) {
		this.establecerSaludMaxima(saludMaxima);
		this.recibirGolpe((int) (saludMaxima * 0.1));
	}
}