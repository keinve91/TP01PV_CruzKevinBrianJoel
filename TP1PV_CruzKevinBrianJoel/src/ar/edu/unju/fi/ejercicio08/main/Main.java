package ar.edu.unju.fi.ejercicio08.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio08.model.CalculadoraEspecial;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int n = scanner.nextInt();
        
        CalculadoraEspecial calculadora = new CalculadoraEspecial();
        calculadora.setNum(n);
        
        System.out.println("Sumatoria: " + calculadora.CalculadoraSumatoria());
        System.out.println("Productoria: " + calculadora.CalculadoraProduco());
        
        scanner.close();
    }
}
