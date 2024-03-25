package Relaciones;

public class vuelo {
    private int numeroDeVuelo;
    private String origen;
    private String destino;


    public vuelo() {
    }

    public vuelo(int numeroDeVuelo, String origen, String destino) {
        this.numeroDeVuelo = numeroDeVuelo;
        this.origen = origen;
        this.destino = destino;
    }

    public int getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    public void setNumeroDeVuelo(int numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

}
