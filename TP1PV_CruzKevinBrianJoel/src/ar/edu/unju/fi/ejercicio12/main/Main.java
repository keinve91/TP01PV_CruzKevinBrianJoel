// Main.java en el paquete main
package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ingrese Nombre: ");
		String nombre = scanner.next();
		System.out.println("Ingrese Año de Nacimiento:");
		int anio = scanner.nextInt();
		System.out.println("Ingrese Mes de Nacimiento: ");
		int mes = scanner.nextInt();
		System.out.println("Ingrese Dia de Nacimiento: ");
		int dia = scanner.nextInt();
		scanner.nextLine();
		Calendar fechaNaci= Calendar.getInstance();
		fechaNaci.set(anio, mes-1,dia);
		Persona persona = new Persona(nombre, fechaNaci);
		persona.mostrarDatos();
		scanner.close();
    }
}
