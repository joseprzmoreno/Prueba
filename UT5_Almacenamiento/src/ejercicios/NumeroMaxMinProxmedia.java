package ejercicios;

import java.util.Scanner;

public class NumeroMaxMinProxmedia {

	public static void main(String[] args) {
		// Leer 10 números, encontrar el máximo, el mínimo y el más cercano a la
		// media

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce diez números");

		int[] numeros;
		numeros = new int[10];

		// Leer los números
		for (int i = 0; i < 10; i++) {
			numeros[i] = teclado.nextInt();
		}

		// Número máximo
		int max = numeros[0];

		for (int i = 0; i < 10; i++) {
			if (numeros[i] > max)
				max = numeros[i];
		}
		System.out.println("El número máximo es " + max);

		// Número mínimo
		int min = numeros[0];

		for (int i = 0; i < 10; i++) {
			if (numeros[i] < min)
				min = numeros[i];
		}
		System.out.println("El número mínimo es " + min);

		// Cálculo de la media

		int sumaAcum = 0;
		for (int i = 0; i < 10; i++) {
			sumaAcum += numeros[i];
		}
		int media = sumaAcum / 10;

		// Número más cercano a la media
		int distancia = Math.abs(media - numeros[0]);
		int numProxMedia = numeros[0];

		for (int i = 0; i < 10; i++) {
			if (Math.abs(media - numeros[i]) < distancia) {
				distancia = Math.abs(media - numeros[i]);
				numProxMedia = numeros[i];
			}
		}
		System.out.println("La media es " + media
				+ ". El número más cercano a la media es " + numProxMedia);

	}

}
