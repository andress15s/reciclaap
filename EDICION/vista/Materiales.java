package vista;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;



public class Materiales extends JDialog
{   
    //atributos
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JButton btVolver;
    private JLabel lImagen;
    private ImageIcon iLogo;
    private JLabel lbLogo;
    
   
 



    //metodos constructor
    public Materiales()
    {
        //Definición del contenedor de la ventana
        setLayout(null);


        //fondo de la ventana
        iImagen = new ImageIcon(getClass().getResource("imagenes/MATERIALES.PNG"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(0,0,900,500);
        add(lbImagen);

        //crear un jcombobox para seleccionar el material
        JComboBox cbMaterial = new JComboBox();
        cbMaterial.setBounds(310, 30, 330, 30);
        lbImagen.add(cbMaterial);

        
        // se agrega el logo
        iLogo = new ImageIcon(getClass().getResource("imagenes/carton.png"));
        lbLogo = new JLabel(iLogo);
        lbLogo.setOpaque(true);//
        lbLogo.setBorder(BorderFactory.createRaisedBevelBorder());
        lbLogo.setBounds(114, 202, 290, 190);
        

        lbImagen.add(lbLogo);



        
        


        






















        //boton volver
        btVolver = new JButton("");
        btVolver.setFont(new Font("Algerian", Font.BOLD, 10));
        btVolver.setBounds(700, 430, 150, 50);
        lbImagen.add(btVolver);
        btVolver.setOpaque(false);
        btVolver.setContentAreaFilled(false);
        btVolver.setBorderPainted(false);
        btVolver.setActionCommand("volver4");




        //Caracteristicas de la ventana
        setTitle("");
        setSize(910,540);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void agregarOyentesBotones(ActionListener pAL) 
    {
        btVolver.addActionListener(pAL);
    }

    //activar botones
    public void activarBotones()
    {
        btVolver.setEnabled(true);
    }

    public void cerrarVentanaMateriales()
    {
        this.dispose();
    }
    
}
