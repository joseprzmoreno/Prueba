package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Creando un método que calcule los años que hay entre dos fechas, 
		 * calcule la edad de una persona pidiendole la fecha actual y la de su nacimiento. 
		 * El método tendrá la forma: public static int añosEntre
		 * (int dia, int mes, int año, int dia_final, int mes_final, int año_final)
		 */

	int diaAct = -1;
	int mesAct = -1;
	int anioAct = -1;
	int diaNac = -1;
	int mesNac = -1;
	int anioNac = -1;
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("El siguiente programa calculará tu edad. Introduce estos datos: ");
	
	while(diaAct < 1  || diaAct > 31) {
	System.out.print("Día actual: ");
	diaAct = teclado.nextInt();
	}
	
	while(mesAct < 1  || mesAct > 12) {
		System.out.print("Mes actual: ");
		mesAct = teclado.nextInt();
		}
	
	while(anioAct < 1900  || anioAct > 2100) {
		System.out.print("Año actual: ");
		anioAct = teclado.nextInt();
		}
	
	while(diaNac < 1  || diaNac > 31) {
	System.out.print("Tu día de nacimiento: ");
	diaNac = teclado.nextInt();
	}
	
	while(mesNac < 1  || mesNac > 12) {
		System.out.print("Tu mes de nacimiento: ");
		mesNac = teclado.nextInt();
		}
	
	while(anioNac < 1900  || anioNac > 2100) {
		System.out.print("Tu año de nacimiento: ");
		anioNac = teclado.nextInt();
		}
		
	int numAnios = aniosEntre(diaNac, mesNac, anioNac, diaAct, mesAct, anioAct);
	System.out.println("Tienes " + numAnios + " años");
	
	}
	
	public static int aniosEntre(int diaN, int mesN, int anioN, int diaA, int mesA, int anioA) {
		int difAnios = anioA - anioN;
		if (mesA < mesN)
			difAnios -= 1;
		if (mesA==mesN && diaA < diaN)
			difAnios -= 1;
	return difAnios;
	}

}
