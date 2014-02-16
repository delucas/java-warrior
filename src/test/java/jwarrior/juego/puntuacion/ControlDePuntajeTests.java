package jwarrior.juego.puntuacion;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collections;
import java.util.List;

import jwarrior.juego.Juego;
import jwarrior.juego.niveles.Nivel;
import jwarrior.observadores.ObservadorDeUnidades;
import jwarrior.piezas.unidades.Unidad;
import jwarrior.piezas.unidades.mocks.UnidadStubBuilder;
import jwarrior.posiciones.Posicion;

import org.junit.Test;

public class ControlDePuntajeTests {

	@Test
	public void informaPuntuacionInicial() {
		
		ControlDePuntaje controlDePuntaje = new ControlDePuntaje();
		assertThat(controlDePuntaje.obtenerPuntaje(), is(10));
	}
	
	@Test
	public void alInformarPasoDeTurnoNotificaConPuntajeNegativo() {

		ControlDePuntaje controlDePuntaje = new ControlDePuntaje();
		PuntajeEspia puntajeEspia = new PuntajeEspia();
		controlDePuntaje.establecerPuntaje(puntajeEspia);
		
		controlDePuntaje.notificarTurno(new JuegoStub());
		assertThat(puntajeEspia.invocoComputarConNegativo(), is(true));
	}

	@Test
	public void alInformarMuerteEnemigoComputa() {

		ControlDePuntaje controlDePuntaje = new ControlDePuntaje();
		PuntajeEspia puntajeEspia = new PuntajeEspia();
		controlDePuntaje.establecerPuntaje(puntajeEspia);
		
		controlDePuntaje.notificarMuerte(UnidadStubBuilder.construirStub());
		assertThat(puntajeEspia.invocoComputar(), is(true));
	}

	@Test
	public void alInformarMuerteGuerreroNoComputa() {

		ControlDePuntaje controlDePuntaje = new ControlDePuntaje();
		PuntajeEspia puntajeEspia = new PuntajeEspia();
		controlDePuntaje.establecerPuntaje(puntajeEspia);
		
		controlDePuntaje.notificarMuerte(UnidadStubBuilder.construirStubGuerrero());
		assertThat(puntajeEspia.invocoComputar(), is(false));
	}

	@Test
	public void alInformarFinalizacionPartidaComputa() {

		ControlDePuntaje controlDePuntaje = new ControlDePuntaje();
		PuntajeEspia puntajeEspia = new PuntajeEspia();
		controlDePuntaje.establecerPuntaje(puntajeEspia);
		
		controlDePuntaje.notificarFinal(new JuegoStub());
		assertThat(puntajeEspia.invocoComputar(), is(true));
	}
}

class JuegoStub extends Juego {

	public JuegoStub() {
		super(new NivelDummy());
	}
	
	@Override
	public Unidad obtenerGuerrero() {
		return UnidadStubBuilder.construirStubGuerrero();
	}
}

class NivelDummy extends Nivel {

	public NivelDummy() {
		super(null, null, null);
	}

	public List<Posicion> obtenerPosiciones(final ObservadorDeUnidades observadorDeUnidades) {
		return Collections.emptyList();
	}
}

class PuntajeEspia extends Puntaje {
	private boolean computo = false;
	private boolean computoConNegativo = false;

	@Override
	public void computar(Integer puntos) {
		this.computo = true;
		if (puntos < 0) {
			this.computoConNegativo = true;
		}
	}
	
	public Boolean invocoComputarConNegativo() {
		return this.computoConNegativo;
	}
	
	public Boolean invocoComputar() {
		return this.computo;
	}
}