package ejercicios;

import java.util.Scanner;

public class Ej5For {

	public static void main(String[] args) {
		/*Escribe un programa que pida tantos números como el usuario del programa indique al principio. 
		 * El programa mostrará al final la media y si se ha insertado un número par.*/
		
		Scanner teclado = new Scanner(System.in);
		int sumaNumeros = 0;
		int numero;
		boolean hayPar = false;
		
		System.out.println("Escribe cuántos numeros quieres introducir: ");
		int cuantosNumeros = teclado.nextInt();
		
		for (int i=0; i<cuantosNumeros; i++) {
			System.out.println("Introduce número");
			numero = teclado.nextInt();
			if (numero % 2 == 0)
				hayPar = true;
			sumaNumeros += numero;	
		}
		
		System.out.println("La media de los números introducidos es " + (sumaNumeros / cuantosNumeros));
		if (hayPar)
			System.out.println("Entre los números introducidos hay al menos un número par");
		else
			System.out.println("Entre los números introducidos no hay ningún número par");
 
	}

}
