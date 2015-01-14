package modelo;

import java.util.Arrays;

public class BoletoPrimitiva {

	private int[] apuesta;
	private int numeroApuestas;

	public int[] getApuesta() {
		return apuesta;
	}

	public void setApuesta(int[] apuesta) {
		this.apuesta = apuesta;
	}
	
	int numero = -1;
	

	// constructor del boleto
	public BoletoPrimitiva(int numeroApuestas) {
		this.numeroApuestas = numeroApuestas;
		apuesta = new int[numeroApuestas];
		apuesta = rellenarAut();
	}
	
	
	//consructorManual
	public BoletoPrimitiva(int[] combinacion) {
		apuesta = combinacion;
		numeroApuestas = combinacion.length;
	}
    

	// método para rellenar automaticamente
	public int[] rellenarAut() {
		for (int i = 0; i < numeroApuestas; i++) {
			do {
				numero = (int)(Math.random() * 49) + 1;
			} while (mirarSiHaSalido(numero, i));
				apuesta[i] = numero;
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
	BoletoPrimitiva boletoGanador = new BoletoPrimitiva(6); 
	int[] combinacionGan = boletoGanador.rellenarAut();
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
	

}
