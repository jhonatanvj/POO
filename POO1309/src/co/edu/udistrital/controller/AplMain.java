package co.edu.udistrital.controller;

import co.edu.udistrital.model.Estudiante;
import co.edu.udistrital.model.Persona;
import co.edu.udistrital.model.Profesor;

public class AplMain {

	public static void main(String[] args) {
	
		Persona a=new Persona("Carlos",19);
		
		Estudiante b=new Estudiante("Ana",21,"Economia");
		
		Profesor c=new Profesor("Jhon",60,12,"Contabilidad");
		
		System.out.println(a);
		System.out.println("____________________________");
		System.out.println(b);
		System.out.println("_________________________");
		System.out.println(c);
		System.out.println("_________________________");
		
				
				
	}

}
