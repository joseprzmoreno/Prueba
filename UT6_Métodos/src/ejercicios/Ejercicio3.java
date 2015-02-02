package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Crea un m�todo que nos diga si un n�mero es capic�a 
		 * (devuelve true en el caso de que lo sea y false si no lo es).
		 */

	Scanner teclado = new Scanner(System.in);	
	boolean capicua;	
	int numero = 0;
	
	do {
		System.out.print("Introduce un n�mero. Para terminar introduce 0: ");
		numero = teclado.nextInt();
		if (numero != 0) {
		capicua = esCapicua(numero);
		if (capicua)
			System.out.println("Es capic�a.");
		else
			System.out.println("No es capic�a.");
		}
	} while (numero != 0);
		
		System.out.println("Fin del programa");
	}
	
	public static boolean esCapicua(int numero) {
		boolean es_Capicua = true;
		String cadena = String.valueOf(numero);
		for (int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i) != cadena.charAt(cadena.length()-(i+1))) {
				es_Capicua = false;
			}
		}
	    return es_Capicua;
	}

}
