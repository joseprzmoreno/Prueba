package ejercicios;

import java.util.Scanner;

public class Ejercicio3_perimetro_rectangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double ladoA;
		double ladoB;
		//se puede poner double ladoA, ladoB;
		System.out.println("Introduce longitud del lado A del rectángulo:");
		ladoA = entrada.nextDouble();
		System.out.println("Introduce longitud del lado B del rectángulo:");
		ladoB = entrada.nextDouble();
		System.out.println("-------------------------------");
		System.out.println("El perímetro del rectángulo es " + ((2*ladoA)+(2*ladoB)));
		System.out.println("El área del rectángulo es " + (ladoA*ladoB));
		

	}

}
