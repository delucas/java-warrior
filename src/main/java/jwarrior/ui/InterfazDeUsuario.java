package jwarrior.ui;

public class InterfazDeUsuario {

	private static InterfazDeUsuario instance = new InterfazDeUsuario();

	private InterfazDeUsuario() { }

	public static InterfazDeUsuario getInstance() {
		return instance;
	}

	public void mensaje(String mensaje) {
		// TODO: Desacoplar en una "configuracion" / "salida" / etc
		System.out.println(mensaje);
	}

}
