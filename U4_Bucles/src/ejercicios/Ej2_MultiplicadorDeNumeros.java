package ejercicios;

import java.util.Scanner;

public class Ej2_MultiplicadorDeNumeros {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numeroAcumulado = 1;
		int cantidadNumeros = 0;
		int numero;
		
		do {
			System.out.println("Escribe un número entero positivo. Para parar introduce 0");
			numero = teclado.nextInt();
			if (numero > 0)
			{
				numeroAcumulado *= numero;
				cantidadNumeros++;
			}
			
		} while (numero > 0);
		
		System.out.printf("Has introducido %d números. El resultado de multiplicarlos es %d", cantidadNumeros, numeroAcumulado);

	}

}
