package co.edu.udistrital.model;

public class Persona {

	protected String nombre;
	protected int edad;
	
	public Persona(String pnombre,int pedad) {
		
		nombre=pnombre;
		edad=pedad;
		
		
		
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre +
			 "\nEdad=" + edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
}
