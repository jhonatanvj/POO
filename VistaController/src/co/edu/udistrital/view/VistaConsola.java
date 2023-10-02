package co.edu.udistrital.view;

import java.util.Scanner;

public class VistaConsola {
	
	private Scanner sc;
	
	public VistaConsola() {
		sc = new Scanner(System.in);
	}
	
	public double leerDatoReal(String mensaje) {
		double dato = 0.0;
		System.out.println(mensaje);
		dato = sc.nextDouble();
		sc.nextLine();
		return dato;
	}
	
	public int leerDatoEntero(String mensaje) {
		int dato = 0;
		System.out.println(mensaje);
		dato = sc.nextInt();
		sc.nextLine();
		return dato;
	}
	
	public String leerDatoCadenaCaracteres(String mensaje) {
		String dato = "";
		System.out.println(mensaje);
		dato = sc.nextLine();
		return dato;
	}

	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}

}
