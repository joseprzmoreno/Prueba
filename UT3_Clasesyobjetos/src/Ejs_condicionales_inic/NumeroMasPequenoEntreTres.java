package Ejs_condicionales_inic;

import java.util.Scanner;

public class NumeroMasPequenoEntreTres {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa calcula el menor de tres n�meros");
		System.out.println("Introduce n�mero entero 1");
		int numeroA = teclado.nextInt();
		System.out.println();
		System.out.println("Introduce n�mero entero 2");
		int numeroB = teclado.nextInt();
		System.out.println();
		System.out.println("Introduce n�mero entero 3");
		int numeroC = teclado.nextInt();
		System.out.println();
				
		//compara primero A y B, luego compara el resultado con C
		int numeroMasPequeno = 0;
		
		if (numeroA <= numeroB)
			numeroMasPequeno = numeroA;
		else
			numeroMasPequeno = numeroB;
		
		if (numeroC <= numeroMasPequeno)
			numeroMasPequeno = numeroC;
		
		System.out.println("El n�mero m�s peque�o de los tres es " + numeroMasPequeno);
		
		//En Python: http://www.codeskulptor.org/#user38_PzqIPBwNWcbASNT.py
			
		/*soluci�n profesor
		 * int menor = numero1;
		 * if (numero2<menor)
		 *    menor=numero2;
		 * if (numero3<menor)
		 *    menor=numero3;
		 * System.out.println("El n�mero m�s peque�o es" + menor);
		 */

	}

}
