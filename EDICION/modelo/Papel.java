package modelo;

public class Papel extends Material
{
    public String Descripcion() 
    {
        return "Nombre: Papel\n \nDescripcion: El papel es un material ampliamente reciclado y se puede reutilizar para crear nuevos productos de papel.\n Para reciclar papel, sigue estos pasos generales:\n \n1. Clasifica el papel segun su tipo, como periodicos, revistas, cajas de carton, etc.\n \n2. Si el papel esta en buenas condiciones, considera reutilizarlo en proyectos de arte o manualidades.\n \n3. Si el papel esta dañado o no se puede reutilizar, busca instalaciones de reciclaje de papel cercanas.\n \n4. En el centro de reciclaje, el papel se clasifica, se limpia y se tritura en una pasta.\n \n5. La pasta se convierte en papel nuevo, que se puede utilizar para crear nuevos productos de papel.\n \n6. Sigue las regulaciones locales y las practicas de reciclaje adecuadas para garantizar una disposicion adecuada del papel.\n \nReciclar el papel ayuda a reducir la deforestacion y promueve un uso sostenible de los recursos forestales.\n \nGracias por reciclar! ";
    }
    
    //metodo para acceder al string de la descripcion
    public String toString()
    {
        return Descripcion();
    }
    
}
