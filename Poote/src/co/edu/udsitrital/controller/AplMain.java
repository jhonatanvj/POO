package co.edu.udsitrital.controller;

import co.edu.udsitrital.model.Persona;

public class AplMain {

	public static void main(String[] args) {

		Persona a = new Persona("Juan", 25);
		Persona b = new Persona("Maria", 31);

		System.out.println("La edad de la persona A es: " + a.edad);
		System.out.println("La edad de la persona B es: " + b.edad);
		System.out.println();
		System.out.println(a);
		System.out.println();
		System.out.println(b);
		System.out.println();
		System.out.println("Se llaman igual? " + a.nombresIguales(b));
		System.out.println(a.nombre + a.esMayor(b) + " que " + b.nombre);
		a.Saludar();
		a.Saludar(b);

	}

}
