package ar.edu.unju.fi.ejercicio09.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio09.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double PrecioToDesc=0;
		
	    for(int i=1;i<=3;i++) {
	    	System.out.println("********************************************");
	    	System.out.println("Producto nro " + i);
		      Producto p = new Producto();
	    	System.out.println("Ingrese nombre: ");
	    	p.setNombre(sc.nextLine());
	    	System.out.println("Ingrese codigo: ");
	    	p.setCodigo(sc.nextLine());
	    	System.out.println("Ingrese precio: $");
	    	p.setPrecio(sc.nextDouble());
	    	System.out.println("Ingrese descuento: ");
	    	p.setDescuento(sc.nextInt());
	        System.out.println("Nombre: " + p.getNombre());
	        System.out.println("Codigo : " + p.getCodigo());
	        System.out.println("Precio $" + p.getPrecio());
	        System.out.println("Descuento: " + p.getDescuento() + "%");
	        System.out.println("Precio con descuento aplicado: $" + p.calcularDescuento());
	        PrecioToDesc+=p.calcularDescuento();
	        }
	    System.out.println("***********************************************");

	    System.out.println("Precio total con descuento aplicado: $" + PrecioToDesc);
	    sc.close();
	}
}
