package co.edu.udistrital.model;

public class Directivo extends Empleado {

	private int experiencia;
	private String area;
	private double salarion=(salario*0.35)+salario;

	public Directivo(String pnombre,String pcargo, int pedad, int pcedula, int psalario, int pexperiencia, String parea) {
		super(pnombre,pcargo, pedad, pcedula, psalario);
		experiencia = pexperiencia;
		area = parea;

	}
	@Override
	public String toString() {
		return super.toString() + "\nRegistro de años de experiencia=" +experiencia
				+ "\nArea del cual están encargados=" + area+"\nNuevo salario= "+
						salarion;
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
