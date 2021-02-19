package AppSuma;
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
public class AplicacionSuma {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Ingrese el primer numero entero");
		String num2 = JOptionPane.showInputDialog("Ingrese el segundo numero entero");
		
		int numero1 = Integer.parseInt(num1);
		int numero2 = Integer.parseInt(num2);
		
		int suma = numero1 + numero2;
		String resultado = "El resultado de la suma es " + suma;
		
		String titulo = "Aplicacion Suma de Enteros";
		JOptionPane.showMessageDialog(null, resultado, titulo, JOptionPane.PLAIN_MESSAGE);
	}
}
