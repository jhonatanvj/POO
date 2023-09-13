package co.edu.udistrital.model;

public class Profesor extends Persona {

	private int horasClase;
	private String especialidad;
	
	
	
	public Profesor(String pnombre,int pedad,int phorasClase,String pespecialidad) {
	
		super(pnombre,pedad);
		horasClase=phorasClase;
		especialidad=pespecialidad;
		
		
		
	}



	@Override
	public String toString() {
		return super.toString()+"\nHoras clase= "+horasClase+"\nEspecialidad= "+especialidad;
	}



	public int getHorasClase() {
		return horasClase;
	}



	public void setHorasClase(int horasClase) {
		this.horasClase = horasClase;
	}



	public String getEspecialidad() {
		return especialidad;
	}



	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	
	
	
}
