package co.edu.udistrital.model;

public abstract class Figura {
	protected String nombre;
	protected double volumen;

	public Figura(String nombre) {
		this.nombre = nombre;
	}

	public abstract void calcularVolumen();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getVolumen() {
		return volumen;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nVolumen: " + volumen;
	}

}
