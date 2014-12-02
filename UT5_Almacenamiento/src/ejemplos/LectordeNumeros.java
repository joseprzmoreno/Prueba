package ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class LectordeNumeros {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce diez números");
		
		int[] numeros;
		numeros = new int[10];
		//o: int[] numeros = new int[10];
		
		//Guardar 10 números en un vector
		for(int i=0;i<10;i++) {
			numeros[i] = teclado.nextInt();
			
		}
		
		//Imprimir los números
		System.out.println("Has introducido los siguientes 10 números:");
		for(int i=0;i<10;i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("");
		
		System.out.println(Arrays.toString(numeros));
		

	}

}
