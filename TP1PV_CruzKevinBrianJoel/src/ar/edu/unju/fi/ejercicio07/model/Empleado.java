package ar.edu.unju.fi.ejercicio07.model;

public class Empleado {
	private String nombre;
	private String apellido;
	private int legajo;
	private double salario;
	final double minimo_salario = 210000;
	final double merito = 20000;
	public Empleado() {
		
	}
	public Empleado(String nombre, String apellido, int legajo, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		if(salario >= minimo_salario) {
			this.salario = salario;
		}else {
			this.salario = minimo_salario;
		}
	}
	public void Aumento(Empleado empleado) {
		empleado.salario += merito;
	}
	@Override
	public String toString() {
		return "\nDetalles del Empleado: " + nombre + " " +apellido+ "\nLegajo: " + legajo + "\nSalario: " + salario + "$";
	}
}
