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
    }

    //activar los botones
    public void activarBotones()
    {
        btVolver.setEnabled(true);  
    }

    public void cerrarVentanaCentros()
    {
        dispose();
    }
 
        
    
}