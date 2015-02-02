package ejercicios;

import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Escriba un programa que simule el juego de adivinar un n�mero. 
		 * El ordenador debe generar un n�mero entre 1 y 100 y el usuario tiene que intentar el adivinarlo. 
		 * Para ello, cada vez que el usuario introduce un valor el ordenador debe decirle al usuario 
		 * si el n�mero a adivinar es mayor o menor que el introducido.
		 *  Cuando consiga adivinarlo debe indic�rselo e imprimir en pantalla el n�mero de veces que 
		 *  el usuario ha intentado adivinar dicho n�mero. Estructura el programa 
		 *  con los m�todos que estimes necesarios, 
		 * teniendo en cuenta que debe ser lo m�s legible posible.
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
		System.out.println("Adivina el n�mero: ");
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
