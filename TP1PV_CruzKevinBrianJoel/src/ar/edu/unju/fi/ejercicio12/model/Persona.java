// Persona.java en el paquete model
package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
    private String nombre;
    private Calendar fechaNacimiento;
    public Persona() {
    	
    }

    public Persona(String nombre, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
    	Calendar hoy = Calendar.getInstance();
		return (hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR));
    }

    public String determinarEstacion() {
        int diaAño = fechaNacimiento.get(Calendar.DAY_OF_YEAR);
        
        // Ajuste para años bisiestos
        if (fechaNacimiento.get(Calendar.YEAR) % 4 == 0) {
            diaAño++;
            if ((diaAño >= 22 && diaAño <= 80) || (diaAño >= 356 && diaAño <= 367)) {
                return "Verano";
            } else if (diaAño >= 81 && diaAño <= 173) {
                return "Otoño";
            } else if (diaAño >= 174 && diaAño <= 265) {
                return "Invierno";
            } else {
                return "Primavera";
            }
        }
        
        if ((diaAño >= 21 && diaAño <= 79) || (diaAño >= 355 && diaAño <= 366)) {
            return "Verano";
        } else if (diaAño >= 80 && diaAño <= 172) {
            return "Otoño";
        } else if (diaAño >= 173 && diaAño <= 264) {
            return "Invierno";
        } else {
            return "Primavera";
        }
    }

    public String determinarSignoZodiaco() {
        int diaAño = fechaNacimiento.get(Calendar.DAY_OF_YEAR);
        
        // Ajuste para años bisiestos
        if (fechaNacimiento.get(Calendar.YEAR) % 4 == 0) {
            diaAño++;
        }
        
        // Determinar el signo zodiacal según el día del año
        if ((diaAño >= 21 && diaAño <= 79) || (diaAño >= 355 && diaAño <= 366)) {
            return "Capricornio";
        } else if (diaAño >= 80 && diaAño <= 140) {
            return "Acuario";
        } else if (diaAño >= 141 && diaAño <= 201) {
            return "Piscis";
        } else if (diaAño >= 202 && diaAño <= 262) {
            return "Aries";
        } else if (diaAño >= 263 && diaAño <= 323) {
            return "Tauro";
        } else if (diaAño >= 324 && diaAño <= 384) {
            return "Géminis";
        } else if (diaAño >= 385 && diaAño <= 445) {
            return "Cáncer";
        } else if (diaAño >= 446 && diaAño <= 506) {
            return "Leo";
        } else if (diaAño >= 507 && diaAño <= 566) {
            return "Virgo";
        } else if (diaAño >= 567 && diaAño <= 626) {
            return "Libra";
        } else if (diaAño >= 627 && diaAño <= 686) {
            return "Escorpio";
        } else {
            return "Sagitario";
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento.get(Calendar.DAY_OF_MONTH) + "/" +
                           (fechaNacimiento.get(Calendar.MONTH) + 1) + "/" +
                           fechaNacimiento.get(Calendar.YEAR)); // Sumar 1 porque los meses se indexan desde 0
        System.out.println("Edad: " + calcularEdad() + " años");
        
        System.out.println("Signo del zodiaco: " + determinarSignoZodiaco());
        System.out.println("Estación: " + determinarEstacion());
    }
}
