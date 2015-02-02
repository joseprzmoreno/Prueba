package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir un método que convierta de euros a dólares. 
		 * Recibirá un número decimal correspondiente a la cantidad en euros 
		 * y devolverá la cantidad correspondiente en dolares. Escribir el código en el main necesario para probarlo.
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce cantidad de euros (usa coma para decimales): ");
		
		double euros = teclado.nextDouble();
		
		double dolares = eurosDolares(euros);
		
		System.out.printf("En dólares: %.2f dólares", dolares);
		
	}

	
	public static double eurosDolares(double euros) {
		return euros * 1.13;
	}
}
