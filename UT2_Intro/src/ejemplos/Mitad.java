package ejemplos;

import java.util.Scanner;

public class Mitad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long numero;
		System.out.println("Dime el n�mero: ");
		numero = teclado.nextLong();
		
		System.out.println("La mitad de " + numero + " es " + numero/2.0);
		
		System.out.println("Si le sumo dos al n�mero nos da " + (numero + 2));
	}

}




