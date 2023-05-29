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
   
    
    //-------------------------
    //Métodos
    //-------------------------
        
    //Metodo constructor
    public Centros()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
            
        
        iImagen = new ImageIcon(getClass().getResource("imagenes/Titulo.PNG"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(100,20,400,50);
        add(lbImagen);

       

        //Caracteristicas de la ventana
        setTitle("Parejas");
        setSize(610,680);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }


    //agregar oyentes a los botones
    public void agregarOyentesBotones(ActionListener pAL)
    {
        
    }

    //activar los botones
    public void activarBotones()
    {
        
    }

 
        
    
}