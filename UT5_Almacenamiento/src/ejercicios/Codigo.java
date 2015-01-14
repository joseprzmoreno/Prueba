package ejercicios;

import java.util.Scanner;

public class Codigo {

	public static void main(String[] args) {
		/*
		 * Ejerciccio 9 Realiza un programa que pida al usuario la introducción de un carácter 
		 * hasta que este pulse el carácter @. El programa debe mostrar las veces que se ha escrito
		 *  cada carácter. Recordad que los caracteres tienen asociado un número (código) que comienza por cero. 
		 *  Ten en cuenta que se pueden hacer cosas como esta:

		int c;
		String qp="qp";
		c=qp.charAt(0);
		System.out.println(c);
		Este programa imprimiría "113", el código de q. Si quisiera imprimir un número también puedo hacerlo así:

		System.out.println((char)65);
		Utiliza arrays para hacer el ejercicio.	
		*/	
		
		Scanner teclado = new Scanner(System.in);
		
		String a = "hola";
		System.out.println(a.substring(0,1));
		
		String caracter = "*";
		String cadena = "";
		
		System.out.println("Introduce caracteres");
		while (!(caracter.equals("@"))) {
			caracter = teclado.next();
			if (!(caracter.equals("@")))
			cadena += caracter;
		}
		
		boolean[] haAparecido = new boolean[cadena.length()];
		
		//marcar los elementos repetidos de la lista
		for (int i=0; i<cadena.length(); i++) {
			haAparecido[i] = false;
		}
		
		for (int i=0; i<cadena.length(); i++) {
			for (int j=0; j<cadena.length(); j++) {
				if (cadena.substring(i,i+1).equals(cadena.substring(j,j+1))) {
					haAparecido[i] = true;
				}
			}
		}
		
		for (int i=0; i<cadena.length();i++) {
			int numVeces = 0;
			if (haAparecido[i] == false) {
				for (int j=i+1; j<cadena.length(); j++) {
					if (cadena.substring(i,i+1).equals(cadena.substring(j, j+1))) {
						numVeces++;
					}
				}
			}
		System.out.println(cadena.substring(i,i+1) + " ha aparecido " + numVeces + " veces");
		}
		
	}

}
