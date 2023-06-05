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

        if(comando.equals("tipos"))
        {   
            //crear ventana materiales
            venPrin.crearVentanaMateriales();
            this.venPrin.miMateriales.agregarOyentesBotones(this);
            
        }
    

        if(comando.equals("Centros"))
        {   
            venPrin.crearVentanaCentros();
            this.venPrin.miCentros.agregarOyentesBotones(this);
        }

        if(comando.equals("ideas"))
        {   
            //abrir una pagina web con el navegador por defecto
            try
            {
                Runtime.getRuntime().exec("cmd.exe /c start https://www.ecoembes.com/es/reduce-reutiliza-y-recicla/beneficios-de-reciclar");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "No se pudo abrir la pagina web");
            }
            
            
            
        }

        if(comando.equals("volver"))
        {   
            venPrin.miGuia.cerrarVentanaGuia();
        }

        if(comando.equals("volver2"))
        {   
            venPrin.miInfo.cerrarVentanaInfo();
        }

        if(comando.equals("volver3"))
        {   
            venPrin.miCentros.cerrarVentanaCentros();
        }

        if(comando.equals("volver4"))
        {   
            venPrin.miMateriales.cerrarVentanaMateriales();
        }

      

        if(comando.equals("masinfo"))
        {   
            //abrir una pagina web con el navegador por defecto
            try
            {
                Runtime.getRuntime().exec("cmd.exe /c start https://www.ecoembes.com/es/residuos");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "No se pudo abrir la pagina web");
            }
            
        }
       

        if(comando.equals("salir"))
        {
            System.exit(0);
        }
    }
}