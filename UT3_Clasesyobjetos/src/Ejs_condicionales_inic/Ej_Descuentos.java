package Ejs_condicionales_inic;

import java.util.Scanner;

public class Ej_Descuentos {

	public static void main(String[] args) {
		
		/*Una tienda hace un descuento del 10% por compras menores 
		 * de 20€, un 20% por compras entre 20 y 50€ y un 25% 
		 * si la compra es mayor. Escribe un programa que pida el 
		 * precio de un producto y muestre su precio final en las rebajas.
		 */

	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Introduce el precio original del producto ");
	double precioOriginal = teclado.nextDouble();
	
	double precioDesc = 0.0;
	
	if (precioOriginal < 20.0)
		precioDesc = precioOriginal - (precioOriginal * 10 / 100);
	else if (precioOriginal >= 20.0 && precioOriginal <=50)
		precioDesc = precioOriginal - (precioOriginal * 20 / 100);
	else
		precioDesc = precioOriginal - (precioOriginal * 25 / 100);
		
	System.out.printf("Su precio rebajado es de %.2f euros", precioDesc);
	
	}

}
