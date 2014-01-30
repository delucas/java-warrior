package jwarrior.ui;

public final class InterfazDeUsuario {

	private static InterfazDeUsuario instance = new InterfazDeUsuario();

	private InterfazDeUsuario() { }

	public static InterfazDeUsuario getInstance() {
		return instance;
	}

	public void mensaje(final String mensaje) {
		// TODO: Desacoplar en una "configuracion" / "salida" / etc
		System.out.println(mensaje);
	}

}
