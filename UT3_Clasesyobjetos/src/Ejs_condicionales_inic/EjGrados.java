package Ejs_condicionales_inic;

import java.util.Scanner;

public class EjGrados {
	
	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);

	System.out.println("Introduce temperatura en grados Farenheit");

	double tempFarenheit = teclado.nextDouble();

	double tempCelsius = (tempFarenheit - 32)  / 1.8;

	System.out.printf("La temperatura en grados centígrados es de %.2f grados\n", tempCelsius);

	if (tempCelsius < 0)
	    System.out.println("Alerta de congelación!");

	}
}
