package modelo;

public class Material 
{

    //atributos
    private String nombre;
    private String descripcion;
    private String tipo;

    //constructor
    public Material(String nombre, String descripcion, String tipo) 
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    //getters y setters
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }

    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    

}