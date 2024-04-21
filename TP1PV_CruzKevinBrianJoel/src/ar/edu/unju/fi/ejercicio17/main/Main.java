package ar.edu.unju.fi.ejercicio17.main;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

    public static void main(String[] args) {
        List<Jugador> jugadores = new ArrayList<Jugador>();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n\t\tMENÚ DE JUGADORES");
            System.out.println("------------------------");
            System.out.println("1. Alta de jugador");
            System.out.println("2. Mostrar datos de un jugador");
            System.out.println("3. Mostrar jugadores ordenados por apellido");
            System.out.println("4. Modificar datos de un jugador");
            System.out.println("5. Eliminar un jugador");
            System.out.println("6. Mostrar cantidad total de jugadores");
            System.out.println("7. Mostrar jugadores por nacionalidad");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opción: ");

            try {
                opcion = entrada.nextInt();
                entrada.nextLine(); 

                switch (opcion) {
                    case 1:
                        altaJugador(entrada, jugadores);
                        break;
                    case 2:
                        mostrarDatosJugador(entrada, jugadores);
                        break;
                    case 3:
                        mostrarJugadoresOrdenadosApellido(jugadores);
                        break;
                    case 4:
                        modificarDatosJugador(entrada, jugadores);
                        break;
                    case 5:
                        eliminarJugador(entrada, jugadores);
                        break;
                    case 6:
                        mostrarCantidadTotalJugadores(jugadores);
                        break;
                    case 7:
                        mostrarJugadoresPorNacionalidad(entrada, jugadores);
                        break;
                    case 8:
                        System.out.println("Saliendo del menú...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                entrada.nextLine(); // Limpiar entrada errónea
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado. Motivo: " + e.getMessage());
            }
        } while (opcion != 8);

        entrada.close();
    }

    private static void altaJugador(Scanner entrada, List<Jugador> jugadores) {
        try {
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese el apellido del jugador: ");
            String apellido = entrada.nextLine();

            System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
            LocalDate fechaNacimiento = LocalDate.parse(entrada.nextLine());

            System.out.print("Ingrese la nacionalidad del jugador: ");
            String nacionalidad = entrada.nextLine();

            System.out.print("Ingrese la estatura del jugador (en cm): ");
            double estatura = entrada.nextDouble();
            entrada.nextLine(); 

            System.out.print("Ingrese el peso del jugador (en kg): ");
            double peso = entrada.nextDouble();
            entrada.nextLine(); 

            String posicion = elegirPosicion();

            Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
            jugadores.add(jugador);
            System.out.println("Jugador dado de alta correctamente.");
        } catch (Exception e) {
            System.out.println("Error al dar de alta al jugador. Motivo: " + e.getMessage());
        }
    }

    private static void mostrarDatosJugador(Scanner entrada, List<Jugador> jugadores) {
        try {
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese el apellido del jugador: ");
            String apellido = entrada.nextLine();

            Jugador jugador = buscarJugador(nombre, apellido, jugadores);
            if (jugador != null) {
                System.out.println("\nDatos del jugador:");
                System.out.println("Nombre: " + jugador.getNombre() + " " + jugador.getApellido());
                System.out.println("Fecha de nacimiento: " + jugador.getFechaNac());
                System.out.println("Nacionalidad: " + jugador.getNacionalidad());
                System.out.println("Estatura: " + jugador.getEstatura() + " cm");
                System.out.println("Peso: " + jugador.getPeso() + " kg");
                System.out.println("Posición: " + jugador.getPosicion());
                System.out.println("Edad: " + jugador.calcularEdad() + " años");
            } else {
                System.out.println("Jugador no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar datos del jugador. Motivo: " + e.getMessage());
        }
    }

    private static void mostrarJugadoresOrdenadosApellido(List<Jugador> jugadores) {
        try {

            Collections.sort(jugadores, (j1, j2) -> j1.getApellido().compareToIgnoreCase(j2.getApellido()));

            System.out.println("\nJugadores ordenados por apellido:");
            for (Jugador jugador : jugadores) {
                System.out.println(jugador);
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar jugadores ordenados. Motivo: " + e.getMessage());
        }
    }
    private static void modificarDatosJugador(Scanner entrada, List<Jugador> jugadores) {
        try {
            System.out.print("Ingrese el nombre del jugador a modificar: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese el apellido del jugador a modificar: ");
            String apellido = entrada.nextLine();

            Jugador jugador = buscarJugador(nombre, apellido, jugadores);
            if (jugador != null) {
                System.out.print("Ingrese la nueva fecha de nacimiento (YYYY-MM-DD): ");
                jugador.setFechaNac(LocalDate.parse(entrada.nextLine()));

                System.out.print("Ingrese la nueva nacionalidad del jugador: ");
                jugador.setNacionalidad(entrada.nextLine());

                System.out.print("Ingrese la nueva estatura del jugador (en cm): ");
                jugador.setEstatura(entrada.nextDouble());
                entrada.nextLine(); 

                System.out.print("Ingrese el nuevo peso del jugador (en kg): ");
                jugador.setPeso(entrada.nextDouble());
                entrada.nextLine(); 

                
                System.out.print("Ingrese la nueva posición del jugador (delantero, medio, defensa, arquero): ");
                String pos=elegirPosicion();
                jugador.setPosicion(pos);

                System.out.println("Datos del jugador modificados correctamente.");
            } else {
                System.out.println("Jugador no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al modificar datos del jugador. Motivo: " + e.getMessage());
        }
    }

    private static void eliminarJugador(Scanner entrada, List<Jugador> jugadores) {
        try {
            System.out.print("Ingrese el nombre del jugador a eliminar: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese el apellido del jugador a eliminar: ");
            String apellido = entrada.nextLine();

            Jugador jugador = buscarJugador(nombre, apellido, jugadores);
            if (jugador != null) {
                jugadores.remove(jugador);
                System.out.println("Jugador eliminado correctamente.");
            } else {
                System.out.println("Jugador no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar el jugador. Motivo: " + e.getMessage());
        }
    }

    private static void mostrarCantidadTotalJugadores(List<Jugador> jugadores) {
            System.out.println("La cantidad total de jugadores es: " + jugadores.size());
    }

    private static void mostrarJugadoresPorNacionalidad(Scanner entrada, List<Jugador> jugadores) {
            System.out.print("Ingrese la nacionalidad para filtrar los jugadores: ");
            String nacionalidad = entrada.nextLine();

            int contador = 0;
            for (Jugador jugador : jugadores) {
                if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                    contador++;
                }
            }
            System.out.println("La cantidad de jugadores de nacionalidad " + nacionalidad + " es: " + contador);
    }
    private static Jugador buscarJugador(String nombre, String apellido, List<Jugador> jugadores) {
        try {
            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                    return jugador;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al buscar el jugador. Motivo: " + e.getMessage());
        }
        return null;
    }

public static String elegirPosicion() {
	  Scanner sc = new Scanner(System.in);
	  String posicion="";
	  boolean band=false;
	  do {
          System.out.print("Ingrese la posición del jugador (delantero, medio, defensa, arquero): ");

	        posicion = sc.nextLine();
	        if(posicion.equals("delantero") || posicion.equals("medio") || posicion.equals("defensa") || posicion.equals("arquero")) {
	        	band=true;
	        }else {
	        	System.out.println("Posicion invalida");
	        }
			}while(band!=true);
	  return posicion;
}
}