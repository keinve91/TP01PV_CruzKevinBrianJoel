package ar.edu.unju.fi.ejercicio07.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio07.model.Empleado;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nombre, apellido;
		int legajo;
		double salario;
		System.out.println("Registrando un nuevo empleado");
		System.out.println("Ingrese el nombre: ");
		nombre =  scan.next();
		System.out.println("Ingrese el apellido");
		apellido = scan.next();
		System.out.println("Ingrese el numero de Legajo");
		legajo = scan.nextInt();
		System.out.println("Ingrese el salario");
		salario = scan.nextDouble();
		System.out.println(" ");
		System.out.println("********************************");
		Empleado empleado = new Empleado(nombre, apellido, legajo, salario);
		System.out.println(empleado.toString());
		empleado.Aumento(empleado);
		System.out.println("Aumento aplicado.......");
		System.out.println(empleado.toString());
		scan.close();

	}

}
