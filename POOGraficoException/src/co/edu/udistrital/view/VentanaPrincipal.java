package co.edu.udistrital.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	private PanelPrincipal panel;
	
	
	public VentanaPrincipal() {
		//Titulo de arriba
		setTitle("Mi primer programa");
		//Tamanio ventana
		setSize(800,600);
		//Que no quede nada abierto despues de cerrar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Color del fondo
		getContentPane().setBackground(Color.CYAN);
		//Organizacion de elementos manual
		getContentPane().setLayout(null);
		
		inicializarComponentes();
		//Hace que el usuario no pueda cambiar el tama�o de la ventana
		setResizable(false);
		//Hace que la ventana se abra en el centro
		setLocationRelativeTo(null);
		//Hace que se vea la ventana
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		panel=new PanelPrincipal();
		//Pone las coordenadas del panel osea tama�o
		panel.setBounds(25,25,735,510);
		//A�ade el panel
		getContentPane().add(panel);
	}

	public PanelPrincipal getPanel() {
		return panel;
	}

	public void setPanel(PanelPrincipal panel) {
		this.panel = panel;
	}
	
	
}
