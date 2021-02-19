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
import javax.swing.JOptionPane;

public class CalculoIMC {
	public static void main(String[] args) {
		// instanciar clase
		Persona persona1;
		// solicitar datos
		String nombre = JOptionPane.showInputDialog("Nombre: ");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
		double talla = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));

		persona1 = new Persona(nombre, edad, peso, talla);
		persona1.verDatos();
	}
}
