package co.edu.udistrital.view;

import java.util.Scanner;

public class VistaConsola {
	
	private Scanner sc;
	
	public VistaConsola() {
		sc=new Scanner(System.in);
		
	}
	
	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}

}
