package modelo;

public class Cuenta {

	private long numero;

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private String titular;
	private double saldo;

	public Cuenta(long numero, String titular, double saldoInicial) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldoInicial;
	}

	public void sacarDinero(double cantidad) {
		if (cantidad > saldo) {
			System.out.println("No hay saldo suficiente en la cuenta");
			System.out.println("");
		} else {
			saldo = saldo - cantidad;
		}
		System.out.println("Operación de sacar " + cantidad
				+ " euros realizada con éxito. Saldo actual: " + saldo
				+ " euros");
		System.out.println("");
	}

	public void ingresarDinero(double cantidad) {
		saldo = saldo + cantidad;
		System.out.println("Operación de ingresar " + cantidad
				+ " euros realizada con éxito. Saldo actual: " + saldo
				+ " euros");
		System.out.println("");
	}

	public void transferencia(Cuenta b, double cantidad) {
		if (cantidad > saldo) {
			System.out.println("No hay saldo suficiente en la cuenta");
		} else {
			saldo = saldo - cantidad;
			b.setSaldo(b.getSaldo() + cantidad);
			System.out.println("Operación de transferir " + cantidad
					+ " euros a la cuenta " + b.getNumero()
					+ " realizada con éxito");
			System.out.println("El saldo de tu cuenta es ahora " + saldo
					+ " euros.");
			System.out.println("El saldo de la cuenta de destino es ahora "
					+ b.getSaldo() + " euros");
		}
		System.out.println("");
	}

}
