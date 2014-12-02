package ejercicios;

import java.util.Scanner;

public class DatosEmpleado {

	public static void main(String[] args) {
		
		/*
		 * Escribe un programa que pida los datos de empleados, en concreto su nombre y sueldo. 
		 * Realizará una pregunta tipo "¿Otro [s/n]?" para saber cuando parar. 
		 * El programa calculará la media del sueldo.
		 */
	
	String nombre;
	double sueldo;
	double sueldoAcumulado = 0;
	int numEmpleados = 0;
	String respuesta = "s";
	Scanner teclado = new Scanner(System.in);
	
	while(respuesta.equals("s")) {
		respuesta = "";
		System.out.println("DATOS DEL NUEVO EMPLEADO");
		System.out.print("Nombre: ");
		nombre = teclado.next();
		System.out.print("Sueldo: ");
		sueldo = teclado.nextInt();
		sueldoAcumulado += sueldo;
		numEmpleados++;
		while(!(respuesta.equals("s") || respuesta.equals("n"))){
		System.out.println("Otro [s/n]?");
		respuesta = teclado.next();
		respuesta = respuesta.toLowerCase();
		}
	}
	System.out.println("-------------------------");
	System.out.printf("El sueldo medio de los empleados es %.2f euros", sueldoAcumulado / numEmpleados);

	}

}
