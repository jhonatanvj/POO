package co.edu.udistrital.model;

public class Programador extends Empleado {

	private String lenguaje;
	private int numerodelineas;
	private double salarion=salario*0.15;
	

	public Programador(String pnombre, int pedad, int pcedula, float psalario, String plenguaje, int pnumerodelineas) {
		super(pnombre, pedad, pcedula, psalario);
		lenguaje = plenguaje;
		numerodelineas = pnumerodelineas;
		
	}

	@Override
	public String toString() {
		return super.toString() + "\nLenguaje de Programación Dominante=" + lenguaje
				+ "\nNúmero de Líneas de Código por hora=" + numerodelineas+"\nNuevo salario= "+
				salarion;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public int getNumerodelineas() {
		return numerodelineas;
	}

	public void setNumerodelineas(int numerodelineas) {
		this.numerodelineas = numerodelineas;
	}

	

}
