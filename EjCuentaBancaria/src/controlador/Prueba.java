package controlador;

import modelo.Cuenta;

public class Prueba {

	public static void main(String[] args) {
		
		Cuenta cuentaLuis = new Cuenta(1234,"Luis Moreno",100);
		
		Cuenta cuentaDiego = new Cuenta(5678, "Diego Moreno",40);
		
		Cuenta cuentaMaria = new Cuenta(2468, "Maria Moreno");
		
		cuentaLuis.sacarDinero(200);
		cuentaLuis.sacarDinero(30);
		cuentaLuis.ingresarDinero(50);
		cuentaLuis.transferencia(cuentaDiego, 500);
		cuentaLuis.transferencia(cuentaDiego, 110);
		cuentaDiego.sacarDinero(10);
		cuentaMaria.ingresarDinero(200);
		System.out.println("El saldo de la cuenta de Maria es " + cuentaMaria.getSaldo() + " euros");

	}

}
