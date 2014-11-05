package ejemplos;

public class claseDAW {

	public static void main(String[] args) {
		
		Alumno juan, pepe;
		juan = new Alumno();
		pepe = new Alumno();
		juan.nombre = "Juan Pérez";
		juan.edad = 25;
		
		juan.aumentarEdad(3);
		System.out.println(juan.edad);
		
		pepe.setNombre("José García");
		System.out.println(pepe.nombre);
		

	}

}
