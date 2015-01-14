package ejercicios;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {

			/*
			 * Lee un n�mero por consola y comprueba si es pal�ndromo (capic�a).
			Pista: si creas un n�mero con los d�gitos en orden inverso al leido, 
			y al compararlos resulta que son iguales, ser� capic�a.
			 */
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Introduce un n�mero");
			
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


