package jwarrior.piezas.unidades.mocks;

public class UnidadHeridaEspia extends UnidadMock {

	// TODO: código repetido
	private boolean invocoCurar = false;

	public UnidadHeridaEspia(Integer saludMaxima) {
		this.establecerSaludMaxima(saludMaxima);
		this.recibirGolpe(saludMaxima / 2);
	}

	@Override
	public void curar(Integer cantidadARestaurar) {
		this.invocoCurar   = true;
	}

	public boolean invocoCurar() {
		return this.invocoCurar;
	}
}