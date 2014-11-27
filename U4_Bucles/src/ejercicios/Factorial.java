package ejercicios;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		// declarar variables; poner numero a -1 y respuesta a s para que el
		// while funcione la primera vez
		double numero, numeroAcumulado;
		numero = -1;
		numeroAcumulado = 1;
		String respuesta = "s";
		Scanner teclado = new Scanner(System.in);

		// Validar el n�mero y la respuesta, si pone un n�mero negativo y quiere
		// introducir otro n�mero, repite todo
		// mientras el n�mero negativo sea 0 y la respuesta sea que s�, repite
		// el proceso
		while (numero < 0 && respuesta.equals("s")) {
			System.out.println("Inserta un n�mero");
			numero = teclado.nextDouble();
			if (numero < 0) {
				do {
					System.out
							.println("El n�mero introducido es negativo. Desea introducir otro n�mero(s/n)? ");
					respuesta = teclado.next();
					respuesta = respuesta.toLowerCase();
				} while (!(respuesta.equals("s") || respuesta.equals("n")));
			}
		}

		// Si viene de un n�mero v�lido (la respuesta es s�), calcula el
		// factorial.
		// Si ha dicho que no quiere introducir otro n�mero, termina el programa
		if (respuesta.equals("s")) {

			if (numero == 0) {
				System.out.println("Su factorial es 1");
			}

			else {
				// este bucle calcula el factorial, el n�mero se va
				// multiplicando por todos los n�meros desde 1 a s� mismo y el
				// resultado
				// se acumula en la variable numeroAcumulado
				for (double i = 1; i <= numero; i++) {
					numeroAcumulado *= i;
				}

				System.out.println("Su factorial es " + numeroAcumulado);
			}

		} else {
			System.out.println("Fin del programa");
		}
	}

}
