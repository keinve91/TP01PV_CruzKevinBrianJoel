package ar.edu.unju.fi.ejercicio03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO: ");
        int numero = scan.nextInt();
        if (numero%2==0) {
        	System.out.println("El numero "+numero+" es par.");
        	System.out.println("El triple del numero es: "+ numero*3 );
        }else {
        	System.out.println("El numero "+numero+" es impar.");
        	System.out.println("El doble del numero es: "+ numero*2 );
        }
        scan.close();
    }
}
