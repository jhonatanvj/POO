package co.edu.udistrital.controller;

import co.edu.udistrital.model.Bicicleta;
import co.edu.udistrital.model.Moto;
import co.edu.udistrital.model.Sitp;
import co.edu.udistrital.view.VistaConsola;

public class Controller {

	private VistaConsola vista;
	private Sitp vehiculopa;
	private Bicicleta bici;
	private Moto susuki;

	public Controller() {
		vista = new VistaConsola();
		vehiculopa = new Sitp();
		bici=new Bicicleta();
		susuki=new Moto();
		funcionar();
	}

	public void funcionar() {
		vista.mostrarInformacion(vehiculopa.arrancar());
		vista.mostrarInformacion(vehiculopa.detener());
		vista.mostrarInformacion(vehiculopa.echarPito());
		vista.mostrarInformacion("-------------------------------------");
		vista.mostrarInformacion(bici.arrancar());
		vista.mostrarInformacion(bici.detener());
		vista.mostrarInformacion(bici.echarPito());
		vista.mostrarInformacion("-------------------------------------");
		vista.mostrarInformacion(susuki.arrancar());
		vista.mostrarInformacion(susuki.detener());
		vista.mostrarInformacion(susuki.echarPito());
	}

}
