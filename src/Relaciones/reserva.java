package Relaciones;

public class reserva {
    private int numAsiento;
    private vuelo vuelo;

    public reserva() {
    }

    public reserva(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    //
    public void agregarvuelo(vuelo vuelo1){
        this.vuelo = vuelo1;
    }

    //solo se usa el getter pq es una agregacion
    public Relaciones.vuelo getReserva() {
        return vuelo;
    }

}
