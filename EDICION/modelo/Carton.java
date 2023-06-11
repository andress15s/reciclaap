package modelo;

public class Carton extends Material
{
    public String Descripcion() 
    {
        return "Nombre: Carton\n Descripcion: El carton es un material ampliamente utilizado y facilmente reciclable.\n Para reciclar el carton, sigue los siguientes pasos:\n 1. Asegurate de eliminar cualquier cinta adhesiva, etiquetas o elementos no reciclables del carton.\n 2. Si es posible, aplasta o pliega el carton para reducir su volumen y facilitar su transporte.\n 3. Coloca el carton en el contenedor de reciclaje especifico para papel y carton.\n 4. Si no tienes acceso a un contenedor de reciclaje, puedes llevar el carton a un centro de reciclaje cercano.\n 5. Recuerda seguir las instrucciones locales de reciclaje y contribuir al cuidado del medio ambiente.\n Gracias por reciclar!";
    }
    
    //metodo para acceder al string de la descripcion
    public String toString()
    {
        return Descripcion();
    }

    

}
