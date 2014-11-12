package Ejs_condicionales_inic;

import java.util.Scanner;

public class EjNumeroPar {
	
	public static void main(String[] args)
	{

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número entero");
		
		int numero = teclado.nextInt();
		
		if (numero%2==0)
		     System.out.printf("Has introducido el número %d y es un número par",numero);
	}

}
