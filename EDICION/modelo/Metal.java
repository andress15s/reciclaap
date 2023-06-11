package modelo;

public class Metal extends Material
{
    public String Descripcion() 
    {
        return "Nombre: Metal\n Descripcion: El metal es un material ampliamente utilizado y facilmente reciclable.\n Para reciclar el metal, sigue los siguientes pasos:\n 1. Clasifica el metal segun su tipo, como aluminio, acero o hierro.\n 2. Si el metal esta en buenas condiciones, considera reutilizarlo en proyectos de construccion o fabricacion.\n 3. Si el metal esta dañado o no se puede reutilizar, busca instalaciones de reciclaje de metal cercanas.\n 4. En el centro de reciclaje, el metal puede ser fundido y convertido en nuevos productos.\n 5. Sigue las regulaciones locales y las practicas de reciclaje adecuadas para garantizar una disposicion adecuada del metal.\n Reciclar el metal ayuda a reducir la contaminacion y promueve un uso sostenible de los recursos naturales.\n Gracias por reciclar!";
    }
    
    //metodo para acceder al string de la descripcion
    public String toString()
    {
        return Descripcion();
    }
    
}
