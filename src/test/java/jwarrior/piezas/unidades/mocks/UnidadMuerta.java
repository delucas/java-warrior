package jwarrior.piezas.unidades.mocks;

public class UnidadMuerta extends GuerreroStub {

	@Override
	public boolean estaVivo() {
		return false;
	}

	private boolean invocoDecir = false;

	@Override
	public void decir(String frase) {
		this.invocoDecir = true;
	}

	public boolean invocoDecir() {
		return this.invocoDecir;
	}
}
