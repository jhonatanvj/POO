package co.udistrital.modell;

public class Mascota {
	private String nombre;
	private String tipo;
	private int edad;
	
	public Mascota() {
		
		nombre= "";
		tipo= " ";
		edad=0;
		
		
	}
	
	
	
	public String toString() {
		
		
		return "Nombre= "+ nombre
				+"\nTipo= "+tipo+
				"\nEdad= "+edad;
		
		
	}

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public Mascota(String nombre, String tipo, int edad) {

		this.nombre = nombre;
		this.tipo = tipo;
		this.edad = edad;

	}

}
