package Ejs_condicionales_inic;

import java.util.Scanner;

public class AnoBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		boolean es_bisiesto = false;
		
		System.out.println("Introduce el a�o");
		int a�o = teclado.nextInt();
		
		
		
		//comprobar si es divisible entre 4
		boolean div_cuatro = (a�o % 4 == 0);
		
		//comprobar si es divisible entre 100
		boolean div_cien = (a�o % 100 == 0);
		
		//comprobar si es divisible entre 400
		boolean div_cuatrocientos = (a�o % 400 == 0);
		
		if (div_cuatro)
		{
			if (div_cien)
			{
				if (div_cuatrocientos)
					es_bisiesto = true;
				else
					es_bisiesto = false;
			}
			else
				es_bisiesto = true;
		}
		else
			es_bisiesto = false;
		

		
		if (es_bisiesto)
			System.out.println("Es bisiesto!");
		else
			System.out.println("No es bisiesto!");
		
				

	}

}
