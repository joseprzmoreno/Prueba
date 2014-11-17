package Ejs_condicionales_inic;

import java.util.Scanner;

public class EjPh {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce ph de la solución");
		
		double ph = teclado.nextDouble();
		
		if (ph < 7.0 && ph >= 3.0)
			System.out.println("La solución es ácida");
		else if (ph < 3.0)
			System.out.println("La solución es peligrosamente ácida");
		else
			System.out.println("-----------");
		

	}

}
