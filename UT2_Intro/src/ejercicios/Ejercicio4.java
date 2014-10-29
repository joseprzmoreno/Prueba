package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	//1 Kilogramo (Kg) =    35.2739619 Onzas (oz)
	
	public static void main(String[] args)
	{
		double pesoKilos;
		final double ONZAS_KILO = 35.2739619;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe tu peso en kg:");
		pesoKilos = teclado.nextDouble(); 
		System.out.println("Tu peso en onzas es: " + pesoKilos * ONZAS_KILO);
		
	}
}
