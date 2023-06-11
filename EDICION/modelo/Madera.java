package modelo;

public class Madera extends Material 
{
    public String Descripcion() 
    {
        return "Nombre: Madera\n \n Descripcion: La madera es un material ampliamente utilizado y facilmente reciclable.\n  Para reciclar la madera, sigue los siguientes pasos:\n 1. Clasifica la madera segun su estado y caracteristicas, como madera solida, contrachapado o astillas.\n \n 2. Si la madera esta en buenas condiciones, considera reutilizarla en proyectos de carpinteria o construccion.\n \n3. Si la madera esta dañada o no se puede reutilizar, busca instalaciones de reciclaje de madera cercanas.\n \n4. En el centro de reciclaje, la madera puede ser triturada, convertida en astillas o utilizada para generar energia.\n \n5. Sigue las regulaciones locales y las practicas de reciclaje adecuadas para garantizar una disposicion adecuada de la madera.\n \nReciclar la madera ayuda a reducir la deforestacion y promueve un uso sostenible de los recursos forestales.\n \nGracias por reciclar!";
        

    }
    
    //metodo para acceder al string de la descripcion
    public String toString()
    {
        return Descripcion();
    }
}
