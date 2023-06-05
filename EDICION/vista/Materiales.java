package vista;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
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

        //crear una etiqueta para el material
        JLabel lbMaterial = new JLabel("Materiales");
        lbMaterial.setFont(new Font("Algerian", Font.BOLD, 20));
        lbMaterial.setBounds(165, 30, 150, 30);
        lbImagen.add(lbMaterial);


        //crear un contenedor para el material






















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
