package CalculoIMC;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Persona {
	private String nombre;
	private int edad;
	private double peso, altura;

	public Persona (){
		
	}
	
	public Persona (String n, int e, double p, double t) {
		this.nombre = n;
		this.edad = e;
		this.peso = p;
		this.altura = t;
	}

	Persona verDatos() {
		String res = "Datos\n";
		res += "\nNombre: " + nombre;
		res += "\nEdad: " + edad;
		res += "\nPeso: " + peso;
		res += "\nAltura: " + altura;
		res += "\nIMC obtenido es: " + imc();
		res += "\nClasificacion obtenida es: " + clasificacion();
		JOptionPane.showMessageDialog(null, res, "Resultado", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/main/resources/Porky.png"));
		return this;
	}

	public double imc() {
		return peso / (altura * altura);
	}

	public String clasificacion() {
		String cad = "";
		if (imc() < 16.00) {
			cad = "Infrapeso: Delgadez Severa";
		} else if (imc() <= 16.00 || imc() <= 16.99) {
			cad = "Infrapeso: Delgadez moderada";
		} else if (imc() <= 17.00 || imc() <= 18.49) {
			cad = "Infrapeso: Delgadez aceptable";
		} else if (imc() <= 18.50 || imc() <= 24.99) {
			cad = "Peso Normal";
		} else if (imc() <= 25.00 || imc() <= 29.99) {
			cad = "Sobrepeso";
		} else if (imc() <= 30.00 || imc() <= 34.99) {
			cad = "Obeso: Tipo I";
		} else if (imc() <= 35.00 || imc() <= 40.00) {
			cad = "Obeso: Tipo II";
		} else if (imc() >= 40.00) {
			cad = "Obeso: Tipo III";
		} else {
			cad = "no existe clasificacion";
		}
		return cad;
	}
}
