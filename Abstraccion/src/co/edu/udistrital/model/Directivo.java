package co.edu.udistrital.model;

public class Directivo extends Empleado {

	private int experiencia;
	private String area;

	public Directivo(String pnombre, String pcargo, int pedad, int pcedula, int psalario, int pexperiencia,
			String parea) {
		super(pnombre, pcargo, pedad, pcedula, psalario);
		experiencia = pexperiencia;
		area = parea;

	}

	@Override
	public String toString() {
		return super.toString() + "\nRegistro de anios de experiencia=" + experiencia
				+ "\nArea del cual estan encargados=" + area + "\nNuevo salario= " + salarion;
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

	public void aumentoSalario() {
		salarion = (salario * 0.35) + salario;
	}

	@Override
	public void aumentoBono() {
		if(experiencia>8 && experiencia<=12) {
			salario=(salario*0.30)+salario;
			
		}else if(experiencia>12) {
			salario=(salario*0.50)+salario;
		}
		
		
	}

}
