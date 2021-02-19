package Window;
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
import java.awt.FlowLayout;
import javax.swing.*;

public class Window extends JFrame {

	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel etiqueta3;

	public Window() {
		super("Prueba de una ventana con 3 JLabel");
		setLayout(new FlowLayout()); // establece el esquema

		// Constructor de JLabel con un argumento String
		etiqueta1 = new JLabel("Etiqueta solo con texto");
		etiqueta1.setToolTipText("Esta es Etiqueta 1");
		add(etiqueta1); // agrega la etiqueta al JFrame Window

		// Constructor JLabel con argumentos String, Icono y alineacion
		ImageIcon logo = new ImageIcon("src/main/resources/JavaLogo.gif");
		etiqueta2 = new JLabel("Etiqueta con Icomo y texto a derecha", logo, SwingConstants.LEFT);
		etiqueta2.setToolTipText("Esta es Etiqueta 2");
		add(etiqueta2);

		etiqueta3 = new JLabel(); // Constructor de JLabel sin argumentos
		etiqueta3.setText("Etiqueta con icono y texto debajo");
		etiqueta3.setIcon(logo);
		etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
		etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
		etiqueta3.setToolTipText("Esta es Etiqueta 3");
		add(etiqueta3);
	}
}
