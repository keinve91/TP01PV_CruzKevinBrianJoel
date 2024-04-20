package ar.edu.unju.fi.ejercicio06.model;

import java.time.LocalDate;
public class Persona {
	private int dni;
	private String nombre;
	private LocalDate fechaNac;
	private String provincia;
	
	
	public Persona(){
		
	}


	public Persona(int dni, String nombre, LocalDate fechaNac, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.provincia = provincia;
	}
	


	public Persona(int dni, String nombre, LocalDate fechaNac) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.provincia = "Jujuy";
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public int calcularEdad(LocalDate fechaNacimiento) {
	    LocalDate ahora = LocalDate.now();
	    int edad = ahora.getYear() - fechaNacimiento.getYear();
	    
	    if (ahora.getMonthValue() < fechaNacimiento.getMonthValue() || 
	        (ahora.getMonthValue() == fechaNacimiento.getMonthValue() && 
	         ahora.getDayOfMonth() < fechaNacimiento.getDayOfMonth())) {
	        edad--;
	    }
	    
	    return edad;
	}
    public boolean esMayorDeEdad(LocalDate fechaNacimiento) {
        return (calcularEdad(fechaNacimiento) >= 18);
    }


	@Override
	public String toString() {
		
		if(esMayorDeEdad(fechaNac)) {
			return "\nMostrando los Datos de: " + nombre + "\ndni: " + dni + "\nFecha de Nacimiento: " + fechaNac + "\nProvincia: " + provincia + "\n\"Es Mayor de edad\"";
		}else {
			return "\nMostrando los Datos de: " + nombre + "\ndni: " + dni + "\nFecha de Nacimiento: " + fechaNac + "\nProvincia: " + provincia + "\n\"Es Menor de edad\"";
		}
		
	}

}
