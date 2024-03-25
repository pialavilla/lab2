package Relaciones;

public class flota {
    private String nombre;
    private String ListaDeAviones;

    public flota() {
    }
    public flota(String listaDeAviones, String nombre) {
        ListaDeAviones = listaDeAviones;
        nombre = nombre;
    }

    public String getListaDeAviones() {
        return ListaDeAviones;
    }

    public void setListaDeAviones(String listaDeAviones) {
        ListaDeAviones = listaDeAviones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
