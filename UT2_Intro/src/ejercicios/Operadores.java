package ejercicios;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y, a, b;
		boolean resultado;
		
		x = 10;
		y = 5;
		a = 18;
		b = 0;
		
		resultado = x > y;
		
		System.out.println("x>y:" + resultado);
		System.out.println(x>y && a>b);
		System.out.println(x>y || x>0);
		System.out.println(!(x>y));
		System.out.println(x>y || x<0);
		System.out.println(x>y && x<0);

	}

}

