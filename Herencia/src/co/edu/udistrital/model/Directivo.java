package co.edu.udistrital.model;

public class Directivo extends Empleado {

	private int experiencia;
	private String area;

	public Directivo(String pnombre, int pedad, int pcedula, float psalario, int pexperiencia, String parea) {
		super(pnombre, pedad, pcedula, psalario);
		experiencia = pexperiencia;
		area = parea;

	}
	@Override
	public String toString() {
		return super.toString() + "\nRegistro de años de experiencia=" +experiencia
				+ "\nArea del cual están encargados=" + area;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
	
	
	
	
	

}
