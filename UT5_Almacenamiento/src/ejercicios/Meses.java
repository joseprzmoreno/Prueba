package ejercicios;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		// Ejercicio 2 Crea un programa que almacene los meses del año (los nombres de cada mes). 
		//Se pedirá al usuario el número de mes y se visualizará su nombre.
		
		Scanner teclado = new Scanner(System.in);
		
		String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		int numeroMes = 0;
		
		System.out.println("Introduce un número del 1 al 12 y se mostrará el mes correspondiente");
		
		while(numeroMes<1 || numeroMes>12) {
			System.out.println("Número... ");
			numeroMes = teclado.nextInt();
			if (numeroMes<1  || numeroMes>12) 
				System.out.println("El número tiene que estar entre 1 y 12");
		}
		
		for (int i=0; i<12; i++) {
			if (numeroMes == i)
				System.out.println("El número corresponde a " + meses[i-1]);
		}
		
	}

}
