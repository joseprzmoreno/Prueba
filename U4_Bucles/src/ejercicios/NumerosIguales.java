package ejercicios;

import java.util.Scanner;

public class NumerosIguales {

	public static void main(String[] args) {
		
		/*
		 * Escribe un programa que pida dos n�meros. Si los dos n�meros dados son iguales, 
		 * se visualizar� un mensaje informando de esto y se volver�n a pedir otros dos n�meros. 
		 * El programa termina cuando los dos n�meros no son iguales y se imprime el mayor de los dos.
		 */
		
		int numeroA, numeroB;
		numeroA = 0;
		numeroB = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
		System.out.println("Introduce dos n�meros");
		System.out.println("N�mero 1: ");
		numeroA = teclado.nextInt();
		System.out.println("N�mero 2: ");
		numeroB = teclado.nextInt();
		if (numeroA == numeroB)
			System.out.println("Los n�meros son iguales");
		} while (numeroA == numeroB);
		if (numeroA>numeroB)
			System.out.println("El n�mero mayor de los dos es " + numeroA);
		else
			System.out.println("El n�mero mayor de los dos es " + numeroB);
		
		
		
		
		

	}

}
