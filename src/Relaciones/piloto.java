package Relaciones;

public class piloto {
    private int edad;
    private String nombre;
    private int rango;

    public piloto(int edad,String nombre,int rango) {
        this.edad = edad;
        this.nombre = nombre;
        this.rango = rango;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }
}
