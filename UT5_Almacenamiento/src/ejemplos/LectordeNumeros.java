package ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class LectordeNumeros {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce diez n�meros");
		
		int[] numeros;
		numeros = new int[10];
		//o: int[] numeros = new int[10];
		
		//Guardar 10 n�meros en un vector
		for(int i=0;i<10;i++) {
			numeros[i] = teclado.nextInt();
			
		}
		
		//Imprimir los n�meros
		System.out.println("Has introducido los siguientes 10 n�meros:");
		for(int i=0;i<10;i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("");
		
		System.out.println(Arrays.toString(numeros));
		

	}

}
