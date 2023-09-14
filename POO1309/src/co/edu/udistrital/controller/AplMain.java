package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.Estudiante;
import co.edu.udistrital.model.Persona;
import co.edu.udistrital.model.Profesor;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		Persona a = new Persona("Carlos", 19);

		Estudiante b = new Estudiante("Ana", 21, "Economia");

		Profesor c = new Profesor("Jhon", 60, 12, "Contabilidad");

		System.out.println(a);
		System.out.println("____________________________");
		System.out.println(b);
		System.out.println("_________________________");
		System.out.println(c);
		System.out.println("_________________________");

		Persona[] d = new Persona[5];
		int n;

		for (int i = 0; i < 5; i++) {
			System.out.println("Escoja 1 si quiere profesor " + "\nEscoja 2 para estudiante");
			n = leer.nextInt();

			if (n == 1) {
				String nombre1;
				nombre1=leer.nextLine();
				d[i] = new Profesor(nombre1,60, 12, "Contabilidad");

			} else {
				 d[i] = new Estudiante("Ana", 21, "Economia");
			}

		}

		for (int i = 0; i < 5; i++) {
			System.out.println(d[i].toString());
			System.out.println("______________________________");
		}

		leer.close();
	}

}
