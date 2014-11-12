package Ejs_condicionales_inic;

import java.util.Scanner;

public class NumeroMayorEntreDos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce número entero 1");
		int numeroA = teclado.nextInt();
		System.out.println();
		System.out.println("Introduce número entero 2");
		int numeroB = teclado.nextInt();
		System.out.println();
		
		if (numeroA > numeroB)
			System.out.println(numeroA + " es el mayor número de los dos");
		else if (numeroB > numeroA)
			System.out.println(numeroB + " es el mayor número de los dos");
		else
			System.out.println("Los número son iguales. En ambos casos has introducido " + numeroA);
	}

}
