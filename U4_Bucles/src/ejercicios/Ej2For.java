package ejercicios;

public class Ej2For {

	public static void main(String[] args) {
		// Generar primeros 15 números naturales al revés
		
		// con while
		
		System.out.println("Con while: ");
		int contador = 15;
		while (contador > 0) {
			System.out.print(contador + " ");
			contador--;
		}
		
		System.out.println("");
			
		//con for
		
		System.out.println("Con for: ");
		for (int i=15; i>=1; i--) {
			System.out.print(i + " ");
		}
		

	}

}
