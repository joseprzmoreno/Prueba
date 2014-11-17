package Ejs_condicionales_inic;

import java.util.Scanner;

public class E06DiasSemana {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número del 1 a 7");
		int numero = teclado.nextInt();
		
		switch (numero) {
			case 1: System.out.println("lunes");break;
			case 2: System.out.println("martes");break;
			case 3: System.out.println("miércoles");break;
			case 4: System.out.println("jueves");break;
			case 5: System.out.println("viernes");break;
			case 6: System.out.println("sábado");break;
			case 7: System.out.println("domingo");break;
			default: System.out.println("No es un número válido");
		
		}
		
		//comprobar si es laborable con if
		
		if (numero == 7)
			System.out.println("Es un día festivo!");
		else
			System.out.println("Es un día laborable!");
		
		
		//comprobar si es festivo con switch
		switch (numero) {
			case 7: System.out.println("Es un día festivo!");
			default: System.out.println("Es un día laborable!");
		
		
		}
		
		
		
	}

}
