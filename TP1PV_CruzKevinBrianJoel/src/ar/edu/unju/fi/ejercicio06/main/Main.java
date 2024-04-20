package ar.edu.unju.fi.ejercicio06.main;
import java.time.LocalDate;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio06.model.Persona;
public class Main {

	public static void main(String[] args) {
		
		byte opcion = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Ingrese 1 -> Crear Objeto con constructor por defecto.");
			System.out.println("Ingrese 2 -> Crear Objeto con constructor parametrizado.");
			System.out.println("Ingrese 3 -> Crear Objeto con constructor sin definir la provincia.");
			System.out.println("Ingrese 3 -> Salir Del Menu.");
			System.out.println("Ingrese una opcion para continuar: ");
			opcion = scan.nextByte();
			switch (opcion) {
			
			case 1:
				
				const_defecto();
				break;
			
			case 2:
				
				const_parametrizado();
				break;
			
			case 3: 
				
				const_sinprovincia();
				break;
			case 4:
				System.out.println("Saliendo del menu");
				
				
				break;
			default:
				System.out.println("¡¡Error!!, debe elegir una opcion valida, reintente...");
			}
			
		}while(opcion!=4);
			scan.close();
		}
	public static void const_sinprovincia() {
		
		String nomb;
		LocalDate Fechan;
		int anio, mes, dia, dni;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**************************");
		System.out.println("Cargando Nuevos Datos");
		System.out.print("Ingrese un nombre: ");
		nomb = sc.next();

		System.out.print("Ingrese un DNI: ");
		dni = sc.nextInt();
		
		System.out.print("Ingrese Datos de la edad: ");
		System.out.print("\nAnio: ");
		anio = sc.nextInt();
		System.out.print("Mes: ");
		mes = sc.nextInt();
		System.out.print("Dia: ");
		dia = sc.nextInt();
		Fechan = LocalDate.of(anio, mes, dia);
		
		Persona person = new Persona(dni, nomb, Fechan);
		
		System.out.println(person.toString());
		sc.close();
		
	}
	public static void const_parametrizado() {
		
		String nomb, provincia;
		LocalDate Fechan;
		int anio, mes, dia, dni;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**************************");
		System.out.println("Cargando Nuevos Datos");
		System.out.print("Ingrese un nombre: ");
		nomb = sc.next();

		System.out.print("Ingrese un DNI: ");
		dni = sc.nextInt();
		
		System.out.print("Ingrese Datos de la edad: ");
		System.out.print("\nAnio: ");
		anio = sc.nextInt();
		System.out.print("Mes: ");
		mes = sc.nextInt();
		System.out.print("Dia: ");
		dia = sc.nextInt();
		
		Fechan = LocalDate.of(anio, mes, dia);
		
		System.out.println("Ingrese la provincia: ");
		provincia = sc.next();
		
		Persona person = new Persona(dni,nomb,Fechan,provincia);
		
		System.out.println(person.toString());
		sc.close();
		
	}
	public static void const_defecto() {

		int anio, mes, dia;
		
		Scanner scan = new Scanner(System.in);
		
		Persona person = new Persona();
		
		System.out.println("**************************");
		System.out.println("Cargando Nuevos Datos");
		System.out.print("Ingrese un nombre: ");
		person.setNombre(scan.nextLine());

		System.out.print("Ingrese un DNI: ");
		person.setDni(scan.nextInt());
		
		System.out.print("Ingrese Datos de la edad: ");
		System.out.print("\nAnio: ");
		anio = scan.nextInt();
		System.out.print("Mes: ");
		mes = scan.nextInt();
		System.out.print("Dia: ");
		dia = scan.nextInt();
		
		person.setFechaNac(LocalDate.of(anio, mes, dia));
		
		System.out.println("Ingrese la provincia: ");
		person.setProvincia(scan.next());
		
		System.out.println(person.toString());
		scan.close();

	}
		

	}
