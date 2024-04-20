package ar.edu.unju.fi.ejercicio14;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tamanio, suma = 0;
		do {
			System.out.println("Ingrese un numero en el rango [3-10]: ");
			tamanio = scan.nextInt();
		}while(tamanio<3 || tamanio>10);
		int[]numeros = new int[tamanio];
		for(int i=0; i<numeros.length; i++) {
            System.out.print("Ingrese un número para la posición [" + i + "]: ");
            numeros[i]=scan.nextInt();
            suma+=numeros[i];
		}
        System.out.println("La suma de todos los valores es: " + suma);
        scan.close();

	}
}
