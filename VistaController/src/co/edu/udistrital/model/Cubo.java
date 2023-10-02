package co.edu.udistrital.model;

public class Cubo extends Figura{
	private double lado;

	public Cubo(String nombre, double l) {
		super(nombre);
		lado=l;
	}
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public void calcularVolumen() {
		volumen= Math.pow(lado, 3);
	}
	@Override
	public String toString() {
		return super.toString()+"\nLado: " + lado;
	}
	
	
}
