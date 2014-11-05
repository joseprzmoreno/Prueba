package ejemplos;

import graphics.Ellipse;
import graphics.Rectangle;
import graphics.Color;

public class PrimerosGraficos {

	public static void main(String[] args) throws InterruptedException {
		Rectangle cuadrado;
		cuadrado = new Rectangle(10,10,100,100);
		cuadrado.draw();
		
		Ellipse circulo, circulo2;
		circulo = new Ellipse(35,35,50,50);
		circulo2 = new Ellipse(35,35,50,50);
		
		while(true)
		{
		circulo.setColor(Color.RED);
		circulo.fill();
		
		Thread.sleep(100);
		circulo2.setColor(Color.BLUE);
		circulo.fill();
		
		}

	}

}
