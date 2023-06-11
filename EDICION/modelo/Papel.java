package modelo;

public class Papel extends Material
{
    public String Descripcion() 
    {
        return "Nombre: Papel\n Descripcion: El papel es un material ampliamente reciclado y se puede reutilizar para crear nuevos productos de papel.\n Para reciclar papel, sigue estos pasos generales:\n 1. Clasifica el papel segun su tipo, como periodicos, revistas, cajas de carton, etc.\n 2. Si el papel esta en buenas condiciones, considera reutilizarlo en proyectos de arte o manualidades.\n 3. Si el papel esta dañado o no se puede reutilizar, busca instalaciones de reciclaje de papel cercanas.\n 4. En el centro de reciclaje, el papel se clasifica, se limpia y se tritura en una pasta.\n 5. La pasta se convierte en papel nuevo, que se puede utilizar para crear nuevos productos de papel.\n 6. Sigue las regulaciones locales y las practicas de reciclaje adecuadas para garantizar una disposicion adecuada del papel.\n Reciclar el papel ayuda a reducir la deforestacion y promueve un uso sostenible de los recursos forestales.\n Gracias por reciclar! ";
    }
    
    //metodo para acceder al string de la descripcion
    public String toString()
    {
        return Descripcion();
    }
    
}
