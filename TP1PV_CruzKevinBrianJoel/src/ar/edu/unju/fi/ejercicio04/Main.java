package ar.edu.unju.fi.ejercicio04;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número para calcular su factorial (entre 0 y 10): ");
        int numero = scanner.nextInt();
        
        while (numero < 0 || numero > 10) {
            System.out.println("El número debe estar dentro del rango [0 o 10].");
            numero = scanner.nextInt();
        }
        
        int factorial = 1;
        int i = 1;
        
        while (i <= numero) {
            factorial *= i;
            i++;
        }
        
        System.out.println("El factorial de " + numero + " es: " + factorial);
        
        scanner.close();
		}
}
