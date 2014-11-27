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

		// Validar el número y la respuesta, si pone un número negativo y quiere
		// introducir otro número, repite todo
		// mientras el número negativo sea 0 y la respuesta sea que sí, repite
		// el proceso
		while (numero < 0 && respuesta.equals("s")) {
			System.out.println("Inserta un número");
			numero = teclado.nextDouble();
			if (numero < 0) {
				do {
					System.out
							.println("El número introducido es negativo. Desea introducir otro número(s/n)? ");
					respuesta = teclado.next();
					respuesta = respuesta.toLowerCase();
				} while (!(respuesta.equals("s") || respuesta.equals("n")));
			}
		}

		// Si viene de un número válido (la respuesta es sí), calcula el
		// factorial.
		// Si ha dicho que no quiere introducir otro número, termina el programa
		if (respuesta.equals("s")) {

			if (numero == 0) {
				System.out.println("Su factorial es 1");
			}

			else {
				// este bucle calcula el factorial, el número se va
				// multiplicando por todos los números desde 1 a sí mismo y el
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
