package ejercicios;

public class Ejercicio07_08 {
	
	public static void main(String[] args) {

		System.out.println(!(5>3));
		System.out.println((5!=3) && (4>3));
		System.out.println((5!=3) || (4>3));
		System.out.println((5<8) && (3==3));
		System.out.println(!((5!=3) || (4>3)));
		System.out.println((4!=3) && (3>2) || (4>8));
		System.out.println(!(3==5) || (4!=2));
		System.out.println(!(3==5) && (4!=2));
		System.out.println((8>2) && (4<2) || (3!=4));
		System.out.println(((3>2) && (4<5) || (3!=2)) && !(2!=5));



		System.out.println("----------------------");

		System.out.println(((4-2)*(5+1)/2)>2-(4+3));
		System.out.println((6+3)>8 && (6-1)*2<8 || 2*3==8);
		int X = 7, Z = 2;
		System.out.println((1.0 < X) && (X < Z+7.0));
		int Y = 4;
		X=1;
		Z=10;
		System.out.println((Math.PI * Math.pow(X, X) > Y || X + Y <= Z));
		System.out.println(X>3 && Y==4 || X + Y <=Z);
		Z=1;
		System.out.println(X>3 && (Y==4 || X + Y <=Z));
		
	}
}
