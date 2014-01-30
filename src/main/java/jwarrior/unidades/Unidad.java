package jwarrior.unidades;

import jwarrior.comandos.Atacar;
import jwarrior.comandos.Comando;
import jwarrior.comandos.Descansar;
import jwarrior.comandos.Desplazarse;
import jwarrior.comandos.NoHacerNada;
import jwarrior.posiciones.Posicion;
import jwarrior.referencias.Direccion;
import jwarrior.referencias.Espacio;
import jwarrior.sentidos.Sentir;
import jwarrior.ui.InterfazDeUsuario;

public abstract class Unidad {

	protected Espacio tipo = Espacio.VACIO;
	protected String nombre;
	private Posicion posicion;

	protected Integer saludMaxima = 0;
	protected Integer saludActual = 0;
	protected Integer fuerzaMaxima = 0;

	protected Unidad(final String nombre) {
		this.nombre = nombre;
	}

	// Puntos de extensión

	public Comando proximoMovimiento() {
		return this.noHacerNada();
	}

	// Comandos y Sentidos

	public final Comando noHacerNada() {
		return new NoHacerNada(this); // TODO: Factory
	}

	public final Comando atacar(final Direccion direccion) {
		return new Atacar(direccion, this); // TODO: Factory
	}

	public final Comando desplazarse(final Direccion direccion) {
		return new Desplazarse(direccion, this); // TODO: Factory
	}

	public final Comando descansar() {
		return new Descansar(this); // TODO: Factory
	}

	public final Sentir sentir(final Direccion direccion) {
		return new Sentir(direccion, this); // TODO: Factory
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

	private void morir() {
		this.decir("muere");
		this.posicion.liberar();
	}

	public final void decir(final String frase) {
		InterfazDeUsuario.getInstance().mensaje(nombre + " " + frase);
	}

	// Getters / Setters

	public final Espacio obtenerTipo() {
		return tipo;
	}

	public boolean estaSaludable() {
		return this.saludActual == this.saludMaxima;
	}

	public final boolean estaVivo() {
		return this.saludActual > 0;
	}

	public final void establecerPosicion(final Posicion posicion) {
		this.posicion = posicion;
	}

	public final Posicion obtenerPosicion() {
		return this.posicion;
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

	@Override
	public String toString() {
		return this.nombre;
	}

	public abstract String toCharacter();
}
