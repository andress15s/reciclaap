package modelo;

import java.util.ArrayList;

import vista.Materiales;

public class TipodeMaterial extends Material 
{
    public TipodeMaterial(String nombre, String descripcion, String tipo) 
    {
        super(nombre, descripcion, tipo);
    }

    //atributos
    private ArrayList<Material> materiales = new ArrayList<Material>();

    




  
    


















    //agregar material
    public void agregarMaterial(Material material)
    {
        materiales.add(material);
    }

    
    


    
}
