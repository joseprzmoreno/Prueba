package ejercicios;

import java.util.Scanner;

public class Ej1For {

	public static void main(String[] args) {
		//Escribe un programa que pida cinco frases y las visualice.
		
		Scanner teclado = new Scanner(System.in);
		String leido;		
		int i;
		
		for(i = 0; i < 5; i++) {
			
			leido = teclado.nextLine();
			System.out.println(leido);
			
		}

		/*En Python:
		 * for i in range(5):
    	   mensaje = input()
           print mensaje
		 */
		
		/*En Javascript:
			<html><head><script>
			function escribe()
			{ 
			texto = "";
			for (i=0;i<5;i++) { 
			    var frase = window.prompt("Escribe una frase",""); 
			    texto += frase + "<br>";
			}	
			document.getElementById("p1").innerHTML = texto;
			}
			</script></head><body>
			<form name="f1">
			<input type="button" value="Escribe cinco frases" onClick="escribe()">
			</form>
			<hr>
			<p id="p1">Aquí aparecerán las frases</p>
			</body></html>
			
		 */
		
	}

}
