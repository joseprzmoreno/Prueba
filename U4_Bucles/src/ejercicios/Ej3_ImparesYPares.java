package ejercicios;

import java.util.Scanner;

public class Ej3_ImparesYPares {
	
	/* Escribir un programa que pida varios n�meros hasta que el usuario inserte 
	 * un n�mero par. Hay que ir mostrando cada uno de los n�meros insertados (excepto el par).
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		String numerosIntroducidos = "";
		System.out.println("Introduce una serie de n�meros. Si el n�mero es impar, se pedir� otro n�mero. Si el n�mero es par, se detiene el programa");
		
		do {
			System.out.println("Introduce un n�mero");
			numero = teclado.nextInt();
			numerosIntroducidos += String.valueOf(numero) + " ";
			if (numero > 0 && numero % 2 != 0)
				System.out.println("Has introducido los n�meros: " + numerosIntroducidos);
		} while (numero > 0 && numero % 2 != 0);		

		
		System.out.println("Fin del programa");
	}

}
