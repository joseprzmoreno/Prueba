package Ejercicios;

import graphics.*;

public class Coche {

	public static void main(String[] args) throws InterruptedException {
		
		int coord_izq = 200;
		
		int ancho_abajo = 400;
		int ancho_arriba = ancho_abajo - (ancho_abajo/3);
		int alto_abajo = ancho_abajo/4;
		int alto_arriba = alto_abajo;
		int radio_rueda = ancho_abajo/10;
		int ancho_ventana = ancho_arriba/2 - 30;
		int alto_ventana = alto_arriba - 20;
		int velocidad = 10;  //cuanto menor sea más rápido va
		
		Rectangle parte_abajo;
		parte_abajo = new Rectangle(coord_izq,10+alto_arriba,ancho_abajo,alto_abajo);
		parte_abajo.setColor(Color.RED);
		parte_abajo.fill();
		
		Rectangle parte_arriba;
		parte_arriba = new Rectangle(coord_izq+(ancho_abajo-ancho_arriba),10,ancho_arriba,alto_arriba);
		parte_arriba.setColor(Color.RED);
		parte_arriba.fill();
		
		Ellipse rueda1;
		rueda1 = new Ellipse(coord_izq+ancho_abajo/5,(alto_arriba+alto_abajo-radio_rueda),radio_rueda*2,radio_rueda*2);
		rueda1.setColor(Color.BLACK);
		rueda1.fill();
		
		Ellipse rueda2;
		rueda2 = new Ellipse(coord_izq+ancho_abajo/5*4,(alto_arriba+alto_abajo-radio_rueda),radio_rueda*2,radio_rueda*2);
		rueda2.setColor(Color.BLACK);
		rueda2.fill();
		
		Rectangle ventana1;
		ventana1 = new Rectangle(coord_izq+(ancho_abajo-ancho_arriba)+10,10+10,ancho_ventana,alto_ventana);
		ventana1.setColor(Color.WHITE);
		ventana1.fill();
		
		Rectangle ventana2;
		ventana2 = new Rectangle(coord_izq+(ancho_abajo-ancho_arriba)+20+ancho_ventana,10+10,ancho_ventana,alto_ventana);
		ventana2.setColor(Color.WHITE);
		ventana2.fill();
		
		for (int i = 0; i<coord_izq; --i) {
		     Thread.sleep(velocidad);
		    
		    parte_abajo.translate(-1,0);
		    parte_arriba.translate(-1,0);
		    rueda1.translate(-1,0);
		    rueda2.translate(-1,0);
		    ventana1.translate(-1,0);
		    ventana2.translate(-1,0);
		    
		    
		}
		
			
		
	}

}
