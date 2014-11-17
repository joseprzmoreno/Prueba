package Ejs_condicionales_inic;

import javax.swing.JOptionPane;

public class PasarRato {
	
	public static void main(String[] args)
	{
	
		for (int i = 0; i < 20; i++)
		{
		int bajo = 4;
		int alto = 9;
		int z = (int) (Math.random() * ((alto - bajo)+1)) + bajo;
		//JOptionPane.showMessageDialog(null, z);
		System.out.println(z);
		}
	
	}

}
