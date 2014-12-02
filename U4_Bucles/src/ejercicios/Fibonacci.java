package ejercicios;

import java.util.Scanner;

public class Fibonacci {

	/*
		 * Imprimime los primeros X números de la serie de Fibonacci, donde X es un
		 * número que pedirás al usuario. Después pregunta números y di si está en
		 * esa serie o no. El programa terminará cuando el usuario introduzca un 0.
		 */

		public static void main(String[] args) {

			Scanner teclado = new Scanner(System.in);

			System.out
					.println("¿Cuántos números de la serie Fibonacci quieres ver?");
			int cantidad = teclado.nextInt();

			int numeroX = 1;
			int numeroY = 1;
			int numeroBusc = 1;  //numero buscado (se utiliza en la segunda parte del programa)
			boolean estaEnLista = false;

			System.out.print("1 1 ");

			for (int i = 0; i < (cantidad - 2); i++) {
				System.out.print((numeroX + numeroY) + " ");
				numeroX = numeroY;
				numeroY = numeroX + numeroY;
			}

			System.out.println("");

			while (numeroBusc != 0) {
				System.out
						.println("Introduce un número para ver si está en la lista. Para acabar introduce 0");
				numeroBusc = teclado.nextInt();
				estaEnLista = false;
				numeroX = 1;
				numeroY = 1;

				if (numeroBusc == 1) {
					estaEnLista = true;
				} else {
					for (int i = 0; i < (cantidad - 2); i++) {
						if (numeroX + numeroY == numeroBusc)
							estaEnLista = true;
						numeroX = numeroY;
						numeroY = numeroX + numeroY;
					}
				}
				if (numeroBusc != 0) {
					if (estaEnLista)
						System.out
								.println("El número está en la lista Fibonacci anterior");
					else
						System.out
								.println("El número no está en la lista Fibonacci anterior");
				}
			}
			;
			System.out.println("Fin del programa");

	}

}
