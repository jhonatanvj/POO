package co.edu.udistrital.model;

public class Bicicleta implements Vehiculo {

	@Override
	public String arrancar() {
		
		return "Dar pedal hasta el cansancio";
	}

	@Override
	public String detener() {
		
		return "Aprender a respetar los semaforos";
	}

}
