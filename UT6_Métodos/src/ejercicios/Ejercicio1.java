package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir un m�todo que convierta de euros a d�lares. 
		 * Recibir� un n�mero decimal correspondiente a la cantidad en euros 
		 * y devolver� la cantidad correspondiente en dolares. Escribir el c�digo en el main necesario para probarlo.
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce cantidad de euros (usa coma para decimales): ");
		
		double euros = teclado.nextDouble();
		
		double dolares = eurosDolares(euros);
		
		System.out.printf("En d�lares: %.2f d�lares", dolares);
		
	}

	
	public static double eurosDolares(double euros) {
		return euros * 1.13;
	}
}
