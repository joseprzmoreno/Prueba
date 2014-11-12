package Ejs_condicionales_inic;

import java.util.Scanner;

public class NumeroOculto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int numeroOculto =  (int )(Math.random() * 10 + 1);

		System.out.println("Adivina el número oculto, del 1 al 10");

		int intento = teclado.nextInt();

		if (intento == numeroOculto)
		     System.out.println("Enhorabuena, lo acertaste!");
		else
		    System.out.println("Incorrecto. El número era " + numeroOculto);


	}

}
