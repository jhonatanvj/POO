package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.Consultor;
import co.edu.udistrital.model.Directivo;
import co.edu.udistrital.model.Empleado;
import co.edu.udistrital.model.Programador;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese cuantos empleados quiere ingresar: ");
		int n = leer.nextInt();
		Empleado[] persona = new Empleado[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Ingrese el valor dependiendo del cargo" + "\n1 para programador" + "\n2 para consultor"
					+ "\n3 para directivo");
			System.out.println("--------------------------------");
			int n2 = leer.nextInt();

			switch (n2) {

			case 1:
				System.out.println("Ingrese el nombre:");
				String nombre = leer.next();
				System.out.println("Ingrese la edad:");
				int edad = leer.nextInt();
				System.out.println("Ingrese la cedula");
				int cedula = leer.nextInt();
				System.out.println("Ingrese el lenguaje de Programacion Dominante");
				String lenguaje = leer.next();
				System.out.println("Ingrese el numero de lineas de Codigo por hora");
				int numerodelineas = leer.nextInt();
				String cargo = "Programador";
				persona[i] = new Programador(nombre, cargo, edad, cedula, 1500000, lenguaje, numerodelineas);
				persona[i].aumentoBono();
				persona[i].aumentoSalario();
				break;
			case 2:
				System.out.println("Ingrese el nombre:");
				nombre = leer.next();
				System.out.println("Ingrese la edad:");
				edad = leer.nextInt();
				System.out.println("Ingrese la cedula");
				cedula = leer.nextInt();
				System.out.println("Ingrese el registro de anios de experiencia");
				int anioexperiencia = leer.nextInt();
				System.out.println("Ingrese los equipos de desarrollo ha liderado");
				int equipos = leer.nextInt();
				cargo = "Consultor";
				persona[i] = new Consultor(nombre, cargo, edad, cedula, 3000000, anioexperiencia, equipos);
				persona[i].aumentoBono();
				persona[i].aumentoSalario();
				break;
			case 3:
				System.out.println("Ingrese el nombre:");
				nombre = leer.next();
				System.out.println("Ingrese la edad:");
				edad = leer.nextInt();
				System.out.println("Ingrese la cedula");
				cedula = leer.nextInt();
				System.out.println("Ingrese el registro de anios de experiencia");
				int experiencia = leer.nextInt();
				System.out.println("Ingrese la area encargada");
				String area = leer.next();
				cargo = "Directivo";
				persona[i] = new Directivo(nombre, cargo, edad, cedula, 5000000, experiencia, area);
				persona[i].aumentoBono();
				persona[i].aumentoSalario();
				break;

			}

		}
		for (int i = 0; i < n; i++) {
			System.out.println("-----------------------------");
			System.out.println(persona[i].toString());
		}
		leer.close();
	}
}
