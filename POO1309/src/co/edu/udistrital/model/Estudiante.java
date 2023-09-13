package co.edu.udistrital.model;

public class Estudiante extends Persona {

	private String carrera;
	
	
	public Estudiante(String pnombre,int pedad,String pcarrera) {
		super(pnombre,pedad);
		
		carrera=pcarrera;
		
	}


	public String getCarrera() {
		return carrera;
	}


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}


	@Override
	public String toString() {
		return super.toString()+"\nCarrera:"+carrera;
	}
	
	
	
	
}
