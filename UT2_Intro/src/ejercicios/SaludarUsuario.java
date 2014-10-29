package ejercicios;

import java.util.Scanner;

public class SaludarUsuario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cómo te llamas?");
		String nombre = entrada.nextLine();
		System.out.println("Hola, " + nombre +". Bienvenido");
		//tb se podria poner System.out.println("Hola, " + entrada.nextLine() + ". Bienvenido");
		
				
	}

}
