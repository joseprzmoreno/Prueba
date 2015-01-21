package modelo;

import java.util.Arrays;

import java.util.Scanner;

public class BoletoPrimitiva {

	private int[] apuesta;
	private int numeroApuestas;
	Scanner teclado = new Scanner(System.in);

	public int[] getApuesta() {
		return apuesta;
	}

	public void setApuesta(int[] apuesta) {
		this.apuesta = apuesta;
	}
	
	int numero = -1;
	

	// automático o manual
	public BoletoPrimitiva(int numeroApuestas, String modo) {
		if (modo.equals("AUTOMATICO"))
			generarBoletoAutomatico(numeroApuestas);
		else
			generarBoletoManual(numeroApuestas);
		
		this.numeroApuestas = numeroApuestas;
	}
	
	//metodo automatico
	public int[] generarBoletoAutomatico(int numeroApuestas) {
		apuesta = new int[numeroApuestas];
		for (int i = 0; i < numeroApuestas; i++) {
			do {
				numero = (int)(Math.random() * 49) + 1;
			} while (mirarSiHaSalido(numero, i));
				apuesta[i] = numero;
			}
		return apuesta;
	}
	
	
	//metodo manual
	public int[] generarBoletoManual(int numeroApuestas) {
		apuesta = new int[numeroApuestas];
		boolean numerocorrecto = false;
		for (int i = 0; i < numeroApuestas;i++) {
			do {
				numerocorrecto = false;
			System.out.println("Te quedan " + (numeroApuestas-i) + " números por introducir");
			apuesta[i] = teclado.nextInt();
			if (apuesta[i]>0 && apuesta[i]<50) numerocorrecto=true;
			if (mirarSiHaSalido(apuesta[i],i) && numerocorrecto)
					System.out.println("Ya lo has puesto");
			if (!numerocorrecto)
				System.out.println("No es un número correcto");
			
			} while (mirarSiHaSalido(apuesta[i], i) || !numerocorrecto);
		}
		
	return apuesta;	
	}

	
	

	// función para comprobar que no ha salido el número antes
	public boolean mirarSiHaSalido(int num, int posicion) {
		boolean haSalido = false;
		for (int i = 0; i < posicion; i++) {
			if (apuesta[i] == num)
				haSalido = true;
		}
		return haSalido;
	}

	// método para imprimir apuesta
	public void imprimir() {
		Arrays.sort(apuesta);
		System.out.print("Apuesta: ");
		for (int i = 0; i < apuesta.length; i++) {
			System.out.print(apuesta[i] + " ");

		}
		System.out.println("");
	}
	
	//método para hacer un sorteo
	
	public int[] sorteo() {
		//hacer un sorteo de la primitiva es como crear un boleto de seis números
	BoletoPrimitiva boletoGanador = new BoletoPrimitiva(6, "AUTOMATICO"); 
	int[] combinacionGan = boletoGanador.generarBoletoAutomatico(6);
	System.out.print("Sorteo: ");
	Arrays.sort(combinacionGan);
	for (int i=0; i<combinacionGan.length; i++) {
	System.out.print(combinacionGan[i] + " ");
	}
	return combinacionGan;
	}
	
	public void getAciertos() {
		//primero, hacer un sorteo y luego comprobar coincidencias
		int[] combinacionGanadora = sorteo();
		int aciertos = 0;
		for (int i=0; i<apuesta.length; i++) {
			for (int j=0; j<combinacionGanadora.length; j++) {
				if (apuesta[i] == combinacionGanadora[j])
					aciertos++;
			}
		}
	System.out.println("\nNúmero de aciertos: " + aciertos + "\n");	
	}
	
	public void getAciertos2() {
		int[] combinacionGanadora = sorteo();
		int aciertos = 0;
		for (int i=0; i<6; i++) {
			if (mirarSiHaSalido(combinacionGanadora[i], apuesta.length)) {
				aciertos++;
			}
		}
		System.out.println("\nNúmero de aciertos: " + aciertos + "\n");
	}
	

}
