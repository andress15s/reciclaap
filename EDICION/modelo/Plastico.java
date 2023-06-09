package modelo;

public class Plastico extends Material
{
    public String Descripcion()
    {
    return "Nombre: Plastico\n \nDescripcion: El plastico es un material ampliamente utilizado y reciclable que se puede transformar en nuevos productos.\n \nPara reciclar el plastico, sigue los siguientes pasos generales:\n \n1. Clasifica el plastico segun su codigo de reciclaje, que suele estar marcado en el producto.\n \n2. Limpia y enjuaga el plastico para eliminar restos de comida u otros contaminantes.\n \n3. Verifica si el plastico es aceptado en el programa de reciclaje local o si hay centros de reciclaje especializados para ese tipo de plastico.\n \n4. Deposita el plastico en el contenedor de reciclaje adecuado o llevalo al centro de reciclaje correspondiente.\n \n5. En el centro de reciclaje, el plastico se clasificara, triturara y fundira para convertirlo en granulos o pellets.\n \n6. Estos granulos de plastico reciclado se pueden utilizar para fabricar nuevos productos, como envases, textiles, muebles, etc.\n \nReciclar plastico contribuye a reducir la cantidad de residuos, conservar los recursos y proteger el medio ambiente.\n \nGracias por reciclar!";
    }
    
    //metodo para acceder al string de la descripcion
    public String toString()
    {
        return Descripcion();
    }
}
