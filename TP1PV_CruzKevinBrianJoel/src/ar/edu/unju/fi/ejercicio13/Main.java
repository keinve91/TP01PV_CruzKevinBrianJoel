package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] numeros = new int[8]; 
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Ingrese un numero para la posición ["+i +"] : " );
			numeros[i] = scan.nextInt();
		}
		 System.out.println("Valores ingresados:");
	        for (int i = 0; i < numeros.length; i++) {
	    		System.out.println("Posicion [" + i + "]: " + numeros[i]);

	        }
		scan.close();
	}

}