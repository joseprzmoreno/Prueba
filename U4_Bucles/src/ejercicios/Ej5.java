package ejercicios;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que lea una serie de n�meros, muestre el primero, no el segundo, 
		 * si el tercero y as� sucesivamente. Termina cuando insertamos un n�mero negativo.
		 * El n�mero negativo no se imprimir�.
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		int contador = 0;
		int numero;
		
		do {
			System.out.println("Introduce un n�mero");
			numero = teclado.nextInt();
			if (contador % 2 == 0 && numero>=0)
				System.out.println("N�mero introducido: " + numero);
			contador++;
		} while(numero >= 0);
		
		System.out.println("Fin del programa");
	}

}
