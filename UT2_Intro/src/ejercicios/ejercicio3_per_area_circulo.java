package ejercicios;

import java.util.Scanner;

public class ejercicio3_per_area_circulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double radio;
		
		System.out.println("Introduce longitud del radio del c�rculo:");
		radio = entrada.nextDouble();
		
		System.out.println("-------------------------------");
		System.out.println("El per�metro de la circunferencia es " + (2*Math.PI*radio));
		System.out.println("El �rea del c�rculo es " + (Math.PI*radio*radio));

	}

}
