package jwarrior.piezas.unidades.mocks;

public class UnidadEspia extends GuerreroStub {

	private boolean invocoDecir = false;
	private boolean invocoRecibirGolpe = false;

	@Override
	public void decir(String frase) {
		this.invocoDecir = true;
	}

	public void recibirGolpe(Integer fuerza) {
		this.invocoRecibirGolpe = true;
	}

	public boolean invocoDecir() {
		return this.invocoDecir;
	}

	public boolean invocoRecibirGolpe() {
		return this.invocoRecibirGolpe;
	}
}