package Ejs_condicionales_inic;

import java.util.Scanner;

public class Ej_Kilometrajes {

	public static void main(String[] args) {
		/*El ordenador de nuestro coche calcula los kilómetros que nos quedan 
		 * antes de repostar. Crea un programa que pida: tamaño del depósito 
		 * (en litros), porcentaje del depósito que está lleno y litros de consumo 
		 * por 100kms. El programa mostrará los kilómetros que quedan de autonomía. 
		 * Si quedan menos de 30 kilómetros mostrará un aviso de que hay que repostar
		 * porque estamos usando la reserva.
		 */
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa calcula los kilómetros que nos quedan antes de repostar");
		System.out.println("Introduce el tamaño del depósito");
		double TamanoDeposito = teclado.nextDouble();
		
		System.out.println("Introduce el porcentaje de depósito que está lleno");
		double porcDepositoLleno = teclado.nextDouble();
		
		System.out.println("Introduce los litros de consumo por cada 100 kms");
		double litrosConsumo = teclado.nextDouble();
		
		//Calcular los litros que hay en el depósito
		double litrosEnDeposito = TamanoDeposito * porcDepositoLleno / 100;
		
		//Calcular cuántos kms podemos recorrer con esos litros
		double kmsRecorrido = litrosEnDeposito / litrosConsumo * 100;
		
		System.out.printf("Usted puede recorrer aproximadamente %.2f kilómetros\n", kmsRecorrido);
		
		if (kmsRecorrido < 30)
			System.out.println("Debería repostar");

	}

}
