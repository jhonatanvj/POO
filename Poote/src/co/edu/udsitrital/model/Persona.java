package co.edu.udsitrital.model;

public class Persona {
	public String nombre;
	public int edad;

	public Persona(String nombre, int edad) {
		this.edad = edad;
		this.nombre = nombre;
	}

	public String toString() {

		return "Nombre: " + nombre + "\nEdad: " + edad;

	}

	public boolean nombresIguales(Persona x) {

		if (nombre.equals(x.nombre)) {

			return true;
		} else {

			return false;
		}

	}

	public String esMayor(Persona x) {

		if (edad > x.edad) {
			return "Es mayor";
		} else if (edad == x.edad) {
			return "Es igual";

		} else {
			return "Es menor";
		}

	}
	
	public void Saludar() {
		System.out.println("Hola a todos");
		
	}
	
public void Saludar(Persona x) {
	
	System.out.println("Hola "+x.nombre);
	
	
}
}
