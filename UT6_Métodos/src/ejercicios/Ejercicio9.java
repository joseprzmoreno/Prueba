package ejercicios;

import java.util.Arrays;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * Escribe un método que tome un vector de números y devuelva 
		 * la suma acumulativa; esto es, un nuevo vector en el que cada 
		 * elemento contiene la suma de todos los elementos anteriores. 
		 * Por ejemplo, la suma acumulativa de [1, 2, 3] es [1, 3, 6].
		 */
		
	int[] prueba = {1,5,6,2,3,4,7,10,6};
	System.out.println("La suma de los elementos de " + Arrays.toString(prueba) + " es: ");
	System.out.println(Arrays.toString(acumular(prueba)));
	

	}
	
	public static int[] acumular(int[] serie) {
		int suma = 0;
		int[] respuesta = new int[serie.length];
		for (int i=0; i<serie.length; i++) {
			suma = suma + serie[i];
			respuesta[i] = suma;
		}
		return respuesta;
	}

}
