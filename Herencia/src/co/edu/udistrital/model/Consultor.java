package co.edu.udistrital.model;

public class Consultor extends Empleado {

	private int aniosexperiencia;
	private int equipos;
	private double salarion=(salario*0.25)+salario;

	public Consultor(String pnombre,String pcargo, int pedad, int pcedula, int psalario, int paniosexperiencia, int pequipos) {
		super(pnombre,pcargo, pedad, pcedula, psalario);

		aniosexperiencia = paniosexperiencia;
		equipos = pequipos;

	}

	@Override
	public String toString() {
		return super.toString() + "\nRegistro de años de experiencia=" +aniosexperiencia
				+ "\nEquipos de desarrollo ha liderado=" + equipos+"\nNuevo salario="+
						salarion;
	}

	public int getAniosexperiencia() {
		return aniosexperiencia;
	}

	public void setAniosexperiencia(int aniosexperiencia) {
		this.aniosexperiencia = aniosexperiencia;
	}

	public int getEquipos() {
		return equipos;
	}

	public void setEquipos(int equipos) {
		this.equipos = equipos;
	}

}
