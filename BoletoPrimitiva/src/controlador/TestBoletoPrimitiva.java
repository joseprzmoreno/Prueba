package controlador;

import modelo.BoletoPrimitiva;

import java.util.Scanner;

public class TestBoletoPrimitiva {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Generar boleto: número de apuestas? ");
		int numApuestas = teclado.nextInt();
		System.out.println("");
		System.out.print("AUTOMATICO/MANUAL? ");
		String modo = teclado.next();
		BoletoPrimitiva miBoleto = new BoletoPrimitiva(numApuestas, modo);
		miBoleto.imprimir();
		miBoleto.getAciertos2();

	}

}
