package vista;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class Materiales extends JDialog
{   
    //atributos
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JButton btVolver;
    private JLabel lImagen;
    private ImageIcon iLogo;
    private JLabel lbLogo;
    private JTextArea taResultado;
    private JScrollPane spResultado;
    
   
 



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
        //agregar los materiales al jcombobox
        cbMaterial.addItem("Cartón");
        cbMaterial.addItem("Plástico");
        cbMaterial.addItem("Vidrio");
        cbMaterial.addItem("Metal");
        cbMaterial.addItem("Papel");
        cbMaterial.addItem("Madera");
        cbMaterial.addItem("Otros");



        //Creación y adicion del area de texto
        taResultado = new JTextArea();
        taResultado.setEditable(true);
        taResultado.setFont(new Font("Arial", Font.BOLD, 14));
        taResultado.setLineWrap(true);
        taResultado.setWrapStyleWord(true);
        taResultado.setBounds(500, 120, 290, 250);
        //taResultado.setBorder(BorderFactory.createRaisedBevelBorder());
        taResultado.setOpaque(false);//
        lbImagen.add(taResultado);

        
        

        

        
        // se agrega el logo
        iLogo = new ImageIcon(getClass().getResource("imagenes/carton.png"));
        lbLogo = new JLabel(iLogo);
        lbLogo.setOpaque(true);//
        lbLogo.setBorder(BorderFactory.createRaisedBevelBorder());
        lbLogo.setBounds(114, 202, 290, 190);
        lbImagen.add(lbLogo);

        //quiero que el logo cambie segun el material que se seleccione
        cbMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(cbMaterial.getSelectedItem().equals("Cartón"))
                {
                    iLogo = new ImageIcon(getClass().getResource("imagenes/carton.png"));
                    lbLogo.setIcon(iLogo);
                }
                else if(cbMaterial.getSelectedItem().equals("Plástico"))
                {
                    iLogo = new ImageIcon(getClass().getResource("imagenes/plastico.png"));
                    lbLogo.setIcon(iLogo);
                }
                else if(cbMaterial.getSelectedItem().equals("Vidrio"))
                {
                    iLogo = new ImageIcon(getClass().getResource("imagenes/vidrio.png"));
                    lbLogo.setIcon(iLogo);
                }
                else if(cbMaterial.getSelectedItem().equals("Metal"))
                {
                    iLogo = new ImageIcon(getClass().getResource("imagenes/metales.png"));
                    lbLogo.setIcon(iLogo);
                }
                else if(cbMaterial.getSelectedItem().equals("Papel"))
                {
                    iLogo = new ImageIcon(getClass().getResource("imagenes/papel.png"));
                    lbLogo.setIcon(iLogo);
                }
                else if(cbMaterial.getSelectedItem().equals("Madera"))
                {
                    iLogo = new ImageIcon(getClass().getResource("imagenes/madera.png"));
                    lbLogo.setIcon(iLogo);
                }
                else if(cbMaterial.getSelectedItem().equals("Otros"))
                {
                    iLogo = new ImageIcon(getClass().getResource("imagenes/otros.png"));
                    lbLogo.setIcon(iLogo);
                }
            }
        });

        
        


        






















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
