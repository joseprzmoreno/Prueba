package Ejercicios;

import java.util.Scanner;

public class Ej_3_1 {
	
	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno();
		Alumno alumno3 = new Alumno();	
	    
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe el nombre del primer alumno");
		alumno1.setNombre(teclado.nextLine());
		System.out.println("Escribe el nombre del segundo alumno");
		alumno2.setNombre(teclado.nextLine());
		System.out.println("Escribe el nombre del tercer alumno");
		alumno3.setNombre(teclado.nextLine());

		System.out.println("Escribe la edad de los alumnos");
		int edad = teclado.nextInt();
		alumno1.setEdad(edad);
		alumno2.setEdad(edad);
		alumno3.setEdad(edad);
		
		System.out.println("Lista de alumnos");
		System.out.printf("Alumno 1 : %s : %d\nAlumno 2 : %s : %d\nAlumno 3 : %s : %d",alumno1.nombre, alumno1.edad, alumno2.nombre, alumno2.edad, alumno3.nombre, alumno3.edad);
		
		
	}

}
