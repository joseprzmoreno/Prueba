package ejercicios;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		/*
		 * Modifica el ejercicio 3 de condicionales switch (operadores '+', '-', '*', '/') de forma que permita hacer 
		 * una operaci�n, volver� a pedir al usuario el operador, para, con los mismos n�meros, volver a hacer otra operaci�n. 
		 * El programa terminar� cuando se inserte un caracter que no es un operador.
		 */
		
        Scanner teclado = new Scanner(System.in);
        String operacion;
		
		System.out.println("Introduce un n�mero entero");
		double numeroA = teclado.nextDouble();
		System.out.println("Introduce otro n�mero entero");
		double numeroB = teclado.nextDouble();
		
		do {
		
		System.out.println("�Qu� operaci�n quieres realizar?: +(suma), -(resta), *(multiplicaci�n), /(divisi�n)");
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
			
		System.out.println("Operaci�n no v�lida / Fin del programa");

	}

}
