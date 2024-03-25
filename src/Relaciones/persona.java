package Relaciones;

//clase abstracta para q no pueda crear de la clase persona
public abstract class persona  {
    private String nombre;
    private int edad;

    public persona() {
    }

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
