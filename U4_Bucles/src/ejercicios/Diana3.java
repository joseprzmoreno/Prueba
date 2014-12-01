package ejercicios;

import graphics.*;

public class Diana3 {

	public static void main(String[] args) {
		/*
		 * Diana: Escribir un programa que dibuje 10 círculos concéntricos en la
		 * pantalla. Puedes utilizar Math.Random() para obtener valores de color
		 * aleatorio.
		 */

		int diametroCE /* diametro circulo externo */= 400;

		Ellipse circulo1 = new Ellipse(10, 10, diametroCE, diametroCE);

		for (int i = 10; i < 200; i += 20) {
			Color colorAleat = new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random()*255));
			Ellipse circulo = new Ellipse(i, i, diametroCE - (i * 2),
					diametroCE - (i * 2));
			circulo.setColor(colorAleat);
			circulo.fill();
		}


	}

}
