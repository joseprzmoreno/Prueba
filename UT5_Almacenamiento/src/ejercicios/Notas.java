package ejercicios;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
        //Escribe un programa que pida 8 notas. El programa debe visualizar cuál es la nota más alta, 
		//luego la siguiente, y así sucesivamente. Si hay alguna nota repetida, se visualizará solo una vez.
		

Scanner teclado = new Scanner(System.in);
int[] notas;
notas = new int[8];

int numNotas = 0;

while(numNotas < 8) {
	notas[numNotas] = teclado.nextInt();
	numNotas++;
}

//Ordenar
for(int i=0; i<8; i++) {
	for (int j=0;j<8;j++) {
		if (notas[i] > notas[j])
		{
			int temp = notas[j];
			notas[j] = notas[i];
			notas[i] = temp;
		}
	}
}

//Imprimir

boolean[] repetido = new boolean[8];
for (int j=0; j<8; j++) {
	repetido[j] = false;
	for (int k=0; k<j; k++) {
		if (notas[k]==notas[j])
			repetido[j]=true;
	}
}

for (int i=0; i<8; i++) {
	if(!repetido[i]) {
		System.out.print(notas[i] + " ");
	}
}

		
	}

}
