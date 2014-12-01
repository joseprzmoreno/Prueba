package ejercicios;

import java.util.Scanner;

public class NumerosIguales {

	public static void main(String[] args) {
		
		/*
		 * Escribe un programa que pida dos números. Si los dos números dados son iguales, 
		 * se visualizará un mensaje informando de esto y se volverán a pedir otros dos números. 
		 * El programa termina cuando los dos números no son iguales y se imprime el mayor de los dos.
		 */
		
		int numeroA, numeroB;
		numeroA = 0;
		numeroB = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
		System.out.println("Introduce dos números");
		System.out.println("Número 1: ");
		numeroA = teclado.nextInt();
		System.out.println("Número 2: ");
		numeroB = teclado.nextInt();
		if (numeroA == numeroB)
			System.out.println("Los números son iguales");
		} while (numeroA == numeroB);
		if (numeroA>numeroB)
			System.out.println("El número mayor de los dos es " + numeroA);
		else
			System.out.println("El número mayor de los dos es " + numeroB);
		
		
		
		
		

	}

}
