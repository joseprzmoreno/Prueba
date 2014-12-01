package ejercicios;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		/*
		 * El juego de adivina el número.El programa "pensará" un número del 1
		 * al 100 que el jugador tendrá que adivinar. El programa va preguntando
		 * un número tras otro al jugador. Si el jugador dice uno mayor, el
		 * programa le dice que el número oculto es menor (y al revés si dice
		 * uno menor). El jugador tiene como máximo 10 oportunidades para
		 * adivinar el número.
		 */

		Scanner teclado = new Scanner(System.in);
		int numAleatorio = (int) (Math.random() * 100 + 1);
		int intento = 0;
		int oportunidades = 0;

		while (intento != numAleatorio && oportunidades < 10) {
			System.out.println("Adivina un número del 1 a 100");
			System.out.print("Número: ");
			intento = teclado.nextInt();
			if (intento == numAleatorio) {
				System.out.println("Número correcto!");
				break;
			} else if (intento > numAleatorio) {
				System.out.println("El número es menor");
			} else {
				System.out.println("El número es mayor");
			}
			oportunidades++;

		}

	}

}
