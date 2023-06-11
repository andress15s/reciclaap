package modelo;

public class Vidrio extends Material
{
    public String Descripcion()
    {
        return "Nombre: Vidrio\n Descripcion: El vidrio es un material 100% reciclable y se puede reciclar de manera indefinida sin perder calidad.\n Para reciclar vidrio, sigue estos pasos generales:\n 1. Clasifica el vidrio segun su color, como transparente, verde o Ambar.\n 2. Lava el vidrio para eliminar cualquier residuo o contaminante.\n 3. Retira las tapas, tapones o elementos no reciclables del vidrio.\n 4. Coloca el vidrio en los contenedores especificos para reciclaje de vidrio, generalmente ubicados en puntos de recogida selectiva o centros de reciclaje.\n 5. El vidrio reciclado se lleva a una planta de reciclaje donde se tritura y se funde a altas temperaturas para producir nuevos productos de vidrio.\n 6. Estos nuevos productos de vidrio reciclado incluyen botellas, frascos, envases y otros objetos de vidrio.\n Reciclar vidrio ayuda a conservar los recursos naturales, reducir el consumo de energia y disminuir los desechos en vertederos.\n Gracias por reciclar!";
    }
    
    //metodo para acceder al string de la descripcion
    public String toString()
    {
        return Descripcion();
    }
    
}
