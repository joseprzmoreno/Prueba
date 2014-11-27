package ejercicios;

import java.util.Scanner;

public class Ej3For {

	public static void main(String[] args) {
		// Escribe un programa que calcule la suma de 6 números que inserte el usuario a través del teclado.
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		int cantidadAcumulada = 0;
		System.out.println("Introduce seis números");
		
		for (int i=0; i<6; i++) {
			numero = teclado.nextInt();
			cantidadAcumulada += numero;
		}	
			
		System.out.println("La suma de los seis números es " + cantidadAcumulada);

	}

}
