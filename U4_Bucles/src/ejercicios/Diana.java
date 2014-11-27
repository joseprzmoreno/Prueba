package ejercicios;

import graphics.*;

public class Diana {

	public static void main(String[] args) {

		/*
		 * Diana: Escribir un programa que dibuje 10 círculos concéntricos en la
		 * pantalla. Puedes utilizar Math.Random() para obtener valores de color
		 * aleatorio.
		 */

		int diametroCE /* diametro circulo externo */= 400;
		Color colorCirc = Color.RED;

		// para que no se repitan dos colores seguidos, se necesitan dos
		// colores, hay que comparar un color con el último que ha salido
		int colorAleatorio = 0;
		int colorAleatorio2 = 0;

		Ellipse circulo1 = new Ellipse(10, 10, diametroCE, diametroCE);

		for (int i = 10; i < 200; i += 20) {
			Ellipse circulo = new Ellipse(i, i, diametroCE - (i * 2),
					diametroCE - (i * 2));
			while (colorAleatorio == colorAleatorio2) {
				colorAleatorio2 = (int) (Math.random() * 8 + 1);
			}
			colorAleatorio = colorAleatorio2;

			switch (colorAleatorio) {

			case 1:
				colorCirc = Color.RED;
				break;
			case 2:
				colorCirc = Color.YELLOW;
				break;
			case 3:
				colorCirc = Color.GREEN;
				break;
			case 4:
				colorCirc = Color.BLACK;
				break;
			case 5:
				colorCirc = Color.CYAN;
				break;
			case 6:
				colorCirc = Color.BLUE;
				break;
			case 7:
				colorCirc = Color.PINK;
				break;
			case 8:
				colorCirc = Color.ORANGE;
				break;

			}

			circulo.setColor(colorCirc);
			circulo.fill();
		}

	}

}
