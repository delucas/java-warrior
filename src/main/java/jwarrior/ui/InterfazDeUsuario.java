package jwarrior.ui;

public final class InterfazDeUsuario {

	private static InterfazDeUsuario instancia = new InterfazDeUsuario();
	private Salida salida;

	private InterfazDeUsuario() {
		this.salida = new Salida();
	}

	public static InterfazDeUsuario obtenerInstancia() {
		return instancia;
	}

	public void mensaje(final String mensaje) {
		this.salida.enviar(mensaje);
	}

	public static void establecerSalida(final Salida salida) {
		InterfazDeUsuario.obtenerInstancia().salida = salida;
	}

}
