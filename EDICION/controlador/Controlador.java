package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
  
  
    
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal venPrin )
    
    {
       
        this.venPrin = venPrin;
        this.venPrin.miPanelEntradaDatos.agregarOyentesBotones(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
    

   

        if(comando.equals("info"))
        {   
            venPrin.crearVentanaInformacion();
            this.venPrin.miInfo.agregarOyentesBotones(this);
        }

        if(comando.equals("Guia"))
        {   
            venPrin.crearVentanaGuia();
            this.venPrin.miGuia.agregarOyentesBotones(this);
        }

    

        if(comando.equals("Centros"))
        {   
            venPrin.crearVentanaCentros();
            this.venPrin.miCentros.agregarOyentesBotones(this);
        }

      

        if(comando.equals("salir"))
        {
            System.exit(0);
        }
    }
}