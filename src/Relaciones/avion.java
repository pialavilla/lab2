package Relaciones;

public class avion {
    private String patente;
    private String ubicacion;


    private flota flota;
    private vuelo vuelo;

    public avion(String ubicacion,String patente, String listaDeAviones, String nombre) {
        this.ubicacion = ubicacion;
        this.patente = patente;
        this.flota=new flota(listaDeAviones,nombre); //avion-flota obligatorio
    }

    public String getModelo() {
        return ubicacion;
    }

    public void setModelo(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    //solo hace falta el getter pq es una agregacion
    public Relaciones.flota getFlota() {
        return flota;
    }

    public Relaciones.vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Relaciones.vuelo vuelo) {
        this.vuelo = vuelo;
    }
}
