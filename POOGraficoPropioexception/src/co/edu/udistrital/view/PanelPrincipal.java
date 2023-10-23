package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelPrincipal extends JPanel {

	private JLabel etitulo;
	private JLabel enumero;
	private JLabel eresultado;
	private JLabel emostrar;
	private JTextField cingresarNumero;
	private JButton botonValidar;

	public PanelPrincipal() {
		setLayout(null);
		setBackground(Color.LIGHT_GRAY);

		inicializarComponentes();

		setVisible(true);

	}

	public void inicializarComponentes() {

		etitulo = new JLabel("PROGRAMA QUE DETERMINA SI UN NUMERO ES PAR O IMPAR");
		Font fuenteNueva = new Font("arial", Font.BOLD, 20);
		Font fuenteNueva2 = new Font("arial", Font.BOLD, 16);
		etitulo.setFont(fuenteNueva);
		etitulo.setForeground(Color.RED);
		etitulo.setBounds(60, 20, 670, 30);
		add(etitulo);

		enumero = new JLabel("Ingrese numero entero: ");
		enumero.setFont(fuenteNueva2);
		enumero.setBounds(100, 200, 200, 30);
		add(enumero);

		eresultado = new JLabel("Resultado: ");
		eresultado.setFont(fuenteNueva2);
		eresultado.setBounds(100, 300, 200, 30);
		add(eresultado);

		emostrar = new JLabel();
		emostrar.setFont(fuenteNueva2);
		emostrar.setBounds(200, 300, 500, 30);
		add(emostrar);

		cingresarNumero = new JTextField();
		cingresarNumero.setBounds(300, 200, 100, 30);
		// Hace que en el cuadre aparezca el texto en la mitad
		cingresarNumero.setHorizontalAlignment(JTextField.CENTER);
		add(cingresarNumero);

		botonValidar = new JButton("Validar");
		botonValidar.setBackground(Color.BLACK);
		botonValidar.setForeground(Color.WHITE);
		botonValidar.setBounds(480, 200, 100, 30);
		botonValidar.setActionCommand("VALIDAR");
		add(botonValidar);

	}

	public JLabel getEtitulo() {
		return etitulo;
	}

	public void setEtitulo(JLabel etitulo) {
		this.etitulo = etitulo;
	}

	public JLabel getEnumero() {
		return enumero;
	}

	public void setEnumero(JLabel enumero) {
		this.enumero = enumero;
	}

	public JLabel getEresultado() {
		return eresultado;
	}

	public void setEresultado(JLabel eresultado) {
		this.eresultado = eresultado;
	}

	public JLabel getEmostrar() {
		return emostrar;
	}

	public void setEmostrar(JLabel emostrar) {
		this.emostrar = emostrar;
	}

	public JTextField getCingresarNumero() {
		return cingresarNumero;
	}

	public void setCingresarNumero(JTextField cingresarNumero) {
		this.cingresarNumero = cingresarNumero;
	}

	public JButton getBotonValidar() {
		return botonValidar;
	}

	public void setBotonValidar(JButton botonValidar) {
		this.botonValidar = botonValidar;
	}

}
