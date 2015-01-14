package ejercicios;

import java.util.Scanner;

public class NumeroMaxMinProxmedia {

	public static void main(String[] args) {
		// Leer 10 n�meros, encontrar el m�ximo, el m�nimo y el m�s cercano a la
		// media

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce diez n�meros");

		int[] numeros;
		numeros = new int[10];

		// Leer los n�meros
		for (int i = 0; i < 10; i++) {
			numeros[i] = teclado.nextInt();
		}

		// N�mero m�ximo
		int max = numeros[0];

		for (int i = 0; i < 10; i++) {
			if (numeros[i] > max)
				max = numeros[i];
		}
		System.out.println("El n�mero m�ximo es " + max);

		// N�mero m�nimo
		int min = numeros[0];

		for (int i = 0; i < 10; i++) {
			if (numeros[i] < min)
				min = numeros[i];
		}
		System.out.println("El n�mero m�nimo es " + min);

		// C�lculo de la media

		int sumaAcum = 0;
		for (int i = 0; i < 10; i++) {
			sumaAcum += numeros[i];
		}
		int media = sumaAcum / 10;

		// N�mero m�s cercano a la media
		int distancia = Math.abs(media - numeros[0]);
		int numProxMedia = numeros[0];

		for (int i = 0; i < 10; i++) {
			if (Math.abs(media - numeros[i]) < distancia) {
				distancia = Math.abs(media - numeros[i]);
				numProxMedia = numeros[i];
			}
		}
		System.out.println("La media es " + media
				+ ". El n�mero m�s cercano a la media es " + numProxMedia);

	}

}
