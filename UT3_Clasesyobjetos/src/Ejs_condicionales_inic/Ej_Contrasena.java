package Ejs_condicionales_inic;

import java.util.Scanner;

public class Ej_Contrasena {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		String contrasena = "Toledo";

		System.out.println("Introduce la contraseña");

		String textoUsuario = teclado.nextLine();
		
		if (textoUsuario.equals(contrasena))
		     System.out.println("Correcto");
		else
		     System.out.println("Incorrecto");		

	}

}
