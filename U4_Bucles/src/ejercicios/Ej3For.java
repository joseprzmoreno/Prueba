package ejercicios;

import java.util.Scanner;

public class Ej3For {

	public static void main(String[] args) {
		// Escribe un programa que calcule la suma de 6 n�meros que inserte el usuario a trav�s del teclado.
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		int cantidadAcumulada = 0;
		System.out.println("Introduce seis n�meros");
		
		for (int i=0; i<6; i++) {
			numero = teclado.nextInt();
			cantidadAcumulada += numero;
		}	
			
		System.out.println("La suma de los seis n�meros es " + cantidadAcumulada);

	}

}
