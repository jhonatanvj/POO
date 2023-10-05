package view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class VistaEmergente {
	
public VistaEmergente() {
		
	}
	
	public double leerDatoReal(String mensaje) {
		double dato = 0.0;
		String aux = JOptionPane.showInputDialog(mensaje);
		dato = Double.parseDouble(aux);
		return dato;
	}
	
	public int leerDatoEntero(String mensaje) {
		int dato = 0;
		String aux = JOptionPane.showInputDialog(mensaje);
		dato = Integer.parseInt(aux);
		return dato;
	}
	
	public String leerDatoCadenaCaracteres(String mensaje) {
		String dato = JOptionPane.showInputDialog(mensaje);
		return dato;
	}

	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null,mensaje);
	}
}
