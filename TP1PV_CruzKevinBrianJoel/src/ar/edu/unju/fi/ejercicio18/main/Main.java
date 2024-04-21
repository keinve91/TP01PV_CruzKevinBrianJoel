package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	
	static Scanner scanner= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List <Pais> paises = new ArrayList(); 
		
		paises.add(new Pais("c1","argentina"));
		paises.add(new Pais("c2","brasil"));
		
		List<DestinoTuristico> destinos = new ArrayList();
		int op=0;
		do {
			op=menu();
			switch(op) {
			case 1:System.out.println("---- ALTA DESTINO TURISTICO ---- :");
					
					DestinoTuristico dt = crearDt();
						if(destinos.add(dt)) {
							System.out.println("Destino agregado con exito !");
						}
						else {
							System.out.println("error al agregar destino");
						}
				break;
			case 2:System.out.println("---- DESTINOS TURISTICOS ----");
					mostrarDestinosT(destinos);
				break;
			case 3:System.out.println("MODIFICAR EL PAIS DE UN DESTINO TURISTICO");
				if(modificarPaisDestino(destinos)) {
					System.out.println(" INFORMACION MODIFICADA CON EXITO !");
				}
				else {
					System.out.println("ERROR AL MODIFICAR !");
				}
				break;
			case 4:System.out.println("LIMPIAR EL ARRAYS DE DESTINOS TURISTICOS :");
					destinos.clear();
				break;
			case 5:System.out.println("ELIMINAR UN DESTINO TURISTICO");
					if(eliminarDestino(destinos)) {
						System.out.println("SE ELIMINO EXITOSAMENTE");
					}
					else {
						System.out.println("ERROR AL BORRAR ");
					}
				break;
			case 6:System.out.println("DESTINOS TURISTICOS ORDENADOS POR NOMBRE ");
					mostrarOrdenado(destinos);
				break;
			case 7:System.out.println("TODOS LOS PAISES ");
				mostrarPaises(paises);
				break;
			case 8:System.out.println("DESTINOS TURISTICOS DE UN PAIS ");
					System.out.println("INGRESE CODIGO DE PAIS ");
					String cod = scanner.nextLine();
					destinosPorPais(destinos,cod);
				break;
			case 9:System.out.println("FIN DEL PROGRAMA  ! ! !");
				break;
			default: System.out.println("ERROR DE OPCION");
			}
		}while(op != 9);
		
	}
	public static int menu() {
		int op=0;
		System.out.println("\n 1- Alta Destino Turistico -");
		System.out.println(" 2- Mostrar todos los Destinos turisticos -");
		System.out.println(" 3- Modificar el pais de un destino turistico -");
		System.out.println(" 4- Limpiar Arraylist de destino turisticos -");
		System.out.println(" 5- Eliminar un destino turistico -");
		System.out.println(" 6- Mostrar Destinos Turisticos Ordenados -");
		System.out.println(" 7- Mostrar todos los Paises -");
		System.out.println(" 8- Destinos turisticos de un Pais ");
		System.out.println(" 9- Salir ...");
		System.out.println(" \n Ingrese opcion !");
		op = scanner.nextInt();
		scanner.nextLine();
		return op;
	}
	
	static String codigo() {
		System.out.println("-------INGRESE CODIGO DEL DESTINO TURISTICO :");
		return scanner.nextLine();
	}
	static String nombre() {
		System.out.println("-------INGRESE NOMBRE DEL DESTINO TURISTICO :");
		return scanner.nextLine();
	}
	static Float precio() {
		float p=0;
		try {
			System.out.println("-------INGRESE PRECIO : ");
			p = scanner.nextFloat();
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("DATO INGRESADO NO VALIDO !");
		}
		scanner.nextLine();
		return p;
	}
	static Pais pais() {
		boolean band=false;
		String c,p="";
		do {
			System.out.println("------INGRESE CODIGO DE PAIS ");
			System.out.println(" c1 - ARGENTINA");
			System.out.println(" c2 - BRASIL");
			 c = scanner.nextLine();
			if(c.equals("c1")) {
				p = "argentina ";
			}
			if(c.equals("c2")) {
				 p = "brasil ";
			}
			if(c.equals("c1") == true || c.equals("c2") == true) {
				band=true;
			}
			else {
				System.out.println("ERROR DE CODIGO");
			}
		}while(!band);
		
		
		return new Pais(c,p);
	}
	static int dias() {
		int d=0;
		try {
			System.out.println("---------INGRESE DIAS");
			d = scanner.nextInt();
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("DATO INGRESADO NO VALIDO ");
		}
		scanner.nextLine();
		return d;
	}
	static DestinoTuristico crearDt() {
		return new DestinoTuristico(codigo(),nombre(),precio(),pais(),dias());
	}
	static void mostrarDestinosT(List<DestinoTuristico> destinos) {
		for (DestinoTuristico destinoTuristico : destinos) {
			System.out.println(" DESTINO TURISTICO : "+destinoTuristico.getNombre());
		}
	}
	
	static boolean modificarPaisDestino (List<DestinoTuristico> destinos) {
		boolean encontrado = false;
		System.out.println("INGRESE CODIGO DEL DESTINO TURISTICO:");
		String codigo = scanner.nextLine();
			for(int i=0; i< destinos.size(); i++) {
				if(codigo.equals(destinos.get(i).getCodigo())) {
					encontrado = true ;
					destinos.get(i).setPais(pais());
				}
			}
	
		return encontrado;
	}
	static boolean eliminarDestino (List<DestinoTuristico> destinos) {
		boolean encontrado = false;
		System.out.println("INGRESE CODIGO DEL DESTINO TURISTICO :");
		String codigo = scanner.nextLine();
			for(int i=0; i< destinos.size(); i++) {
				if(codigo.equals(destinos.get(i).getCodigo())) {
					encontrado = true ;
					destinos.remove(i);
				}
			}
		return encontrado;
	}
	static void mostrarOrdenado(List<DestinoTuristico> destinos) { //MUESTRA LOS APELLIDOS ORDENADOS
		Collections.sort(destinos,Comparator.comparing(DestinoTuristico::getNombre));
		for (DestinoTuristico destinoTuristico : destinos) {
			System.out.println("Destino Turistico : "+destinoTuristico.getNombre());
		}
	}
	static void mostrarPaises(List <Pais> paises) {
		for (Pais pais : paises) {
			System.out.println("PAIS : "+pais.getNombre()+ " CODIGO : "+pais.getCodigo());
		}
	}
	
	static void destinosPorPais(List<DestinoTuristico> destinos,String cod) {
		for(int i=0; i < destinos.size() ; i++) {
			if(cod.equals(destinos.get(i).getPais().getCodigo())) {
			System.out.println("Pais : "+destinos.get(i).getPais().getNombre()+"Destino : "+destinos.get(i).getNombre());
				
			}
		}
	}
}