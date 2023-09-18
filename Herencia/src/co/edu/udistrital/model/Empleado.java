package co.edu.udistrital.model;

public class Empleado {
	protected String nombre;
	protected int edad;

	protected int cedula;
	protected float salario;

	public Empleado(String pnombre, int pedad, int pcedula, float psalario) {

		nombre = pnombre;
		edad = pedad;
		cedula = pcedula;
		salario = psalario;

	}

	@Override
	public String toString() {
		return "Nombre= " + nombre + ", \nEdad=" + edad + ", \nCedula=" + cedula + ", \nSalario=" + salario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
	
	

}
