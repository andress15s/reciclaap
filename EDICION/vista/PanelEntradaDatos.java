package vista;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;



public class PanelEntradaDatos extends JPanel
{
    
    //Atributos
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private ImageIcon iImagen2;
    public JButton btRegistro;
    private JLabel lbImagen2;
    
  
    private JTextField tfNombre;
    private JTextField tfEdad;

    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        //setBackground(new Color(185, 180, 179));
        
        //Creación y adicion de la imagen

      

        iImagen = new ImageIcon(getClass().getResource(""));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(310,75,250,276);
        add(lbImagen);

        iImagen = new ImageIcon(getClass().getResource("imagenes/Titulo.PNG"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(80,100,400,180);
        add(lbImagen);

        
        //imajen de fondo

        iImagen2 = new ImageIcon(getClass().getResource("imagenes/fondo.jpeg"));
        lbImagen2 = new JLabel(iImagen2);
        lbImagen2.setBounds(0,0,550,276);
        lbImagen2.setIcon(new ImageIcon(iImagen2.getImage().getScaledInstance(540, 280, Image.SCALE_SMOOTH)));
        add(lbImagen2);
  
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getNomUsu()
    {
        return (String) tfNombre.getText();
    }

    public String getEdadUsuario()
    {
        return (String) tfEdad.getText();
    }





    
    
}