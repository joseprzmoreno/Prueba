package ejercicios;

import java.util.Scanner;

public class Ej1_TablaMultiplicar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero entero y el programa generar� su tabla de multiplicar del 1 al 10");
		
		int numeroA = teclado.nextInt();
		
		int numeroB = 1;
		
		while (numeroB <= 10) {
			System.out.println(numeroA + " x " + numeroB + " = " + (numeroA * numeroB));
			numeroB++;
		}

	}

}
