package jwarrior.unidades;


public class UnidadNula extends Unidad {

	public UnidadNula() {
		super("la nada");
	}

	@Override
	public void recibirGolpe(final Integer fuerza) {
		// no puede recibir golpes!
	}

	@Override
	public String toCharacter() {
		return "_";
	}

}
