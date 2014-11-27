package ejercicios;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		/*
		 * Modifica el ejercicio 3 de condicionales switch (operadores '+', '-', '*', '/') de forma que permita hacer 
		 * una operación, volverá a pedir al usuario el operador, para, con los mismos números, volver a hacer otra operación. 
		 * El programa terminará cuando se inserte un caracter que no es un operador.
		 */
		
        Scanner teclado = new Scanner(System.in);
        String operacion;
		
		System.out.println("Introduce un número entero");
		double numeroA = teclado.nextDouble();
		System.out.println("Introduce otro número entero");
		double numeroB = teclado.nextDouble();
		
		do {
		
		System.out.println("¿Qué operación quieres realizar?: +(suma), -(resta), *(multiplicación), /(división)");
		operacion = teclado.next();
		
			if (operacion.equals("+") || operacion.equals("-")  || operacion.equals("*") || operacion.equals("/")) {
				System.out.print("Resultado: ");
				
				switch(operacion) {
				
					case "+": System.out.println(numeroA + numeroB); break;
					case "-" : System.out.println(numeroA - numeroB); break;
					case "*" : System.out.println(numeroA * numeroB); break;
					case "/" : System.out.println(numeroA / numeroB); break;
				}
			}
		
		} while (operacion.equals("+") || operacion.equals("-")  || operacion.equals("*") || operacion.equals("/"));
			
		System.out.println("Operación no válida / Fin del programa");

	}

}
