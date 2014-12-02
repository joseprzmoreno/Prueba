package controlador;

import modelo.Cuenta;

public class Prueba {

	public static void main(String[] args) {
		
		Cuenta cuentaLuis = new Cuenta(1234,"Luis Moreno",100);
		
		Cuenta cuentaDiego = new Cuenta(5678, "Diego Moreno",40);
		
		cuentaLuis.sacarDinero(200);
		cuentaLuis.sacarDinero(30);
		cuentaLuis.ingresarDinero(50);
		cuentaLuis.transferencia(cuentaDiego, 500);
		cuentaLuis.transferencia(cuentaDiego, 110);

	}

}
