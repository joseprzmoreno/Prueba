package ejercicios;

public class Quiniela2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros;
		numeros = new int[6];
		boolean repetido = false;

		for (int i = 0; i < 6; i++) {
			do {
				repetido = false;
				numeros[i] = (int) (Math.random() * 49 + 1);
				for (int j = 0; j < i; j++) {
					if (numeros[j] == numeros[i])
						repetido = true;
				}
			} while (repetido);
		}

		System.out.print("Tu apuesta es: ");
		
		for (int i = 0; i < 6; i++) {
			System.out.print(numeros[i] + " ");
		}

	}

	// Él hace for(int i=0;i<6;). El i++ lo pone abajo

}
