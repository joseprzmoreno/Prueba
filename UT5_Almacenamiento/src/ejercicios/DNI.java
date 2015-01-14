package ejercicios;

import java.util.Scanner;

public class DNI {
	
	public static void main(String[] args) {
	
	//Escribe un programa que obtenga la letra del DNI. El procedimiento para obtener la letra consiste en 
	//dividir el número del DNI por 23. http://letradni.appspot.com/info.html
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Introduce el número de DNI sin puntos y el programa calculará la letra");
	
	int dni = teclado.nextInt();
	
	int resto = dni%23;
	
	String letra = "";
	
	switch (resto) {
	case 0: letra = "T"; break;
	case 1: letra = "R"; break;
	case 2: letra = "W"; break;
	case 3: letra = "A"; break;
	case 4: letra = "G"; break;
	case 5: letra = "M"; break;
	case 6: letra = "Y"; break;
	case 7: letra = "F"; break;
	case 8: letra = "P"; break;
	case 9: letra = "D"; break;
	case 10: letra = "X"; break;
	case 11: letra = "B"; break;
	case 12: letra = "N"; break;
	case 13: letra = "J"; break;
	case 14: letra = "Z"; break;
	case 15: letra = "S"; break;
	case 16: letra = "Q"; break;
	case 17: letra = "V"; break;
	case 18: letra = "H"; break;
	case 19: letra = "L"; break;
	case 20: letra = "C"; break;
	case 21: letra = "K"; break;
	case 22: letra = "E";
	
	}
	
	System.out.println("La letra es " + letra);
	
	
	
	}

}
