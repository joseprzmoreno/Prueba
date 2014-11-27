package ejercicios;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que lea una serie de números, muestre el primero, no el segundo, 
		 * si el tercero y así sucesivamente. Termina cuando insertamos un número negativo.
		 * El número negativo no se imprimirá.
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		int contador = 0;
		int numero;
		
		do {
			System.out.println("Introduce un número");
			numero = teclado.nextInt();
			if (contador % 2 == 0 && numero>=0)
				System.out.println("Número introducido: " + numero);
			contador++;
		} while(numero >= 0);
		
		System.out.println("Fin del programa");
	}

}
