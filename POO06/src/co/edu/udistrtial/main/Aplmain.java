package co.edu.udistrtial.main;

import co.udistrital.modell.Mascota;

public class Aplmain {

	public static void main(String[] args) {
		Mascota x = new Mascota();
		
		x.setNombre("Carol");
		x.setTipo("gato");
		x.setEdad(4);

		System.out.println(x);
		Mascota y = new Mascota("Max", "Perro", 15);

		System.out.println(y);

	}

}
