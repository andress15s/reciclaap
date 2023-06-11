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
                Runtime.getRuntime().exec("cmd.exe /c start https://uisreciclaap.blogspot.com/2023/06/el-reciclaje-es-el-proceso-de-convertir.html#more");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "No se pudo abrir la pagina web");
            }
            
        }

        if(comando.equals("ubicacion1"))
        {   
            //abrir una pagina web con el navegador por defecto
            try
            {
                Runtime.getRuntime().exec("cmd.exe /c start https://goo.gl/maps/e2UsS12JafXoJ94A6");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "No se pudo abrir la pagina web");
            }
            
        }

        if(comando.equals("ubicacion2"))
        {   
            //abrir una pagina web con el navegador por defecto
            try
            {
                Runtime.getRuntime().exec("cmd.exe /c start https://goo.gl/maps/78xURi2VgeNNdAhB7");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "No se pudo abrir la pagina web");
            }
            
        }

        if(comando.equals("ubicacion3"))
        {   
            //abrir una pagina web con el navegador por defecto
            try
            {
                Runtime.getRuntime().exec("cmd.exe /c start https://goo.gl/maps/g22fvCX6yw8bWQTG8");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "No se pudo abrir la pagina web");
            }
            
        }

        if(comando.equals("ubicacion4"))
        {   
            //abrir una pagina web con el navegador por defecto
            try
            {
                Runtime.getRuntime().exec("cmd.exe /c start https://goo.gl/maps/u3qUEYXhvpAZQxQk6");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "No se pudo abrir la pagina web");
            }
            
        }

        if(comando.equals("ubicacion5"))
        {   
            //abrir una pagina web con el navegador por defecto
            try
            {
                Runtime.getRuntime().exec("cmd.exe /c start https://goo.gl/maps/8RZuA9LU6Euks9bt7");
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