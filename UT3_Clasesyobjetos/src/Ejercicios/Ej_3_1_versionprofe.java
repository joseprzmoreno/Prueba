package Ejercicios;

import java.util.Scanner;

public class Ej_3_1_versionprofe {

	public static void main(String[] args) {
		
    Alumno alumno1, alumno2, alumno3;
    
    Scanner teclado = new Scanner(System.in);
    
    alumno1 = new Alumno();
    alumno2 = new Alumno();
    alumno3 = new Alumno();
    System.out.print("Nombre del primer alumno: ");
    String nombre = teclado.nextLine();
    alumno1.setNombre(nombre);
    System.out.print("Edad de los alumnos: ");
    int edad = teclado.nextInt();
    alumno1.setEdad(edad);
    alumno2.setEdad(edad);
    alumno3.setEdad(edad);
		
		
	}

}
