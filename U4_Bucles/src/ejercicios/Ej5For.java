package ejercicios;

import java.util.Scanner;

public class Ej5For {

	public static void main(String[] args) {
		/*Escribe un programa que pida tantos n�meros como el usuario del programa indique al principio. 
		 * El programa mostrar� al final la media y si se ha insertado un n�mero par.*/
		
		Scanner teclado = new Scanner(System.in);
		int sumaNumeros = 0;
		int numero;
		boolean hayPar = false;
		
		System.out.println("Escribe cu�ntos numeros quieres introducir: ");
		int cuantosNumeros = teclado.nextInt();
		
		for (int i=0; i<cuantosNumeros; i++) {
			System.out.println("Introduce n�mero");
			numero = teclado.nextInt();
			if (numero % 2 == 0)
				hayPar = true;
			sumaNumeros += numero;	
		}
		
		System.out.println("La media de los n�meros introducidos es " + (sumaNumeros / cuantosNumeros));
		if (hayPar)
			System.out.println("Entre los n�meros introducidos hay al menos un n�mero par");
		else
			System.out.println("Entre los n�meros introducidos no hay ning�n n�mero par");
 
	}

}
