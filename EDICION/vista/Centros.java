package vista;

import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Image;





public class Centros extends JDialog
{
 //----------------------
    //Atributos
    //----------------------
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JButton btVolver;
    private JButton btUbicacion1;
    private JButton btUbicacion2;
    private JButton btUbicacion3;
    private JButton btUbicacion4;
    private JButton btUbicacion5;
   
    
    //-------------------------
    //Métodos
    //-------------------------
        
    //Metodo constructor
    public Centros()
    {
        //Definición del contenedor de la ventana
        setLayout(null);

        //fondo de la ventana
        iImagen = new ImageIcon(getClass().getResource("imagenes/CENTROS.PNG"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(0,0,900,500);
        add(lbImagen);

        //crear boton volver
        btVolver = new JButton("");
        btVolver.setBounds(708, 430, 140, 50);
        lbImagen.add(btVolver);
        btVolver.setOpaque(false);
        btVolver.setContentAreaFilled(false);
        btVolver.setBorderPainted(false);
        btVolver.setActionCommand("volver3");

        // Crear botón ubicacion 1
        btUbicacion1 = new JButton("");
        btUbicacion1.setBounds(70, 340, 60, 60);
        lbImagen.add(btUbicacion1);
        btUbicacion1.setOpaque(false);
        btUbicacion1.setContentAreaFilled(false);
        btUbicacion1.setBorderPainted(false);
        btUbicacion1.setActionCommand("ubicacion1");

        // Crear botón ubicacion 2
        btUbicacion2 = new JButton("");
        btUbicacion2.setBounds(240, 340, 60, 60);
        lbImagen.add(btUbicacion2);
        btUbicacion2.setOpaque(false);
        btUbicacion2.setContentAreaFilled(false);
        btUbicacion2.setBorderPainted(false);
        btUbicacion2.setActionCommand("ubicacion2");

        // Crear botón ubicacion 3
        btUbicacion3 = new JButton("");
        btUbicacion3.setBounds(410, 340, 60, 60);
        lbImagen.add(btUbicacion3);
        btUbicacion3.setOpaque(false);
        btUbicacion3.setContentAreaFilled(false);
        btUbicacion3.setBorderPainted(false);
        btUbicacion3.setActionCommand("ubicacion3");

        // Crear botón ubicacion 4
        btUbicacion4 = new JButton("");
        btUbicacion4.setBounds(600, 340, 60, 60);
        lbImagen.add(btUbicacion4);
        btUbicacion4.setOpaque(false);
        btUbicacion4.setContentAreaFilled(false);
        btUbicacion4.setBorderPainted(false);
        btUbicacion4.setActionCommand("ubicacion4");


        // Crear botón ubicacion 5
        btUbicacion5 = new JButton("");
        btUbicacion5.setBounds(778, 340, 60, 60);
        lbImagen.add(btUbicacion5);
        btUbicacion5.setOpaque(false);
        btUbicacion5.setContentAreaFilled(false);
        btUbicacion5.setBorderPainted(false);
        btUbicacion5.setActionCommand("ubicacion5");




            
        
        

       

        //Caracteristicas de la ventana
        setTitle("");
        setSize(900,535);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }


    //agregar oyentes a los botones
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btVolver.addActionListener(pAL);
        btUbicacion1.addActionListener(pAL);
        btUbicacion2.addActionListener(pAL);
        btUbicacion3.addActionListener(pAL);
        btUbicacion4.addActionListener(pAL);
        btUbicacion5.addActionListener(pAL);
    }

    //activar los botones
    public void activarBotones()
    {
        btVolver.setEnabled(true); 
        btUbicacion1.setEnabled(true);
        btUbicacion2.setEnabled(true);
        btUbicacion3.setEnabled(true);
        btUbicacion4.setEnabled(true);
        btUbicacion5.setEnabled(true); 
    }

    public void cerrarVentanaCentros()
    {
        dispose();
    }
 
        
    
}