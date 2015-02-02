package ejercicios;

import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Escriba un programa que simule el juego de adivinar un número. 
		 * El ordenador debe generar un número entre 1 y 100 y el usuario tiene que intentar el adivinarlo. 
		 * Para ello, cada vez que el usuario introduce un valor el ordenador debe decirle al usuario 
		 * si el número a adivinar es mayor o menor que el introducido.
		 *  Cuando consiga adivinarlo debe indicárselo e imprimir en pantalla el número de veces que 
		 *  el usuario ha intentado adivinar dicho número. Estructura el programa 
		 *  con los métodos que estimes necesarios, 
		 * teniendo en cuenta que debe ser lo más legible posible.
		 */

	
		int numeroGenerado = (int)(Math.random()*100)+1;
		int rondas = 0;
		int numeroIntroducido = -1;
		
		while (!haAcertado(numeroIntroducido, numeroGenerado)) {
			numeroIntroducido = introducirNumero(rondas, numeroGenerado);
			if (numeroIntroducido < numeroGenerado)
				System.out.println("Es mayor");
			else if (numeroIntroducido > numeroGenerado)
				System.out.println("Es menor");
			else {
				rondas++;
				terminar(rondas);
			}
		rondas++;
		}
	}

	public static int introducirNumero(int nRondas, int numG) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Adivina el número: ");
		int num = teclado.nextInt();
		if (nRondas==0)
			System.out.println("Llevas 1 intento");
		else
			if (num!=numG)
			System.out.println("Llevas " + (nRondas + 1) + " intentos");
		return num;
	}
	
	public static boolean haAcertado(int numA, int numB) {
		return numA == numB;
	}
	
	public static void terminar(int nRondas) {
		System.out.println("Enhorabuena! Lo has adivinado en " + nRondas + " intentos");
	}
}
