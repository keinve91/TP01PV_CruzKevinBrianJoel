package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       Pizza pzz = new Pizza();
	       int diametro=0;
	       for(int i=1; i<=3; i++) {
	    	   System.out.println("***   PIZZAS   ***");
	    	   do {
	    	   System.out.println("Ingrese diametro [20, 30, 40]:");
	    	   diametro = sc.nextInt();
	    	   }while(!(diametro == 20 || diametro == 30 || diametro == 40));
	    	   pzz.setDiametro(diametro);
	    	   sc.nextLine();
	    	   System.out.println("¿Contiene ingredientes especiales?");
	           String op = sc.nextLine();
	           boolean band = op.equalsIgnoreCase("si");
	           if(band==true) {
	        	   pzz.setIngredienteEspecial(true);
	           }else {
	        	   pzz.setIngredienteEspecial(false);
	           }
	           pzz.setPrecio(pzz.calcularPrecio(diametro, band));
	           pzz.setArea(pzz.calcularArea(diametro));
	           System.out.println("    ");
	           System.out.println("*** Pizza " + i +" ***");
	           pzz.mostrarDatos();
	       }
	       sc.close();

	}

}
