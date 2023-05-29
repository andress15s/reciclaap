package vista;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.Color;



public class PanelEntradaDatos extends JPanel
{
    
    //Atributos
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private ImageIcon iImagen2;
    private JLabel lbImagen2;
    private JButton btInfo;
    private JButton btCentros;
    private JButton btGuia;

    Color color = new Color(180, 198, 169);
    
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

        iImagen = new ImageIcon(getClass().getResource("imagenes/FONDO.PNG"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(0,0,780,450);
        add(lbImagen);

        //crear y agragar boton informacion general
        btInfo = new JButton("<html>>Información<br>General</html>");
        btInfo.setFont(new Font("Algerian", Font.BOLD, 10));
        btInfo.setBounds(58, 310, 120, 70);
        lbImagen.add(btInfo);
        btInfo.setOpaque(false);
        btInfo.setContentAreaFilled(false);
        btInfo.setBorderPainted(false);
        btInfo.setActionCommand("info");


        //crear y agragar boton centros 
        btCentros = new JButton("<html>>Centros de <br> Reciclaje</html>");
        btCentros.setFont(new Font("Algerian", Font.BOLD, 10));
        btCentros.setBounds(220, 310, 120, 70);
        lbImagen.add(btCentros);
        btCentros.setOpaque(false);
        btCentros.setContentAreaFilled(false);
        btCentros.setBorderPainted(false);
        btCentros.setActionCommand("Centros");

        //crear y agragar boton guia
        btGuia = new JButton("<html>>Guía de <br> Reciclaje</html>");
        btGuia.setFont(new Font("Algerian", Font.BOLD, 10));
        btGuia.setBounds(380, 310, 120, 70);
        lbImagen.add(btGuia);
        btGuia.setOpaque(false);
        btGuia.setContentAreaFilled(false);
        btGuia.setBorderPainted(false);
        btGuia.setActionCommand("Guia");


         
        
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btInfo.addActionListener(pAL);
        btCentros.addActionListener(pAL);
        btGuia.addActionListener(pAL);

    }

    //activar boton
    public void activarBotonInfo()
    {
        btInfo.setEnabled(true);
        btCentros.setEnabled(true);
        btGuia.setEnabled(true);
    }

    
  
   





    
    
}