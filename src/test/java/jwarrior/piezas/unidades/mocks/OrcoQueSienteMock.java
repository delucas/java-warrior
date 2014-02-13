package jwarrior.piezas.unidades.mocks;

import jwarrior.piezas.unidades.Orco;
import jwarrior.referencias.Direccion;
import jwarrior.referencias.Espacio;
import jwarrior.sentidos.Sentir;

public class OrcoQueSienteMock extends Orco {

	private Espacio contenido;

	public OrcoQueSienteMock(Espacio contenido) {
		this.contenido = contenido;
	}

	@Override
	public Sentir sentir(Direccion direccion) {
		return new SentirPredefinido(this.contenido);
	}
}

class SentirPredefinido extends Sentir {


	private Espacio contenido;

	public SentirPredefinido(Espacio contenido) {
		super(null, null);
		this.contenido = contenido;
	}

	@Override
	public boolean hay(Espacio espacio) {
		return espacio == this.contenido;
	}
}