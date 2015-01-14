package controlador;

import modelo.BoletoPrimitiva;

public class TestBoletoPrimitiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BoletoPrimitiva miBoleto = new BoletoPrimitiva(6);
		miBoleto.imprimir();
		miBoleto.getAciertos();
		
		BoletoPrimitiva miBoleto12 = new BoletoPrimitiva(12);
		miBoleto12.imprimir();
		miBoleto12.getAciertos();
		
		
		int[] miCombi = {1, 2, 5, 26, 29, 31};
		BoletoPrimitiva miBoletoManual6 = new BoletoPrimitiva(miCombi);
		miBoletoManual6.imprimir();
		miBoletoManual6.getAciertos();
		
	}

}
