package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class VentanaU extends JFrame {
	
	private PanelU pu;

	public VentanaU() {
		setTitle("USUARIO");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(new BorderLayout(10, 10));
		inicializarComponentes();
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(false);
		
	}
	
	
	
	public void inicializarComponentes() {
			
		pu= new PanelU();
		getContentPane().add(pu,BorderLayout.CENTER);
		
	}



	public PanelU getPu() {
		return pu;
	}



	public void setPu(PanelU pu) {
		this.pu = pu;
	}
	
	
	
	
}
