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
    public DialogoInformacion miInfo;
    public DialogoGuia miGuia;
    public DialogoCentros miCentros;
    public DialogoMateriales miMateriales;
    
 


    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);   
        
       

        //Creación y adición del PanelEntradaDatos
        //Creación de los panele entrada de datos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(0,0,900,500);
        this.add(miPanelEntradaDatos);
       
        
   
        

        //Caracteristicas de la ventana
        this.setTitle("RECICLAAPP");
        this.setSize(900,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
       
        
       
        
        
        //icono de la ventana
        Image icon = new ImageIcon(getClass().getResource("imagenes/icono.png")).getImage();
            setIconImage(icon);

    }

    public void crearVentanaInformacion()
    {
        miInfo = new DialogoInformacion();
    }

    
    public void crearVentanaGuia()
    {
        miGuia = new DialogoGuia();
    }

   

    public void crearVentanaCentros()
    {
        miCentros = new DialogoCentros();
       
        
        
    }

    public void crearVentanaMateriales()
    {
        miMateriales = new DialogoMateriales();
    }
    


 

}

