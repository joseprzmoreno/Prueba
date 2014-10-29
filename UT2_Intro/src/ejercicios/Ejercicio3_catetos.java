package ejercicios;

import java.util.Scanner;

public class Ejercicio3_catetos {
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce longitud del cateto A: ");
		double catetoA = teclado.nextDouble();
		
		System.out.println("Introduce longitud del cateto B: ");
		double catetoB = teclado.nextDouble();
		
		double hipotenusa = Math.sqrt(catetoA*catetoA + catetoB*catetoB);
		System.out.println("La hipotenusa es: " + hipotenusa);
	}

}

