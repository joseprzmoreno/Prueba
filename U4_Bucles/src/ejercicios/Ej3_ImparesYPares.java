package ejercicios;

import java.util.Scanner;

public class Ej3_ImparesYPares {
	
	/* Escribir un programa que pida varios números hasta que el usuario inserte 
	 * un número par. Hay que ir mostrando cada uno de los números insertados (excepto el par).
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		String numerosIntroducidos = "";
		System.out.println("Introduce una serie de números. Si el número es impar, se pedirá otro número. Si el número es par, se detiene el programa");
		
		do {
			System.out.println("Introduce un número");
			numero = teclado.nextInt();
			numerosIntroducidos += String.valueOf(numero) + " ";
			if (numero > 0 && numero % 2 != 0)
				System.out.println("Has introducido los números: " + numerosIntroducidos);
		} while (numero > 0 && numero % 2 != 0);		

		
		System.out.println("Fin del programa");
	}

}
