package ejercicios;

import java.util.Scanner;

/*
 * Modifica el ejercicio de la tabla de multiplicar de forma que el usuario vaya introduciendo n�meros y
 * se vayan imprimiendo las tablas correspondientes. 
 * El programa termina cuando se introduce un n�mero no est� entre 1 y 10.
 */

public class TablaMult2 {

	public static void main(String[] args) {

		int numero;

		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("Introduce el n�mero (1 a 10) cuya tabla quieres saber...");

			numero = teclado.nextInt();

			// si no le pongo este if cuando me salgo saca la tabla del �ltimo n�mero
			if (numero >= 1 && numero <= 10) {
				for (int i = 1; i <= 10; i++) {
					System.out.println(numero + " x " + i + " = " + numero * i);
				}
			}

		} while (numero >= 1 && numero <= 10);
		
		System.out.println("Fin del programa");

	}

}
