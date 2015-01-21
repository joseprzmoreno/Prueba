package ejercicios;

import java.util.Scanner;

public class Quiniela {

	public static void main(String[] args) {
		//Ejercicio 1 Realiza un programa que calcule los 6 n�meros 
		//para rellenar una quiniela primitiva controlando que no se repita ninguno de ellos.
		
		Scanner teclado = new Scanner(System.in);
		boolean repetido = false;
		
		System.out.println("Rellena los n�meros de la primitiva");
		
		int[] numeros;
		numeros = new int[6];
		
		for (int i=0; i<6; i++) {
			do {
			repetido=false;
			System.out.print("Numero " + (i+1) + " ... ");
			numeros[i] = teclado.nextInt();
			for (int j=0; j<i; j++) {
				if (numeros[i]==numeros[j])
					repetido=true;
			} 
			if (repetido) 
				System.out.println("Ya has introducido ese n�mero. Pon otro.");
			} while(repetido || !(numeros[i]>=1 && numeros[i]<=49));
		}
		
		System.out.print("Has introducido los n�meros: ");
		for (int i=0; i<6; i++) {
			System.out.print(numeros[i] + " ");
		}
		
      //python: http://www.codeskulptor.org/#user39_Rj1H6gGesi_0.py
	}

}
