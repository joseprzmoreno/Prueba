package Ejercicios;

import graphics.Rectangle;
import graphics.Ellipse;
import graphics.Color;

public class Semaforo {

	public static void main(String[] args) {

		Rectangle rectangulo;
		rectangulo = new Rectangle(10,10,90,270);
		rectangulo.setColor(Color.GRAY);
		rectangulo.fill();
		Ellipse rojo, amarillo, verde;
		rojo = new Ellipse(15,15,80,80);
		rojo.setColor(Color.RED);
		rojo.fill();
		amarillo = new Ellipse(15,105,80,80);
		amarillo.setColor(Color.YELLOW);
		amarillo.fill();
		verde = new Ellipse(15,195,80,80);
		verde.setColor(Color.GREEN);
		verde.fill();
		

	}

}
