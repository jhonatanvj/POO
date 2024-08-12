package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelU extends JPanel {
	
	private JLabel enombre;
	private JLabel erol;
	
	
	
	
	public PanelU() {
		setLayout(new GridLayout(1,2));
		setBackground(new Color(236, 159, 91));
		setPreferredSize(new Dimension(800, 60));
		setBorder(new TitledBorder("Modulo de datos "));

		inicializarComponentes();

		setVisible(true);
}
	
	public void inicializarComponentes(){
		
		enombre = new JLabel();
		add(enombre);
		
		erol = new JLabel();
		add(erol);
		
	}

	public JLabel getEnombre() {
		return enombre;
	}

	public void setEnombre(JLabel enombre) {
		this.enombre = enombre;
	}

	public JLabel getErol() {
		return erol;
	}

	public void setErol(JLabel erol) {
		this.erol = erol;
	}
	
	
	
	

}
