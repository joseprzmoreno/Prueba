package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/*
		 * Escriba un programa que lea temperaturas expresadas en grados Fahrenheit y 
		 * las convierta a grados Celsius mostrándola. El programa finalizará cuando 
		 * lea un valor de temperatura igual a 999. La conversión de grados Farenheit 
		 * (F) a Celsius (C) la realizará un método llamado farenheitCelsius 
		 * donde incluirás el código que hace la conversión (C = 5/9(F − 32)).
		 */

		Scanner teclado = new Scanner(System.in);
		double farenheit = 0.0;
		double celsius = 0.0;
		
		do {
			System.out.print("Introduce temperatura en grados Farenheit. Para terminar introduce 999: ");
			farenheit = teclado.nextDouble();
			if (farenheit != 999) {
			celsius = farenheitCelsius(farenheit);
		
			System.out.printf("En grados Celsius: %.2f C \n", celsius);
			}
		} while (farenheit != 999);
		
		System.out.println("Fin del programa");
		
	}
	
	public static double farenheitCelsius(double farenheit) {
		return ((farenheit -32) * 5.00/9.00);
	}

}
