package ar.edu.unju.fi.ejercicio08.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio08.model.CalculadoraEspecial;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el valor de n
        System.out.print("Ingrese un numero: ");
        int n = scanner.nextInt();
        
        // Construir un objeto de la clase CalculadoraEspecial
        CalculadoraEspecial calculadora = new CalculadoraEspecial();
        calculadora.setNum(n);
        
        // Invocar métodos del objeto y mostrar resultados
        System.out.println("Sumatoria: " + calculadora.CalculadoraSumatoria());
        System.out.println("Productoria: " + calculadora.CalculadoraProduco());
        
        scanner.close();
    }
}
