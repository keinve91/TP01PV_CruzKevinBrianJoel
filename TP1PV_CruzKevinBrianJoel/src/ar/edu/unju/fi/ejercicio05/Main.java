package ar.edu.unju.fi.ejercicio05;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      System.out.println("Ingrese un numero entre 1 y 9: ");
	        int numero = scan.nextInt();
	        
	        while (numero < 1 || numero > 9) {
	            System.out.println("El número debe estar dentro del rango [1-9]. Inténtelo de nuevo: ");
	            numero = scan.nextInt();
	        }
	        for(int i=0;i<11;i++) {
	        	System.out.println(numero+ " x " +i+" = "+numero*i);
	        }
	        
		scan.close();


	}

}
