package ar.edu.unju.fi.ejercicio15;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tamanio;
		do {
			System.out.println("Ingrese un numero en el rango [5-10]: ");
			tamanio = scan.nextInt();
		}while(tamanio<5 || tamanio>10);
		String[]nombres = new String[tamanio];
		for(int i=0; i<nombres.length; i++) {
            System.out.print("Ingrese un nombre para la posición [" + i + "]: ");
            nombres[i]=scan.next();
		}
		System.out.println("Nombres ingresados:");
        for (int i = 0; i < nombres.length; i++) {
    		System.out.println("Posicion [" + i + "]: " + nombres[i]);

        }
        System.out.println("Nombres ingresados inversamente:");
        for (int i = nombres.length-1; i >= 0; i--) {
    		System.out.println("Posicion [" + i + "]: " + nombres[i]);

        }
        scan.close();
	}

}
