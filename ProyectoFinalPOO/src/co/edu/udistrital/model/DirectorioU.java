package co.edu.udistrital.model;

import java.util.ArrayList;

public class DirectorioU {
	
	private ArrayList<Usuario> directoriou;
	
	
	public DirectorioU() {
		directoriou = new ArrayList<Usuario>();
		cargarDatosIniciales();
	}
	
	public void cargarDatosIniciales() {
		Usuario x;
		
		x= new Usuario("samuel", "1234", "saleals@gmail.com","Usuario", 17, "987654321");
		directoriou.add(x);
		
		
		
		
		
		
	}

	public ArrayList<Usuario> getDirectoriou() {
		return directoriou;
	}

	public void setDirectoriou(ArrayList<Usuario> directoriou) {
		this.directoriou = directoriou;
	}
	
	

}
