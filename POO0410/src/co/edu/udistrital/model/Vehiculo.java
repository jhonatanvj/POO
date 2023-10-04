package co.edu.udistrital.model;

public interface Vehiculo {

	String arrancar();

	String detener();
	// El default dice que el metodo es una constante no se modifica

	default String echarPito() {
		return "Haciendo sonar el pito PIIIII";
	}

}
