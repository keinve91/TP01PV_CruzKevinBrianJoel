package ar.edu.unju.fi.ejercicio02;

public class Main {
	public static void main(String[] args) {
		
		String pais = "Argentina";
		int edad = 18;
		float alturaEdi = 1.70f;
		double precioPro = 100.0;
		double Coseno = Math.cos(0.5);
		Coseno=Math.round(Coseno * 10000.0) / 10000.0;
		String Telefono = "3887738903";
		
		System.out.println("Pais: " + pais + " Edad: " + edad + " Altura edificio: " + alturaEdi + " Precio producto: " + precioPro + " Calculo cos: " + Coseno + " Numero telefono: " + Telefono);
	}
}
