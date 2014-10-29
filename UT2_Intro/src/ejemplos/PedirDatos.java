package ejemplos;

import java.util.Scanner;

public class PedirDatos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*double numeroLeido;
		
		System.out.println("Dame un número: ");
		numeroLeido = teclado.nextDouble();
		
		System.out.println("Has escrito: " + numeroLeido);*/
		System.out.println("Escribe un mensaje:");
		String mensaje;
		mensaje = teclado.nextLine();
		System.out.println("You have written: " + mensaje);
		
		
	}

}
