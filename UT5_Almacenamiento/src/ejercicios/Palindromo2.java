package ejercicios;

import java.util.Scanner;

public class Palindromo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 3 Mediante el uso de arrays pide al usuario un número y 
		//muestra por pantalla si este es palíndromo o no. 
		//Debes pedir el número completo, no digito a digito.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número para ver si es capicúa");
		System.out.println("Número... ");
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
			System.out.println("Es capicúa.");
		else
			System.out.println("No es capicúa");

		

	}

}
