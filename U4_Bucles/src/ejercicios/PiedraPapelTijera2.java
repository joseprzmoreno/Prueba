package ejercicios;

import java.util.Scanner;

/*
 * Mejora el juego de piedra/papel/tijera haciendo dos cosas:
 Que se compruebe lo que el usuario escribe, y si no está {"piedra","papel","tijera"} 
 vuelva a pedir que introduzca su elección.
 Al finalizar la partida, deberá preguntarse "¿Otra partida [s/n]?". 
 Si el usuario contesta que si, deberá volver a dejarnos jugar una nueva partida.
 */

public class PiedraPapelTijera2 {

	public static void main(String[] args) {

		int puntosOrdenador = 0;
		int puntosHumano = 0;

		String respuesta = "s";

		while (respuesta.equals("s")) {

			// jugada del ordenador
			int jugadaOrdenador = (int) (Math.random() * 3 + 1);

			Scanner teclado = new Scanner(System.in);

			// jugada del humano
			int jugadaHumano;
			do {
				System.out
						.println("Elige tu jugada: 1.Piedra; 2.Papel; 3.Tijera");
				jugadaHumano = teclado.nextInt();

				if (jugadaHumano != 1 && jugadaHumano != 2 && jugadaHumano != 3)
					System.out.println("Jugada no válida");

				else {
					if (jugadaHumano == 1)
						System.out.println("Tu jugada es PIEDRA");
					else if (jugadaHumano == 2)
						System.out.println("Tu jugada es PAPEL");
					else
						System.out.println("Tu jugada es TIJERA");

					if (jugadaOrdenador == 1)
						System.out.println("El ordenador ha jugado PIEDRA");
					else if (jugadaOrdenador == 2)
						System.out.println("El ordenador ha jugado PAPEL");
					else
						System.out.println("El ordenador ha jugado TIJERA");

					System.out.println("-------------------");

					/*
					 * Lógica del juego. Piedra (1) gana a Tijera(3). Papel (2)
					 * gana a piedra(1) Tijera (3) gana a papel(2)
					 */

					boolean ganaHumano = false;

					if (jugadaOrdenador == jugadaHumano) {
						System.out.println("El juego acaba en TABLAS");
						System.out.println("LLEVAS " + puntosHumano
								+ " PUNTOS. EL ORDENADOR LLEVA "
								+ puntosOrdenador + " PUNTOS");
					} else {
						if (jugadaOrdenador == 1 && jugadaHumano == 2) {
							System.out.println("El papel lija la piedra");
							ganaHumano = true;
						} else if (jugadaOrdenador == 1 && jugadaHumano == 3) {
							System.out.println("La piedra aplasta la tijera");
							ganaHumano = false;
						} else if (jugadaOrdenador == 2 && jugadaHumano == 1) {
							System.out.println("El papel lija la piedra");
							ganaHumano = false;
						} else if (jugadaOrdenador == 2 && jugadaHumano == 3) {
							System.out.println("La tijera corta el papel");
							ganaHumano = true;
						} else if (jugadaOrdenador == 3 && jugadaHumano == 1) {
							System.out.println("La piedra aplasta la tijera");
							ganaHumano = true;
						} else {
							System.out.println("La tijera corta el papel");
							ganaHumano = false;
						}

						if (ganaHumano) {
							System.out.println("TÚ GANAS");
							puntosHumano++;
							System.out.println("LLEVAS " + puntosHumano
									+ " PUNTOS. EL ORDENADOR LLEVA "
									+ puntosOrdenador + " PUNTOS");
						} else {
							System.out.println("GANA EL ORDENADOR");
							puntosOrdenador++;
							System.out.println("LLEVAS " + puntosHumano
									+ " PUNTOS. EL ORDENADOR LLEVA "
									+ puntosOrdenador + " PUNTOS");
						}
					}

				}
			} while (jugadaHumano != 1 && jugadaHumano != 2
					&& jugadaHumano != 3);

			respuesta = "";
			while (!(respuesta.equals("s") || respuesta.equals("n"))) {
				System.out.println("Quieres jugar otra vez? [s/n]");
				respuesta = teclado.next();
				respuesta = respuesta.toLowerCase();
			}

		}
		System.out.println("Fin del programa");

	}

}
