package co.edu.udistrital.model;

public class Cilindro extends Figura{
	private double radio;
	private double altura;
	
	public Cilindro(String nombre, double r, double h) {
		super(nombre);
		radio=r;
		altura=h;
	}
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	@Override
	public void calcularVolumen() {
		volumen= Math.PI*Math.pow(radio, 2)*altura;
	}
	@Override
	public String toString() {
		return super.toString()+"\nRadio: " + radio + "\nAltura: " + altura;
	}
	
	
}
