package ejercicios;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Escribe un método llamado ordenado, que tome un vector de enteros como parámetro y devuelva true si el vector 
		 * (todos sus elementos) está ordenado ascendentemente, o false en caso contrario.
		 */
		
		
	int[] desordenado = {7,8,9,1,2,4,6,3,5};
	int[] ordenado = {1,2,3,4,5,6,7,8,9};
	
	if (estaOrdenado(desordenado))
		System.out.println("La serie " + Arrays.toString(desordenado) + " está ordenada.");
	else
		System.out.println("La serie " + Arrays.toString(desordenado) + " está desordenada.");
	
	if (estaOrdenado(ordenado))
		System.out.println("La serie " + Arrays.toString(ordenado) + " está ordenada.");
	else
		System.out.println("La serie " + Arrays.toString(ordenado) + "está desordenada.");
	
	
	

	}
	
	public static boolean estaOrdenado(int[] serie) {
		boolean resp = true;
		for (int i=0; i<serie.length-1; i++) {
			if (serie[i+1] < serie[i]) {
				resp = false;
			}
		}
		return resp;
	}

}
