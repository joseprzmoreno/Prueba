package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double tamanoArchivo;
		double velocidadLinea;
		double transferencia;
		double tamanoBits;
		
		System.out.println("Escribe el tama�o de tu archivo en MB: ");
		tamanoArchivo = teclado.nextDouble();
		System.out.println("Escribe la velocidad de tu l�nea en mbps: ");
		velocidadLinea = teclado.nextDouble();
		
		tamanoBits = ((tamanoArchivo * 1024)*1024)*8;
		
		transferencia = tamanoBits / (velocidadLinea * 1000000.0);
		
		System.out.println("Tiempo estimado de transmisi�n del archivo: " + transferencia + " segundos.");
		

	}

}
