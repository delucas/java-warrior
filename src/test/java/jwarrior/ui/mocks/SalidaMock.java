package jwarrior.ui.mocks;

import jwarrior.ui.Salida;

public class SalidaMock extends Salida {

	private boolean envioMensaje = false;

	@Override
	public void enviar(String mensaje) {
		this.envioMensaje  = true;
	}

	public boolean envioMensaje() {
		return this.envioMensaje;
	}
}
