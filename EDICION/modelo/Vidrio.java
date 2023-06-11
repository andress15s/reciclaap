package modelo;

public class Vidrio extends Material
{
    public String Descripcion()
    {
        return "Nombre: Vidrio\n \nDescripcion: El vidrio es un material 100% reciclable y se puede reciclar de manera indefinida sin perder calidad.\n Para reciclar vidrio, sigue estos pasos generales:\n \n1. Clasifica el vidrio segun su color, como transparente, verde o Ambar.\n \n2. Lava el vidrio para eliminar cualquier residuo o contaminante.\n \n3. Retira las tapas, tapones o elementos no reciclables del vidrio.\n \n4. Coloca el vidrio en los contenedores especificos para reciclaje de vidrio, generalmente ubicados en puntos de recogida selectiva o centros de reciclaje.\n \n5. El vidrio reciclado se lleva a una planta de reciclaje donde se tritura y se funde a altas temperaturas para producir nuevos productos de vidrio.\n \n6. Estos nuevos productos de vidrio reciclado incluyen botellas, frascos, envases y otros objetos de vidrio.\n \nReciclar vidrio ayuda a conservar los recursos naturales, reducir el consumo de energia y disminuir los desechos en vertederos.\n \nGracias por reciclar!";
    }
    
    //metodo para acceder al string de la descripcion
    public String toString()
    {
        return Descripcion();
    }
    
}
