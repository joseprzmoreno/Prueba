package ejercicios;

public class Ejercicio_2_34 {

	public static void main(String[] args) {
		
		System.out.println("Calculador de población mundial");
		double poblacion2014 = 7201145320.0;
		System.out.printf("La población mundial en 2014 es de %.0f habitantes\n", poblacion2014);
		double tasaCrecimiento = 1.0114; //1.14% anual 
		double poblacion2015 = Math.round(poblacion2014 * tasaCrecimiento);
		double poblacion2016 = Math.round(poblacion2015 * tasaCrecimiento);
		double poblacion2017 = Math.round(poblacion2016 * tasaCrecimiento);
		double poblacion2018 = Math.round(poblacion2017 * tasaCrecimiento);
		double poblacion2019 = Math.round(poblacion2018 * tasaCrecimiento);		
		System.out.printf("Población estimada en 2015: %.0f habitantes\n", poblacion2015);
		System.out.printf("Población estimada en 2016: %.0f habitantes\n", poblacion2016);
		System.out.printf("Población estimada en 2017: %.0f habitantes\n", poblacion2017);
		System.out.printf("Población estimada en 2018: %.0f habitantes\n", poblacion2018);
		System.out.printf("Población estimada en 2019: %.0f habitantes\n", poblacion2019);
		

	}

}
