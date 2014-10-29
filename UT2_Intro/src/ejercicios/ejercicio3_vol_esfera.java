package ejercicios;

import java.util.Scanner;

public class ejercicio3_vol_esfera {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double radio;
		final double PI = 3.1416;
		
		System.out.println("Introduce longitud del radio de la esfera:");
		radio = entrada.nextDouble();
		
		System.out.println("-------------------------------");
		System.out.println("El volumen de la esfera es " + (4/3*PI*radio*radio*radio));

	}

}
