package Ejs_condicionales_inic;

import java.util.Scanner;

public class Ej_operaciones {
	
	public static void main(String[] args)
	{
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero entero");
		double numeroA = teclado.nextDouble();
		System.out.println("Introduce otro n�mero entero");
		double numeroB = teclado.nextDouble();
		
		System.out.println("�Qu� operaci�n quieres realizar?: +(suma), -(resta), *(multipliaci�n), /(divisi�n)");
		String operacion = teclado.nextLine();
		
		System.out.print("Resultado: ");
		
		/*switch(operacion) {
		
		case "+" : System.out.println(numeroA + numeroB);
		case "-" : System.out.println(numeroA - numeroB);
		case "*" : System.out.println(numeroA * numeroB);
		case "/" : System.out.println(numeroA / numeroB);
		default: System.out.println("Operaci�n no v�lida");*/
		
	    if (operacion.equals("+"))
	    {
	    	System.out.println(numeroA + numeroB);
		
		}
		
		
		
		
	}

}
