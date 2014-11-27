package Ejs_condicionales_inic;

import java.util.Scanner;

public class Ej_operaciones {
	
	public static void main(String[] args)
	{
		
Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número entero");
		double numeroA = teclado.nextDouble();
		System.out.println("Introduce otro número entero");
		double numeroB = teclado.nextDouble();
		
		System.out.println("¿Qué operación quieres realizar?: +(suma), -(resta), *(multipliación), /(división)");
		String operacion = teclado.next();
		
		System.out.print("Resultado: ");
		
		switch(operacion) {
		
		case "+": System.out.println(numeroA + numeroB); break;
		case "-" : System.out.println(numeroA - numeroB); break;
		case "*" : System.out.println(numeroA * numeroB); break;
		case "/" : System.out.println(numeroA / numeroB); break;
		default: System.out.println("Operación no válida");
		
		}
		
	}

}
