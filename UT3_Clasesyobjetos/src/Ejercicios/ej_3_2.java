package Ejercicios;

import java.util.Scanner;

public class ej_3_2 {
		
		public static void main(String[] args) {
			
			Alumno alumno1 = new Alumno();
			Alumno alumno2 = new Alumno();
			Alumno alumno3 = new Alumno();	
		    
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Escribe el nombre del primer alumno");
			alumno1.setNombre(teclado.nextLine());
			System.out.println("Escribe la edad del primer alumno");
			alumno1.setEdad(Integer.parseInt(teclado.nextLine()));	
			
			System.out.println("Escribe el nombre del segundo alumno");
			alumno2.setNombre(teclado.nextLine());
			System.out.println("Escribe la edad del segundo alumno");
			alumno2.setEdad(Integer.parseInt(teclado.nextLine()));	
			
			System.out.println("Escribe el nombre del tercer alumno");
			alumno3.setNombre(teclado.nextLine());
			System.out.println("Escribe la edad del tercer alumno");
			alumno3.setEdad(Integer.parseInt(teclado.nextLine()));	
			
			System.out.printf("El primer alumno se llama %s y tiene %d años\n",alumno1.nombre, alumno1.edad);
			System.out.printf("El segundo alumno se llama %s y tiene %d años\n",alumno2.nombre, alumno2.edad);
			System.out.printf("El tercer alumno se llama %s y tiene %d años\n",alumno3.nombre, alumno3.edad);

		}

}


