package co.edu.udistrital.model;

//Clase abstracta

public abstract class Empleado {
	protected String nombre;
	protected int edad;

	protected int cedula;
	protected double salario;
	protected String cargo;
	protected double salarion;

	public Empleado(String pnombre, String pcargo, int pedad, int pcedula, double psalario) {

		nombre = pnombre;
		edad = pedad;
		cedula = pcedula;
		salario = psalario;
		cargo = pcargo;

	}

	@Override
	public String toString() {
		return "Nombre= " + nombre + "\nCargo=" + cargo + "\nEdad=" + edad + "\nCedula=" + cedula + "\nSalario="
				+ salario;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	//Metodo abstracto
	public abstract void aumentoSalario();

	// Metodo abstracto
	public abstract void aumentoBono();

}
