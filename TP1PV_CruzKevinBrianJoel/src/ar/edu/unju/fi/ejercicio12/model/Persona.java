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
        
        if (diaAño >= 80 && diaAño <= 109) {
            return "Aries";
        } else if (diaAño >= 110 && diaAño <= 140) {
            return "Tauro";
        } else if (diaAño >= 141 && diaAño <= 171) {
            return "Géminis";
        } else if (diaAño >= 172 && diaAño <= 202) {
            return "Cáncer";
        } else if (diaAño >= 203 && diaAño <= 233) {
            return "Leo";
        } else if (diaAño >= 234 && diaAño <= 264) {
            return "Virgo";
        } else if (diaAño >= 265 && diaAño <= 294) {
            return "Libra";
        } else if (diaAño >= 295 && diaAño <= 324) {
            return "Escorpio";
        } else if (diaAño >= 325 && diaAño <= 354) {
            return "Sagitario";
        } else if ((diaAño >= 355 && diaAño <= 365) || (diaAño >= 1 && diaAño <= 19)) {
            return "Capricornio";
        } else if (diaAño >= 20 && diaAño <= 49) {
            return "Acuario";
        } else {
            return "Piscis";
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
