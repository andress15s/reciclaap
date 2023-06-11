package modelo;

public class Otros extends Material
{
    public String Descripcion() 
    {
        return "existen otros tipos de materiales como lo son los organicos que se pueden reciclar y reutilizar para crear nuevos productos. como composta, abono, etc. ";
    }
    
    //metodo para acceder al string de la descripcion
    public String toString()
    {
        return Descripcion();
    }
}
