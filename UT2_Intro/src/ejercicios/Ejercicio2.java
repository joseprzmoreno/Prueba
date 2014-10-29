package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeroA;
		int numeroB;
		
		System.out.println("Introduce el número 1: ");
		numeroA = entrada.nextInt();
		
		System.out.println("Introduce el número 2: ");
		numeroB = entrada.nextInt();
		
		System.out.println("---------------------------");
		System.out.println("La suma es " + (numeroA + numeroB));
		System.out.println("El producto es " + numeroA * numeroB);
		System.out.println("La media es " + (numeroA + numeroB)/2.0);
		
		//entrada.close(); opcional, se puede hacer pero casi mejor no hacerlo

	}

}
