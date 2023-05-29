package vista;

import javax.swing.JFrame;
import java.awt.Image;
import javax.swing.ImageIcon;



public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
  
    public PanelEntradaDatos miPanelEntradaDatos;
    public Informacion miInfo;
    public Guia miGuia;
    public Centros miCentros;
    
    
 


    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);   
        
       

        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(2,10,780,480);
        add(miPanelEntradaDatos);
       
        
   
        

        //Caracteristicas de la ventana
        setTitle("RECICLAAP");
        setSize(800,520);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
       
        
       
        
        
        //icono de la ventana
        Image icon = new ImageIcon(getClass().getResource("imagenes/icono.png")).getImage();
            setIconImage(icon);

    }

    public void crearVentanaInformacion()
    {
        miInfo = new Informacion();
        this.setState(JFrame.ICONIFIED);
    }

    
    public void crearVentanaGuia()
    {
        miGuia = new Guia();
        this.setState(JFrame.ICONIFIED);
    }

   

    public void crearVentanaCentros()
    {
        miCentros = new Centros();
        this.setState(JFrame.ICONIFIED);
    }

}

