package jwarrior.piezas.unidades;

import jwarrior.comandos.Comando;
import jwarrior.fabricas.LocalizadorDeFabricas;
import jwarrior.piezas.Pieza;
import jwarrior.referencias.Direccion;
import jwarrior.referencias.Espacio;
import jwarrior.sentidos.Sentir;
import jwarrior.ui.InterfazDeUsuario;

public abstract class Unidad extends Pieza {

	private String nombre;

	private Integer saludMaxima = 0;
	private Integer saludActual = 0;
	private Integer fuerzaMaxima = 0;

	protected Unidad(final String nombre, final Espacio tipo) {
		super(tipo);
		this.nombre = nombre;
	}

	// Puntos de extensión

	public Comando proximoComando() {
		return this.noHacerNada();
	}

	// Comandos y Sentidos

	public final Comando noHacerNada() {
		return LocalizadorDeFabricas
				.obtenerInstancia()
				.obtenerFabricaDeComandos()
				.crearNoHacerNada(this);
	}

	public final Comando atacar(final Direccion direccion) {
		return LocalizadorDeFabricas
				.obtenerInstancia()
				.obtenerFabricaDeComandos()
				.crearAtacar(direccion, this);
	}

	public final Comando desplazarse(final Direccion direccion) {
		return LocalizadorDeFabricas
				.obtenerInstancia()
				.obtenerFabricaDeComandos()
				.crearDesplazarse(direccion, this);
	}

	public final Comando descansar() {
		return LocalizadorDeFabricas
				.obtenerInstancia()
				.obtenerFabricaDeComandos()
				.crearDescansar(this);
	}

	public final Sentir sentir(final Direccion direccion) {
		return LocalizadorDeFabricas
				.obtenerInstancia()
				.obtenerFabricaDeSentidos()
				.crearSentir(direccion, this);
	}

	// Acciones generales de Unidad

	public void recibirGolpe(final Integer fuerza) {
		this.saludActual -= fuerza;
		this.decir("recibe " + fuerza + " de daño y le queda " + this.saludActual + " de salud");
		if (this.saludActual <= 0) {
			this.morir();
		}
	}

	public final void curar(final Integer cantidadARestaurar) {
		this.saludActual = Math.min(
				this.saludActual + cantidadARestaurar,
				this.saludMaxima);
	}

	protected void morir() {
		this.decir("muere");
		this.obtenerPosicion().liberar();
	}

	public void decir(final String frase) {
		InterfazDeUsuario.getInstance().mensaje(nombre + " " + frase);
	}

	// Getters / Setters

	public boolean estaSaludable() {
		return this.saludActual == this.saludMaxima;
	}

	public final boolean estaVivo() {
		return this.saludActual > 0;
	}

	protected final void establecerFuerzaMaxima(final Integer fuerzaMaxima) {
		this.fuerzaMaxima = fuerzaMaxima;
	}

	public final Integer obtenerFuerzaMaxima() {
		return this.fuerzaMaxima;
	}

	protected final void establecerSaludMaxima(final Integer saludMaxima) {
		this.saludMaxima = saludMaxima;
		this.saludActual = saludMaxima;
	}

	public final Integer obtenerSaludMaxima() {
		return this.saludMaxima;
	}

	public final Integer obtenerSaludActual() {
		return this.saludActual;
	}

	public boolean esUnidad() {
		return true;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

	public abstract String toCharacter();
}
