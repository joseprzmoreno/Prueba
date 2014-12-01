package ejercicios;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {

			/*
			 * Lee un número por consola y comprueba si es palíndromo (capicúa).
			Pista: si creas un número con los dígitos en orden inverso al leido, 
			y al compararlos resulta que son iguales, será capicúa.
			 */
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Introduce un número");
			
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


