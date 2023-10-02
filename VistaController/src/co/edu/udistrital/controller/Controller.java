package co.edu.udistrital.controller;

import co.edu.udistrital.model.Cilindro;
import co.edu.udistrital.model.Cono;
import co.edu.udistrital.model.Cubo;
import co.edu.udistrital.model.Figura;
import co.edu.udistrital.view.VistaConsola;
import co.edu.udistrital.view.VistaVentanasEmergentes;

public class Controller {
	
	//private VistaConsola vista;
	private VistaVentanasEmergentes vista;
	
	public Controller() {
		//vista = new VistaConsola();
		vista = new VistaVentanasEmergentes();
		funcionar();
	}
	
	public void funcionar() {
		
		Cilindro a=new Cilindro("Cilindro",2.3,5.6);
		a.calcularVolumen();
		vista.mostrarInformacion(a.toString());
		vista.mostrarInformacion("___________________");
		
		Cono b=new Cono("Cono",1.8,0.9);
		b.calcularVolumen();
		vista.mostrarInformacion(b.toString());
		vista.mostrarInformacion("___________________");
		
		Cubo c=new Cubo("Cubo",2.67);
		c.calcularVolumen();
		vista.mostrarInformacion(c.toString());
		vista.mostrarInformacion("___________________");
		
		double radio = vista.leerDatoReal("Ingresar radio del cono: ");
		double altura = vista.leerDatoReal("Ingresar altura del cono: ");
		Cono c1 = new Cono("Cono2", radio, altura);
		c1.calcularVolumen();
		vista.mostrarInformacion(c1.toString());

	}

}
