package ejercicios;

import java.util.Scanner;

public class AdivinaNumero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * El juego de adivina el n�mero.El programa "pensar�" un n�mero del 1
		 * al 100 que el jugador tendr� que adivinar. El programa va preguntando
		 * un n�mero tras otro al jugador. Si el jugador dice uno mayor, el
		 * programa le dice que el n�mero oculto es menor (y al rev�s si dice
		 * uno menor). El jugador tiene como m�ximo 10 oportunidades para
		 * adivinar el n�mero.
		 */

		Scanner teclado = new Scanner(System.in);
		int numAleatorio = (int) (Math.random() * 100 + 1);
		int intento = 0;
		int oportunidades = 0;
		
		/*para conocer la hora actual utiliza System.currentTimeMillis()
	    long start = System.currentTimeMillis();
	    long intervalo;
	    // tareas a medir
	    intervalo = (System.currentTimeMillis() - start)/1000;*/

		
		long start = System.currentTimeMillis();
		long intervalo;
		while (intento != numAleatorio && oportunidades < 10) {

			
			System.out.println("Adivina un n�mero del 1 a 100");
			System.out.print("N�mero: ");
			intento = teclado.nextInt();
			if (intento == numAleatorio) {
				System.out.println("N�mero correcto!");
				intervalo = (System.currentTimeMillis() - start)/1000;
				System.out.println("Has tardado " + intervalo + " segundos en adivinarlo");
				break;
			} else if (intento > numAleatorio) {
				System.out.println("El n�mero es menor");
			} else {
				System.out.println("El n�mero es mayor");
			}
			intervalo = (System.currentTimeMillis() - start)/1000;
			System.out.println("Has jugado " + intervalo + " segundos");
			oportunidades++;
			System.out.println("");
			}

	}
}
