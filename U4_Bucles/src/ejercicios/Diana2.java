package ejercicios;

import graphics.*;

public class Diana2 {

	public static void main(String[] args) {
		/*
		 * Diana: Escribir un programa que dibuje 10 círculos concéntricos en la
		 * pantalla. Puedes utilizar Math.Random() para obtener valores de color
		 * aleatorio.
		 */

		int diametroCE /* diametro circulo externo */= 400;

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
				circulo.setColor(Color.RED);
				break;
			case 2:
				circulo.setColor(Color.YELLOW);
				break;
			case 3:
				circulo.setColor(Color.GREEN);
				break;
			case 4:
				circulo.setColor(Color.BLACK);;
				break;
			case 5:
				circulo.setColor(Color.CYAN);;
				break;
			case 6:
				circulo.setColor(Color.BLUE);
				break;
			case 7:
				circulo.setColor(Color.PINK);;
				break;
			case 8:
				circulo.setColor(Color.ORANGE);
				break;

			}

			circulo.fill();
		}

		/*
		 * El hace: setColor (new Color((int)(Math.random() * ((max - min) + 1) - min, ... ...
		 * o: Color colorAleatorio = new Color((int)(Math.random() * ((max-min) + 1)) + min, se repite 2 veces;
		 *     rec.setColor(colorAleatorio);
		 *     
		 *     Otra posibilidad es crear un vector/array:
		 *     Color[] colorAleatorio;
		 *     colorAleatorio=new Color[5];
		 *     
		 *     colorAleatorio[0]=new Color(0,0,0);
		 *     colorAleatorio[1]=new Color(200,50,0);
		 *     ...
		 *     
		 *     rec.setColor(colorAleatorio[(int)(Math.random()*5)]);
		 */

	}

}
