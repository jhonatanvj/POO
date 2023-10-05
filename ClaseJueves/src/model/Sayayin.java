package model;

public class Sayayin implements Volar, SuperFuerza {

	@Override
	public String golpear() {
		
		return "Aumenta su ki en sus punios para pegare a el objetivo ";
	}

	@Override
	public String lanzar() {
		
		return "Concentra su fuerza para lanzar una piedra grande";
	}

	@Override
	public String empujar(int distancia) {
		
		return "Fija una estructura para empujarlo a una distancia de "+distancia;
	}

	@Override
	public String levantar() {
		
		return "Canaliza ki para levantar un objeto pesado";
	}

	@Override
	public String saltar(int distancia) {
		
		return "Aumenta su ki en sus piernas para saltar una altura de "+distancia;
	}

	@Override
	public String despegar() {
		return "Canaliza su ki para salir a volar";
	}

	@Override
	public String aterrizar() {
		
		return "Disminuye su ki para poder aterrizar";
	}

	

	@Override
	public String acelerar() {
		
		return "Aumenta un poco su ki para dezplazarse mas rapido";
	}

}
