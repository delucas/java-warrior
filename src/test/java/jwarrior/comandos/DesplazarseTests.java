package jwarrior.comandos;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DesplazarseTests {

	@Test
	public void queUnidadSiHayContiguaSeMueve() {

		EscenarioParaDesplazarse escenario = ConstructorDeEscenarios.escenarioParaDesplazarsePorVacia();
		Desplazarse comando = escenario.obtenerComando();

		comando.ejecutarComando();
		assertThat(escenario.obtenerPosicionOrigen().invocoMoverUnidadHacia(), is(true));
	}

	@Test
	public void queUnidadSiHaySalidaSeMueve() {

		EscenarioParaDesplazarse escenario = ConstructorDeEscenarios.escenarioParaDesplazarsePorSalida();
		Desplazarse comando = escenario.obtenerComando();

		comando.ejecutarComando();
		assertThat(escenario.obtenerPosicionOrigen().invocoMoverUnidadHacia(), is(true));
	}

	@Test
	public void queUnidadSiNoHayContiguaNoSeMueve() {

		EscenarioParaDesplazarse escenario = ConstructorDeEscenarios.escenarioParaNoDesplazarsePorInexistente();
		Desplazarse comando = escenario.obtenerComando();

		comando.ejecutarComando();
		assertThat(escenario.obtenerPosicionOrigen().invocoMoverUnidadHacia(), is(false));
	}

	@Test
	public void queUnidadSiHayContiguaOcupadaNoSeMueve() {

		EscenarioParaDesplazarse escenario = ConstructorDeEscenarios.escenarioParaNoDesplazarsePorOcupada();
		Desplazarse comando = escenario.obtenerComando();

		comando.ejecutarComando();
		assertThat(escenario.obtenerPosicionOrigen().invocoMoverUnidadHacia(), is(false));
	}
}
