package ejercicios;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		// Ejercicio 2 Crea un programa que almacene los meses del a�o (los nombres de cada mes). 
		//Se pedir� al usuario el n�mero de mes y se visualizar� su nombre.
		
		Scanner teclado = new Scanner(System.in);
		
		String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		int numeroMes = 0;
		
		System.out.println("Introduce un n�mero del 1 al 12 y se mostrar� el mes correspondiente");
		
		while(numeroMes<1 || numeroMes>12) {
			System.out.println("N�mero... ");
			numeroMes = teclado.nextInt();
			if (numeroMes<1  || numeroMes>12) 
				System.out.println("El n�mero tiene que estar entre 1 y 12");
		}
		
		for (int i=0; i<12; i++) {
			if (numeroMes == i)
				System.out.println("El n�mero corresponde a " + meses[i-1]);
		}
		
	}

}
