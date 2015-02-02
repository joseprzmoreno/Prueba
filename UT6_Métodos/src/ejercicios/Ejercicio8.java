package ejercicios;

import java.util.Arrays;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*Escribe una funci�n tiene_duplicados(vector) que tome un vector de cadenas 
		 * y devuelva verdadero si alg�n elemento aparece m�s de una vez. La funci�n no modificar� el vector.
		 */

	String[] palabras1 = {"a","e","i","o","u"};
	String[] palabras2 = {"a","e","i","a","o"};
	
	if (hayRepetidos(palabras1))
		System.out.println("En " + Arrays.toString(palabras1) + " hay elementos repetidos");
	else
		System.out.println("En " + Arrays.toString(palabras1) + " no hay elementos repetidos");
		
	if (hayRepetidos(palabras2))
		System.out.println("En " + Arrays.toString(palabras2) + " hay elementos repetidos");
	else
		System.out.println("En " + Arrays.toString(palabras2) + " no hay elementos repetidos");
	
	}

	
	public static boolean hayRepetidos(String[] palabras) {
		boolean respuesta = false;
		for (int i=0; i<palabras.length-1; i++) {
			 for (int j=i+1; j<palabras.length; j++) {
				 if (palabras[i].equals(palabras[j])) {
					 respuesta = true;
				 }
			 }
		}
		return respuesta;
	}
}
