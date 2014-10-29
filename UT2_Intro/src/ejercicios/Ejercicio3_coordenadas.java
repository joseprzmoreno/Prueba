package ejercicios;

import java.util.Scanner;

public class Ejercicio3_coordenadas {

	public static void main(String[] args) {
		
		/* (x1,y2)                     (x2,y2)
		 *----------------------------------*
		 * 									*
		 * 									*
		 * 									* 
		 *----------------------------------*
		 * (x1,y1)                     (x2,y1)
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce coordenada x1 del rectángulo ");
		double coordenada_x1 = teclado.nextDouble();
		System.out.println("Introduce coordenada x2");
		double coordenada_x2 = teclado.nextDouble();
		System.out.println("Introduce coordenada y1");
		double coordenada_y1 = teclado.nextDouble();
		System.out.println("Introduce coordenada y2");
		double coordenada_y2 = teclado.nextDouble();
		
		double lado1 = Math.abs(coordenada_x2 - coordenada_x1);
		double lado2 = Math.abs(coordenada_y2 - coordenada_y1);
		
		double area = lado1 * lado2;
		
		System.out.println("El área del rectángulo de base " + lado1 + " y altura " + lado2 + " es: " + area);

	}

}
