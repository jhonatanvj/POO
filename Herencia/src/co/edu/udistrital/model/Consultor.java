package co.edu.udistrital.model;

public class Consultor extends Empleado {

	private int aniosexperiencia;
	private int equipos;

	public Consultor(String pnombre, int pedad, int pcedula, float psalario, int paniosexperiencia, int pequipos) {
		super(pnombre, pedad, pcedula, psalario);

		aniosexperiencia = paniosexperiencia;
		equipos = pequipos;

	}

	@Override
	public String toString() {
		return super.toString() + "\nRegistro de años de experiencia=" +aniosexperiencia
				+ "\nequipos de desarrollo ha liderado=" + equipos;
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
