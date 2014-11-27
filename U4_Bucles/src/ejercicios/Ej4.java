package ejercicios;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);	
	
	int numero;
		
	int contador = 0;
	
	do {
		System.out.println("Introduce un número");
		numero = teclado.nextInt();
		if (contador == 0)
			System.out.println("Número introducido: " + numero);
		contador++;
	} while (numero >= 0);

System.out.println("Fin del programa");
	}

}
