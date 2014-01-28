# java-warrior

`java-warrior` es un juego para programadores.

[![Historias en Ready](https://badge.waffle.io/delucas/java-warrior.png?label=ready)](https://waffle.io/delucas/java-warrior)

## Temática

El programador deberá codificar un `Jugador`, que tenga la lógica para guiar a un `Guerrero` a lo largo de un nivel.

## Modo de uso

Crear una clase que implemente la interfaz de `Jugador`. Por ejemplo, aquí está la que resuelve el primer nivel:

    package jwarrior.jugadores;

    import static jwarrior.referencias.Direccion.ADELANTE;
    import jwarrior.comandos.Comando;
    import jwarrior.juego.Jugador;
    import jwarrior.unidades.Guerrero;

    public class JugadorNivel01 implements Jugador {

      @Override
      public Comando jugarTurno(Guerrero guerrero) {
        return guerrero.desplazarse(ADELANTE);
      }
      
      @Override
      public String obtenerNombreDelGuerrero() {
        return "Gimli";
      }
    }

Una vez implementado el `Jugador`, se debe utilizarlo dentro del nivel. Para ello preparamos un test que servirá para jugarlo:

    package jwarrior;

    import jwarrior.juego.Juego;
    import jwarrior.juego.niveles.Nivel01;
    import jwarrior.jugadores.JugadorNivel01;

    import org.junit.Test;

    public class Nivel01AcceptanceTest {

      @Test
      public void test() {
        Juego coordinador = new Juego(new Nivel01(new JugadorNivel01()));
        coordinador.jugar();
      }
    }

Ejecutando este test veremos por la consola los resultados de la partida:

    Nivel 01
    Turno: 1
    -------
    PG____S
    -------
    Gimli se desplaza hacia ADELANTE

    Turno: 2
    -------
    P_G___S
    -------
    Gimli se desplaza hacia ADELANTE

    Turno: 3
    -------
    P__G__S
    -------
    Gimli se desplaza hacia ADELANTE

    Turno: 4
    -------
    P___G_S
    -------
    Gimli se desplaza hacia ADELANTE

    Turno: 5
    -------
    P____GS
    -------
    Gimli se desplaza hacia ADELANTE
    juego terminado

¡Listo! Ya has podido jugar al `java-warrior`. Podés seguir con los siguientes niveles.

## Inspiración

La primera versión de este juego educativo está basada en el famoso [ruby-warrior](https://github.com/ryanb/ruby-warrior), el cual puede jugarse de manera on-line desde la página de [bloc.io](https://www.bloc.io/ruby-warrior#/).

## Contribuciones

1. Hacer un fork
2. Crear un feature-branch (`git checkout -b my-new-feature`)
3. Commitear los cambios (`git commit -am 'Add some feature'`)
4. Hacer push al branch (`git push origin my-new-feature`)
5. Crear un Pull Request