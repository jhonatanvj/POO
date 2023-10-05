package model;

public interface Volar {
	String despegar();
	String aterrizar();
	 default String desplazarse(int distancia) {
		 return "Mientars vuela de desplaza una distancia de "+distancia;
	 }
	String acelerar();

}
