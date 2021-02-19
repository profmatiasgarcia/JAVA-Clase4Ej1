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
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

public class Componentes extends JFrame {

    private JButton btnInscribir;
    private JCheckBox cboxAB;
    private JCheckBox cboxBP;
    private JCheckBox cboxPJ;
    private JCheckBox cboxPesas;
    private JCheckBox cboxSpin;
    private JCheckBox cboxZumba;
    private ButtonGroup grupoDos;
    private ButtonGroup grupoUno;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JPanel panelActividades;
    private JPanel panelDatos;
    private JPanel panelTitulo;
    private JRadioButton radioBoxeo;
    private JRadioButton radioCross;
    private JRadioButton radioKarate;
    private JRadioButton radioTRX;
    private JTextField txtApellido;
    private JTextField txtDNI;
    private JTextField txtDireccion;
    private JTextField txtNombre;
    private JTextField txtTelefono;

    public Componentes() {
        super("INSCRIPCION");
        setSize(500, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        panelTitulo = new JPanel();
        panelTitulo.setPreferredSize(new Dimension(350, 100));
        panelTitulo.setLayout(new FlowLayout());

        jLabel1 = new JLabel();
        jLabel1.setFont(new Font("Arial Black", 2, 24));
        jLabel1.setText("INSCRIPCION GIMNASIO");
        panelTitulo.add(jLabel1);

        jLabel2 = new JLabel();
        jLabel2.setFont(new Font("Arial Black", 0, 30));
        jLabel2.setForeground(Color.BLUE);
        jLabel2.setText("< EL FORZUDO >");
        panelTitulo.add(jLabel2);

        add(panelTitulo);

        ////
        panelDatos = new JPanel();
        panelDatos.setPreferredSize(new Dimension(300, 150));
        panelDatos.setLayout(new GridLayout(5, 2));

        jLabel3 = new JLabel();
        jLabel3.setFont(new Font("Verdana", 1, 18));
        jLabel3.setText("Apellido: ");
        panelDatos.add(jLabel3);

        txtApellido = new JTextField();
        txtApellido.setColumns(15);
        txtApellido.setFont(new Font("Verdana", 2, 18));
        panelDatos.add(txtApellido);

        jLabel4 = new JLabel();
        jLabel4.setFont(new Font("Verdana", 1, 18));
        jLabel4.setText("Nombre: ");
        panelDatos.add(jLabel4);

        txtNombre = new JTextField();
        txtNombre.setColumns(15);
        txtNombre.setFont(new Font("Verdana", 2, 18));
        panelDatos.add(txtNombre);

        jLabel5 = new JLabel();
        jLabel5.setFont(new Font("Verdana", 1, 18));
        jLabel5.setText("DNI: ");
        panelDatos.add(jLabel5);

        txtDNI = new JTextField();
        txtDNI.setColumns(15);
        txtDNI.setFont(new Font("Verdana", 2, 18));
        panelDatos.add(txtDNI);

        jLabel6 = new JLabel();
        jLabel6.setFont(new Font("Verdana", 1, 18));
        jLabel6.setText("Telefono:");
        panelDatos.add(jLabel6);

        txtTelefono = new JTextField();
        txtTelefono.setColumns(15);
        txtTelefono.setFont(new Font("Verdana", 2, 18));
        panelDatos.add(txtTelefono);

        jLabel7 = new JLabel();
        jLabel7.setFont(new Font("Verdana", 1, 18));
        jLabel7.setText("Direccion:");
        panelDatos.add(jLabel7);

        txtDireccion = new JTextField();
        txtDireccion.setColumns(15);
        txtDireccion.setFont(new Font("Verdana", 2, 18));
        panelDatos.add(txtDireccion);

        add(panelDatos);

        ////
        panelActividades = new JPanel();
        panelActividades.setBorder(BorderFactory.createTitledBorder(null, "Actividades:", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, new Font("Verdana", 1, 18)));
        panelActividades.setPreferredSize(new Dimension(310, 250));
        panelActividades.setLayout(new GridLayout(5, 2));

        grupoUno = new ButtonGroup();
        grupoDos = new ButtonGroup();

        cboxPesas = new JCheckBox();
        cboxPesas.setFont(new Font("Verdana", 3, 18));
        cboxPesas.setText("Pesas");
        panelActividades.add(cboxPesas);

        radioBoxeo = new JRadioButton();
        radioBoxeo.setFont(new Font("Verdana", 3, 18));
        radioBoxeo.setText("Boxeo");
        grupoUno.add(radioBoxeo);
        panelActividades.add(radioBoxeo);

        cboxBP = new JCheckBox();
        cboxBP.setFont(new Font("Verdana", 3, 18));
        cboxBP.setText("BodyPump");
        panelActividades.add(cboxBP);

        radioKarate = new JRadioButton();
        radioKarate.setFont(new Font("Verdana", 3, 18));
        radioKarate.setText("Karate");
        grupoUno.add(radioKarate);
        panelActividades.add(radioKarate);

        cboxPJ = new JCheckBox();
        cboxPJ.setFont(new Font("Verdana", 3, 18));
        cboxPJ.setText("PowerJump");
        panelActividades.add(cboxPJ);

        cboxZumba = new JCheckBox();
        cboxZumba.setFont(new Font("Verdana", 3, 18));
        cboxZumba.setText("Zumba");
        panelActividades.add(cboxZumba);

        cboxAB = new JCheckBox();
        cboxAB.setFont(new Font("Verdana", 3, 18));
        cboxAB.setText("AeroBox");
        panelActividades.add(cboxAB);

        cboxSpin = new JCheckBox();
        cboxSpin.setFont(new Font("Verdana", 3, 18));
        cboxSpin.setText("Spinning");
        panelActividades.add(cboxSpin);

        radioCross = new JRadioButton();
        radioCross.setFont(new Font("Verdana", 3, 18));
        radioCross.setText("CrossFit");
        grupoDos.add(radioCross);
        panelActividades.add(radioCross);

        radioTRX = new JRadioButton();
        radioTRX.setFont(new Font("Verdana", 3, 18));
        radioTRX.setText("TRX");
        grupoDos.add(radioTRX);
        panelActividades.add(radioTRX);

        add(panelActividades);

        ////
        btnInscribir = new JButton();
        btnInscribir.setFont(new Font("Arial Black", 0, 24));
        btnInscribir.setText("Inscribir");
        btnInscribir.setPreferredSize(new Dimension(300, 43));

        add(btnInscribir);

    }

    public static void main(String[] args) {
        JFrame Inscripcion = new Componentes();
        Inscripcion.setVisible(true);

    }
}
