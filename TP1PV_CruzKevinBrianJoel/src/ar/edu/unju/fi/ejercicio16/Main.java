package ar.edu.unju.fi.ejercicio16;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }
        System.out.println("Valores guardados en Lista:");
        int index = 0;
        while (index < nombres.length) {
            System.out.println("Posición [" + index + "]: " + nombres[index]);
            index++;
        }
		System.out.println("Tamaño de la Lista : "+nombres.length);
			System.out.println("¿Desea eliminar un nombre de la Lista. Responder con SI o NO?");
	        String op = scanner.nextLine();
	        boolean band = op.equalsIgnoreCase("SI");
	        if(band==true) {
	        	byte indice;
	            do {
	                System.out.print("Ingrese la posicion del elemento a eliminar (0-4): ");
	                indice = scanner.nextByte();
	            } while (indice < 0 || indice >= nombres.length);

	            for (int i = (int) indice; i < nombres.length - 1; i++) {
	                nombres[i] = nombres[i + 1];
	            }
	            nombres[nombres.length - 1] = null;

	            System.out.println("Lista actualizada:");
	            for (int i = 0; i < nombres.length; i++) {
	                System.out.println("Posición [" + i + "]: " + (nombres[i] == null ? " " : nombres[i]));
	            }
	        
	        }
	        scanner.close();
}
}
