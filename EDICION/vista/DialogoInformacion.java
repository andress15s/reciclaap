package vista;

import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Image;





public class DialogoInformacion extends JDialog
{
 //----------------------
    //Atributos
    //----------------------
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JButton btInfo;
    private JButton btVolver;
   
    
    //-------------------------
    //Métodos
    //-------------------------
        
    //Metodo constructor
    public DialogoInformacion()
    {
        //Definición del contenedor de la ventana
        setLayout(null);

        //fondo de la ventana
        iImagen = new ImageIcon(getClass().getResource("imagenes/INFORMACION.PNG"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(0,0,900,500);
        add(lbImagen);

        //crear boton mas informacion
        btInfo = new JButton("");
        btInfo.setBounds(40, 430, 140, 50);
        lbImagen.add(btInfo);
        btInfo.setOpaque(false);
        btInfo.setContentAreaFilled(false);
        btInfo.setBorderPainted(false);
        btInfo.setActionCommand("masinfo");

        //crear boton volver
        btVolver = new JButton("");
        btVolver.setBounds(740, 430, 140, 50);
        lbImagen.add(btVolver);
        btVolver.setOpaque(false);
        btVolver.setContentAreaFilled(false);
        btVolver.setBorderPainted(false);
        btVolver.setActionCommand("volver2");
        
        

       

        //Caracteristicas de la ventana
        setTitle("");
        setSize(910,540);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }


    //agregar oyentes a los botones
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btInfo.addActionListener(pAL);
        btVolver.addActionListener(pAL);
    }

    //activar los botones
    public void activarBotones()
    {
        btInfo.setEnabled(true);
        btVolver.setEnabled(true);

    }

    public void cerrarVentanaInfo()
    {
        this.dispose();
    }

 
        
    
}