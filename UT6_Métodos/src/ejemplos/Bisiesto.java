package ejemplos;

import java.util.*;
public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a�o;
        System.out.print("Introduce a�o: ");
        a�o = sc.nextInt();
        if(esBisiesto(a�o))  //llamada al m�todo
           System.out.println("Bisiesto");
        else
           System.out.println("No es bisiesto");
    }
    /**
     * m�todo que calcula si un a�o es o no bisiesto
     */    
    public static boolean esBisiesto(int a){   
        if(a%4==0 && a%100!=0 || a%400==0)
           return true;
        else
           return false;
    }
}
