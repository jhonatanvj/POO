package co.edu.udistrital.model;

public class Sitp implements Vehiculo {

	@Override
	public String arrancar() {

		return "Poner en marcha el bus para cerrar a alguien";
	}

	@Override
	public String detener() {

		return "Frenar para hacer trancon";
	}

	
	
}
