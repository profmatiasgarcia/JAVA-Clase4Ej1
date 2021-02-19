package GUI;
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
import javax.swing.JButton;
import javax.swing.JFrame;

public class BotonConTooltip extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public BotonConTooltip(){
		super("Botón con Tooltip");	
		
		getContentPane().setLayout(new FlowLayout());
				
		JButton boton = new JButton("Pasa sobre este botón");
		boton.setToolTipText("Tooltip del botón");
		getContentPane().add(boton);
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new BotonConTooltip();
	}

}
