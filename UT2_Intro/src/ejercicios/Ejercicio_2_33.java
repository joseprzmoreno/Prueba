package ejercicios;

import java.util.Scanner;

public class Ejercicio_2_33 {
	
	public static void main(String[] args)
	{
		//indice de masa corporal
		System.out.println("Calculador del índice de masa corporal");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce tu peso en kilos: ");
		double pesoKg = teclado.nextDouble();
		System.out.print("Introduce tu altura en metros: ");
		double alturaM = teclado.nextDouble();
		System.out.println();
		double imc = pesoKg / (alturaM * alturaM);
		System.out.printf("Tu índice de masa corporal es %.2f\n", imc);
		System.out.println("-----------------------------");
		System.out.println("VALORES INDICATIVOS DEL IMC");
		System.out.println("Peso inferior al normal: menos de 18,5");
		System.out.println("Normal:                  entre 18,5 y 24,9");
		System.out.println("Sobrepeso:               entre 25 y 29,9");
		System.out.println("Obeso:                   30 o superior");
		
		
		
	}
	
	
	

}
