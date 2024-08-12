package co.edu.udistrital.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.udistrital.model.DirectorioU;
import co.edu.udistrital.model.Persona;
import co.edu.udistrital.model.Usuario;
import co.edu.udistrital.view.VentanaPrincipal;
import co.edu.udistrital.view.VentanaU;

public class Controller implements ActionListener {

	private VentanaPrincipal vista;
	private DirectorioU datos;
	private VentanaU vistau;

	public Controller() {
		vista = new VentanaPrincipal();
		datos = new DirectorioU();
		vistau = new VentanaU();
		asignarOyentes();
	}

	public void asignarOyentes() {

		vista.getPin().getBentrar().addActionListener(this);
		vista.getPin().getBadd().addActionListener(this);
		vista.getPin().getLrol().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("SING")) {
			vista.setVisible(false);
			vistau.setVisible(true);
			Usuario encontrada = null;
			for (Usuario x : datos.getDirectoriou()) {
				if (x.getNombre().equals(vista.getPin().getCajanombre().getText())) {
					encontrada = x;
				}
			}
			vistau.getPu().getErol().setText(encontrada.getRol());
			vistau.getPu().getEnombre().setText(encontrada.getNombre());

		} 

		/*
		 * String nombreBuscar = (String)
		 * vista.getPd().getLista_nombres().getSelectedItem(); Persona encontrada =
		 * null; for (Persona x : datos.getDirectorio()) { if
		 * (x.getNombre().equals(nombreBuscar)) { encontrada = x; } }
		 */

	}

}
