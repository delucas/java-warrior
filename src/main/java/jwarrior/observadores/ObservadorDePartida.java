package jwarrior.observadores;

import jwarrior.juego.Juego;

public interface ObservadorDePartida {

	void notificarTurno(Juego partida);

	void notificarFinal(Juego partida);

}
