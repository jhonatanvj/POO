package co.edu.udistrital.model;

public class Programador extends Empleado {

	private String lenguaje;
	private int numerodelineas;
	private double salarion=(salario*0.15)+salario;
	

	public Programador(String pnombre, String pcargo, int pedad, int pcedula, int psalario, String plenguaje, int pnumerodelineas) {
		super(pnombre,pcargo, pedad, pcedula, psalario);
		lenguaje = plenguaje;
		numerodelineas = pnumerodelineas;
		
	}

	@Override
	public String toString() {
		return super.toString() + "\nLenguaje de Programacinn Dominante=" + lenguaje
				+ "\nNumero de Líneas de Codigo por hora=" + numerodelineas+"\nNuevo salario= "+
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
