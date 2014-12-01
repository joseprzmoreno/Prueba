package ejercicios;

public class Figuras {

	public static void main(String[] args) {
		
		//Figura 1
		
				for (int i=1; i<5; i++) {
					for (int j=0; j<i; j++) {
						System.out.print("*");
					}
					System.out.print("\n");
				}
				
				System.out.println("");
				
				//Figura 2
				
				for (int i=1; i<5; i++) {
					for (int j=0; j<(4-i);j++) {
						System.out.print(" ");
					}
					for (int k=0; k<i; k++) {
						System.out.print("*");
					}
					System.out.print("\n");
				}
				
				System.out.println("");
				
				//Figura 3
				
				int numAsteriscos = 1;
				int numEspacios = 3;

				for (int i=1; i<5; i++) {
					for (int j=0; j<numEspacios; j++) {
						System.out.print(" ");
					}
					
					for (int k=0; k<numAsteriscos; k++) {
							System.out.print("*");
					}
						
					for (int j=0; j<numEspacios; j++) {
						System.out.print(" ");
					}
					System.out.print("\n");
					numAsteriscos+=2;
					numEspacios-=1;
				}

	}

}
