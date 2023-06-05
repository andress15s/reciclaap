package vista;


import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
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
    private JButton btVolver;
    private JButton btTipos;
    
    
    
    
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
        lbImagen.setBounds(0,0,900,500);
        add(lbImagen);

        //crear boton mas ideas
        btIdeas = new JButton("");
        btIdeas.setFont(new Font("Algerian", Font.BOLD, 10));
        btIdeas.setBounds(490, 430, 200, 50);
        lbImagen.add(btIdeas);
        btIdeas.setOpaque(false);
        btIdeas.setContentAreaFilled(false);
        btIdeas.setBorderPainted(false);
        btIdeas.setActionCommand("ideas");

        //crear boton volver
        btVolver = new JButton("");
        btVolver.setFont(new Font("Algerian", Font.BOLD, 10));
        btVolver.setBounds(730, 430, 150, 50);
        lbImagen.add(btVolver);
        btVolver.setOpaque(false);
        btVolver.setContentAreaFilled(false);
        btVolver.setBorderPainted(false);
        btVolver.setActionCommand("volver");

        //crear boton tipos
        btTipos = new JButton("");
        btTipos.setFont(new Font("Algerian", Font.BOLD, 10));
        btTipos.setBounds(298, 430, 140, 50);
        lbImagen.add(btTipos);
        btTipos.setOpaque(false);
        btTipos.setContentAreaFilled(false);
        btTipos.setBorderPainted(false);
        btTipos.setActionCommand("tipos");

            
      
       
        

        //Caracteristicas de la ventana
        setTitle("");
        setSize(910,540);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

 
        
    public void agregarOyentesBotones(ActionListener pAL)
    {   
        btIdeas.addActionListener(pAL);
        btVolver.addActionListener(pAL);
        btTipos.addActionListener(pAL);
      
    }

    

    public void cerrarVentanaGuia()
    {
        this.dispose();
    }



    public void activarBotones()
    {
        btIdeas.setEnabled(true);
        btVolver.setEnabled(true);
        btTipos.setEnabled(true);
    }

}