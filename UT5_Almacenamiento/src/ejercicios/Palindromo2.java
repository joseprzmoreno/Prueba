package ejercicios;

import java.util.Scanner;

public class Palindromo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 3 Mediante el uso de arrays pide al usuario un n�mero y 
		//muestra por pantalla si este es pal�ndromo o no. 
		//Debes pedir el n�mero completo, no digito a digito.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero para ver si es capic�a");
		System.out.println("N�mero... ");
		int numero = teclado.nextInt();
		
		int copiaNumero = numero;
		int numInverso = 0;
		
		while (numero > 0) {
			int prov = numero % 10;
			numInverso = numInverso * 10 + prov;
			numero = numero / 10;
		}
		
		//System.out.println(prov);
		
		if (copiaNumero==numInverso)
			System.out.println("Es capic�a.");
		else
			System.out.println("No es capic�a");

		

	}

}
