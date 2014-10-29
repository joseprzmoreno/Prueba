package ejercicios;

public class Ejercicio06 {

	public static void main(String[] args) {
		/* 5. 

Completa la siguiente tabla (crea también un programa Java que muestre la tabla realizando 
cada uno de los cálculos):
a	b	a and b	a or b	not a	not b
3>5	12!=8	false	true	...	
5>=6	3!=3	...			
-7=8	22				
21!=12	true				
4=2	7>=-9	
		 */
		
//caso 1
		boolean a, b;
		a = 3>5;
		b = 12!=8;
		System.out.println("a = 3>5, b = 12!=8");
		System.out.printf("a --- %b\nb --- %b\na and b --- %b\na or b --- %b\nnot a --- %b\nnot b --- %b\n\n", a,b,(a&&b),(a||b),(!a),(!b));

		a = 5>=6;
		b = 3!=3;
		System.out.println("a = 5>=6, b = 3!=3");
		System.out.printf("a --- %b\nb --- %b\na and b --- %b\na or b --- %b\nnot a --- %b\nnot b --- %b\n\n", a,b,(a&&b),(a||b),(!a),(!b));
		
		a = -7==8;
		b = 22==22; //?? en el ejercicio pone solo 22
		System.out.println("a = -7=8, b = 22");
		System.out.printf("a --- %b\nb --- %b\na and b --- %b\na or b --- %b\nnot a --- %b\nnot b --- %b\n\n", a,b,(a&&b),(a||b),(!a),(!b));
		
		a = 21!=12;
		b = true;
		System.out.println("a = 21!=12, b = true");
		System.out.printf("a --- %b\nb --- %b\na and b --- %b\na or b --- %b\nnot a --- %b\nnot b --- %b\n\n", a,b,(a&&b),(a||b),(!a),(!b));
		
		a = 4==2;
		b = 7>=-9;
		System.out.println("a = 4=2, b = 7>=-9");
		System.out.printf("a --- %b\nb --- %b\na and b --- %b\na or b --- %b\nnot a --- %b\nnot b --- %b\n\n", a,b,(a&&b),(a||b),(!a),(!b));
		
		
	}

}
