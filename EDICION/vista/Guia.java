package vista;


import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;


public class Guia extends JDialog
{
 //----------------------
    //Atributos
    //----------------------
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JButton btIdeas;

   
    
    
    //-------------------------
    //Métodos
    //-------------------------
        
    //Metodo constructor
    public Guia()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        setBackground(Color.PINK);

        //fondo de la ventana
        iImagen = new ImageIcon(getClass().getResource("imagenes/GUIA.PNG"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,0,760,475);
        add(lbImagen);

        //crear botones
        btIdeas = new JButton("<html>IDEAS PARA REUTILIZAR<br>MATERIALES</html>");
        btIdeas.setFont(new Font("Algerian", Font.BOLD, 10));
        btIdeas.setBounds(415, 410, 160, 50);
        lbImagen.add(btIdeas);
        btIdeas.setOpaque(false);
        btIdeas.setContentAreaFilled(false);
        btIdeas.setBorderPainted(false);
       

            
      
       
        

        //Caracteristicas de la ventana
        setTitle("");
        setSize(800,520);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

 
        
    public void agregarOyentesBotones(ActionListener pAL)
    {
      
    }
        
    public void cerrarDialogo()
    {
        
    }    
}