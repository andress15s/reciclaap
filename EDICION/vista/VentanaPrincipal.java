package vista;

import javax.swing.JFrame;



public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
  
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public Animal miAnimal;
    
    public Fruta miFruta;
    public Pareja miPareja;
    
 


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
        miPanelEntradaDatos.setBounds(10,10,680,270);
        add(miPanelEntradaDatos);
       
        
        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,290,560,440);
        add(miPanelOperaciones);
        

        //Caracteristicas de la ventana
        setTitle("RECICLAAP");
        setSize(600,500);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
    
    }

    public void crearVentanaAnimal()
    {
        miAnimal = new Animal();
    }

    
    public void crearVentanaFruta()
    {
        miFruta = new Fruta();
    }

    

    public void crearVentanaPareja()
    {
        miPareja = new Pareja();
    }

}

