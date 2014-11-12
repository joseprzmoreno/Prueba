package Ejs_condicionales_inic;

import java.util.Scanner;

public class Ej_Kilometrajes {

	public static void main(String[] args) {
		/*El ordenador de nuestro coche calcula los kil�metros que nos quedan 
		 * antes de repostar. Crea un programa que pida: tama�o del dep�sito 
		 * (en litros), porcentaje del dep�sito que est� lleno y litros de consumo 
		 * por 100kms. El programa mostrar� los kil�metros que quedan de autonom�a. 
		 * Si quedan menos de 30 kil�metros mostrar� un aviso de que hay que repostar
		 * porque estamos usando la reserva.
		 */
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa calcula los kil�metros que nos quedan antes de repostar");
		System.out.println("Introduce el tama�o del dep�sito");
		double TamanoDeposito = teclado.nextDouble();
		
		System.out.println("Introduce el porcentaje de dep�sito que est� lleno");
		double porcDepositoLleno = teclado.nextDouble();
		
		System.out.println("Introduce los litros de consumo por cada 100 kms");
		double litrosConsumo = teclado.nextDouble();
		
		//Calcular los litros que hay en el dep�sito
		double litrosEnDeposito = TamanoDeposito * porcDepositoLleno / 100;
		
		//Calcular cu�ntos kms podemos recorrer con esos litros
		double kmsRecorrido = litrosEnDeposito / litrosConsumo * 100;
		
		System.out.printf("Usted puede recorrer aproximadamente %.2f kil�metros\n", kmsRecorrido);
		
		if (kmsRecorrido < 30)
			System.out.println("Deber�a repostar");

	}

}
