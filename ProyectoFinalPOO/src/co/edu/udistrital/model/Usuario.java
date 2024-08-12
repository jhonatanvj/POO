package co.edu.udistrital.model;

import java.util.ArrayList;

public class Usuario extends Persona {

	private int edad;
	private String tarjeta;

	public Usuario(String nombre, String contra, String gmail,String rol, int edad, String tarjeta) {
		super(nombre, contra, gmail, rol);
		this.edad = edad;
		this.tarjeta = tarjeta;

	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setCupo(String tarjeta) {
		this.tarjeta = tarjeta;
	}

}
