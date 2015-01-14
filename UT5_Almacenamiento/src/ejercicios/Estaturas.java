package ejercicios;

import java.util.Scanner;

public class Estaturas {

	public static void main(String[] args) {
	    
		/*
		 * Ejercicio 8 Escribe un programa que pida la estatura de una serie de alumnos, 
		 * de tantos como indique el usuario del programa. Posteriormente, el programa ordenará 
		 * dichos datos de forma ascendente. Una vez ordenados, el programa visualizará los datos
		 *  en el orden que se insertaron y ordenados de forma ascendente.
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿De cuántos alumnos quieres saber la estatura?");
		
		int numeroAlumnos = teclado.nextInt();
		double[] estatura = new double[numeroAlumnos];
		
		System.out.println("------------------------------------------------");
		
		for(int i=0;i<numeroAlumnos;i++) {
			System.out.print("Estatura alumno " + (i+1) + ": ");
			estatura[i] = teclado.nextDouble();
		}
		
		System.out.println("-------------------------------------------------");
		//ordenar
		double[] estaturasOrdenadas = estatura.clone();
		
		double temp=0.0;
		
		for (int i=0;i<estaturasOrdenadas.length;i++) {
			for (int j=0; j<estaturasOrdenadas.length;j++) {
				if (estaturasOrdenadas[i]<estaturasOrdenadas[j]) {
					temp = estaturasOrdenadas[i];
					estaturasOrdenadas[i] = estaturasOrdenadas[j];
					estaturasOrdenadas[j] = temp;
				}
			}
		}
		
		System.out.println("ESTATURAS INTRODUCIDAS");
		for (int i=0;i<estatura.length;i++) {
			System.out.print(estatura[i] + " ");
		}
		System.out.println("");
		
		System.out.println("ESTATURAS ORDENADAS");
		for (int i=0;i<estatura.length;i++) {
			System.out.print(estaturasOrdenadas[i] + " ");
		}

	}

}
